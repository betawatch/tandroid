package io.noties.markwon.ext.latex;

import io.noties.markwon.inlineparser.InlineProcessor;
import java.util.regex.Pattern;
import org.commonmark.node.Node;

/* loaded from: classes3.dex */
class JLatexMathInlineProcessor extends InlineProcessor {
    private static final Pattern RE = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    public char specialCharacter() {
        return '$';
    }

    JLatexMathInlineProcessor() {
    }

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    protected Node parse() {
        String match = match(RE);
        if (match == null) {
            return null;
        }
        JLatexMathNode jLatexMathNode = new JLatexMathNode();
        jLatexMathNode.latex(match.substring(2, match.length() - 2));
        return jLatexMathNode;
    }
}
