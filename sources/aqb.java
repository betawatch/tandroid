// default package

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aqb {
    public static final char[] r;
    public static final int[] s = {8364, kk7.M1, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, kk7.W5, 8249, kk7.I5, kk7.W1, 381, kk7.Y1, kk7.Z1, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, kk7.J5, kk7.m2, 382, 376};
    public final zj1 a;
    public final yu7 b;
    public fs5 d;
    public vpb i;
    public final upb j;
    public final tpb k;
    public final ppb l;
    public final rpb m;
    public final qpb n;
    public String o;
    public final int[] p;
    public final int[] q;
    public qsb c = qsb.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public aqb(zj1 zj1Var, yu7 yu7Var) {
        upb upbVar = new upb(2);
        upbVar.m = new fy();
        this.j = upbVar;
        this.k = new tpb(3);
        this.l = new ppb(5, (byte) 2);
        this.m = new rpb();
        this.n = new qpb();
        this.p = new int[1];
        this.q = new int[2];
        this.a = zj1Var;
        this.b = yu7Var;
    }

    public final void a(qsb qsbVar) {
        this.a.a();
        this.c = qsbVar;
    }

    public final void b(String str) {
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            yu7Var.add(new ng5(zj1Var.f + zj1Var.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (java.util.Arrays.binarySearch(aqb.r, r3[r1.e]) >= 0) goto L11;
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
        zj1 zj1Var = this.a;
        String[] strArr = zj1Var.h;
        char[] cArr = zj1Var.a;
        if (!zj1Var.j() && (ch == null || ch.charValue() != zj1Var.i())) {
            zj1Var.b();
            if (!zj1Var.j()) {
            }
            zj1Var.g = zj1Var.e;
            boolean k = zj1Var.k("#");
            int[] iArr2 = this.p;
            if (k) {
                boolean l = zj1Var.l("X");
                if (l) {
                    zj1Var.b();
                    int i6 = zj1Var.e;
                    while (true) {
                        i5 = zj1Var.e;
                        iArr = null;
                        if (i5 >= zj1Var.c) {
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
                        zj1Var.e = i5 + 1;
                    }
                    c6 = zj1.c(cArr, strArr, i6, i5 - i6);
                } else {
                    c5 = 0;
                    iArr = null;
                    zj1Var.b();
                    int i7 = zj1Var.e;
                    while (true) {
                        i3 = zj1Var.e;
                        if (i3 >= zj1Var.c || (c7 = cArr[i3]) < '0' || c7 > '9') {
                            break;
                        }
                        zj1Var.e = i3 + 1;
                    }
                    c6 = zj1.c(cArr, strArr, i7, i3 - i7);
                }
                if (c6.length() == 0) {
                    b("numeric reference with no numerals");
                    zj1Var.e = zj1Var.g;
                    return iArr;
                }
                if (!zj1Var.k(";")) {
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
            zj1Var.b();
            int i8 = zj1Var.e;
            while (true) {
                int i9 = zj1Var.e;
                if (i9 >= zj1Var.c || (((c4 = cArr[i9]) < 'A' || c4 > 'Z') && ((c4 < 'a' || c4 > 'z') && !Character.isLetter(c4)))) {
                    break;
                }
                zj1Var.e++;
            }
            while (true) {
                i = zj1Var.e;
                if (i >= zj1Var.c || (c3 = cArr[i]) < '0' || c3 > '9') {
                    break;
                }
                zj1Var.e = i + 1;
            }
            String c9 = zj1.c(cArr, strArr, i8, i - i8);
            boolean m = zj1Var.m(';');
            Map map = lm2.a;
            if (!map.containsKey(c9) || !m) {
                zj1Var.e = zj1Var.g;
                if (!m) {
                    return null;
                }
                b("invalid named referenece '" + c9 + "'");
                return null;
            }
            if (z && (zj1Var.o() || ((!zj1Var.j() && (c2 = cArr[zj1Var.e]) >= '0' && c2 <= '9') || zj1Var.n('=', '-', '_')))) {
                zj1Var.e = zj1Var.g;
                return null;
            }
            if (!zj1Var.k(";")) {
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
            w26.j("Unexpected characters returned for ".concat(c9));
            return null;
        }
        return null;
    }

    public final vpb d(boolean z) {
        vpb vpbVar;
        if (z) {
            vpbVar = this.j;
            vpbVar.s();
        } else {
            vpbVar = this.k;
            vpbVar.s();
        }
        this.i = vpbVar;
        return vpbVar;
    }

    public final void e() {
        fs5.t(this.h);
    }

    public final void f(char c) {
        h(String.valueOf(c));
    }

    public final void g(fs5 fs5Var) {
        if (this.e) {
            w26.j("There is an unread token pending!");
            return;
        }
        this.d = fs5Var;
        this.e = true;
        int i = fs5Var.b;
        if (i == 2) {
            this.o = ((upb) fs5Var).e;
            return;
        }
        if (i != 3 || ((tpb) fs5Var).m == null) {
            return;
        }
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            int i2 = zj1Var.f + zj1Var.e;
            ng5 ng5Var = new ng5();
            ng5Var.b = i2;
            ng5Var.c = "Attributes incorrectly present on end tag";
            yu7Var.add(ng5Var);
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
        vpb vpbVar = this.i;
        if (vpbVar.g != null) {
            vpbVar.A();
        }
        g(this.i);
    }

    public final void l(qsb qsbVar) {
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            yu7Var.add(new ng5(zj1Var.f + zj1Var.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{qsbVar}));
        }
    }

    public final void m(qsb qsbVar) {
        yu7 yu7Var = this.b;
        if (yu7Var.size() < 0) {
            zj1 zj1Var = this.a;
            yu7Var.add(new ng5(zj1Var.f + zj1Var.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(zj1Var.i()), qsbVar}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.z().equalsIgnoreCase(this.o);
    }
}
