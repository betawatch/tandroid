package io.noties.markwon.inlineparser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.Delimiter;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.inline.UnderscoreDelimiterProcessor;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserContext;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes3.dex */
public class MarkwonInlineParser implements InlineParser, MarkwonInlineParserContext {
    private Node block;
    private final Map delimiterProcessors;
    private int index;
    private final InlineParserContext inlineParserContext;
    private final Map inlineProcessors;
    private String input;
    private Bracket lastBracket;
    private Delimiter lastDelimiter;
    private final boolean referencesEnabled;
    private final BitSet specialCharacters;
    private static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    static final Pattern WHITESPACE = Pattern.compile("\\s+");

    public interface FactoryBuilder {
        FactoryBuilder addInlineProcessor(InlineProcessor inlineProcessor);

        InlineParserFactory build();
    }

    public static FactoryBuilder factoryBuilder() {
        return new FactoryBuilderImpl().includeDefaults();
    }

    public MarkwonInlineParser(InlineParserContext inlineParserContext, boolean z, List list, List list2) {
        this.inlineParserContext = inlineParserContext;
        this.referencesEnabled = z;
        Map calculateInlines = calculateInlines(list);
        this.inlineProcessors = calculateInlines;
        Map calculateDelimiterProcessors = calculateDelimiterProcessors(list2);
        this.delimiterProcessors = calculateDelimiterProcessors;
        this.specialCharacters = calculateSpecialCharacters(calculateInlines.keySet(), calculateDelimiterProcessors.keySet());
    }

