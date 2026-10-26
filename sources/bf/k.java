package bf;

import a8.nb;
import a8.tb;
import c3.h0;
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
import n4.s;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k implements ff.a {
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
    public final s d;
    public String e;
    public int f;
    public e g;
    public d h;

    public k(s sVar) {
        List list = (List) sVar.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new cf.a(0), new cf.a(1)), hashMap);
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
        this.d = sVar;
    }

    public static void b(char c10, hf.a aVar, HashMap hashMap) {
        if (((hf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        q qVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hf.a aVar = (hf.a) it.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                hf.a aVar2 = (hf.a) hashMap.get(Character.valueOf(e));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e, aVar, hashMap);
                } else {
                    if (aVar2 instanceof q) {
                        qVar = (q) aVar2;
                    } else {
                        q qVar2 = new q(e);
                        qVar2.f(aVar2);
                        qVar = qVar2;
                    }
                    qVar.f(aVar);
                    hashMap.put(Character.valueOf(e), qVar);
                }
            } else {
                b(e, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(ef.s sVar, ef.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        ef.p pVar = (ef.p) sVar.f;
        ef.p pVar2 = (ef.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((ef.s) pVar).g);
            ef.p pVar3 = (ef.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void f(ef.p pVar, ef.p pVar2) {
        ef.s sVar = null;
        ef.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof ef.s) {
                sVar2 = (ef.s) pVar;
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
                pVar = (ef.p) pVar.f;
            }
        }
        e(sVar, sVar2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0443  */
    /* JADX WARN: Type inference failed for: r3v16, types: [ef.s] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ef.d] */
    /* JADX WARN: Type inference failed for: r3v23, types: [ef.s] */
    /* JADX WARN: Type inference failed for: r3v41, types: [ef.k, ef.p] */
    /* JADX WARN: Type inference failed for: r3v57, types: [ef.k] */
    /* JADX WARN: Type inference failed for: r3v58, types: [ef.k] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v42, types: [ag.g] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, ef.p pVar) {
        int i10;
        ef.g gVar;
        ef.p pVar2;
        ef.p sVar;
        ?? sVar2;
        int i11;
        ef.k kVar;
        String d;
        ef.p pVar3;
        int i12;
        String str2;
        boolean z10;
        String str3;
        ?? r42;
        ?? r82;
        ?? r52;
        this.e = str.trim();
        int i13 = 0;
        this.f = 0;
        ef.p pVar4 = null;
        this.g = null;
        this.h = null;
        ef.p pVar5 = null;
        while (true) {
            char g7 = g();
            if (g7 == 0) {
                pVar5 = pVar4;
                i10 = i13;
            } else {
                if (g7 == '\n') {
                    this.f++;
                    if (pVar5 instanceof ef.s) {
                        ef.s sVar3 = (ef.s) pVar5;
                        if (sVar3.g.endsWith(" ")) {
                            String str4 = sVar3.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i10 = 0;
                            if (end > 0) {
                                sVar3.g = h0.l(end, 0, str4);
                            }
                            gVar = end >= 2 ? new ef.g(1) : new ef.g(2);
                            pVar2 = gVar;
                        }
                    }
                    i10 = 0;
                    gVar = new ef.g(2);
                    pVar2 = gVar;
                } else if (g7 != '!') {
                    if (g7 == '&') {
                        String d10 = d(l);
                        if (d10 != null) {
                            sVar2 = new ef.s(df.b.a(d10));
                            pVar2 = sVar2;
                        }
                        pVar2 = null;
                    } else if (g7 == '<') {
                        String d11 = d(o);
                        if (d11 != null) {
                            i11 = 1;
                            String l4 = h0.l(1, 1, d11);
                            kVar = new ef.k(1, b10.j("mailto:", l4), null);
                            kVar.b(new ef.s(l4));
                        } else {
                            i11 = 1;
                            String d12 = d(p);
                            if (d12 != null) {
                                String l10 = h0.l(1, 1, d12);
                                kVar = new ef.k(1, l10, null);
                                kVar.b(new ef.s(l10));
                            } else {
                                pVar2 = null;
                                if (pVar2 == null) {
                                    String d13 = d(j);
                                    if (d13 != null) {
                                        sVar2 = new ef.d(i11);
                                        sVar2.h = d13;
                                        pVar2 = sVar2;
                                    }
                                    pVar2 = null;
                                }
                            }
                        }
                        pVar2 = kVar;
                        if (pVar2 == null) {
                        }
                    } else if (g7 != '`') {
                        switch (g7) {
                            case '[':
                                int i14 = this.f;
                                this.f = i14 + 1;
                                ef.s sVar4 = new ef.s("[");
                                d dVar = this.h;
                                d dVar2 = new d(sVar4, i14, dVar, this.g, false);
                                if (dVar != null) {
                                    dVar.d = true;
                                }
                                this.h = dVar2;
                                pVar2 = sVar4;
                                break;
                            case '\\':
                                this.f++;
                                if (g() == '\n') {
                                    sVar = new ef.g(1);
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str5 = this.e;
                                        int i15 = this.f;
                                        if (k.matcher(str5.substring(i15, i15 + 1)).matches()) {
                                            String str6 = this.e;
                                            int i16 = this.f;
                                            ef.s sVar5 = new ef.s(str6.substring(i16, i16 + 1));
                                            this.f++;
                                            pVar2 = sVar5;
                                            break;
                                        }
                                    }
                                    sVar = new ef.s("\\");
                                }
                                pVar2 = sVar;
                                break;
                            case ']':
                                int i17 = this.f + 1;
                                this.f = i17;
                                d dVar3 = this.h;
                                if (dVar3 != null) {
                                    ef.s sVar6 = (ef.s) dVar3.e;
                                    boolean z11 = dVar3.a;
                                    if (dVar3.c) {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            d(pattern);
                                            i12 = 1;
                                            int a2 = nb.a(this.f, this.e);
                                            if (a2 == -1) {
                                                str3 = null;
                                            } else {
                                                String substring = g() == '<' ? this.e.substring(this.f + 1, a2 - 1) : this.e.substring(this.f, a2);
                                                this.f = a2;
                                                str3 = df.a.a(substring);
                                            }
                                            if (str3 != null) {
                                                d(pattern);
                                                String str7 = this.e;
                                                int i18 = this.f;
                                                if (s.matcher(str7.substring(i18 - 1, i18)).matches()) {
                                                    int c10 = nb.c(this.f, this.e);
                                                    if (c10 == -1) {
                                                        str2 = null;
                                                    } else {
                                                        String substring2 = this.e.substring(this.f + 1, c10 - 1);
                                                        this.f = c10;
                                                        str2 = df.a.a(substring2);
                                                    }
                                                    d(pattern);
                                                } else {
                                                    str2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f++;
                                                    z10 = true;
                                                } else {
                                                    this.f = i17;
                                                }
                                            } else {
                                                str2 = null;
                                            }
                                            z10 = false;
                                        } else {
                                            i12 = 1;
                                            str2 = null;
                                            z10 = false;
                                            str3 = null;
                                        }
                                        if (!z10) {
                                            int i19 = this.f;
                                            if (i19 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                int i20 = this.f + 1;
                                                int b10 = nb.b(i20, this.e);
                                                int i21 = b10 - i20;
                                                if (b10 != -1 && i21 <= 999 && b10 < this.e.length() && this.e.charAt(b10) == ']') {
                                                    this.f = b10 + 1;
                                                }
                                            }
                                            int i22 = this.f - i19;
                                            String substring3 = i22 > 2 ? this.e.substring(i19, i22 + i19) : !dVar3.d ? this.e.substring(dVar3.b, i17) : null;
                                            if (substring3 != null) {
                                                Pattern pattern2 = df.a.a;
                                                ef.m mVar = (ef.m) ((Map) this.d.c).get(df.a.c.matcher(substring3.substring(i12, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (mVar != null) {
                                                    str3 = mVar.h;
                                                    str2 = mVar.i;
                                                    z10 = true;
                                                }
                                            }
                                        }
                                        if (!z10) {
                                            this.f = i17;
                                            this.h = (d) this.h.f;
                                            sVar = new ef.s("]");
                                            pVar2 = sVar;
                                            break;
                                        } else {
                                            sVar2 = z11 ? new ef.k(0, str3, str2) : new ef.k(1, str3, str2);
                                            ef.p pVar6 = (ef.p) sVar6.f;
                                            while (pVar6 != null) {
                                                ef.p pVar7 = (ef.p) pVar6.f;
                                                sVar2.b(pVar6);
                                                pVar6 = pVar7;
                                            }
                                            h((e) dVar3.g);
                                            ef.p pVar8 = (ef.p) sVar2.c;
                                            ef.p pVar9 = (ef.p) sVar2.d;
                                            if (pVar8 != pVar9) {
                                                f(pVar8, pVar9);
                                            }
                                            sVar6.g();
                                            d dVar4 = (d) this.h.f;
                                            this.h = dVar4;
                                            if (!z11) {
                                                while (dVar4 != null) {
                                                    if (!dVar4.a) {
                                                        dVar4.c = false;
                                                    }
                                                    dVar4 = (d) dVar4.f;
                                                }
                                            }
                                            pVar2 = sVar2;
                                            break;
                                        }
                                    } else {
                                        this.h = (d) dVar3.f;
                                        pVar3 = new ef.s("]");
                                    }
                                } else {
                                    pVar3 = new ef.s("]");
                                }
                                pVar2 = pVar3;
                                break;
                            default:
                                if (this.b.get(g7)) {
                                    hf.a aVar = (hf.a) this.c.get(Character.valueOf(g7));
                                    int i23 = this.f;
                                    int i24 = i13;
                                    while (g() == g7) {
                                        i24++;
                                        this.f++;
                                    }
                                    if (i24 < aVar.c()) {
                                        this.f = i23;
                                        r52 = pVar4;
                                    } else {
                                        String substring4 = i23 == 0 ? "\n" : this.e.substring(i23 - 1, i23);
                                        char g10 = g();
                                        String valueOf = g10 != 0 ? String.valueOf(g10) : "\n";
                                        Pattern pattern3 = i;
                                        boolean matches = pattern3.matcher(substring4).matches();
                                        Pattern pattern4 = r;
                                        boolean matches2 = pattern4.matcher(substring4).matches();
                                        boolean matches3 = pattern3.matcher(valueOf).matches();
                                        boolean matches4 = pattern4.matcher(valueOf).matches();
                                        int i25 = (matches4 || !(!matches3 || matches2 || matches)) ? i13 : 1;
                                        int i26 = (matches2 || !(!matches || matches4 || matches3)) ? i13 : 1;
                                        if (g7 == '_') {
                                            int i27 = (i25 == 0 || !(i26 == 0 || matches)) ? i13 : 1;
                                            if (i26 == 0 || !(i25 == 0 || matches3)) {
                                                r82 = i13;
                                                r42 = i27;
                                            } else {
                                                r82 = 1;
                                                r42 = i27;
                                            }
                                        } else {
                                            int i28 = (i25 == 0 || g7 != aVar.e()) ? i13 : 1;
                                            int i29 = (i26 == 0 || g7 != aVar.b()) ? i13 : 1;
                                            r42 = i28;
                                            r82 = i29;
                                        }
                                        this.f = i23;
                                        r52 = new ag.g(i24, r42, r82);
                                    }
                                    if (r52 != 0) {
                                        int i30 = r52.a;
                                        int i31 = this.f;
                                        int i32 = i31 + i30;
                                        this.f = i32;
                                        ef.s sVar7 = new ef.s(this.e.substring(i31, i32));
                                        boolean z12 = r52.c;
                                        boolean z13 = r52.b;
                                        e eVar = this.g;
                                        e eVar2 = new e(sVar7, g7, z12, z13, eVar);
                                        this.g = eVar2;
                                        eVar2.g = i30;
                                        eVar2.h = i30;
                                        if (eVar != null) {
                                            eVar.f = eVar2;
                                        }
                                        pVar2 = sVar7;
                                        i10 = i13;
                                        break;
                                    }
                                    pVar2 = pVar4;
                                    i10 = i13;
                                } else {
                                    int i33 = this.f;
                                    int length = this.e.length();
                                    while (true) {
                                        int i34 = this.f;
                                        if (i34 != length) {
                                            if (!this.a.get(this.e.charAt(i34))) {
                                                this.f++;
                                            }
                                        }
                                    }
                                    int i35 = this.f;
                                    if (i33 != i35) {
                                        pVar2 = new ef.s(this.e.substring(i33, i35));
                                        i10 = i13;
                                    }
                                    pVar2 = pVar4;
                                    i10 = i13;
                                }
                                break;
                        }
                    } else {
                        String d14 = d(n);
                        if (d14 != null) {
                            int i36 = this.f;
                            do {
                                d = d(m);
                                if (d == null) {
                                    this.f = i36;
                                    sVar2 = new ef.s(d14);
                                    pVar2 = sVar2;
                                }
                            } while (!d.equals(d14));
                            ef.d dVar5 = new ef.d(0);
                            String replace = this.e.substring(i36, this.f - d14.length()).replace('\n', ' ');
                            if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                int length2 = replace.length();
                                if (tb.b(' ', replace, 0, length2) != length2) {
                                    replace = h0.l(1, 1, replace);
                                }
                            }
                            dVar5.h = replace;
                            pVar3 = dVar5;
                            pVar2 = pVar3;
                        }
                        pVar2 = null;
                    }
                    i10 = 0;
                } else {
                    int i37 = this.f + 1;
                    this.f = i37;
                    if (g() == '[') {
                        this.f++;
                        ef.s sVar8 = new ef.s("![");
                        d dVar6 = this.h;
                        d dVar7 = new d(sVar8, i37, dVar6, this.g, true);
                        if (dVar6 != null) {
                            dVar6.d = true;
                        }
                        this.h = dVar7;
                        pVar2 = sVar8;
                        i10 = 0;
                    } else {
                        sVar = new ef.s("!");
                        pVar2 = sVar;
                        i10 = 0;
                    }
                }
                if (pVar2 != null) {
                    pVar5 = pVar2;
                } else {
                    this.f++;
                    pVar5 = new ef.s(String.valueOf(g7));
                }
            }
            if (pVar5 == null) {
                h(null);
                ef.p pVar10 = (ef.p) pVar.c;
                ef.p pVar11 = (ef.p) pVar.d;
                if (pVar10 == pVar11) {
                    return;
                }
                f(pVar10, pVar11);
                return;
            }
            pVar.b(pVar5);
            i13 = i10;
            pVar4 = null;
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

    public final void h(e eVar) {
        boolean z10;
        ef.p pVar;
        HashMap hashMap = new HashMap();
        e eVar2 = this.g;
        while (eVar2 != null) {
            e eVar3 = eVar2.e;
            if (eVar3 == eVar) {
                break;
            } else {
                eVar2 = eVar3;
            }
        }
        while (eVar2 != null) {
            ef.s sVar = eVar2.a;
            char c10 = eVar2.b;
            hf.a aVar = (hf.a) this.c.get(Character.valueOf(c10));
            if (!eVar2.d || aVar == null) {
                eVar2 = eVar2.f;
            } else {
                char e = aVar.e();
                e eVar4 = eVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.c && eVar4.b == e) {
                        i10 = aVar.a(eVar4, eVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (z11) {
                    ef.s sVar2 = eVar4.a;
                    eVar4.g -= i10;
                    eVar2.g -= i10;
                    sVar2.g = h0.l(i10, 0, sVar2.g);
                    sVar.g = h0.l(i10, 0, sVar.g);
                    e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (ef.p) sVar2.f) != sVar) {
                        f(pVar, (ef.p) sVar.e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (eVar4.g == 0) {
                        eVar4.a.g();
                        i(eVar4);
                    }
                    if (eVar2.g == 0) {
                        e eVar7 = eVar2.f;
                        sVar.g();
                        i(eVar2);
                        eVar2 = eVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), eVar2.e);
                        if (!eVar2.c) {
                            i(eVar2);
                        }
                    }
                    eVar2 = eVar2.f;
                }
            }
        }
        while (true) {
            e eVar8 = this.g;
            if (eVar8 == null || eVar8 == eVar) {
                return;
            } else {
                i(eVar8);
            }
        }
    }

    public final void i(e eVar) {
        e eVar2 = eVar.e;
        if (eVar2 != null) {
            eVar2.f = eVar.f;
        }
        e eVar3 = eVar.f;
        if (eVar3 == null) {
            this.g = eVar2;
        } else {
            eVar3.e = eVar2;
        }
    }
}
