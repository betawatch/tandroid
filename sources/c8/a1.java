package c8;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class a1 {
    public static boolean a(int i7, CharSequence charSequence) {
        if (i7 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i7);
        switch (charAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (charAt) {
                    case ls.v0 /* 58 */:
                    case ls.w0 /* 59 */:
                    case ls.x0 /* 60 */:
                    case ls.y0 /* 61 */:
                    case ls.z0 /* 62 */:
                    case ls.A0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case ls.c1 /* 91 */:
                            case ls.d1 /* 92 */:
                            case ls.e1 /* 93 */:
                            case ls.f1 /* 94 */:
                            case ls.g1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case ls.H1 /* 123 */:
                                    case ls.I1 /* 124 */:
                                    case ls.J1 /* 125 */:
                                    case ls.K1 /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c10, int i7, int i10, CharSequence charSequence) {
        while (i7 < i10) {
            if (charSequence.charAt(i7) != c10) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static int c(int i7, int i10, CharSequence charSequence) {
        while (i7 < i10) {
            char charAt = charSequence.charAt(i7);
            if (charAt != '\t' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i10;
    }
}
