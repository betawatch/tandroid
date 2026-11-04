package b8;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class dc {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i3, CharSequence charSequence) {
        char charAt;
        if (i3 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i3) == '<') {
            while (true) {
                i3++;
                if (i3 >= charSequence.length() || (charAt = charSequence.charAt(i3)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i3 + 1;
                }
                if (charAt == '\\') {
                    int i10 = i3 + 1;
                    if (ec.a(i10, charSequence)) {
                        i3 = i10;
                    }
                }
            }
            return -1;
        }
        int i11 = 0;
        int i12 = i3;
        while (i12 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i12 != i3) {
                    return i12;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i13 = i12 + 1;
                if (ec.a(i13, charSequence)) {
                    i12 = i13;
                }
            } else if (charAt2 == '(') {
                i11++;
                if (i11 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i12 != i3) {
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

    public static int b(int i3, CharSequence charSequence) {
        while (i3 < charSequence.length()) {
            switch (charSequence.charAt(i3)) {
                case hs.c1 /* 91 */:
                    return -1;
                case hs.d1 /* 92 */:
                    int i10 = i3 + 1;
                    if (!ec.a(i10, charSequence)) {
                        break;
                    } else {
                        i3 = i10;
                        break;
                    }
                case hs.e1 /* 93 */:
                    return i3;
            }
            i3++;
        }
        return charSequence.length();
    }

    public static int c(int i3, CharSequence charSequence) {
        if (i3 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i3);
        char c2 = '\"';
        if (charAt != '\"') {
            c2 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c2 = ')';
            }
        }
        int d = d(charSequence, i3 + 1, c2);
        if (d != -1 && d < charSequence.length() && charSequence.charAt(d) == c2) {
            return d + 1;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i3, char c2) {
        while (i3 < charSequence.length()) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\\') {
                int i10 = i3 + 1;
                if (ec.a(i10, charSequence)) {
                    i3 = i10;
                    i3++;
                }
            }
            if (charAt == c2) {
                return i3;
            }
            if (c2 == ')' && charAt == '(') {
                return -1;
            }
            i3++;
        }
        return charSequence.length();
    }
}
