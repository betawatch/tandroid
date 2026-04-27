package io.noties.markwon.html;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class AppendableUtils {
    static void appendQuietly(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void appendQuietly(Appendable appendable, CharSequence charSequence) {
        try {
            appendable.append(charSequence);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
