package c8;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class w0 {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i7, CharSequence charSequence) {
        char charAt;
        if (i7 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i7) == '<') {
            while (true) {
                i7++;
                if (i7 >= charSequence.length() || (charAt = charSequence.charAt(i7)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i7 + 1;
                }
                if (charAt == '\\') {
                    int i10 = i7 + 1;
                    if (x0.a(i10, charSequence)) {
                        i7 = i10;
                    }
                }
            }
            return -1;
        }
        int i11 = 0;
        int i12 = i7;
        while (i12 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i12 != i7) {
                    return i12;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i13 = i12 + 1;
                if (x0.a(i13, charSequence)) {
                    i12 = i13;
                }
            } else if (charAt2 == '(') {
                i11++;
                if (i11 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i12 != i7) {
                    }
                }
            } else {
                if (i11 == 0) {
                    return i12;
                }
                i11--;
            }
            i12++;
        }
        return charSequence.length();
    }

    public static int b(int i7, CharSequence charSequence) {
        while (i7 < charSequence.length()) {
            switch (charSequence.charAt(i7)) {
                case qs.c1 /* 91 */:
                    return -1;
                case qs.d1 /* 92 */:
                    int i10 = i7 + 1;
                    if (!x0.a(i10, charSequence)) {
                        break;
                    } else {
                        i7 = i10;
                        break;
                    }
                case qs.e1 /* 93 */:
                    return i7;
            }
            i7++;
        }
        return charSequence.length();
    }

    public static int c(int i7, CharSequence charSequence) {
        if (i7 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i7);
        char c10 = '\"';
        if (charAt != '\"') {
            c10 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c10 = ')';
            }
        }
        int d = d(charSequence, i7 + 1, c10);
        if (d != -1 && d < charSequence.length() && charSequence.charAt(d) == c10) {
            return d + 1;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i7, char c10) {
        while (i7 < charSequence.length()) {
            char charAt = charSequence.charAt(i7);
            if (charAt == '\\') {
                int i10 = i7 + 1;
                if (x0.a(i10, charSequence)) {
                    i7 = i10;
                    i7++;
                }
            }
            if (charAt == c10) {
                return i7;
            }
            if (c10 == ')' && charAt == '(') {
                return -1;
            }
            i7++;
        }
        return charSequence.length();
    }
}
