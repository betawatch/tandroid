package k7;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class t {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i10, CharSequence charSequence) {
        char charAt;
        if (i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i10) == '<') {
            while (true) {
                i10++;
                if (i10 >= charSequence.length() || (charAt = charSequence.charAt(i10)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i10 + 1;
                }
                if (charAt == '\\') {
                    int i11 = i10 + 1;
                    if (u.a(i11, charSequence)) {
                        i10 = i11;
                    }
                }
            }
            return -1;
        }
        int i12 = 0;
        int i13 = i10;
        while (i13 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i13 != i10) {
                    return i13;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i14 = i13 + 1;
                if (u.a(i14, charSequence)) {
                    i13 = i14;
                }
            } else if (charAt2 == '(') {
                i12++;
                if (i12 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i13 != i10) {
                    }
                }
            } else {
                if (i12 == 0) {
                    return i13;
                }
                i12--;
            }
            i13++;
        }
        return charSequence.length();
    }

    public static int b(int i10, CharSequence charSequence) {
        while (i10 < charSequence.length()) {
            switch (charSequence.charAt(i10)) {
                case '[':
                    return -1;
                case '\\':
                    int i11 = i10 + 1;
                    if (!u.a(i11, charSequence)) {
                        break;
                    } else {
                        i10 = i11;
                        break;
                    }
                case ']':
                    return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static int c(int i10, CharSequence charSequence) {
        if (i10 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i10);
        char c3 = '\"';
        if (charAt != '\"') {
            c3 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c3 = ')';
            }
        }
        int d = d(charSequence, i10 + 1, c3);
        if (d != -1 && d < charSequence.length() && charSequence.charAt(d) == c3) {
            return d + 1;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i10, char c3) {
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (u.a(i11, charSequence)) {
                    i10 = i11;
                    i10++;
                }
            }
            if (charAt == c3) {
                return i10;
            }
            if (c3 == ')' && charAt == '(') {
                return -1;
            }
            i10++;
        }
        return charSequence.length();
    }
}
