// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class lqe {
    public static boolean a(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
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
                    case kk7.u0 /* 58 */:
                    case kk7.v0 /* 59 */:
                    case kk7.w0 /* 60 */:
                    case kk7.x0 /* 61 */:
                    case kk7.y0 /* 62 */:
                    case kk7.z0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case kk7.b1 /* 91 */:
                            case kk7.c1 /* 92 */:
                            case kk7.d1 /* 93 */:
                            case kk7.e1 /* 94 */:
                            case kk7.f1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case kk7.G1 /* 123 */:
                                    case kk7.H1 /* 124 */:
                                    case kk7.I1 /* 125 */:
                                    case kk7.J1 /* 126 */:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c, String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int c(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }
}
