package af;

import com.google.android.gms.internal.play_billing.k3;
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
import v7.e5;
import v7.f5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class m implements ef.a {
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
    public final qf.b d;
    public String e;
    public int f;
    public f g;
    public e h;

    public m(qf.b bVar) {
        List list = (List) bVar.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new bf.a(0), new bf.a(1)), hashMap);
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
        this.d = bVar;
    }

    public static void b(char c10, gf.a aVar, HashMap hashMap) {
        if (((gf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        s sVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gf.a aVar = (gf.a) it.next();
            char e = aVar.e();
            char a2 = aVar.a();
            if (e == a2) {
                gf.a aVar2 = (gf.a) hashMap.get(Character.valueOf(e));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
                    b(e, aVar, hashMap);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(e);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    hashMap.put(Character.valueOf(e), sVar);
                }
            } else {
                b(e, aVar, hashMap);
                b(a2, aVar, hashMap);
            }
        }
    }

    public static void e(df.s sVar, df.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        df.p pVar = (df.p) sVar.f;
        df.p pVar2 = (df.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((df.s) pVar).g);
            df.p pVar3 = (df.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void f(df.p pVar, df.p pVar2) {
        df.s sVar = null;
        df.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof df.s) {
                sVar2 = (df.s) pVar;
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
                pVar = (df.p) pVar.f;
            }
        }
        e(sVar, sVar2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0443  */
    /* JADX WARN: Type inference failed for: r3v16, types: [df.s] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [df.d] */
    /* JADX WARN: Type inference failed for: r3v23, types: [df.s] */
    /* JADX WARN: Type inference failed for: r3v41, types: [df.k, df.p] */
    /* JADX WARN: Type inference failed for: r3v57, types: [df.k] */
    /* JADX WARN: Type inference failed for: r3v58, types: [df.k] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v42, types: [af.l] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // ef.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, df.p pVar) {
        int i10;
        df.g gVar;
        df.p pVar2;
        df.p sVar;
        ?? sVar2;
        int i11;
        df.k kVar;
        String d;
        df.p pVar3;
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
        df.p pVar4 = null;
        this.g = null;
        this.h = null;
        df.p pVar5 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                pVar5 = pVar4;
                i10 = i13;
            } else {
                if (g10 == '\n') {
                    this.f++;
                    if (pVar5 instanceof df.s) {
                        df.s sVar3 = (df.s) pVar5;
                        if (sVar3.g.endsWith(" ")) {
                            String str4 = sVar3.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i10 = 0;
                            if (end > 0) {
                                sVar3.g = k3.j(end, 0, str4);
                            }
                            gVar = end >= 2 ? new df.g(1) : new df.g(2);
                            pVar2 = gVar;
                        }
                    }
                    i10 = 0;
                    gVar = new df.g(2);
                    pVar2 = gVar;
                } else if (g10 != '!') {
                    if (g10 == '&') {
                        String d10 = d(l);
                        if (d10 != null) {
                            sVar2 = new df.s(cf.b.a(d10));
                            pVar2 = sVar2;
                        }
                        pVar2 = null;
                    } else if (g10 == '<') {
                        String d11 = d(o);
                        if (d11 != null) {
                            i11 = 1;
                            String j10 = k3.j(1, 1, d11);
                            kVar = new df.k(1, r4.c.h("mailto:", j10), null);
                            kVar.b(new df.s(j10));
                        } else {
                            i11 = 1;
                            String d12 = d(p);
                            if (d12 != null) {
                                String j11 = k3.j(1, 1, d12);
                                kVar = new df.k(1, j11, null);
                                kVar.b(new df.s(j11));
                            } else {
                                pVar2 = null;
                                if (pVar2 == null) {
                                    String d13 = d(j);
                                    if (d13 != null) {
                                        sVar2 = new df.d(i11);
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
                    } else if (g10 != '`') {
                        switch (g10) {
                            case '[':
                                int i14 = this.f;
                                this.f = i14 + 1;
                                df.s sVar4 = new df.s("[");
                                e eVar = this.h;
                                e eVar2 = new e(sVar4, i14, eVar, this.g, false);
                                if (eVar != null) {
                                    eVar.d = true;
                                }
                                this.h = eVar2;
                                pVar2 = sVar4;
                                break;
                            case '\\':
                                this.f++;
                                if (g() == '\n') {
                                    sVar = new df.g(1);
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str5 = this.e;
                                        int i15 = this.f;
                                        if (k.matcher(str5.substring(i15, i15 + 1)).matches()) {
                                            String str6 = this.e;
                                            int i16 = this.f;
                                            df.s sVar5 = new df.s(str6.substring(i16, i16 + 1));
                                            this.f++;
                                            pVar2 = sVar5;
                                            break;
                                        }
                                    }
                                    sVar = new df.s("\\");
                                }
                                pVar2 = sVar;
                                break;
                            case ']':
                                int i17 = this.f + 1;
                                this.f = i17;
                                e eVar3 = this.h;
                                if (eVar3 != null) {
                                    df.s sVar6 = (df.s) eVar3.e;
                                    boolean z11 = eVar3.a;
                                    if (eVar3.c) {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            d(pattern);
                                            i12 = 1;
                                            int a2 = e5.a(this.f, this.e);
                                            if (a2 == -1) {
                                                str3 = null;
                                            } else {
                                                String substring = g() == '<' ? this.e.substring(this.f + 1, a2 - 1) : this.e.substring(this.f, a2);
                                                this.f = a2;
                                                str3 = cf.a.a(substring);
                                            }
                                            if (str3 != null) {
                                                d(pattern);
                                                String str7 = this.e;
                                                int i18 = this.f;
                                                if (s.matcher(str7.substring(i18 - 1, i18)).matches()) {
                                                    int c10 = e5.c(this.f, this.e);
                                                    if (c10 == -1) {
                                                        str2 = null;
                                                    } else {
                                                        String substring2 = this.e.substring(this.f + 1, c10 - 1);
                                                        this.f = c10;
                                                        str2 = cf.a.a(substring2);
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
                                                int b10 = e5.b(i20, this.e);
                                                int i21 = b10 - i20;
                                                if (b10 != -1 && i21 <= 999 && b10 < this.e.length() && this.e.charAt(b10) == ']') {
                                                    this.f = b10 + 1;
                                                }
                                            }
                                            int i22 = this.f - i19;
                                            String substring3 = i22 > 2 ? this.e.substring(i19, i22 + i19) : !eVar3.d ? this.e.substring(eVar3.b, i17) : null;
                                            if (substring3 != null) {
                                                Pattern pattern2 = cf.a.a;
                                                df.m mVar = (df.m) ((Map) this.d.c).get(cf.a.c.matcher(substring3.substring(i12, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (mVar != null) {
                                                    str3 = mVar.h;
                                                    str2 = mVar.i;
                                                    z10 = true;
                                                }
                                            }
                                        }
                                        if (!z10) {
                                            this.f = i17;
                                            this.h = (e) this.h.f;
                                            sVar = new df.s("]");
                                            pVar2 = sVar;
                                            break;
                                        } else {
                                            sVar2 = z11 ? new df.k(0, str3, str2) : new df.k(1, str3, str2);
                                            df.p pVar6 = (df.p) sVar6.f;
                                            while (pVar6 != null) {
                                                df.p pVar7 = (df.p) pVar6.f;
                                                sVar2.b(pVar6);
                                                pVar6 = pVar7;
                                            }
                                            h((f) eVar3.g);
                                            df.p pVar8 = (df.p) sVar2.c;
                                            df.p pVar9 = (df.p) sVar2.d;
                                            if (pVar8 != pVar9) {
                                                f(pVar8, pVar9);
                                            }
                                            sVar6.g();
                                            e eVar4 = (e) this.h.f;
                                            this.h = eVar4;
                                            if (!z11) {
                                                while (eVar4 != null) {
                                                    if (!eVar4.a) {
                                                        eVar4.c = false;
                                                    }
                                                    eVar4 = (e) eVar4.f;
                                                }
                                            }
                                            pVar2 = sVar2;
                                            break;
                                        }
                                    } else {
                                        this.h = (e) eVar3.f;
                                        pVar3 = new df.s("]");
                                    }
                                } else {
                                    pVar3 = new df.s("]");
                                }
                                pVar2 = pVar3;
                                break;
                            default:
                                if (this.b.get(g10)) {
                                    gf.a aVar = (gf.a) this.c.get(Character.valueOf(g10));
                                    int i23 = this.f;
                                    int i24 = i13;
                                    while (g() == g10) {
                                        i24++;
                                        this.f++;
                                    }
                                    if (i24 < aVar.c()) {
                                        this.f = i23;
                                        r52 = pVar4;
                                    } else {
                                        String substring4 = i23 == 0 ? "\n" : this.e.substring(i23 - 1, i23);
                                        char g11 = g();
                                        String valueOf = g11 != 0 ? String.valueOf(g11) : "\n";
                                        Pattern pattern3 = i;
                                        boolean matches = pattern3.matcher(substring4).matches();
                                        Pattern pattern4 = r;
                                        boolean matches2 = pattern4.matcher(substring4).matches();
                                        boolean matches3 = pattern3.matcher(valueOf).matches();
                                        boolean matches4 = pattern4.matcher(valueOf).matches();
                                        int i25 = (matches4 || !(!matches3 || matches2 || matches)) ? i13 : 1;
                                        int i26 = (matches2 || !(!matches || matches4 || matches3)) ? i13 : 1;
                                        if (g10 == '_') {
                                            int i27 = (i25 == 0 || !(i26 == 0 || matches)) ? i13 : 1;
                                            if (i26 == 0 || !(i25 == 0 || matches3)) {
                                                r82 = i13;
                                                r42 = i27;
                                            } else {
                                                r82 = 1;
                                                r42 = i27;
                                            }
                                        } else {
                                            int i28 = (i25 == 0 || g10 != aVar.e()) ? i13 : 1;
                                            int i29 = (i26 == 0 || g10 != aVar.a()) ? i13 : 1;
                                            r42 = i28;
                                            r82 = i29;
                                        }
                                        this.f = i23;
                                        r52 = new l(i24, r42, r82);
                                    }
                                    if (r52 != 0) {
                                        int i30 = r52.a;
                                        int i31 = this.f;
                                        int i32 = i31 + i30;
                                        this.f = i32;
                                        df.s sVar7 = new df.s(this.e.substring(i31, i32));
                                        boolean z12 = r52.c;
                                        boolean z13 = r52.b;
                                        f fVar = this.g;
                                        f fVar2 = new f(sVar7, g10, z12, z13, fVar);
                                        this.g = fVar2;
                                        fVar2.g = i30;
                                        fVar2.h = i30;
                                        if (fVar != null) {
                                            fVar.f = fVar2;
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
                                        pVar2 = new df.s(this.e.substring(i33, i35));
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
                                    sVar2 = new df.s(d14);
                                    pVar2 = sVar2;
                                }
                            } while (!d.equals(d14));
                            df.d dVar = new df.d(0);
                            String replace = this.e.substring(i36, this.f - d14.length()).replace('\n', ' ');
                            if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                int length2 = replace.length();
                                if (f5.b(' ', replace, 0, length2) != length2) {
                                    replace = k3.j(1, 1, replace);
                                }
                            }
                            dVar.h = replace;
                            pVar3 = dVar;
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
                        df.s sVar8 = new df.s("![");
                        e eVar5 = this.h;
                        e eVar6 = new e(sVar8, i37, eVar5, this.g, true);
                        if (eVar5 != null) {
                            eVar5.d = true;
                        }
                        this.h = eVar6;
                        pVar2 = sVar8;
                        i10 = 0;
                    } else {
                        sVar = new df.s("!");
                        pVar2 = sVar;
                        i10 = 0;
                    }
                }
                if (pVar2 != null) {
                    pVar5 = pVar2;
                } else {
                    this.f++;
                    pVar5 = new df.s(String.valueOf(g10));
                }
            }
            if (pVar5 == null) {
                h(null);
                df.p pVar10 = (df.p) pVar.c;
                df.p pVar11 = (df.p) pVar.d;
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

    public final void h(f fVar) {
        boolean z10;
        df.p pVar;
        HashMap hashMap = new HashMap();
        f fVar2 = this.g;
        while (fVar2 != null) {
            f fVar3 = fVar2.e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            df.s sVar = fVar2.a;
            char c10 = fVar2.b;
            gf.a aVar = (gf.a) this.c.get(Character.valueOf(c10));
            if (!fVar2.d || aVar == null) {
                fVar2 = fVar2.f;
            } else {
                char e = aVar.e();
                f fVar4 = fVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (fVar4.c && fVar4.b == e) {
                        i10 = aVar.d(fVar4, fVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (z11) {
                    df.s sVar2 = fVar4.a;
                    fVar4.g -= i10;
                    fVar2.g -= i10;
                    sVar2.g = k3.j(i10, 0, sVar2.g);
                    sVar.g = k3.j(i10, 0, sVar.g);
                    f fVar5 = fVar2.e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        f fVar6 = fVar5.e;
                        i(fVar5);
                        fVar5 = fVar6;
                    }
                    if (sVar2 != sVar && (pVar = (df.p) sVar2.f) != sVar) {
                        f(pVar, (df.p) sVar.e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (fVar4.g == 0) {
                        fVar4.a.g();
                        i(fVar4);
                    }
                    if (fVar2.g == 0) {
                        f fVar7 = fVar2.f;
                        sVar.g();
                        i(fVar2);
                        fVar2 = fVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), fVar2.e);
                        if (!fVar2.c) {
                            i(fVar2);
                        }
                    }
                    fVar2 = fVar2.f;
                }
            }
        }
        while (true) {
            f fVar8 = this.g;
            if (fVar8 == null || fVar8 == fVar) {
                return;
            } else {
                i(fVar8);
            }
        }
    }

    public final void i(f fVar) {
        f fVar2 = fVar.e;
        if (fVar2 != null) {
            fVar2.f = fVar.f;
        }
        f fVar3 = fVar.f;
        if (fVar3 == null) {
            this.g = fVar2;
        } else {
            fVar3.e = fVar2;
        }
    }
}
