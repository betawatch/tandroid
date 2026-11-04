package bd;

import b8.s1;
import gf.p;
import gf.s;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements hf.a {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final q a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public p e;
    public String f;
    public int g;
    public df.e h;
    public df.d i;

    public j(q qVar, List list, List list2) {
        l lVar;
        this.a = qVar;
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
            kf.a aVar = (kf.a) it2.next();
            char e10 = aVar.e();
            char b10 = aVar.b();
            if (e10 == b10) {
                kf.a aVar2 = (kf.a) hashMap2.get(Character.valueOf(e10));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e10, aVar, hashMap2);
                } else {
                    if (aVar2 instanceof l) {
                        lVar = (l) aVar2;
                    } else {
                        l lVar2 = new l(e10);
                        lVar2.f(aVar2);
                        lVar = lVar2;
                    }
                    lVar.f(aVar);
                    hashMap2.put(Character.valueOf(e10), lVar);
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

    public static void b(char c2, kf.a aVar, HashMap hashMap) {
        if (((kf.a) hashMap.put(Character.valueOf(c2), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    @Override // hf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        p sVar;
        p pVar2;
        boolean z10;
        boolean z11;
        i iVar;
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
                    int i3 = this.g;
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
                            this.g = i3;
                            pVar2 = sVar;
                        }
                    }
                    if (pVar2 == null) {
                        this.g++;
                        pVar2 = new s(String.valueOf(d));
                    }
                } else {
                    kf.a aVar = (kf.a) this.d.get(Character.valueOf(d));
                    if (aVar != null) {
                        int i10 = this.g;
                        int i11 = 0;
                        while (d() == d) {
                            i11++;
                            this.g++;
                        }
                        if (i11 < aVar.d()) {
                            this.g = i10;
                            iVar = null;
                        } else {
                            String substring = i10 == 0 ? "\n" : this.f.substring(i10 - 1, i10);
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
                            this.g = i10;
                            iVar = new i(i11, z11, z10);
                        }
                        if (iVar != null) {
                            int i12 = iVar.a;
                            int i13 = this.g;
                            int i14 = i13 + i12;
                            this.g = i14;
                            i iVar2 = iVar;
                            s sVar2 = new s(this.f.substring(i13, i14));
                            boolean z15 = iVar2.c;
                            boolean z16 = iVar2.b;
                            df.e eVar = this.h;
                            df.e eVar2 = new df.e(sVar2, d, z15, z16, eVar);
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
        s1.b(pVar3, pVar4);
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

    public final void e(df.e eVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        df.e eVar2 = this.h;
        while (eVar2 != null) {
            df.e eVar3 = eVar2.e;
            if (eVar3 == eVar) {
                break;
            } else {
                eVar2 = eVar3;
            }
        }
        while (eVar2 != null) {
            s sVar = eVar2.a;
            char c2 = eVar2.b;
            kf.a aVar = (kf.a) this.d.get(Character.valueOf(c2));
            if (!eVar2.d || aVar == null) {
                eVar2 = eVar2.f;
            } else {
                char e10 = aVar.e();
                df.e eVar4 = eVar2.e;
                int i3 = 0;
                boolean z11 = false;
                while (eVar4 != null && eVar4 != eVar && eVar4 != hashMap.get(Character.valueOf(c2))) {
                    if (eVar4.c && eVar4.b == e10) {
                        i3 = aVar.a(eVar4, eVar2);
                        z11 = true;
                        if (i3 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    eVar4 = eVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (z11) {
                    s sVar2 = eVar4.a;
                    eVar4.g -= i3;
                    eVar2.g -= i3;
                    sVar2.g = com.google.android.recaptcha.internal.a.j(sVar2.g, i3, 0);
                    sVar.g = com.google.android.recaptcha.internal.a.j(sVar.g, i3, 0);
                    df.e eVar5 = eVar2.e;
                    while (eVar5 != null && eVar5 != eVar4) {
                        df.e eVar6 = eVar5.e;
                        f(eVar5);
                        eVar5 = eVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f) != sVar) {
                        s1.b(pVar, (p) sVar.e);
                    }
                    aVar.c(sVar2, sVar, i3);
                    if (eVar4.g == 0) {
                        eVar4.a.g();
                        f(eVar4);
                    }
                    if (eVar2.g == 0) {
                        df.e eVar7 = eVar2.f;
                        sVar.g();
                        f(eVar2);
                        eVar2 = eVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c2), eVar2.e);
                        if (!eVar2.c) {
                            f(eVar2);
                        }
                    }
                    eVar2 = eVar2.f;
                }
            }
        }
        while (true) {
            df.e eVar8 = this.h;
            if (eVar8 == null || eVar8 == eVar) {
                return;
            } else {
                f(eVar8);
            }
        }
    }

    public final void f(df.e eVar) {
        df.e eVar2 = eVar.e;
        if (eVar2 != null) {
            eVar2.f = eVar.f;
        }
        df.e eVar3 = eVar.f;
        if (eVar3 == null) {
            this.h = eVar2;
        } else {
            eVar3.e = eVar2;
        }
    }
}
