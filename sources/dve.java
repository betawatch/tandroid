// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class dve {
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
                    case jn7.u0 /* 58 */:
                    case jn7.v0 /* 59 */:
                    case jn7.w0 /* 60 */:
                    case jn7.x0 /* 61 */:
                    case jn7.y0 /* 62 */:
                    case jn7.z0 /* 63 */:
                    case '@':
                        return true;
                    default:
                        switch (charAt) {
                            case jn7.b1 /* 91 */:
                            case jn7.c1 /* 92 */:
                            case jn7.d1 /* 93 */:
                            case jn7.e1 /* 94 */:
                            case jn7.f1 /* 95 */:
                            case '`':
                                return true;
                            default:
                                switch (charAt) {
                                    case jn7.G1 /* 123 */:
                                    case jn7.H1 /* 124 */:
                                    case jn7.I1 /* 125 */:
                                    case jn7.J1 /* 126 */:
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
