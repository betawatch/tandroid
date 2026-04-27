package io.noties.markwon.html;

/* loaded from: classes3.dex */
abstract class TrimmingAppender {
    abstract void append(Appendable appendable, String str);

    TrimmingAppender() {
    }

    static TrimmingAppender create() {
        return new Impl();
    }

    static class Impl extends TrimmingAppender {
        Impl() {
        }

        @Override // io.noties.markwon.html.TrimmingAppender
        void append(Appendable appendable, String str) {
            int length;
            CharSequence charSequence = (CharSequence) appendable;
            int length2 = charSequence.length();
            int length3 = str.length();
            boolean z = false;
            for (int i = 0; i < length3; i++) {
                char charAt = str.charAt(i);
                if (Character.isWhitespace(charAt)) {
                    z = true;
                } else {
                    if (z && (length = charSequence.length()) > 0 && !Character.isWhitespace(charSequence.charAt(length - 1))) {
                        AppendableUtils.appendQuietly(appendable, ' ');
                    }
                    AppendableUtils.appendQuietly(appendable, charAt);
                    z = false;
                }
            }
            if (!z || length2 >= charSequence.length()) {
                return;
            }
            AppendableUtils.appendQuietly(appendable, ' ');
        }
    }
}
