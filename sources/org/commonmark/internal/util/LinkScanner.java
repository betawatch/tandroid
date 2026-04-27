package org.commonmark.internal.util;

/* loaded from: classes3.dex */
public abstract class LinkScanner {
    public static int scanLinkLabelContent(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!Parsing.isEscapable(charSequence, i2)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int scanLinkDestination(CharSequence charSequence, int i) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) != '<') {
            return scanLinkDestinationWithBalancedParens(charSequence, i);
        }
        while (true) {
            i++;
            if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                break;
            }
            if (charAt == '>') {
                return i + 1;
            }
            if (charAt == '\\') {
                int i2 = i + 1;
                if (Parsing.isEscapable(charSequence, i2)) {
                    i = i2;
                }
            }
        }
        return -1;
    }

    public static int scanLinkTitle(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i);
        char c = '\"';
        if (charAt != '\"') {
            c = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c = ')';
            }
        }
        int scanLinkTitleContent = scanLinkTitleContent(charSequence, i + 1, c);
        if (scanLinkTitleContent != -1 && scanLinkTitleContent < charSequence.length() && charSequence.charAt(scanLinkTitleContent) == c) {
            return scanLinkTitleContent + 1;
        }
        return -1;
    }

    public static int scanLinkTitleContent(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (Parsing.isEscapable(charSequence, i2)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }

    private static int scanLinkDestinationWithBalancedParens(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 < charSequence.length()) {
            char charAt = charSequence.charAt(i3);
            if (charAt == 0 || charAt == ' ') {
                if (i3 != i) {
                    return i3;
                }
                return -1;
            }
            if (charAt == '\\') {
                int i4 = i3 + 1;
                if (Parsing.isEscapable(charSequence, i4)) {
                    i3 = i4;
                }
            } else if (charAt == '(') {
                i2++;
                if (i2 > 32) {
                    return -1;
                }
            } else if (charAt != ')') {
                if (Character.isISOControl(charAt)) {
                    if (i3 != i) {
                        return i3;
                    }
                    return -1;
                }
            } else {
                if (i2 == 0) {
                    return i3;
                }
                i2--;
            }
            i3++;
        }
        return charSequence.length();
    }
}
