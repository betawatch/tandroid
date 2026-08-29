package nc;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l {
    public static final char[] r;
    public static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a a;
    public final b b;
    public k d;
    public j i;
    public final i j;
    public final h k;
    public final d l;
    public final f m;
    public final e n;
    public String o;
    public final int[] p;
    public final int[] q;
    public b2 c = b2.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public l(a aVar, b bVar) {
        i iVar = new i(2);
        iVar.k = new mc.b();
        this.j = iVar;
        this.k = new h(3);
        this.l = new d(5, 0);
        this.m = new f();
        this.n = new e();
        this.p = new int[1];
        this.q = new int[2];
        this.a = aVar;
        this.b = bVar;
    }

    public final void a(b2 b2Var) {
        this.a.a();
        this.c = b2Var;
    }

    public final void b(String str) {
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Invalid character reference: %s", aVar.f + aVar.e, new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (java.util.Arrays.binarySearch(nc.l.r, r4[r1.e]) >= 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch2, boolean z10) {
        int i10;
        char c3;
        int i11;
        char c6;
        char c10;
        char c11;
        char c12;
        int[] iArr;
        int i12;
        String c13;
        char c14;
        int i13;
        int i14;
        a aVar = this.a;
        boolean j10 = aVar.j();
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (!j10 && (ch2 == null || ch2.charValue() != aVar.i())) {
            aVar.b();
            if (!aVar.j()) {
            }
            aVar.g = aVar.e;
            boolean k9 = aVar.k("#");
            int[] iArr2 = this.p;
            if (k9) {
                boolean l10 = aVar.l("X");
                if (l10) {
                    aVar.b();
                    int i15 = aVar.e;
                    while (true) {
                        i14 = aVar.e;
                        iArr = null;
                        if (i14 >= aVar.c) {
                            c12 = 0;
                            break;
                        }
                        char c15 = cArr[i14];
                        if (c15 < '0' || c15 > '9') {
                            c12 = 0;
                            if (c15 >= 'A') {
                                if (c15 <= 'F') {
                                    continue;
                                }
                            }
                            if (c15 < 'a' || c15 > 'f') {
                                break;
                            }
                        }
                        aVar.e = i14 + 1;
                    }
                    c13 = a.c(cArr, strArr, i15, i14 - i15);
                } else {
                    c12 = 0;
                    iArr = null;
                    aVar.b();
                    int i16 = aVar.e;
                    while (true) {
                        i12 = aVar.e;
                        if (i12 >= aVar.c || (c14 = cArr[i12]) < '0' || c14 > '9') {
                            break;
                        }
                        aVar.e = i12 + 1;
                    }
                    c13 = a.c(cArr, strArr, i16, i12 - i16);
                }
                if (c13.length() == 0) {
                    b("numeric reference with no numerals");
                    aVar.e = aVar.g;
                    return iArr;
                }
                if (!aVar.k(";")) {
                    b("missing semicolon");
                }
                try {
                    i13 = Integer.valueOf(c13, l10 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i13 = -1;
                }
                if (i13 == -1 || ((i13 >= 55296 && i13 <= 57343) || i13 > 1114111)) {
                    b("character outside of valid range");
                    iArr2[c12] = 65533;
                    return iArr2;
                }
                if (i13 >= 128 && i13 < 160) {
                    b("character is not a valid unicode code point");
                    i13 = s[i13 - 128];
                }
                iArr2[c12] = i13;
                return iArr2;
            }
            aVar.b();
            int i17 = aVar.e;
            while (true) {
                int i18 = aVar.e;
                if (i18 >= aVar.c || (((c11 = cArr[i18]) < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !Character.isLetter(c11)))) {
                    break;
                }
                aVar.e++;
            }
            while (true) {
                i10 = aVar.e;
                if (i10 < aVar.c && (c10 = cArr[i10]) >= '0' && c10 <= '9') {
                    aVar.e = i10 + 1;
                }
            }
            String c16 = a.c(cArr, strArr, i17, i10 - i17);
            boolean m10 = aVar.m(';');
            Map map = mc.c.a;
            if (!map.containsKey(c16) || !m10) {
                aVar.e = aVar.g;
                if (!m10) {
                    return null;
                }
                b("invalid named referenece '" + c16 + "'");
                return null;
            }
            if (z10 && (aVar.o() || ((!aVar.j() && (c6 = cArr[aVar.e]) >= '0' && c6 <= '9') || aVar.n('=', '-', '_')))) {
                aVar.e = aVar.g;
                return null;
            }
            if (!aVar.k(";")) {
                b("missing semicolon");
            }
            String str = (String) map.get(c16);
            int[] iArr3 = this.q;
            if (str != null) {
                i11 = str.length();
                if (i11 == 1) {
                    c3 = 0;
                    iArr3[0] = str.charAt(0);
                } else {
                    c3 = 0;
                    iArr3[0] = str.charAt(0);
                    iArr3[1] = str.charAt(1);
                }
            } else {
                c3 = 0;
                i11 = 0;
            }
            if (i11 == 1) {
                iArr2[c3] = iArr3[c3];
                return iArr2;
            }
            if (i11 == 2) {
                return iArr3;
            }
            throw new IllegalArgumentException("Unexpected characters returned for ".concat(c16));
        }
        return null;
    }

    public final j d(boolean z10) {
        j jVar;
        if (z10) {
            jVar = this.j;
            jVar.c();
        } else {
            jVar = this.k;
            jVar.c();
        }
        this.i = jVar;
        return jVar;
    }

    public final void e() {
        k.d(this.h);
    }

    public final void f(char c3) {
        g(String.valueOf(c3));
    }

    public final void g(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        StringBuilder sb2 = this.g;
        if (sb2.length() == 0) {
            sb2.append(this.f);
        }
        sb2.append(str);
    }

    public final void h(k kVar) {
        if (this.e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.d = kVar;
        this.e = true;
        int i10 = kVar.b;
        if (i10 == 2) {
            this.o = ((i) kVar).c;
            return;
        }
        if (i10 != 3 || ((h) kVar).k == null) {
            return;
        }
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            int i11 = aVar.f + aVar.e;
            com.google.android.gms.internal.clearcut.a1 a1Var = new com.google.android.gms.internal.clearcut.a1();
            a1Var.b = i11;
            a1Var.c = "Attributes incorrectly present on end tag";
            bVar.add(a1Var);
        }
    }

    public final void i() {
        h(this.n);
    }

    public final void j() {
        h(this.m);
    }

    public final void k() {
        j jVar = this.i;
        if (jVar.e != null) {
            jVar.k();
        }
        h(this.i);
    }

    public final void l(b2 b2Var) {
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f + aVar.e, new Object[]{b2Var}));
        }
    }

    public final void m(b2 b2Var) {
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            bVar.add(new com.google.android.gms.internal.clearcut.a1("Unexpected character '%s' in input state [%s]", aVar.f + aVar.e, new Object[]{Character.valueOf(aVar.i()), b2Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.j().equalsIgnoreCase(this.o);
    }
}
