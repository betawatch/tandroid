package org.commonmark.internal;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.BulletList;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.node.OrderedList;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

/* loaded from: classes3.dex */
public class ListBlockParser extends AbstractBlockParser {
    private final ListBlock block;
    private boolean hadBlankLine;
    private int linesAfterBlank;

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public boolean isContainer() {
        return true;
    }

    public ListBlockParser(ListBlock listBlock) {
        this.block = listBlock;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public boolean canContain(Block block) {
        if (!(block instanceof ListItem)) {
            return false;
        }
        if (this.hadBlankLine && this.linesAfterBlank == 1) {
            this.block.setTight(false);
            this.hadBlankLine = false;
        }
        return true;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public BlockContinue tryContinue(ParserState parserState) {
        if (parserState.isBlank()) {
            this.hadBlankLine = true;
            this.linesAfterBlank = 0;
        } else if (this.hadBlankLine) {
            this.linesAfterBlank++;
        }
        return BlockContinue.atIndex(parserState.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ListData parseList(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        ListMarkerData parseListMarker = parseListMarker(charSequence, i);
        if (parseListMarker == null) {
            return null;
        }
        ListBlock listBlock = parseListMarker.listBlock;
        int i3 = parseListMarker.indexAfterMarker;
        int i4 = i2 + (i3 - i);
        int length = charSequence.length();
        int i5 = i4;
        while (true) {
            if (i3 >= length) {
                z2 = false;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    z2 = true;
                    break;
                }
                i5++;
            } else {
                i5 += Parsing.columnsToNextTabStop(i5);
            }
            i3++;
        }
        if (z && (((listBlock instanceof OrderedList) && ((OrderedList) listBlock).getStartNumber() != 1) || !z2)) {
            return null;
        }
        if (!z2 || i5 - i4 > Parsing.CODE_BLOCK_INDENT) {
            i5 = i4 + 1;
        }
        return new ListData(listBlock, i5);
    }

    private static ListMarkerData parseListMarker(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt == '*' || charAt == '+' || charAt == '-') {
            int i2 = i + 1;
            if (!isSpaceTabOrEnd(charSequence, i2)) {
                return null;
            }
            BulletList bulletList = new BulletList();
            bulletList.setBulletMarker(charAt);
            return new ListMarkerData(bulletList, i2);
        }
        return parseOrderedList(charSequence, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ListMarkerData parseOrderedList(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = i; i3 < length; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == ')' || charAt == '.') {
                if (i2 >= 1) {
                    int i4 = i3 + 1;
                    if (isSpaceTabOrEnd(charSequence, i4)) {
                        String charSequence2 = charSequence.subSequence(i, i3).toString();
                        OrderedList orderedList = new OrderedList();
                        orderedList.setStartNumber(Integer.parseInt(charSequence2));
                        orderedList.setDelimiter(charAt);
                        return new ListMarkerData(orderedList, i4);
                    }
                }
                return null;
            }
            switch (charAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i2++;
                    if (i2 > 9) {
                        return null;
                    }
                default:
                    return null;
            }
            while (i3 < length) {
            }
        }
        return null;
    }

    private static boolean isSpaceTabOrEnd(CharSequence charSequence, int i) {
        char charAt;
        return i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\t' || charAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean listsMatch(ListBlock listBlock, ListBlock listBlock2) {
        if ((listBlock instanceof BulletList) && (listBlock2 instanceof BulletList)) {
            return equals(Character.valueOf(((BulletList) listBlock).getBulletMarker()), Character.valueOf(((BulletList) listBlock2).getBulletMarker()));
        }
        if ((listBlock instanceof OrderedList) && (listBlock2 instanceof OrderedList)) {
            return equals(Character.valueOf(((OrderedList) listBlock).getDelimiter()), Character.valueOf(((OrderedList) listBlock2).getDelimiter()));
        }
        return false;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            BlockParser matchedBlockParser2 = matchedBlockParser.getMatchedBlockParser();
            if (parserState.getIndent() < Parsing.CODE_BLOCK_INDENT) {
                ListData parseList = ListBlockParser.parseList(parserState.getLine(), parserState.getNextNonSpaceIndex(), parserState.getColumn() + parserState.getIndent(), matchedBlockParser.getParagraphContent() != null);
                if (parseList == null) {
                    return BlockStart.none();
                }
                int i = parseList.contentColumn;
                ListItemParser listItemParser = new ListItemParser(i - parserState.getColumn());
                if ((matchedBlockParser2 instanceof ListBlockParser) && ListBlockParser.listsMatch((ListBlock) matchedBlockParser2.getBlock(), parseList.listBlock)) {
                    return BlockStart.of(listItemParser).atColumn(i);
                }
                ListBlockParser listBlockParser = new ListBlockParser(parseList.listBlock);
                parseList.listBlock.setTight(true);
                return BlockStart.of(listBlockParser, listItemParser).atColumn(i);
            }
            return BlockStart.none();
        }
    }

    private static class ListData {
        final int contentColumn;
        final ListBlock listBlock;

        ListData(ListBlock listBlock, int i) {
            this.listBlock = listBlock;
            this.contentColumn = i;
        }
    }

    private static class ListMarkerData {
        final int indexAfterMarker;
        final ListBlock listBlock;

        ListMarkerData(ListBlock listBlock, int i) {
            this.listBlock = listBlock;
            this.indexAfterMarker = i;
        }
    }
}
