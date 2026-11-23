package c8;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class b1 {
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
                    case ks.v0 /* 58 */:
                    case ks.w0 /* 59 */:
                    case ks.x0 /* 60 */:
                    case ks.y0 /* 61 */:
                    case ks.z0 /* 62 */:
                    case ks.A0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case ks.c1 /* 91 */:
                            case ks.d1 /* 92 */:
                            case ks.e1 /* 93 */:
                            case ks.f1 /* 94 */:
                            case ks.g1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case ks.H1 /* 123 */:
                                    case ks.I1 /* 124 */:
                                    case ks.J1 /* 125 */:
                                    case ks.K1 /* 126 */:
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
