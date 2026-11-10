package ed;

import a8.x9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i implements lf.a {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final wf.b a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public p e;
    public String f;
    public int g;
    public gf.e h;
    public gf.d i;

    public i(wf.b bVar, List list, List list2) {
        k kVar;
        this.a = bVar;
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
            nf.a aVar = (nf.a) it2.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                nf.a aVar2 = (nf.a) hashMap2.get(Character.valueOf(e10));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e10, aVar, hashMap2);
                } else {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e10);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e10), kVar);
                }
            } else {
                b(e10, aVar, hashMap2);
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

    public static void b(char c10, nf.a aVar, HashMap hashMap) {
        if (((nf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    @Override // lf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        p sVar;
        p pVar2;
        boolean z9;
        boolean z10;
        bg.f fVar;
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
                    int i7 = this.g;
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
                            this.g = i7;
                            pVar2 = sVar;
                        }
                    }
                    if (pVar2 == null) {
                        this.g++;
                        pVar2 = new s(String.valueOf(d));
                    }
                } else {
                    nf.a aVar = (nf.a) this.d.get(Character.valueOf(d));
                    if (aVar != null) {
                        int i10 = this.g;
                        int i11 = 0;
                        while (d() == d) {
                            i11++;
                            this.g++;
                        }
                        if (i11 < aVar.d()) {
                            this.g = i10;
                            fVar = null;
                        } else {
                            String substring = i10 == 0 ? "\n" : this.f.substring(i10 - 1, i10);
                            char d2 = d();
                            String valueOf = d2 != 0 ? String.valueOf(d2) : "\n";
                            Pattern pattern = j;
                            boolean matches = pattern.matcher(substring).matches();
                            Pattern pattern2 = l;
                            boolean matches2 = pattern2.matcher(substring).matches();
                            boolean matches3 = pattern.matcher(valueOf).matches();
                            boolean matches4 = pattern2.matcher(valueOf).matches();
                            boolean z11 = !matches4 && (!matches3 || matches2 || matches);
                            boolean z12 = !matches2 && (!matches || matches4 || matches3);
                            if (d == '_') {
                                z10 = z11 && (!z12 || matches);
                                z9 = z12 && (!z11 || matches3);
                            } else {
                                boolean z13 = z11 && d == aVar.e();
                                z9 = z12 && d == aVar.b();
                                z10 = z13;
                            }
                            this.g = i10;
                            fVar = new bg.f(i11, z10, z9);
                        }
                        if (fVar != null) {
                            int i12 = fVar.a;
                            int i13 = this.g;
                            int i14 = i13 + i12;
                            this.g = i14;
                            bg.f fVar2 = fVar;
                            s sVar2 = new s(this.f.substring(i13, i14));
                            boolean z14 = fVar2.c;
                            boolean z15 = fVar2.b;
                            gf.e eVar = this.h;
                            gf.e eVar2 = new gf.e(sVar2, d, z14, z15, eVar);
                            this.h = eVar2;
                            eVar2.g = i12;
                            eVar2.h = i12;
                            if (eVar != null) {
                                eVar.f = eVar2;
                            }
                            pVar2 = sVar2;
                            if (pVar2 == null) {
                            }
                        }
                    } else {
                        int i15 = this.g;
                        int length = this.f.length();
                        while (true) {
                            int i16 = this.g;
                            if (i16 == length) {
                                break;
                            }
                            if (this.b.get(this.f.charAt(i16))) {
                                break;
                            } else {
                                this.g++;
                            }
                        }
                        int i17 = this.g;
                        if (i15 != i17) {
                            sVar = new s(this.f.substring(i15, i17));
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
        x9.b(pVar3, pVar4);
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

    public final void e(gf.e eVar) {
        boolean z9;
        p pVar;
        HashMap hashMap = new HashMap();
        gf.e eVar2 = this.h;
        while (eVar2 != null) {
            gf.e eVar3 = eVar2.e;
            if (eVar3 == eVar) {
                break;
            } else {
                eVar2 = eVar3;
            }
        }
        while (eVar2 != null) {
            s sVar = eVar2.a;
            char c10 = eVar2.b;
            nf.a aVar = (nf.a) this.d.get(Character.valueOf(c10));
            if (!eVar2.d || aVar == null) {
                eVar2 = eVar2.f;
            } else {
                char e10 = aVar.e();
                gf.e eVar4 = eVar2.e;
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
                    gf.e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        gf.e eVar6 = eVar5.e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f) != sVar) {
                        x9.b(pVar, (p) sVar.e);
                    }
                    aVar.a(sVar2, sVar, i7);
                    if (eVar4.g == 0) {
                        eVar4.a.g();
                        f(eVar4);
                    }
                    if (eVar2.g == 0) {
                        gf.e eVar7 = eVar2.f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                } else {
                    if (!z9) {
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
            gf.e eVar8 = this.h;
            if (eVar8 == null || eVar8 == eVar) {
                return;
            } else {
                f(eVar8);
            }
        }
    }

    public final void f(gf.e eVar) {
        gf.e eVar2 = eVar.e;
        if (eVar2 != null) {
            eVar2.f = eVar.f;
        }
        gf.e eVar3 = eVar.f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.e = eVar2;
        }
    }
}