    private static Map calculateInlines(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InlineProcessor inlineProcessor = (InlineProcessor) it.next();
            char specialCharacter = inlineProcessor.specialCharacter();
            List list2 = (List) hashMap.get(Character.valueOf(specialCharacter));
            if (list2 == null) {
                list2 = new ArrayList(1);
                hashMap.put(Character.valueOf(specialCharacter), list2);
            }
            list2.add(inlineProcessor);
        }
        return hashMap;
    }

    private static BitSet calculateSpecialCharacters(Set set, Set set2) {
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        return bitSet;
    }

    private static Map calculateDelimiterProcessors(List list) {
        HashMap hashMap = new HashMap();
        addDelimiterProcessors(list, hashMap);
        return hashMap;
    }

    private static void addDelimiterProcessors(Iterable iterable, Map map) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) it.next();
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) map.get(Character.valueOf(openingCharacter));
                if (delimiterProcessor2 != null && delimiterProcessor2.getOpeningCharacter() == delimiterProcessor2.getClosingCharacter()) {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(openingCharacter);
                        staggeredDelimiterProcessor2.add(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.add(delimiterProcessor);
                    map.put(Character.valueOf(openingCharacter), staggeredDelimiterProcessor);
                } else {
                    addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map);
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, map);
            }
        }
    }

    private static void addDelimiterProcessorForChar(char c, DelimiterProcessor delimiterProcessor, Map map) {
        if (((DelimiterProcessor) map.put(Character.valueOf(c), delimiterProcessor)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    @Override // org.commonmark.parser.InlineParser
    public void parse(String str, Node node) {
        reset(str.trim());
        this.block = node;
        while (true) {
            Node parseInline = parseInline();
            if (parseInline != null) {
                node.appendChild(parseInline);
            } else {
                processDelimiters(null);
                InlineParserUtils.mergeChildTextNodes(node);
                return;
            }
        }
    }

    private void reset(String str) {
        this.input = str;
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
    }

    private Node parseInline() {
        char peek = peek();
        Node node = null;
        if (peek == 0) {
            return null;
        }
        List list = (List) this.inlineProcessors.get(Character.valueOf(peek));
        if (list != null) {
            int i = this.index;
            Iterator it = list.iterator();
            while (it.hasNext() && (node = ((InlineProcessor) it.next()).parse(this)) == null) {
                this.index = i;
            }
        } else {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(peek));
            if (delimiterProcessor != null) {
                node = parseDelimiters(delimiterProcessor, peek);
            } else {
                node = parseString();
            }
        }
        if (node != null) {
            return node;
        }
        this.index++;
        return text(String.valueOf(peek));
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public String match(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        return matcher.group();
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public Text text(String str) {
        return new Text(str);
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public Text text(String str, int i, int i2) {
        return new Text(str.substring(i, i2));
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public LinkReferenceDefinition getLinkReferenceDefinition(String str) {
        if (this.referencesEnabled) {
            return this.inlineParserContext.getLinkReferenceDefinition(str);
        }
        return null;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public Node block() {
        return this.block;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public String input() {
        return this.input;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public int index() {
        return this.index;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public void setIndex(int i) {
        this.index = i;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public Bracket lastBracket() {
        return this.lastBracket;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public Delimiter lastDelimiter() {
        return this.lastDelimiter;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public void addBracket(Bracket bracket) {
        Bracket bracket2 = this.lastBracket;
        if (bracket2 != null) {
            bracket2.bracketAfter = true;
        }
        this.lastBracket = bracket;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public void removeLastBracket() {
        this.lastBracket = this.lastBracket.previous;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public void spnl() {
        match(SPNL);
    }

    private Node parseDelimiters(DelimiterProcessor delimiterProcessor, char c) {
        DelimiterData scanDelimiters = scanDelimiters(delimiterProcessor, c);
        if (scanDelimiters == null) {
            return null;
        }
        int i = scanDelimiters.count;
        int i2 = this.index;
        int i3 = i2 + i;
        this.index = i3;
        Text text = text(this.input, i2, i3);
        Delimiter delimiter = new Delimiter(text, c, scanDelimiters.canOpen, scanDelimiters.canClose, this.lastDelimiter);
        this.lastDelimiter = delimiter;
        delimiter.length = i;
        delimiter.originalLength = i;
        Delimiter delimiter2 = delimiter.previous;
        if (delimiter2 != null) {
            delimiter2.next = delimiter;
        }
        return text;
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public String parseLinkDestination() {
        String substring;
        int scanLinkDestination = LinkScanner.scanLinkDestination(this.input, this.index);
        if (scanLinkDestination == -1) {
            return null;
        }
        if (peek() == '<') {
            substring = this.input.substring(this.index + 1, scanLinkDestination - 1);
        } else {
            substring = this.input.substring(this.index, scanLinkDestination);
        }
        this.index = scanLinkDestination;
        return Escaping.unescapeString(substring);
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public String parseLinkTitle() {
        int scanLinkTitle = LinkScanner.scanLinkTitle(this.input, this.index);
        if (scanLinkTitle == -1) {
            return null;
        }
        String substring = this.input.substring(this.index + 1, scanLinkTitle - 1);
        this.index = scanLinkTitle;
        return Escaping.unescapeString(substring);
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public int parseLinkLabel() {
        if (this.index < this.input.length() && this.input.charAt(this.index) == '[') {
            int i = this.index + 1;
            int scanLinkLabelContent = LinkScanner.scanLinkLabelContent(this.input, i);
            int i2 = scanLinkLabelContent - i;
            if (scanLinkLabelContent != -1 && i2 <= 999 && scanLinkLabelContent < this.input.length() && this.input.charAt(scanLinkLabelContent) == ']') {
                this.index = scanLinkLabelContent + 1;
                return i2 + 2;
            }
        }
        return 0;
    }

    private Node parseString() {
        int i = this.index;
        int length = this.input.length();
        while (true) {
            int i2 = this.index;
            if (i2 == length || this.specialCharacters.get(this.input.charAt(i2))) {
                break;
            }
            this.index++;
        }
        int i3 = this.index;
        if (i != i3) {
            return text(this.input, i, i3);
        }
        return null;
    }

    private DelimiterData scanDelimiters(DelimiterProcessor delimiterProcessor, char c) {
        String substring;
        boolean z;
        int i = this.index;
        boolean z2 = false;
        int i2 = 0;
        while (peek() == c) {
            i2++;
            this.index++;
        }
        if (i2 < delimiterProcessor.getMinLength()) {
            this.index = i;
            return null;
        }
        String str = "\n";
        if (i == 0) {
            substring = "\n";
        } else {
            substring = this.input.substring(i - 1, i);
        }
        char peek = peek();
        if (peek != 0) {
            str = String.valueOf(peek);
        }
        Pattern pattern = PUNCTUATION;
        boolean matches = pattern.matcher(substring).matches();
        Pattern pattern2 = UNICODE_WHITESPACE_CHAR;
        boolean matches2 = pattern2.matcher(substring).matches();
        boolean matches3 = pattern.matcher(str).matches();
        boolean matches4 = pattern2.matcher(str).matches();
        boolean z3 = !matches4 && (!matches3 || matches2 || matches);
        boolean z4 = !matches2 && (!matches || matches4 || matches3);
        if (c == '_') {
            z = z3 && (!z4 || matches);
            if (z4 && (!z3 || matches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c == delimiterProcessor.getOpeningCharacter();
            if (z4 && c == delimiterProcessor.getClosingCharacter()) {
                z2 = true;
            }
            z = z5;
        }
        this.index = i;
        return new DelimiterData(i2, z, z2);
    }

    @Override // io.noties.markwon.inlineparser.MarkwonInlineParserContext
    public void processDelimiters(Delimiter delimiter) {
        boolean z;
        HashMap hashMap = new HashMap();
        Delimiter delimiter2 = this.lastDelimiter;
        while (delimiter2 != null) {
            Delimiter delimiter3 = delimiter2.previous;
            if (delimiter3 == delimiter) {
                break;
            } else {
                delimiter2 = delimiter3;
            }
        }
        while (delimiter2 != null) {
            char c = delimiter2.delimiterChar;
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(c));
            if (!delimiter2.canClose || delimiterProcessor == null) {
                delimiter2 = delimiter2.next;
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter delimiter4 = delimiter2.previous;
                int i = 0;
                boolean z2 = false;
                while (delimiter4 != null && delimiter4 != delimiter && delimiter4 != hashMap.get(Character.valueOf(c))) {
                    if (delimiter4.canOpen && delimiter4.delimiterChar == openingCharacter) {
                        i = delimiterProcessor.getDelimiterUse(delimiter4, delimiter2);
                        z2 = true;
                        if (i > 0) {
                            z = true;
                            break;
                        }
                    }
                    delimiter4 = delimiter4.previous;
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), delimiter2.previous);
                        if (!delimiter2.canOpen) {
                            removeDelimiterKeepNode(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.next;
                } else {
                    Text text = delimiter4.node;
                    Text text2 = delimiter2.node;
                    delimiter4.length -= i;
                    delimiter2.length -= i;
                    text.setLiteral(text.getLiteral().substring(0, text.getLiteral().length() - i));
                    text2.setLiteral(text2.getLiteral().substring(0, text2.getLiteral().length() - i));
                    removeDelimitersBetween(delimiter4, delimiter2);
                    InlineParserUtils.mergeTextNodesBetweenExclusive(text, text2);
                    delimiterProcessor.process(text, text2, i);
                    if (delimiter4.length == 0) {
                        removeDelimiterAndNode(delimiter4);
                    }
                    if (delimiter2.length == 0) {
                        Delimiter delimiter5 = delimiter2.next;
                        removeDelimiterAndNode(delimiter2);
                        delimiter2 = delimiter5;
                    }
                }
            }
        }
        while (true) {
            Delimiter delimiter6 = this.lastDelimiter;
            if (delimiter6 == null || delimiter6 == delimiter) {
                return;
            } else {
                removeDelimiterKeepNode(delimiter6);
            }
        }
    }

    private void removeDelimitersBetween(Delimiter delimiter, Delimiter delimiter2) {
        Delimiter delimiter3 = delimiter2.previous;
        while (delimiter3 != null && delimiter3 != delimiter) {
            Delimiter delimiter4 = delimiter3.previous;
            removeDelimiterKeepNode(delimiter3);
            delimiter3 = delimiter4;
        }
    }

    private void removeDelimiterAndNode(Delimiter delimiter) {
        delimiter.node.unlink();
        removeDelimiter(delimiter);
    }

    private void removeDelimiterKeepNode(Delimiter delimiter) {
        removeDelimiter(delimiter);
    }

    private void removeDelimiter(Delimiter delimiter) {
        Delimiter delimiter2 = delimiter.previous;
        if (delimiter2 != null) {
            delimiter2.next = delimiter.next;
        }
        Delimiter delimiter3 = delimiter.next;
        if (delimiter3 == null) {
            this.lastDelimiter = delimiter2;
        } else {
            delimiter3.previous = delimiter2;
        }
    }

    private static class DelimiterData {
        final boolean canClose;
        final boolean canOpen;
        final int count;

        DelimiterData(int i, boolean z, boolean z2) {
            this.count = i;
            this.canOpen = z;
            this.canClose = z2;
        }
    }

    static class FactoryBuilderImpl implements FactoryBuilder {
        private boolean referencesEnabled;
        private final List inlineProcessors = new ArrayList(3);
        private final List delimiterProcessors = new ArrayList(3);

        FactoryBuilderImpl() {
        }

        @Override // io.noties.markwon.inlineparser.MarkwonInlineParser.FactoryBuilder
        public FactoryBuilder addInlineProcessor(InlineProcessor inlineProcessor) {
            this.inlineProcessors.add(inlineProcessor);
            return this;
        }

        public FactoryBuilder includeDefaults() {
            this.referencesEnabled = true;
            this.inlineProcessors.addAll(Arrays.asList(new AutolinkInlineProcessor(), new BackslashInlineProcessor(), new BackticksInlineProcessor(), new BangInlineProcessor(), new CloseBracketInlineProcessor(), new EntityInlineProcessor(), new HtmlInlineProcessor(), new NewLineInlineProcessor(), new OpenBracketInlineProcessor()));
            this.delimiterProcessors.addAll(Arrays.asList(new AsteriskDelimiterProcessor(), new UnderscoreDelimiterProcessor()));
            return this;
        }

        @Override // io.noties.markwon.inlineparser.MarkwonInlineParser.FactoryBuilder
        public InlineParserFactory build() {
            return new InlineParserFactoryImpl(this.referencesEnabled, this.inlineProcessors, this.delimiterProcessors);
        }
    }

    static class InlineParserFactoryImpl implements InlineParserFactory {
        private final List delimiterProcessors;
        private final List inlineProcessors;
        private final boolean referencesEnabled;

        InlineParserFactoryImpl(boolean z, List list, List list2) {
            this.referencesEnabled = z;
            this.inlineProcessors = list;
            this.delimiterProcessors = list2;
        }

        @Override // org.commonmark.parser.InlineParserFactory
        public InlineParser create(InlineParserContext inlineParserContext) {
            List list;
            List customDelimiterProcessors = inlineParserContext.getCustomDelimiterProcessors();
            int size = customDelimiterProcessors != null ? customDelimiterProcessors.size() : 0;
            if (size > 0) {
                list = new ArrayList(size + this.delimiterProcessors.size());
                list.addAll(this.delimiterProcessors);
                list.addAll(customDelimiterProcessors);
            } else {
                list = this.delimiterProcessors;
            }
            return new MarkwonInlineParser(inlineParserContext, this.referencesEnabled, this.inlineProcessors, list);
        }
    }
}
