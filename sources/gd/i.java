package gd;

import af.l;
import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v7.p7;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class i implements ef.a {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final qf.b a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public p e;
    public String f;
    public int g;
    public af.f h;
    public af.e i;

    public i(qf.b bVar, List list, List list2) {
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
            gf.a aVar = (gf.a) it2.next();
            char e = aVar.e();
            char a2 = aVar.a();
            if (e == a2) {
                gf.a aVar2 = (gf.a) hashMap2.get(Character.valueOf(e));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
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
                b(a2, aVar, hashMap2);
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

    public static void b(char c10, gf.a aVar, HashMap hashMap) {
        if (((gf.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    @Override // ef.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        p sVar;
        p pVar2;
        boolean z10;
        boolean z11;
        l lVar;
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
                        pVar2 = new s(String.valueOf(d));
                    }
                } else {
                    gf.a aVar = (gf.a) this.d.get(Character.valueOf(d));
                    if (aVar != null) {
                        int i11 = this.g;
                        int i12 = 0;
                        while (d() == d) {
                            i12++;
                            this.g++;
                        }
                        if (i12 < aVar.c()) {
                            this.g = i11;
                            lVar = null;
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
                                z10 = z13 && d == aVar.a();
                                z11 = z14;
                            }
                            this.g = i11;
                            lVar = new l(i12, z11, z10);
                        }
                        if (lVar != null) {
                            int i13 = lVar.a;
                            int i14 = this.g;
                            int i15 = i14 + i13;
                            this.g = i15;
                            l lVar2 = lVar;
                            s sVar2 = new s(this.f.substring(i14, i15));
                            boolean z15 = lVar2.c;
                            boolean z16 = lVar2.b;
                            af.f fVar = this.h;
                            af.f fVar2 = new af.f(sVar2, d, z15, z16, fVar);
                            this.h = fVar2;
                            fVar2.g = i13;
                            fVar2.h = i13;
                            if (fVar != null) {
                                fVar.f = fVar2;
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
                            sVar = new s(this.f.substring(i16, i18));
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
        p7.b(pVar3, pVar4);
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

    public final void e(af.f fVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        af.f fVar2 = this.h;
        while (fVar2 != null) {
            af.f fVar3 = fVar2.e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            s sVar = fVar2.a;
            char c10 = fVar2.b;
            gf.a aVar = (gf.a) this.d.get(Character.valueOf(c10));
            if (!fVar2.d || aVar == null) {
                fVar2 = fVar2.f;
            } else {
                char e = aVar.e();
                af.f fVar4 = fVar2.e;
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
                    s sVar2 = fVar4.a;
                    fVar4.g -= i10;
                    fVar2.g -= i10;
                    sVar2.g = k3.j(i10, 0, sVar2.g);
                    sVar.g = k3.j(i10, 0, sVar.g);
                    af.f fVar5 = fVar2.e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        af.f fVar6 = fVar5.e;
                        f(fVar5);
                        fVar5 = fVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f) != sVar) {
                        p7.b(pVar, (p) sVar.e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (fVar4.g == 0) {
                        fVar4.a.g();
                        f(fVar4);
                    }
                    if (fVar2.g == 0) {
                        af.f fVar7 = fVar2.f;
                        sVar.g();
                        f(fVar2);
                        fVar2 = fVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), fVar2.e);
                        if (!fVar2.c) {
                            f(fVar2);
                        }
                    }
                    fVar2 = fVar2.f;
                }
            }
        }
        while (true) {
            af.f fVar8 = this.h;
            if (fVar8 == null || fVar8 == fVar) {
                return;
            } else {
                f(fVar8);
            }
        }
    }

    public final void f(af.f fVar) {
        af.f fVar2 = fVar.e;
        if (fVar2 != null) {
            fVar2.f = fVar.f;
        }
        af.f fVar3 = fVar.f;
        if (fVar3 == null) {
            this.h = fVar2;
        } else {
            fVar3.e = fVar2;
        }
    }
}
