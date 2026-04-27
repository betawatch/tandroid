package org.commonmark.internal;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.Heading;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

/* loaded from: classes3.dex */
public class HeadingParser extends AbstractBlockParser {
    private final Heading block;
    private final String content;

    public HeadingParser(int i, String str) {
        Heading heading = new Heading();
        this.block = heading;
        heading.setLevel(i);
        this.content = str;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.BlockParser
    public BlockContinue tryContinue(ParserState parserState) {
        return BlockContinue.none();
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser, org.commonmark.parser.block.BlockParser
    public void parseInlines(InlineParser inlineParser) {
        inlineParser.parse(this.content, this.block);
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override // org.commonmark.parser.block.BlockParserFactory
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            CharSequence paragraphContent;
            if (parserState.getIndent() >= Parsing.CODE_BLOCK_INDENT) {
                return BlockStart.none();
            }
            CharSequence line = parserState.getLine();
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            HeadingParser atxHeading = HeadingParser.getAtxHeading(line, nextNonSpaceIndex);
            if (atxHeading != null) {
                return BlockStart.of(atxHeading).atIndex(line.length());
            }
            int setextHeadingLevel = HeadingParser.getSetextHeadingLevel(line, nextNonSpaceIndex);
            if (setextHeadingLevel > 0 && (paragraphContent = matchedBlockParser.getParagraphContent()) != null) {
                return BlockStart.of(new HeadingParser(setextHeadingLevel, paragraphContent.toString())).atIndex(line.length()).replaceActiveBlockParser();
            }
            return BlockStart.none();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HeadingParser getAtxHeading(CharSequence charSequence, int i) {
        int skip = Parsing.skip('#', charSequence, i, charSequence.length()) - i;
        if (skip == 0 || skip > 6) {
            return null;
        }
        int i2 = i + skip;
        if (i2 >= charSequence.length()) {
            return new HeadingParser(skip, "");
        }
        char charAt = charSequence.charAt(i2);
        if (charAt != ' ' && charAt != '\t') {
            return null;
        }
        int skipSpaceTabBackwards = Parsing.skipSpaceTabBackwards(charSequence, charSequence.length() - 1, i2);
        int skipBackwards = Parsing.skipBackwards('#', charSequence, skipSpaceTabBackwards, i2);
        int skipSpaceTabBackwards2 = Parsing.skipSpaceTabBackwards(charSequence, skipBackwards, i2);
        if (skipSpaceTabBackwards2 != skipBackwards) {
            return new HeadingParser(skip, charSequence.subSequence(i2, skipSpaceTabBackwards2 + 1).toString());
        }
        return new HeadingParser(skip, charSequence.subSequence(i2, skipSpaceTabBackwards + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getSetextHeadingLevel(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '-') {
            if (charAt != '=') {
                return 0;
            }
            if (isSetextHeadingRest(charSequence, i + 1, '=')) {
                return 1;
            }
        }
        return isSetextHeadingRest(charSequence, i + 1, '-') ? 2 : 0;
    }

    private static boolean isSetextHeadingRest(CharSequence charSequence, int i, char c) {
        return Parsing.skipSpaceTab(charSequence, Parsing.skip(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }
}
