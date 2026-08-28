package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d8 {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i9, CharSequence charSequence) {
        char charAt;
        if (i9 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i9) == '<') {
            while (true) {
                i9++;
                if (i9 >= charSequence.length() || (charAt = charSequence.charAt(i9)) == '\n' || charAt == '<') {
                    break;
                }
                if (charAt == '>') {
                    return i9 + 1;
                }
                if (charAt == '\\') {
                    int i10 = i9 + 1;
                    if (e8.a(i10, charSequence)) {
                        i9 = i10;
                    }
                }
            }
            return -1;
        }
        int i11 = 0;
        int i12 = i9;
        while (i12 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 == 0 || charAt2 == ' ') {
                if (i12 != i9) {
                    return i12;
                }
                return -1;
            }
            if (charAt2 == '\\') {
                int i13 = i12 + 1;
                if (e8.a(i13, charSequence)) {
                    i12 = i13;
                }
            } else if (charAt2 == '(') {
                i11++;
                if (i11 > 32) {
                    return -1;
                }
            } else if (charAt2 != ')') {
                if (Character.isISOControl(charAt2)) {
                    if (i12 != i9) {
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

    public static int b(int i9, CharSequence charSequence) {
        while (i9 < charSequence.length()) {
            switch (charSequence.charAt(i9)) {
                case '[':
                    return -1;
                case '\\':
                    int i10 = i9 + 1;
                    if (!e8.a(i10, charSequence)) {
                        break;
                    } else {
                        i9 = i10;
                        break;
                    }
                case ']':
                    return i9;
            }
            i9++;
        }
        return charSequence.length();
    }

    public static int c(int i9, CharSequence charSequence) {
        if (i9 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i9);
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
        int d = d(charSequence, i9 + 1, c10);
        if (d != -1 && d < charSequence.length() && charSequence.charAt(d) == c10) {
            return d + 1;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i9, char c10) {
        while (i9 < charSequence.length()) {
            char charAt = charSequence.charAt(i9);
            if (charAt == '\\') {
                int i10 = i9 + 1;
                if (e8.a(i10, charSequence)) {
                    i9 = i10;
                    i9++;
                }
            }
            if (charAt == c10) {
                return i9;
            }
            if (c10 == ')' && charAt == '(') {
                return -1;
            }
            i9++;
        }
        return charSequence.length();
    }
}
