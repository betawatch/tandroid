package nc;

import h7.z;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.p;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements ke.a {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final g5.b a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public p e;
    public String f;
    public int g;
    public ge.c h;
    public ge.b i;

    public i(g5.b bVar, List list, List list2) {
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
            me.a aVar = (me.a) it2.next();
            char e9 = aVar.e();
            char a2 = aVar.a();
            if (e9 == a2) {
                me.a aVar2 = (me.a) hashMap2.get(Character.valueOf(e9));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
                    b(e9, aVar, hashMap2);
                } else {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e9);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e9), kVar);
                }
            } else {
                b(e9, aVar, hashMap2);
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

    public static void b(char c10, me.a aVar, HashMap hashMap) {
        if (((me.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    @Override // ke.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        p sVar;
        p pVar2;
        boolean z10;
        boolean z11;
        ge.i iVar;
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
                    me.a aVar = (me.a) this.d.get(Character.valueOf(d));
                    if (aVar != null) {
                        int i11 = this.g;
                        int i12 = 0;
                        while (d() == d) {
                            i12++;
                            this.g++;
                        }
                        if (i12 < aVar.d()) {
                            this.g = i11;
                            iVar = null;
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
                            iVar = new ge.i(i12, z11, z10);
                        }
                        if (iVar != null) {
                            int i13 = iVar.a;
                            int i14 = this.g;
                            int i15 = i14 + i13;
                            this.g = i15;
                            ge.i iVar2 = iVar;
                            s sVar2 = new s(this.f.substring(i14, i15));
                            boolean z15 = iVar2.c;
                            boolean z16 = iVar2.b;
                            ge.c cVar = this.h;
                            ge.c cVar2 = new ge.c(sVar2, d, z15, z16, cVar);
                            this.h = cVar2;
                            cVar2.g = i13;
                            cVar2.h = i13;
                            if (cVar != null) {
                                cVar.f = cVar2;
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
        z.b(pVar3, pVar4);
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

    public final void e(ge.c cVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        ge.c cVar2 = this.h;
        while (cVar2 != null) {
            ge.c cVar3 = cVar2.e;
            if (cVar3 == cVar) {
                break;
            } else {
                cVar2 = cVar3;
            }
        }
        while (cVar2 != null) {
            s sVar = cVar2.a;
            char c10 = cVar2.b;
            me.a aVar = (me.a) this.d.get(Character.valueOf(c10));
            if (!cVar2.d || aVar == null) {
                cVar2 = cVar2.f;
            } else {
                char e9 = aVar.e();
                ge.c cVar4 = cVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (cVar4.c && cVar4.b == e9) {
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
                    sVar2.g = com.google.android.recaptcha.internal.a.n(sVar2.g, i10, 0);
                    sVar.g = com.google.android.recaptcha.internal.a.n(sVar.g, i10, 0);
                    ge.c cVar5 = cVar2.e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        ge.c cVar6 = cVar5.e;
                        f(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f) != sVar) {
                        z.b(pVar, (p) sVar.e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (cVar4.g == 0) {
                        cVar4.a.g();
                        f(cVar4);
                    }
                    if (cVar2.g == 0) {
                        ge.c cVar7 = cVar2.f;
                        sVar.g();
                        f(cVar2);
                        cVar2 = cVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), cVar2.e);
                        if (!cVar2.c) {
                            f(cVar2);
                        }
                    }
                    cVar2 = cVar2.f;
                }
            }
        }
        while (true) {
            ge.c cVar8 = this.h;
            if (cVar8 == null || cVar8 == cVar) {
                return;
            } else {
                f(cVar8);
            }
        }
    }

    public final void f(ge.c cVar) {
        ge.c cVar2 = cVar.e;
        if (cVar2 != null) {
            cVar2.f = cVar.f;
        }
        ge.c cVar3 = cVar.f;
        if (cVar3 == null) {
            this.h = cVar2;
        } else {
            cVar3.e = cVar2;
        }
    }
}
