// default package

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bsb {
    public static final char[] r;
    public static final int[] s = {8364, nm7.M1, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, nm7.W5, 8249, nm7.I5, nm7.W1, 381, nm7.Y1, nm7.Z1, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, nm7.X5, 8250, nm7.J5, nm7.m2, 382, 376};
    public final hl1 a;
    public final zw7 b;
    public eu5 d;
    public wrb i;
    public final vrb j;
    public final urb k;
    public final qrb l;
    public final srb m;
    public final rrb n;
    public String o;
    public final int[] p;
    public final int[] q;
    public rub c = rub.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public bsb(hl1 hl1Var, zw7 zw7Var) {
        vrb vrbVar = new vrb(2);
        vrbVar.m = new fz();
        this.j = vrbVar;
        this.k = new urb(3);
        this.l = new qrb(5, (byte) 2);
        this.m = new srb();
        this.n = new rrb();
        this.p = new int[1];
        this.q = new int[2];
        this.a = hl1Var;
        this.b = zw7Var;
    }

    public final void a(rub rubVar) {
        this.a.a();
        this.c = rubVar;
    }

    public final void b(String str) {
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            zw7Var.add(new mi5(hl1Var.f + hl1Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (java.util.Arrays.binarySearch(bsb.r, r3[r1.e]) >= 0) goto L11;
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
        hl1 hl1Var = this.a;
        String[] strArr = hl1Var.h;
        char[] cArr = hl1Var.a;
        if (!hl1Var.j() && (ch == null || ch.charValue() != hl1Var.i())) {
            hl1Var.b();
            if (!hl1Var.j()) {
            }
            hl1Var.g = hl1Var.e;
            boolean k = hl1Var.k("#");
            int[] iArr2 = this.p;
            if (k) {
                boolean l = hl1Var.l("X");
                if (l) {
                    hl1Var.b();
                    int i6 = hl1Var.e;
                    while (true) {
                        i5 = hl1Var.e;
                        iArr = null;
                        if (i5 >= hl1Var.c) {
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
                        hl1Var.e = i5 + 1;
                    }
                    c6 = hl1.c(cArr, strArr, i6, i5 - i6);
                } else {
                    c5 = 0;
                    iArr = null;
                    hl1Var.b();
                    int i7 = hl1Var.e;
                    while (true) {
                        i3 = hl1Var.e;
                        if (i3 >= hl1Var.c || (c7 = cArr[i3]) < '0' || c7 > '9') {
                            break;
                        }
                        hl1Var.e = i3 + 1;
                    }
                    c6 = hl1.c(cArr, strArr, i7, i3 - i7);
                }
                if (c6.length() == 0) {
                    b("numeric reference with no numerals");
                    hl1Var.e = hl1Var.g;
                    return iArr;
                }
                if (!hl1Var.k(";")) {
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
            hl1Var.b();
            int i8 = hl1Var.e;
            while (true) {
                int i9 = hl1Var.e;
                if (i9 >= hl1Var.c || (((c4 = cArr[i9]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                    break;
                }
                hl1Var.e++;
            }
            while (true) {
                i = hl1Var.e;
                if (i >= hl1Var.c || (c3 = cArr[i]) < '0' || c3 > '9') {
                    break;
                }
                hl1Var.e = i + 1;
            }
            String c9 = hl1.c(cArr, strArr, i8, i - i8);
            boolean m = hl1Var.m(';');
            Map map = xn2.a;
            if (!map.containsKey(c9) || !m) {
                hl1Var.e = hl1Var.g;
                if (!m) {
                    return null;
                }
                b("invalid named referenece '" + c9 + "'");
                return null;
            }
            if (z && (hl1Var.o() || ((!hl1Var.j() && (c2 = cArr[hl1Var.e]) >= '0' && c2 <= '9') || hl1Var.n('=', '-', '_')))) {
                hl1Var.e = hl1Var.g;
                return null;
            }
            if (!hl1Var.k(";")) {
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
            u36.j("Unexpected characters returned for ".concat(c9));
            return null;
        }
        return null;
    }

    public final wrb d(boolean z) {
        wrb wrbVar;
        if (z) {
            wrbVar = this.j;
            wrbVar.s();
        } else {
            wrbVar = this.k;
            wrbVar.s();
        }
        this.i = wrbVar;
        return wrbVar;
    }

    public final void e() {
        eu5.t(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(eu5 eu5Var) {
        if (this.e) {
            u36.j("There is an unread token pending!");
            return;
        }
        this.d = eu5Var;
        this.e = true;
        int i = eu5Var.b;
        if (i == 2) {
            this.o = ((vrb) eu5Var).e;
            return;
        }
        if (i != 3 || ((urb) eu5Var).m == null) {
            return;
        }
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            int i2 = hl1Var.f + hl1Var.e;
            mi5 mi5Var = new mi5();
            mi5Var.b = i2;
            mi5Var.c = "Attributes incorrectly present on end tag";
            zw7Var.add(mi5Var);
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
        wrb wrbVar = this.i;
        if (wrbVar.g != null) {
            wrbVar.A();
        }
        g(this.i);
    }

    public final void l(rub rubVar) {
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            zw7Var.add(new mi5(hl1Var.f + hl1Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{rubVar}));
        }
    }

    public final void m(rub rubVar) {
        zw7 zw7Var = this.b;
        if (zw7Var.size() < 0) {
            hl1 hl1Var = this.a;
            zw7Var.add(new mi5(hl1Var.f + hl1Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(hl1Var.i()), rubVar}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.z().equalsIgnoreCase(this.o);
    }
}
