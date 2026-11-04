package b8;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ec {
    public static boolean a(int i3, CharSequence charSequence) {
        if (i3 >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i3);
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
                    case hs.v0 /* 58 */:
                    case hs.w0 /* 59 */:
                    case hs.x0 /* 60 */:
                    case hs.y0 /* 61 */:
                    case hs.z0 /* 62 */:
                    case hs.A0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case hs.c1 /* 91 */:
                            case hs.d1 /* 92 */:
                            case hs.e1 /* 93 */:
                            case hs.f1 /* 94 */:
                            case hs.g1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case hs.H1 /* 123 */:
                                    case hs.I1 /* 124 */:
                                    case hs.J1 /* 125 */:
                                    case hs.K1 /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c2, int i3, int i10, CharSequence charSequence) {
        while (i3 < i10) {
            if (charSequence.charAt(i3) != c2) {
                return i3;
            }
            i3++;
        }
        return i10;
    }

    public static int c(int i3, int i10, CharSequence charSequence) {
        while (i3 < i10) {
            char charAt = charSequence.charAt(i3);
            if (charAt != '\t' && charAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i10;
    }
}
