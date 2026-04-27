package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Code;
import org.commonmark.node.Node;

/* loaded from: classes3.dex */
public class BackticksInlineProcessor extends InlineProcessor {
    private static final Pattern TICKS = Pattern.compile("`+");
    private static final Pattern TICKS_HERE = Pattern.compile("^`+");

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    public char specialCharacter() {
        return '`';
    }

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    protected Node parse() {
        String match;
        String match2 = match(TICKS_HERE);
        if (match2 == null) {
            return null;
        }
        int i = this.index;
        do {
            match = match(TICKS);
            if (match == null) {
                this.index = i;
                return text(match2);
            }
        } while (!match.equals(match2));
        Code code = new Code();
        String replace = this.input.substring(i, this.index - match2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && Parsing.hasNonSpace(replace)) {
            replace = replace.substring(1, replace.length() - 1);
        }
        code.setLiteral(replace);
        return code;
    }
}
