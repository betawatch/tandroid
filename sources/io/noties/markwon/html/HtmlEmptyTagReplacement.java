package io.noties.markwon.html;

/* loaded from: classes3.dex */
public class HtmlEmptyTagReplacement {
    public static HtmlEmptyTagReplacement create() {
        return new HtmlEmptyTagReplacement();
    }

    public String replace(HtmlTag htmlTag) {
        String name = htmlTag.name();
        if ("br".equals(name)) {
            return "\n";
        }
        if ("img".equals(name)) {
            String str = (String) htmlTag.attributes().get("alt");
            return (str == null || str.length() == 0) ? "￼" : str;
        }
        if ("iframe".equals(name)) {
            return " ";
        }
        return null;
    }
}
