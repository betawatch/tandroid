package ie;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j implements me.a {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final g9.l d;
    public String e;
    public int f;
    public c g;
    public b h;

    public j(g9.l lVar) {
        List list = (List) lVar.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new je.a(0), new je.a(1)), hashMap);
        c(list, hashMap);
        this.c = hashMap;
        Set keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = lVar;
    }

    public static void b(char c3, oe.a aVar, HashMap hashMap) {
        if (((oe.a) hashMap.put(Character.valueOf(c3), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c3 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        p pVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            oe.a aVar = (oe.a) it.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                oe.a aVar2 = (oe.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e10, aVar, hashMap);
                } else {
                    if (aVar2 instanceof p) {
                        pVar = (p) aVar2;
                    } else {
                        p pVar2 = new p(e10);
                        pVar2.f(aVar2);
                        pVar = pVar2;
                    }
                    pVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), pVar);
                }
            } else {
                b(e10, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        le.p pVar = (le.p) sVar.f;
        le.p pVar2 = (le.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((s) pVar).g);
            le.p pVar3 = (le.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void f(le.p pVar, le.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (le.p) pVar.f;
            }
        }
        e(sVar, sVar2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x043e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [le.s] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [le.d] */
    /* JADX WARN: Type inference failed for: r3v21, types: [le.s] */
    /* JADX WARN: Type inference failed for: r3v39, types: [le.k, le.p] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v53, types: [le.k] */
    /* JADX WARN: Type inference failed for: r3v54, types: [le.k] */
    @Override // me.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, le.p pVar) {
        le.g gVar;
        le.p pVar2;
        le.p sVar;
        int i10;
        le.k kVar;
        String d;
        le.p pVar3;
        String str2;
        boolean z10;
        String str3;
        boolean z11;
        boolean z12;
        i iVar;
        this.e = str.trim();
        this.f = 0;
        ?? r32 = 0;
        this.g = null;
        this.h = null;
        le.p pVar4 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                pVar4 = r32;
            } else {
                if (g10 == '\n') {
                    this.f++;
                    if (pVar4 instanceof s) {
                        s sVar2 = (s) pVar4;
                        if (sVar2.g.endsWith(" ")) {
                            String str4 = sVar2.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (end > 0) {
                                sVar2.g = com.google.android.recaptcha.internal.a.m(str4, end, 0);
                            }
                            gVar = end >= 2 ? new le.g(1) : new le.g(2);
                            pVar2 = gVar;
                        }
                    }
                    gVar = new le.g(2);
                    pVar2 = gVar;
                } else if (g10 == '!') {
                    int i11 = this.f + 1;
                    this.f = i11;
                    if (g() == '[') {
                        this.f++;
                        s sVar3 = new s("![");
                        b bVar = this.h;
                        b bVar2 = new b(sVar3, i11, bVar, this.g, true);
                        if (bVar != null) {
                            bVar.d = true;
                        }
                        this.h = bVar2;
                        pVar2 = sVar3;
                    } else {
                        sVar = new s("!");
                        pVar2 = sVar;
                    }
                } else if (g10 == '&') {
                    String d10 = d(l);
                    if (d10 != null) {
                        r32 = new s(ke.b.a(d10));
                        pVar2 = r32;
                    }
                    pVar2 = null;
                } else if (g10 == '<') {
                    String d11 = d(o);
                    if (d11 != null) {
                        i10 = 1;
                        String m10 = com.google.android.recaptcha.internal.a.m(d11, 1, 1);
                        kVar = new le.k(1, u3.c.e("mailto:", m10), null);
                        kVar.b(new s(m10));
                    } else {
                        i10 = 1;
                        String d12 = d(p);
                        if (d12 != null) {
                            String m11 = com.google.android.recaptcha.internal.a.m(d12, 1, 1);
                            kVar = new le.k(1, m11, null);
                            kVar.b(new s(m11));
                        } else {
                            pVar2 = null;
                            if (pVar2 == null) {
                                String d13 = d(j);
                                if (d13 != null) {
                                    r32 = new le.d(i10);
                                    r32.h = d13;
                                    pVar2 = r32;
                                }
                                pVar2 = null;
                            }
                        }
                    }
                    pVar2 = kVar;
                    if (pVar2 == null) {
                    }
                } else if (g10 != '`') {
                    switch (g10) {
                        case '[':
                            int i12 = this.f;
                            this.f = i12 + 1;
                            s sVar4 = new s("[");
                            b bVar3 = this.h;
                            b bVar4 = new b(sVar4, i12, bVar3, this.g, false);
                            if (bVar3 != null) {
                                bVar3.d = true;
                            }
                            this.h = bVar4;
                            pVar2 = sVar4;
                            break;
                        case '\\':
                            this.f++;
                            if (g() == '\n') {
                                sVar = new le.g(1);
                                this.f++;
                            } else {
                                if (this.f < this.e.length()) {
                                    String str5 = this.e;
                                    int i13 = this.f;
                                    if (k.matcher(str5.substring(i13, i13 + 1)).matches()) {
                                        String str6 = this.e;
                                        int i14 = this.f;
                                        s sVar5 = new s(str6.substring(i14, i14 + 1));
                                        this.f++;
                                        pVar2 = sVar5;
                                        break;
                                    }
                                }
                                sVar = new s("\\");
                            }
                            pVar2 = sVar;
                            break;
                        case ']':
                            int i15 = this.f + 1;
                            this.f = i15;
                            b bVar5 = this.h;
                            if (bVar5 != null) {
                                s sVar6 = (s) bVar5.e;
                                boolean z13 = bVar5.a;
                                if (bVar5.c) {
                                    if (g() == '(') {
                                        this.f++;
                                        Pattern pattern = q;
                                        d(pattern);
                                        int a2 = i7.j.a(this.f, this.e);
                                        if (a2 == -1) {
                                            str3 = null;
                                        } else {
                                            String substring = g() == '<' ? this.e.substring(this.f + 1, a2 - 1) : this.e.substring(this.f, a2);
                                            this.f = a2;
                                            str3 = ke.a.a(substring);
                                        }
                                        if (str3 != null) {
                                            d(pattern);
                                            String str7 = this.e;
                                            int i16 = this.f;
                                            if (s.matcher(str7.substring(i16 - 1, i16)).matches()) {
                                                int c3 = i7.j.c(this.f, this.e);
                                                if (c3 == -1) {
                                                    str2 = null;
                                                } else {
                                                    String substring2 = this.e.substring(this.f + 1, c3 - 1);
                                                    this.f = c3;
                                                    str2 = ke.a.a(substring2);
                                                }
                                                d(pattern);
                                            } else {
                                                str2 = null;
                                            }
                                            if (g() == ')') {
                                                this.f++;
                                                z10 = true;
                                            } else {
                                                this.f = i15;
                                            }
                                        } else {
                                            str2 = null;
                                        }
                                        z10 = false;
                                    } else {
                                        str2 = null;
                                        z10 = false;
                                        str3 = null;
                                    }
                                    if (!z10) {
                                        int i17 = this.f;
                                        if (i17 < this.e.length() && this.e.charAt(this.f) == '[') {
                                            int i18 = this.f + 1;
                                            int b10 = i7.j.b(i18, this.e);
                                            int i19 = b10 - i18;
                                            if (b10 != -1 && i19 <= 999 && b10 < this.e.length() && this.e.charAt(b10) == ']') {
                                                this.f = b10 + 1;
                                            }
                                        }
                                        int i20 = this.f - i17;
                                        String substring3 = i20 > 2 ? this.e.substring(i17, i20 + i17) : !bVar5.d ? this.e.substring(bVar5.b, i15) : null;
                                        if (substring3 != null) {
                                            Pattern pattern2 = ke.a.a;
                                            le.m mVar = (le.m) ((Map) this.d.c).get(ke.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                            if (mVar != null) {
                                                str3 = mVar.h;
                                                str2 = mVar.i;
                                                z10 = true;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        this.f = i15;
                                        this.h = (b) this.h.f;
                                        sVar = new s("]");
                                        pVar2 = sVar;
                                        break;
                                    } else {
                                        r32 = z13 ? new le.k(0, str3, str2) : new le.k(1, str3, str2);
                                        le.p pVar5 = (le.p) sVar6.f;
                                        while (pVar5 != null) {
                                            le.p pVar6 = (le.p) pVar5.f;
                                            r32.b(pVar5);
                                            pVar5 = pVar6;
                                        }
                                        h((c) bVar5.g);
                                        le.p pVar7 = (le.p) r32.c;
                                        le.p pVar8 = (le.p) r32.d;
                                        if (pVar7 != pVar8) {
                                            f(pVar7, pVar8);
                                        }
                                        sVar6.g();
                                        b bVar6 = (b) this.h.f;
                                        this.h = bVar6;
                                        if (!z13) {
                                            while (bVar6 != null) {
                                                if (!bVar6.a) {
                                                    bVar6.c = false;
                                                }
                                                bVar6 = (b) bVar6.f;
                                            }
                                        }
                                        pVar2 = r32;
                                        break;
                                    }
                                } else {
                                    this.h = (b) bVar5.f;
                                    pVar3 = new s("]");
                                }
                            } else {
                                pVar3 = new s("]");
                            }
                            pVar2 = pVar3;
                            break;
                        default:
                            if (this.b.get(g10)) {
                                oe.a aVar = (oe.a) this.c.get(Character.valueOf(g10));
                                int i21 = this.f;
                                int i22 = 0;
                                while (g() == g10) {
                                    i22++;
                                    this.f++;
                                }
                                if (i22 < aVar.d()) {
                                    this.f = i21;
                                    iVar = r32;
                                } else {
                                    String substring4 = i21 == 0 ? "\n" : this.e.substring(i21 - 1, i21);
                                    char g11 = g();
                                    String valueOf = g11 != 0 ? String.valueOf(g11) : "\n";
                                    Pattern pattern3 = i;
                                    boolean matches = pattern3.matcher(substring4).matches();
                                    Pattern pattern4 = r;
                                    boolean matches2 = pattern4.matcher(substring4).matches();
                                    boolean matches3 = pattern3.matcher(valueOf).matches();
                                    boolean matches4 = pattern4.matcher(valueOf).matches();
                                    boolean z14 = !matches4 && (!matches3 || matches2 || matches);
                                    boolean z15 = !matches2 && (!matches || matches4 || matches3);
                                    if (g10 == '_') {
                                        z12 = z14 && (!z15 || matches);
                                        z11 = z15 && (!z14 || matches3);
                                    } else {
                                        boolean z16 = z14 && g10 == aVar.e();
                                        z11 = z15 && g10 == aVar.b();
                                        z12 = z16;
                                    }
                                    this.f = i21;
                                    iVar = new i(i22, z12, z11);
                                }
                                if (iVar != null) {
                                    int i23 = iVar.a;
                                    int i24 = this.f;
                                    int i25 = i24 + i23;
                                    this.f = i25;
                                    s sVar7 = new s(this.e.substring(i24, i25));
                                    boolean z17 = iVar.c;
                                    boolean z18 = iVar.b;
                                    c cVar = this.g;
                                    c cVar2 = new c(sVar7, g10, z17, z18, cVar);
                                    this.g = cVar2;
                                    cVar2.g = i23;
                                    cVar2.h = i23;
                                    if (cVar != null) {
                                        cVar.f = cVar2;
                                    }
                                    pVar2 = sVar7;
                                    break;
                                }
                                pVar2 = r32;
                                break;
                            } else {
                                int i26 = this.f;
                                int length = this.e.length();
                                while (true) {
                                    int i27 = this.f;
                                    if (i27 != length) {
                                        if (!this.a.get(this.e.charAt(i27))) {
                                            this.f++;
                                        }
                                    }
                                }
                                int i28 = this.f;
                                if (i26 != i28) {
                                    pVar2 = new s(this.e.substring(i26, i28));
                                    break;
                                }
                                pVar2 = r32;
                            }
                            break;
                    }
                } else {
                    String d14 = d(n);
                    if (d14 != null) {
                        int i29 = this.f;
                        do {
                            d = d(m);
                            if (d == null) {
                                this.f = i29;
                                r32 = new s(d14);
                                pVar2 = r32;
                            }
                        } while (!d.equals(d14));
                        le.d dVar = new le.d(0);
                        String replace = this.e.substring(i29, this.f - d14.length()).replace('\n', ' ');
                        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                            int length2 = replace.length();
                            if (i7.k.b(' ', replace, 0, length2) != length2) {
                                replace = com.google.android.recaptcha.internal.a.m(replace, 1, 1);
                            }
                        }
                        dVar.h = replace;
                        pVar3 = dVar;
                        pVar2 = pVar3;
                    }
                    pVar2 = null;
                }
                if (pVar2 != null) {
                    pVar4 = pVar2;
                } else {
                    this.f++;
                    pVar4 = new s(String.valueOf(g10));
                }
            }
            if (pVar4 == null) {
                h(null);
                le.p pVar9 = (le.p) pVar.c;
                le.p pVar10 = (le.p) pVar.d;
                if (pVar9 == pVar10) {
                    return;
                }
                f(pVar9, pVar10);
                return;
            }
            pVar.b(pVar4);
            r32 = 0;
        }
    }

    public final String d(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(c cVar) {
        boolean z10;
        le.p pVar;
        HashMap hashMap = new HashMap();
        c cVar2 = this.g;
        while (cVar2 != null) {
            c cVar3 = cVar2.e;
            if (cVar3 == cVar) {
                break;
            } else {
                cVar2 = cVar3;
            }
        }
        while (cVar2 != null) {
            s sVar = cVar2.a;
            char c3 = cVar2.b;
            oe.a aVar = (oe.a) this.c.get(Character.valueOf(c3));
            if (!cVar2.d || aVar == null) {
                cVar2 = cVar2.f;
            } else {
                char e10 = aVar.e();
                c cVar4 = cVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.c && cVar4.b == e10) {
                        i10 = aVar.c(cVar4, cVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (z11) {
                    s sVar2 = cVar4.a;
                    cVar4.g -= i10;
                    cVar2.g -= i10;
                    sVar2.g = com.google.android.recaptcha.internal.a.m(sVar2.g, i10, 0);
                    sVar.g = com.google.android.recaptcha.internal.a.m(sVar.g, i10, 0);
                    c cVar5 = cVar2.e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        c cVar6 = cVar5.e;
                        i(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (le.p) sVar2.f) != sVar) {
                        f(pVar, (le.p) sVar.e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.g == 0) {
                        cVar4.a.g();
                        i(cVar4);
                    }
                    if (cVar2.g == 0) {
                        c cVar7 = cVar2.f;
                        sVar.g();
                        i(cVar2);
                        cVar2 = cVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c3), cVar2.e);
                        if (!cVar2.c) {
                            i(cVar2);
                        }
                    }
                    cVar2 = cVar2.f;
                }
            }
        }
        while (true) {
            c cVar8 = this.g;
            if (cVar8 == null || cVar8 == cVar) {
                return;
            } else {
                i(cVar8);
            }
        }
    }

    public final void i(c cVar) {
        c cVar2 = cVar.e;
        if (cVar2 != null) {
            cVar2.f = cVar.f;
        }
        c cVar3 = cVar.f;
        if (cVar3 == null) {
            this.g = cVar2;
        } else {
            cVar3.e = cVar2;
        }
    }
}
