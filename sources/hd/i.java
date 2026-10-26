package hd;

import a8.pc;
import c3.h0;
import ef.p;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n4.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i implements ff.a {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final s a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public p e;
    public String f;
    public int g;
    public bf.e h;
    public bf.d i;

    public i(s sVar, List list, List list2) {
        k kVar;
        this.a = sVar;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            char d = hVar.d();
            List list3 = (List) hashMap.get(Character.valueOf(d));
            if (list3 == null) {
                list3 = new ArrayList(1);
                hashMap.put(Character.valueOf(d), list3);
            }
            list3.add(hVar);
        }
        this.c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            hf.a aVar = (hf.a) it2.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                hf.a aVar2 = (hf.a) hashMap2.get(Character.valueOf(e));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e, aVar, hashMap2);
                } else {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e), kVar);
                }
            } else {
                b(e, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set keySet = this.c.keySet();
        Set keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it3 = keySet.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        Iterator it4 = keySet2.iterator();
        while (it4.hasNext()) {
            bitSet.set(((Character) it4.next()).charValue());
        }
        this.b = bitSet;
    }

    public static void b(char c10, hf.a aVar, HashMap hashMap) {
        if (((hf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    @Override // ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        p sVar;
        p pVar2;
        boolean z10;
        boolean z11;
        ag.g gVar;
        this.f = str.trim();
        this.g = 0;
        this.h = null;
        this.i = null;
        this.e = pVar;
        while (true) {
            char d = d();
            if (d == 0) {
                pVar2 = null;
            } else {
                List<h> list = (List) this.c.get(Character.valueOf(d));
                if (list != null) {
                    int i10 = this.g;
                    pVar2 = null;
                    for (h hVar : list) {
                        hVar.a = this;
                        hVar.b = this.e;
                        hVar.c = this.f;
                        hVar.d = this.g;
                        sVar = hVar.b();
                        this.g = hVar.d;
                        if (sVar != null) {
                            pVar2 = sVar;
                            break;
                        } else {
                            this.g = i10;
                            pVar2 = sVar;
                        }
                    }
                    if (pVar2 == null) {
                        this.g++;
                        pVar2 = new ef.s(String.valueOf(d));
                    }
                } else {
                    hf.a aVar = (hf.a) this.d.get(Character.valueOf(d));
                    if (aVar != null) {
                        int i11 = this.g;
                        int i12 = 0;
                        while (d() == d) {
                            i12++;
                            this.g++;
                        }
                        if (i12 < aVar.c()) {
                            this.g = i11;
                            gVar = null;
                        } else {
                            String substring = i11 == 0 ? "\n" : this.f.substring(i11 - 1, i11);
                            char d10 = d();
                            String valueOf = d10 != 0 ? String.valueOf(d10) : "\n";
                            Pattern pattern = j;
                            boolean matches = pattern.matcher(substring).matches();
                            Pattern pattern2 = l;
                            boolean matches2 = pattern2.matcher(substring).matches();
                            boolean matches3 = pattern.matcher(valueOf).matches();
                            boolean matches4 = pattern2.matcher(valueOf).matches();
                            boolean z12 = !matches4 && (!matches3 || matches2 || matches);
                            boolean z13 = !matches2 && (!matches || matches4 || matches3);
                            if (d == '_') {
                                z11 = z12 && (!z13 || matches);
                                z10 = z13 && (!z12 || matches3);
                            } else {
                                boolean z14 = z12 && d == aVar.e();
                                z10 = z13 && d == aVar.b();
                                z11 = z14;
                            }
                            this.g = i11;
                            gVar = new ag.g(i12, z11, z10);
                        }
                        if (gVar != null) {
                            int i13 = gVar.a;
                            int i14 = this.g;
                            int i15 = i14 + i13;
                            this.g = i15;
                            ag.g gVar2 = gVar;
                            ef.s sVar2 = new ef.s(this.f.substring(i14, i15));
                            boolean z15 = gVar2.c;
                            boolean z16 = gVar2.b;
                            bf.e eVar = this.h;
                            bf.e eVar2 = new bf.e(sVar2, d, z15, z16, eVar);
                            this.h = eVar2;
                            eVar2.g = i13;
                            eVar2.h = i13;
                            if (eVar != null) {
                                eVar.f = eVar2;
                            }
                            pVar2 = sVar2;
                            if (pVar2 == null) {
                            }
                        }
                    } else {
                        int i16 = this.g;
                        int length = this.f.length();
                        while (true) {
                            int i17 = this.g;
                            if (i17 == length) {
                                break;
                            }
                            if (this.b.get(this.f.charAt(i17))) {
                                break;
                            } else {
                                this.g++;
                            }
                        }
                        int i18 = this.g;
                        if (i16 != i18) {
                            sVar = new ef.s(this.f.substring(i16, i18));
                            pVar2 = sVar;
                            if (pVar2 == null) {
                            }
                        }
                    }
                    pVar2 = null;
                    if (pVar2 == null) {
                    }
                }
            }
            if (pVar2 == null) {
                break;
            } else {
                pVar.b(pVar2);
            }
        }
        e(null);
        p pVar3 = (p) pVar.c;
        p pVar4 = (p) pVar.d;
        if (pVar3 == pVar4) {
            return;
        }
        pc.b(pVar3, pVar4);
    }

    public final String c(Pattern pattern) {
        if (this.g >= this.f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f);
        matcher.region(this.g, this.f.length());
        if (!matcher.find()) {
            return null;
        }
        this.g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.g < this.f.length()) {
            return this.f.charAt(this.g);
        }
        return (char) 0;
    }

    public final void e(bf.e eVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        bf.e eVar2 = this.h;
        while (eVar2 != null) {
            bf.e eVar3 = eVar2.e;
            if (eVar3 == eVar) {
                break;
            } else {
                eVar2 = eVar3;
            }
        }
        while (eVar2 != null) {
            ef.s sVar = eVar2.a;
            char c10 = eVar2.b;
            hf.a aVar = (hf.a) this.d.get(Character.valueOf(c10));
            if (!eVar2.d || aVar == null) {
                eVar2 = eVar2.f;
            } else {
                char e = aVar.e();
                bf.e eVar4 = eVar2.e;
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
                    bf.e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        bf.e eVar6 = eVar5.e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f) != sVar) {
                        pc.b(pVar, (p) sVar.e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (eVar4.g == 0) {
                        eVar4.a.g();
                        f(eVar4);
                    }
                    if (eVar2.g == 0) {
                        bf.e eVar7 = eVar2.f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), eVar2.e);
                        if (!eVar2.c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f;
                }
            }
        }
        while (true) {
            bf.e eVar8 = this.h;
            if (eVar8 == null || eVar8 == eVar) {
                return;
            } else {
                f(eVar8);
            }
        }
    }

    public final void f(bf.e eVar) {
        bf.e eVar2 = eVar.e;
        if (eVar2 != null) {
            eVar2.f = eVar.f;
        }
        bf.e eVar3 = eVar.f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.e = eVar2;
        }
    }
}
