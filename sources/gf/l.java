package gf;

import c8.w0;
import c8.x0;
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
import kf.s;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l implements lf.a {
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
    public final wf.b d;
    public String e;
    public int f;
    public e g;
    public d h;

    public l(wf.b bVar) {
        List list = (List) bVar.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new hf.a(0), new hf.a(1)), hashMap);
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

    public static void b(char c10, nf.a aVar, HashMap hashMap) {
        if (((nf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        r rVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nf.a aVar = (nf.a) it.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                nf.a aVar2 = (nf.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e10, aVar, hashMap);
                } else {
                    if (aVar2 instanceof r) {
                        rVar = (r) aVar2;
                    } else {
                        r rVar2 = new r(e10);
                        rVar2.f(aVar2);
                        rVar = rVar2;
                    }
                    rVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), rVar);
                }
            } else {
                b(e10, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i7) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(sVar.g);
        kf.p pVar = (kf.p) sVar.f;
        kf.p pVar2 = (kf.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((s) pVar).g);
            kf.p pVar3 = (kf.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void f(kf.p pVar, kf.p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i7 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i7 = sVar2.g.length() + i7;
            } else {
                e(sVar, sVar2, i7);
                sVar = null;
                sVar2 = null;
                i7 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (kf.p) pVar.f;
            }
        }
        e(sVar, sVar2, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0443  */
    /* JADX WARN: Type inference failed for: r3v16, types: [kf.s] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [kf.d] */
    /* JADX WARN: Type inference failed for: r3v23, types: [kf.s] */
    /* JADX WARN: Type inference failed for: r3v41, types: [kf.k, kf.p] */
    /* JADX WARN: Type inference failed for: r3v57, types: [kf.k] */
    /* JADX WARN: Type inference failed for: r3v58, types: [kf.k] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v42, types: [bg.f] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // lf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, kf.p pVar) {
        int i7;
        kf.g gVar;
        kf.p pVar2;
        kf.p sVar;
        ?? sVar2;
        int i10;
        kf.k kVar;
        String d;
        kf.p pVar3;
        int i11;
        String str2;
        boolean z9;
        String str3;
        ?? r42;
        ?? r82;
        ?? r52;
        this.e = str.trim();
        int i12 = 0;
        this.f = 0;
        kf.p pVar4 = null;
        this.g = null;
        this.h = null;
        kf.p pVar5 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                pVar5 = pVar4;
                i7 = i12;
            } else {
                if (g10 == '\n') {
                    this.f++;
                    if (pVar5 instanceof s) {
                        s sVar3 = (s) pVar5;
                        if (sVar3.g.endsWith(" ")) {
                            String str4 = sVar3.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i7 = 0;
                            if (end > 0) {
                                sVar3.g = com.google.android.recaptcha.internal.a.k(str4, end, 0);
                            }
                            gVar = end >= 2 ? new kf.g(1) : new kf.g(2);
                            pVar2 = gVar;
                        }
                    }
                    i7 = 0;
                    gVar = new kf.g(2);
                    pVar2 = gVar;
                } else if (g10 != '!') {
                    if (g10 == '&') {
                        String d2 = d(l);
                        if (d2 != null) {
                            sVar2 = new s(jf.b.a(d2));
                            pVar2 = sVar2;
                        }
                        pVar2 = null;
                    } else if (g10 == '<') {
                        String d10 = d(o);
                        if (d10 != null) {
                            i10 = 1;
                            String k10 = com.google.android.recaptcha.internal.a.k(d10, 1, 1);
                            kVar = new kf.k(1, rf.b.i("mailto:", k10), null);
                            kVar.b(new s(k10));
                        } else {
                            i10 = 1;
                            String d11 = d(p);
                            if (d11 != null) {
                                String k11 = com.google.android.recaptcha.internal.a.k(d11, 1, 1);
                                kVar = new kf.k(1, k11, null);
                                kVar.b(new s(k11));
                            } else {
                                pVar2 = null;
                                if (pVar2 == null) {
                                    String d12 = d(j);
                                    if (d12 != null) {
                                        sVar2 = new kf.d(i10);
                                        sVar2.h = d12;
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
                            case qs.c1 /* 91 */:
                                int i13 = this.f;
                                this.f = i13 + 1;
                                s sVar4 = new s("[");
                                d dVar = this.h;
                                d dVar2 = new d(sVar4, i13, dVar, this.g, false);
                                if (dVar != null) {
                                    dVar.d = true;
                                }
                                this.h = dVar2;
                                pVar2 = sVar4;
                                break;
                            case qs.d1 /* 92 */:
                                this.f++;
                                if (g() == '\n') {
                                    sVar = new kf.g(1);
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str5 = this.e;
                                        int i14 = this.f;
                                        if (k.matcher(str5.substring(i14, i14 + 1)).matches()) {
                                            String str6 = this.e;
                                            int i15 = this.f;
                                            s sVar5 = new s(str6.substring(i15, i15 + 1));
                                            this.f++;
                                            pVar2 = sVar5;
                                            break;
                                        }
                                    }
                                    sVar = new s("\\");
                                }
                                pVar2 = sVar;
                                break;
                            case qs.e1 /* 93 */:
                                int i16 = this.f + 1;
                                this.f = i16;
                                d dVar3 = this.h;
                                if (dVar3 != null) {
                                    s sVar6 = (s) dVar3.e;
                                    boolean z10 = dVar3.a;
                                    if (dVar3.c) {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            d(pattern);
                                            i11 = 1;
                                            int a10 = w0.a(this.f, this.e);
                                            if (a10 == -1) {
                                                str3 = null;
                                            } else {
                                                String substring = g() == '<' ? this.e.substring(this.f + 1, a10 - 1) : this.e.substring(this.f, a10);
                                                this.f = a10;
                                                str3 = jf.a.a(substring);
                                            }
                                            if (str3 != null) {
                                                d(pattern);
                                                String str7 = this.e;
                                                int i17 = this.f;
                                                if (s.matcher(str7.substring(i17 - 1, i17)).matches()) {
                                                    int c10 = w0.c(this.f, this.e);
                                                    if (c10 == -1) {
                                                        str2 = null;
                                                    } else {
                                                        String substring2 = this.e.substring(this.f + 1, c10 - 1);
                                                        this.f = c10;
                                                        str2 = jf.a.a(substring2);
                                                    }
                                                    d(pattern);
                                                } else {
                                                    str2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f++;
                                                    z9 = true;
                                                } else {
                                                    this.f = i16;
                                                }
                                            } else {
                                                str2 = null;
                                            }
                                            z9 = false;
                                        } else {
                                            i11 = 1;
                                            str2 = null;
                                            z9 = false;
                                            str3 = null;
                                        }
                                        if (!z9) {
                                            int i18 = this.f;
                                            if (i18 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                int i19 = this.f + 1;
                                                int b10 = w0.b(i19, this.e);
                                                int i20 = b10 - i19;
                                                if (b10 != -1 && i20 <= 999 && b10 < this.e.length() && this.e.charAt(b10) == ']') {
                                                    this.f = b10 + 1;
                                                }
                                            }
                                            int i21 = this.f - i18;
                                            String substring3 = i21 > 2 ? this.e.substring(i18, i21 + i18) : !dVar3.d ? this.e.substring(dVar3.b, i16) : null;
                                            if (substring3 != null) {
                                                Pattern pattern2 = jf.a.a;
                                                kf.m mVar = (kf.m) ((Map) this.d.c).get(jf.a.c.matcher(substring3.substring(i11, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (mVar != null) {
                                                    str3 = mVar.h;
                                                    str2 = mVar.i;
                                                    z9 = true;
                                                }
                                            }
                                        }
                                        if (!z9) {
                                            this.f = i16;
                                            this.h = (d) this.h.f;
                                            sVar = new s("]");
                                            pVar2 = sVar;
                                            break;
                                        } else {
                                            sVar2 = z10 ? new kf.k(0, str3, str2) : new kf.k(1, str3, str2);
                                            kf.p pVar6 = (kf.p) sVar6.f;
                                            while (pVar6 != null) {
                                                kf.p pVar7 = (kf.p) pVar6.f;
                                                sVar2.b(pVar6);
                                                pVar6 = pVar7;
                                            }
                                            h((e) dVar3.g);
                                            kf.p pVar8 = (kf.p) sVar2.c;
                                            kf.p pVar9 = (kf.p) sVar2.d;
                                            if (pVar8 != pVar9) {
                                                f(pVar8, pVar9);
                                            }
                                            sVar6.g();
                                            d dVar4 = (d) this.h.f;
                                            this.h = dVar4;
                                            if (!z10) {
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
                                        pVar3 = new s("]");
                                    }
                                } else {
                                    pVar3 = new s("]");
                                }
                                pVar2 = pVar3;
                                break;
                            default:
                                if (this.b.get(g10)) {
                                    nf.a aVar = (nf.a) this.c.get(Character.valueOf(g10));
                                    int i22 = this.f;
                                    int i23 = i12;
                                    while (g() == g10) {
                                        i23++;
                                        this.f++;
                                    }
                                    if (i23 < aVar.d()) {
                                        this.f = i22;
                                        r52 = pVar4;
                                    } else {
                                        String substring4 = i22 == 0 ? "\n" : this.e.substring(i22 - 1, i22);
                                        char g11 = g();
                                        String valueOf = g11 != 0 ? String.valueOf(g11) : "\n";
                                        Pattern pattern3 = i;
                                        boolean matches = pattern3.matcher(substring4).matches();
                                        Pattern pattern4 = r;
                                        boolean matches2 = pattern4.matcher(substring4).matches();
                                        boolean matches3 = pattern3.matcher(valueOf).matches();
                                        boolean matches4 = pattern4.matcher(valueOf).matches();
                                        int i24 = (matches4 || !(!matches3 || matches2 || matches)) ? i12 : 1;
                                        int i25 = (matches2 || !(!matches || matches4 || matches3)) ? i12 : 1;
                                        if (g10 == '_') {
                                            int i26 = (i24 == 0 || !(i25 == 0 || matches)) ? i12 : 1;
                                            if (i25 == 0 || !(i24 == 0 || matches3)) {
                                                r82 = i12;
                                                r42 = i26;
                                            } else {
                                                r82 = 1;
                                                r42 = i26;
                                            }
                                        } else {
                                            int i27 = (i24 == 0 || g10 != aVar.e()) ? i12 : 1;
                                            int i28 = (i25 == 0 || g10 != aVar.b()) ? i12 : 1;
                                            r42 = i27;
                                            r82 = i28;
                                        }
                                        this.f = i22;
                                        r52 = new bg.f(i23, r42, r82);
                                    }
                                    if (r52 != 0) {
                                        int i29 = r52.a;
                                        int i30 = this.f;
                                        int i31 = i30 + i29;
                                        this.f = i31;
                                        s sVar7 = new s(this.e.substring(i30, i31));
                                        boolean z11 = r52.c;
                                        boolean z12 = r52.b;
                                        e eVar = this.g;
                                        e eVar2 = new e(sVar7, g10, z11, z12, eVar);
                                        this.g = eVar2;
                                        eVar2.g = i29;
                                        eVar2.h = i29;
                                        if (eVar != null) {
                                            eVar.f = eVar2;
                                        }
                                        pVar2 = sVar7;
                                        i7 = i12;
                                        break;
                                    }
                                    pVar2 = pVar4;
                                    i7 = i12;
                                } else {
                                    int i32 = this.f;
                                    int length = this.e.length();
                                    while (true) {
                                        int i33 = this.f;
                                        if (i33 != length) {
                                            if (!this.a.get(this.e.charAt(i33))) {
                                                this.f++;
                                            }
                                        }
                                    }
                                    int i34 = this.f;
                                    if (i32 != i34) {
                                        pVar2 = new s(this.e.substring(i32, i34));
                                        i7 = i12;
                                    }
                                    pVar2 = pVar4;
                                    i7 = i12;
                                }
                                break;
                        }
                    } else {
                        String d13 = d(n);
                        if (d13 != null) {
                            int i35 = this.f;
                            do {
                                d = d(m);
                                if (d == null) {
                                    this.f = i35;
                                    sVar2 = new s(d13);
                                    pVar2 = sVar2;
                                }
                            } while (!d.equals(d13));
                            kf.d dVar5 = new kf.d(0);
                            String replace = this.e.substring(i35, this.f - d13.length()).replace('\n', ' ');
                            if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                int length2 = replace.length();
                                if (x0.b(' ', 0, length2, replace) != length2) {
                                    replace = com.google.android.recaptcha.internal.a.k(replace, 1, 1);
                                }
                            }
                            dVar5.h = replace;
                            pVar3 = dVar5;
                            pVar2 = pVar3;
                        }
                        pVar2 = null;
                    }
                    i7 = 0;
                } else {
                    int i36 = this.f + 1;
                    this.f = i36;
                    if (g() == '[') {
                        this.f++;
                        s sVar8 = new s("![");
                        d dVar6 = this.h;
                        d dVar7 = new d(sVar8, i36, dVar6, this.g, true);
                        if (dVar6 != null) {
                            dVar6.d = true;
                        }
                        this.h = dVar7;
                        pVar2 = sVar8;
                        i7 = 0;
                    } else {
                        sVar = new s("!");
                        pVar2 = sVar;
                        i7 = 0;
                    }
                }
                if (pVar2 != null) {
                    pVar5 = pVar2;
                } else {
                    this.f++;
                    pVar5 = new s(String.valueOf(g10));
                }
            }
            if (pVar5 == null) {
                h(null);
                kf.p pVar10 = (kf.p) pVar.c;
                kf.p pVar11 = (kf.p) pVar.d;
                if (pVar10 == pVar11) {
                    return;
                }
                f(pVar10, pVar11);
                return;
            }
            pVar.b(pVar5);
            i12 = i7;
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
        boolean z9;
        kf.p pVar;
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
            s sVar = eVar2.a;
            char c10 = eVar2.b;
            nf.a aVar = (nf.a) this.c.get(Character.valueOf(c10));
            if (!eVar2.d || aVar == null) {
                eVar2 = eVar2.f;
            } else {
                char e10 = aVar.e();
                e eVar4 = eVar2.e;
                int i7 = 0;
                boolean z10 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (eVar4.c && eVar4.b == e10) {
                        i7 = aVar.c(eVar4, eVar2);
                        z10 = true;
                        if (i7 > 0) {
                            z9 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.e;
                }
                z9 = z10;
                z10 = false;
                if (z10) {
                    s sVar2 = eVar4.a;
                    eVar4.g -= i7;
                    eVar2.g -= i7;
                    sVar2.g = com.google.android.recaptcha.internal.a.k(sVar2.g, i7, 0);
                    sVar.g = com.google.android.recaptcha.internal.a.k(sVar.g, i7, 0);
                    e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        e eVar6 = eVar5.e;
                        i(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (kf.p) sVar2.f) != sVar) {
                        f(pVar, (kf.p) sVar.e);
                    }
                    aVar.a(sVar2, sVar, i7);
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
                    if (!z9) {
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
