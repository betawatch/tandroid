package ad;

import java.util.Arrays;
import java.util.Map;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m {
    public static final char[] r;
    public static final int[] s = {8364, hs.N1, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, hs.J5, hs.X1, 381, hs.Z1, hs.a2, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, hs.K5, hs.n2, 382, 376};
    public final a a;
    public final c b;
    public l d;
    public k i;
    public final j j;
    public final i k;
    public final e l;
    public final g m;
    public final f n;
    public String o;
    public final int[] p;
    public final int[] q;
    public c2 c = c2.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public m(a aVar, c cVar) {
        j jVar = new j(2);
        jVar.k = new zc.b();
        this.j = jVar;
        this.k = new i(3);
        this.l = new e(5, 0);
        this.m = new g();
        this.n = new f();
        this.p = new int[1];
        this.q = new int[2];
        this.a = aVar;
        this.b = cVar;
    }

    public final void a(c2 c2Var) {
        this.a.a();
        this.c = c2Var;
    }

    public final void b(String str) {
        c cVar = this.b;
        if (cVar.size() < 0) {
            a aVar = this.a;
            cVar.add(new b(aVar.f + aVar.e, "Invalid character reference: %s", new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (java.util.Arrays.binarySearch(ad.m.r, r4[r1.e]) >= 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch2, boolean z10) {
        int i3;
        char c2;
        int i10;
        char c10;
        char c11;
        char c12;
        char c13;
        int[] iArr;
        int i11;
        String c14;
        char c15;
        int i12;
        int i13;
        a aVar = this.a;
        boolean j10 = aVar.j();
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (!j10 && (ch2 == null || ch2.charValue() != aVar.i())) {
            aVar.b();
            if (!aVar.j()) {
            }
            aVar.g = aVar.e;
            boolean k10 = aVar.k("#");
            int[] iArr2 = this.p;
            if (k10) {
                boolean l10 = aVar.l("X");
                if (l10) {
                    aVar.b();
                    int i14 = aVar.e;
                    while (true) {
                        i13 = aVar.e;
                        iArr = null;
                        if (i13 >= aVar.c) {
                            c13 = 0;
                            break;
                        }
                        char c16 = cArr[i13];
                        if (c16 < '0' || c16 > '9') {
                            c13 = 0;
                            if (c16 >= 'A') {
                                if (c16 <= 'F') {
                                    continue;
                                }
                            }
                            if (c16 < 'a' || c16 > 'f') {
                                break;
                            }
                        }
                        aVar.e = i13 + 1;
                    }
                    c14 = a.c(cArr, strArr, i14, i13 - i14);
                } else {
                    c13 = 0;
                    iArr = null;
                    aVar.b();
                    int i15 = aVar.e;
                    while (true) {
                        i11 = aVar.e;
                        if (i11 >= aVar.c || (c15 = cArr[i11]) < '0' || c15 > '9') {
                            break;
                        }
                        aVar.e = i11 + 1;
                    }
                    c14 = a.c(cArr, strArr, i15, i11 - i15);
                }
                if (c14.length() == 0) {
                    b("numeric reference with no numerals");
                    aVar.e = aVar.g;
                    return iArr;
                }
                if (!aVar.k(";")) {
                    b("missing semicolon");
                }
                try {
                    i12 = Integer.valueOf(c14, l10 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i12 = -1;
                }
                if (i12 == -1 || ((i12 >= 55296 && i12 <= 57343) || i12 > 1114111)) {
                    b("character outside of valid range");
                    iArr2[c13] = 65533;
                    return iArr2;
                }
                if (i12 >= 128 && i12 < 160) {
                    b("character is not a valid unicode code point");
                    i12 = s[i12 - 128];
                }
                iArr2[c13] = i12;
                return iArr2;
            }
            aVar.b();
            int i16 = aVar.e;
            while (true) {
                int i17 = aVar.e;
                if (i17 >= aVar.c || (((c12 = cArr[i17]) < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !Character.isLetter(c12)))) {
                    break;
                }
                aVar.e++;
            }
            while (true) {
                i3 = aVar.e;
                if (i3 < aVar.c && (c11 = cArr[i3]) >= '0' && c11 <= '9') {
                    aVar.e = i3 + 1;
                }
            }
            String c17 = a.c(cArr, strArr, i16, i3 - i16);
            boolean m10 = aVar.m(';');
            Map map = zc.c.a;
            if (!map.containsKey(c17) || !m10) {
                aVar.e = aVar.g;
                if (!m10) {
                    return null;
                }
                b("invalid named referenece '" + c17 + "'");
                return null;
            }
            if (z10 && (aVar.o() || ((!aVar.j() && (c10 = cArr[aVar.e]) >= '0' && c10 <= '9') || aVar.n('=', '-', '_')))) {
                aVar.e = aVar.g;
                return null;
            }
            if (!aVar.k(";")) {
                b("missing semicolon");
            }
            String str = (String) map.get(c17);
            int[] iArr3 = this.q;
            if (str != null) {
                i10 = str.length();
                if (i10 == 1) {
                    c2 = 0;
                    iArr3[0] = str.charAt(0);
                } else {
                    c2 = 0;
                    iArr3[0] = str.charAt(0);
                    iArr3[1] = str.charAt(1);
                }
            } else {
                c2 = 0;
                i10 = 0;
            }
            if (i10 == 1) {
                iArr2[c2] = iArr3[c2];
                return iArr2;
            }
            if (i10 == 2) {
                return iArr3;
            }
            throw new IllegalArgumentException("Unexpected characters returned for ".concat(c17));
        }
        return null;
    }

    public final k d(boolean z10) {
        k kVar;
        if (z10) {
            kVar = this.j;
            kVar.b();
        } else {
            kVar = this.k;
            kVar.b();
        }
        this.i = kVar;
        return kVar;
    }

    public final void e() {
        l.c(this.h);
    }

    public final void f(char c2) {
        h(String.valueOf(c2));
    }

    public final void g(l lVar) {
        if (this.e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.d = lVar;
        this.e = true;
        int i3 = lVar.b;
        if (i3 == 2) {
            this.o = ((j) lVar).c;
            return;
        }
        if (i3 != 3 || ((i) lVar).k == null) {
            return;
        }
        c cVar = this.b;
        if (cVar.size() < 0) {
            a aVar = this.a;
            int i10 = aVar.f + aVar.e;
            b bVar = new b(0);
            bVar.c = i10;
            bVar.b = "Attributes incorrectly present on end tag";
            cVar.add(bVar);
        }
    }

    public final void h(String str) {
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

    public final void i() {
        g(this.n);
    }

    public final void j() {
        g(this.m);
    }

    public final void k() {
        k kVar = this.i;
        if (kVar.e != null) {
            kVar.j();
        }
        g(this.i);
    }

    public final void l(c2 c2Var) {
        c cVar = this.b;
        if (cVar.size() < 0) {
            a aVar = this.a;
            cVar.add(new b(aVar.f + aVar.e, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{c2Var}));
        }
    }

    public final void m(c2 c2Var) {
        c cVar = this.b;
        if (cVar.size() < 0) {
            a aVar = this.a;
            cVar.add(new b(aVar.f + aVar.e, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(aVar.i()), c2Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.i().equalsIgnoreCase(this.o);
    }
}
