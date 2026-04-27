package org.commonmark.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.FencedCodeBlockParser;
import org.commonmark.internal.HeadingParser;
import org.commonmark.internal.HtmlBlockParser;
import org.commonmark.internal.IndentedCodeBlockParser;
import org.commonmark.internal.ListBlockParser;
import org.commonmark.internal.ThematicBreakParser;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.Document;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListBlock;
import org.commonmark.node.Paragraph;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockParserFactory;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

/* loaded from: classes3.dex */
public class DocumentParser implements ParserState {
    private static final Set CORE_FACTORY_TYPES = new LinkedHashSet(Arrays.asList(BlockQuote.class, Heading.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class));
    private static final Map NODES_TO_CORE_FACTORIES;
    private boolean blank;
    private final List blockParserFactories;
    private boolean columnIsInTab;
    private final List delimiterProcessors;
    private final DocumentBlockParser documentBlockParser;
    private final InlineParserFactory inlineParserFactory;
    private CharSequence line;
    private int index = 0;
    private int column = 0;
    private int nextNonSpace = 0;
    private int nextNonSpaceColumn = 0;
    private int indent = 0;
    private final Map definitions = new LinkedHashMap();
    private List activeBlockParsers = new ArrayList();
    private Set allBlockParsers = new LinkedHashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BlockQuote.class, new BlockQuoteParser.Factory());
        hashMap.put(Heading.class, new HeadingParser.Factory());
        hashMap.put(FencedCodeBlock.class, new FencedCodeBlockParser.Factory());
        hashMap.put(HtmlBlock.class, new HtmlBlockParser.Factory());
        hashMap.put(ThematicBreak.class, new ThematicBreakParser.Factory());
        hashMap.put(ListBlock.class, new ListBlockParser.Factory());
        hashMap.put(IndentedCodeBlock.class, new IndentedCodeBlockParser.Factory());
        NODES_TO_CORE_FACTORIES = DesugarCollections.unmodifiableMap(hashMap);
    }

    public DocumentParser(List list, InlineParserFactory inlineParserFactory, List list2) {
        this.blockParserFactories = list;
        this.inlineParserFactory = inlineParserFactory;
        this.delimiterProcessors = list2;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser();
        this.documentBlockParser = documentBlockParser;
        activateBlockParser(documentBlockParser);
    }

    public static Set getDefaultBlockParserTypes() {
        return CORE_FACTORY_TYPES;
    }

    public static List calculateBlockParserFactories(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(NODES_TO_CORE_FACTORIES.get((Class) it.next()));
        }
        return arrayList;
    }

    public Document parse(String str) {
        int i = 0;
        while (true) {
            int findLineBreak = Parsing.findLineBreak(str, i);
            if (findLineBreak == -1) {
                break;
            }
            incorporateLine(str.substring(i, findLineBreak));
            i = findLineBreak + 1;
            if (i < str.length() && str.charAt(findLineBreak) == '\r' && str.charAt(i) == '\n') {
                i = findLineBreak + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            incorporateLine(str.substring(i));
        }
        return finalizeAndProcess();
    }

    @Override // org.commonmark.parser.block.ParserState
    public CharSequence getLine() {
        return this.line;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getIndex() {
        return this.index;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getNextNonSpaceIndex() {
        return this.nextNonSpace;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getColumn() {
        return this.column;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getIndent() {
        return this.indent;
    }

    @Override // org.commonmark.parser.block.ParserState
    public boolean isBlank() {
        return this.blank;
    }

    @Override // org.commonmark.parser.block.ParserState
    public BlockParser getActiveBlockParser() {
        return (BlockParser) this.activeBlockParsers.get(r0.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        setNewIndex(r10.nextNonSpace);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void incorporateLine(CharSequence charSequence) {
        this.line = Parsing.prepareLine(charSequence);
        this.index = 0;
        this.column = 0;
        this.columnIsInTab = false;
        List list = this.activeBlockParsers;
        int i = 1;
        for (BlockParser blockParser : list.subList(1, list.size())) {
            findNextNonSpace();
            BlockContinue tryContinue = blockParser.tryContinue(this);
            if (!(tryContinue instanceof BlockContinueImpl)) {
                break;
            }
            BlockContinueImpl blockContinueImpl = (BlockContinueImpl) tryContinue;
            if (blockContinueImpl.isFinalize()) {
                finalize(blockParser);
                return;
            }
            if (blockContinueImpl.getNewIndex() != -1) {
                setNewIndex(blockContinueImpl.getNewIndex());
            } else if (blockContinueImpl.getNewColumn() != -1) {
                setNewColumn(blockContinueImpl.getNewColumn());
            }
            i++;
        }
        List list2 = this.activeBlockParsers;
        ArrayList arrayList = new ArrayList(list2.subList(i, list2.size()));
        BlockParser blockParser2 = (BlockParser) this.activeBlockParsers.get(i - 1);
        boolean isEmpty = arrayList.isEmpty();
        boolean z = (blockParser2.getBlock() instanceof Paragraph) || blockParser2.isContainer();
        while (true) {
            if (!z) {
                break;
            }
            findNextNonSpace();
            if (isBlank() || (this.indent < Parsing.CODE_BLOCK_INDENT && Parsing.isLetter(this.line, this.nextNonSpace))) {
                break;
            }
            BlockStartImpl findBlockStart = findBlockStart(blockParser2);
            if (findBlockStart == null) {
                setNewIndex(this.nextNonSpace);
                break;
            }
            if (!isEmpty) {
                finalizeBlocks(arrayList);
                isEmpty = true;
            }
            if (findBlockStart.getNewIndex() != -1) {
                setNewIndex(findBlockStart.getNewIndex());
            } else if (findBlockStart.getNewColumn() != -1) {
                setNewColumn(findBlockStart.getNewColumn());
            }
            if (findBlockStart.isReplaceActiveBlockParser()) {
                prepareActiveBlockParserForReplacement();
            }
            BlockParser[] blockParsers = findBlockStart.getBlockParsers();
            int length = blockParsers.length;
            int i2 = 0;
            while (i2 < length) {
                BlockParser blockParser3 = blockParsers[i2];
                BlockParser addChild = addChild(blockParser3);
                i2++;
                z = blockParser3.isContainer();
                blockParser2 = addChild;
            }
        }
        if (!isEmpty && !isBlank() && getActiveBlockParser().canHaveLazyContinuationLines()) {
            addLine();
            return;
        }
        if (!isEmpty) {
            finalizeBlocks(arrayList);
        }
        if (!blockParser2.isContainer()) {
            addLine();
        } else {
            if (isBlank()) {
                return;
            }
            addChild(new ParagraphParser());
            addLine();
        }
    }

    private void findNextNonSpace() {
        int i = this.index;
        int i2 = this.column;
        this.blank = true;
        int length = this.line.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.line.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.blank = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.nextNonSpace = i;
        this.nextNonSpaceColumn = i2;
        this.indent = i2 - this.column;
    }

    private void setNewIndex(int i) {
        int i2 = this.nextNonSpace;
        if (i >= i2) {
            this.index = i2;
            this.column = this.nextNonSpaceColumn;
        }
        int length = this.line.length();
        while (true) {
            int i3 = this.index;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                advance();
            }
        }
        this.columnIsInTab = false;
    }

    private void setNewColumn(int i) {
        int i2;
        int i3 = this.nextNonSpaceColumn;
        if (i >= i3) {
            this.index = this.nextNonSpace;
            this.column = i3;
        }
        int length = this.line.length();
        while (true) {
            i2 = this.column;
            if (i2 >= i || this.index == length) {
                break;
            } else {
                advance();
            }
        }
        if (i2 > i) {
            this.index--;
            this.column = i;
            this.columnIsInTab = true;
            return;
        }
        this.columnIsInTab = false;
    }

    private void advance() {
        if (this.line.charAt(this.index) == '\t') {
            this.index++;
            int i = this.column;
            this.column = i + Parsing.columnsToNextTabStop(i);
        } else {
            this.index++;
            this.column++;
        }
    }

    private void addLine() {
        CharSequence subSequence;
        if (this.columnIsInTab) {
            int i = this.index + 1;
            CharSequence charSequence = this.line;
            CharSequence subSequence2 = charSequence.subSequence(i, charSequence.length());
            int columnsToNextTabStop = Parsing.columnsToNextTabStop(this.column);
            StringBuilder sb = new StringBuilder(subSequence2.length() + columnsToNextTabStop);
            for (int i2 = 0; i2 < columnsToNextTabStop; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.line;
            subSequence = charSequence2.subSequence(this.index, charSequence2.length());
        }
        getActiveBlockParser().addLine(subSequence);
    }

    private BlockStartImpl findBlockStart(BlockParser blockParser) {
        MatchedBlockParserImpl matchedBlockParserImpl = new MatchedBlockParserImpl(blockParser);
        Iterator it = this.blockParserFactories.iterator();
        while (it.hasNext()) {
            BlockStart tryStart = ((BlockParserFactory) it.next()).tryStart(this, matchedBlockParserImpl);
            if (tryStart instanceof BlockStartImpl) {
                return (BlockStartImpl) tryStart;
            }
        }
        return null;
    }

    private void finalize(BlockParser blockParser) {
        if (getActiveBlockParser() == blockParser) {
            deactivateBlockParser();
        }
        if (blockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) blockParser);
        }
        blockParser.closeBlock();
    }

    private void addDefinitionsFrom(ParagraphParser paragraphParser) {
        for (LinkReferenceDefinition linkReferenceDefinition : paragraphParser.getDefinitions()) {
            paragraphParser.getBlock().insertBefore(linkReferenceDefinition);
            String label = linkReferenceDefinition.getLabel();
            if (!this.definitions.containsKey(label)) {
                this.definitions.put(label, linkReferenceDefinition);
            }
        }
    }

    private void processInlines() {
        InlineParser create = this.inlineParserFactory.create(new InlineParserContextImpl(this.delimiterProcessors, this.definitions));
        Iterator it = this.allBlockParsers.iterator();
        while (it.hasNext()) {
            ((BlockParser) it.next()).parseInlines(create);
        }
    }

    private BlockParser addChild(BlockParser blockParser) {
        while (!getActiveBlockParser().canContain(blockParser.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(blockParser.getBlock());
        activateBlockParser(blockParser);
        return blockParser;
    }

    private void activateBlockParser(BlockParser blockParser) {
        this.activeBlockParsers.add(blockParser);
        this.allBlockParsers.add(blockParser);
    }

    private void deactivateBlockParser() {
        this.activeBlockParsers.remove(r0.size() - 1);
    }

    private void prepareActiveBlockParserForReplacement() {
        BlockParser activeBlockParser = getActiveBlockParser();
        deactivateBlockParser();
        this.allBlockParsers.remove(activeBlockParser);
        if (activeBlockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) activeBlockParser);
        }
        activeBlockParser.getBlock().unlink();
    }

    private void finalizeBlocks(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize((BlockParser) list.get(size));
        }
    }

    private Document finalizeAndProcess() {
        finalizeBlocks(this.activeBlockParsers);
        processInlines();
        return this.documentBlockParser.getBlock();
    }

    private static class MatchedBlockParserImpl implements MatchedBlockParser {
        private final BlockParser matchedBlockParser;

        public MatchedBlockParserImpl(BlockParser blockParser) {
            this.matchedBlockParser = blockParser;
        }

        @Override // org.commonmark.parser.block.MatchedBlockParser
        public BlockParser getMatchedBlockParser() {
            return this.matchedBlockParser;
        }

        @Override // org.commonmark.parser.block.MatchedBlockParser
        public CharSequence getParagraphContent() {
            BlockParser blockParser = this.matchedBlockParser;
            if (!(blockParser instanceof ParagraphParser)) {
                return null;
            }
            CharSequence contentString = ((ParagraphParser) blockParser).getContentString();
            if (contentString.length() == 0) {
                return null;
            }
            return contentString;
        }
    }
}
