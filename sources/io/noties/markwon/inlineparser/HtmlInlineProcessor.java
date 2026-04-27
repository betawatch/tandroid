package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Node;

/* loaded from: classes3.dex */
public class HtmlInlineProcessor extends InlineProcessor {
    private static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    public char specialCharacter() {
        return '<';
    }

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    protected Node parse() {
        String match = match(HTML_TAG);
        if (match == null) {
            return null;
        }
        HtmlInline htmlInline = new HtmlInline();
        htmlInline.setLiteral(match);
        return htmlInline;
    }
}
