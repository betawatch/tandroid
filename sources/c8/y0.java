package c8;

import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class y0 {
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
                    case ns.v0 /* 58 */:
                    case ns.w0 /* 59 */:
                    case ns.x0 /* 60 */:
                    case ns.y0 /* 61 */:
                    case ns.z0 /* 62 */:
                    case ns.A0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case ns.c1 /* 91 */:
                            case ns.d1 /* 92 */:
                            case ns.e1 /* 93 */:
                            case ns.f1 /* 94 */:
                            case ns.g1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case ns.H1 /* 123 */:
                                    case ns.I1 /* 124 */:
                                    case ns.J1 /* 125 */:
                                    case ns.K1 /* 126 */:
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
