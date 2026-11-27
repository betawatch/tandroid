// default package

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bub {
    public static final char[] r;
    public static final int[] s = {8364, jn7.M1, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, jn7.W5, 8249, jn7.I5, jn7.W1, 381, jn7.Y1, jn7.Z1, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, jn7.X5, 8250, jn7.J5, jn7.m2, 382, 376};
    public final ik1 a;
    public final fy7 b;
    public iu5 d;
    public wtb i;
    public final vtb j;
    public final utb k;
    public final qtb l;
    public final stb m;
    public final rtb n;
    public String o;
    public final int[] p;
    public final int[] q;
    public rwb c = rwb.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public bub(ik1 ik1Var, fy7 fy7Var) {
        vtb vtbVar = new vtb(2);
        vtbVar.m = new gy();
        this.j = vtbVar;
        this.k = new utb(3);
        this.l = new qtb(5, (byte) 2);
        this.m = new stb();
        this.n = new rtb();
        this.p = new int[1];
        this.q = new int[2];
        this.a = ik1Var;
        this.b = fy7Var;
    }

    public final void a(rwb rwbVar) {
        this.a.a();
        this.c = rwbVar;
    }

    public final void b(String str) {
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            fy7Var.add(new pi5(ik1Var.f + ik1Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (java.util.Arrays.binarySearch(bub.r, r3[r1.e]) >= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch, boolean z) {
        int i;
        char c;
        int i2;
        char c2;
        char c3;
        char c4;
        char c5;
        int[] iArr;
        int i3;
        String c6;
        char c7;
        int i4;
        int i5;
        ik1 ik1Var = this.a;
        String[] strArr = ik1Var.h;
        char[] cArr = ik1Var.a;
        if (!ik1Var.j() && (ch == null || ch.charValue() != ik1Var.i())) {
            ik1Var.b();
            if (!ik1Var.j()) {
            }
            ik1Var.g = ik1Var.e;
            boolean k = ik1Var.k("#");
            int[] iArr2 = this.p;
            if (k) {
                boolean l = ik1Var.l("X");
                if (l) {
                    ik1Var.b();
                    int i6 = ik1Var.e;
                    while (true) {
                        i5 = ik1Var.e;
                        iArr = null;
                        if (i5 >= ik1Var.c) {
                            c5 = 0;
                            break;
                        }
                        char c8 = cArr[i5];
                        if (c8 < '0' || c8 > '9') {
                            c5 = 0;
                            if (c8 >= 'A') {
                                if (c8 <= 'F') {
                                    continue;
                                }
                            }
                            if (c8 < 'a' || c8 > 'f') {
                                break;
                            }
                        }
                        ik1Var.e = i5 + 1;
                    }
                    c6 = ik1.c(cArr, strArr, i6, i5 - i6);
                } else {
                    c5 = 0;
                    iArr = null;
                    ik1Var.b();
                    int i7 = ik1Var.e;
                    while (true) {
                        i3 = ik1Var.e;
                        if (i3 >= ik1Var.c || (c7 = cArr[i3]) < '0' || c7 > '9') {
                            break;
                        }
                        ik1Var.e = i3 + 1;
                    }
                    c6 = ik1.c(cArr, strArr, i7, i3 - i7);
                }
                if (c6.length() == 0) {
                    b("numeric reference with no numerals");
                    ik1Var.e = ik1Var.g;
                    return iArr;
                }
                if (!ik1Var.k(";")) {
                    b("missing semicolon");
                }
                try {
                    i4 = Integer.valueOf(c6, l ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i4 = -1;
                }
                if (i4 == -1 || ((i4 >= 55296 && i4 <= 57343) || i4 > 1114111)) {
                    b("character outside of valid range");
                    iArr2[c5] = 65533;
                    return iArr2;
                }
                if (i4 >= 128 && i4 < 160) {
                    b("character is not a valid unicode code point");
                    i4 = s[i4 - 128];
                }
                iArr2[c5] = i4;
                return iArr2;
            }
            ik1Var.b();
            int i8 = ik1Var.e;
            while (true) {
                int i9 = ik1Var.e;
                if (i9 >= ik1Var.c || (((c4 = cArr[i9]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                    break;
                }
                ik1Var.e++;
            }
            while (true) {
                i = ik1Var.e;
                if (i >= ik1Var.c || (c3 = cArr[i]) < '0' || c3 > '9') {
                    break;
                }
                ik1Var.e = i + 1;
            }
            String c9 = ik1.c(cArr, strArr, i8, i - i8);
            boolean m = ik1Var.m(';');
            Map map = fn2.a;
            if (!map.containsKey(c9) || !m) {
                ik1Var.e = ik1Var.g;
                if (!m) {
                    return null;
                }
                b("invalid named referenece '" + c9 + "'");
                return null;
            }
            if (z && (ik1Var.o() || ((!ik1Var.j() && (c2 = cArr[ik1Var.e]) >= '0' && c2 <= '9') || ik1Var.n('=', '-', '_')))) {
                ik1Var.e = ik1Var.g;
                return null;
            }
            if (!ik1Var.k(";")) {
                b("missing semicolon");
            }
            String str = (String) map.get(c9);
            int[] iArr3 = this.q;
            if (str != null) {
                i2 = str.length();
                c = 0;
                if (i2 == 1) {
                    iArr3[0] = str.charAt(0);
                } else {
                    iArr3[0] = str.charAt(0);
                    iArr3[1] = str.charAt(1);
                }
            } else {
                c = 0;
                i2 = 0;
            }
            if (i2 == 1) {
                iArr2[c] = iArr3[c];
                return iArr2;
            }
            if (i2 == 2) {
                return iArr3;
            }
            lq5.j("Unexpected characters returned for ".concat(c9));
            return null;
        }
        return null;
    }

    public final wtb d(boolean z) {
        wtb wtbVar;
        if (z) {
            wtbVar = this.j;
            wtbVar.s();
        } else {
            wtbVar = this.k;
            wtbVar.s();
        }
        this.i = wtbVar;
        return wtbVar;
    }

    public final void e() {
        iu5.t(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(iu5 iu5Var) {
        if (this.e) {
            lq5.j("There is an unread token pending!");
            return;
        }
        this.d = iu5Var;
        this.e = true;
        int i = iu5Var.b;
        if (i == 2) {
            this.o = ((vtb) iu5Var).e;
            return;
        }
        if (i != 3 || ((utb) iu5Var).m == null) {
            return;
        }
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            int i2 = ik1Var.f + ik1Var.e;
            pi5 pi5Var = new pi5();
            pi5Var.b = i2;
            pi5Var.c = "Attributes incorrectly present on end tag";
            fy7Var.add(pi5Var);
        }
    }

    public final void h(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        StringBuilder sb = this.g;
        if (sb.length() == 0) {
            sb.append(this.f);
        }
        sb.append(str);
    }

    public final void i() {
        g(this.n);
    }

    public final void j() {
        g(this.m);
    }

    public final void k() {
        wtb wtbVar = this.i;
        if (wtbVar.g != null) {
            wtbVar.A();
        }
        g(this.i);
    }

    public final void l(rwb rwbVar) {
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            fy7Var.add(new pi5(ik1Var.f + ik1Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{rwbVar}));
        }
    }

    public final void m(rwb rwbVar) {
        fy7 fy7Var = this.b;
        if (fy7Var.size() < 0) {
            ik1 ik1Var = this.a;
            fy7Var.add(new pi5(ik1Var.f + ik1Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(ik1Var.i()), rwbVar}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.z().equalsIgnoreCase(this.o);
    }
}
