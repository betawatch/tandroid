package bf;

import a8.tb;
import androidx.car.app.navigation.model.Maneuver;
import ef.r;
import ef.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class g {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(ef.b.class, ef.i.class, ef.h.class, ef.j.class, t.class, ef.n.class, ef.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final ff.b j;
    public final List k;
    public final f l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ef.b.class, new af.a(1));
        hashMap.put(ef.i.class, new af.a(3));
        hashMap.put(ef.h.class, new af.a(2));
        hashMap.put(ef.j.class, new af.a(4));
        hashMap.put(t.class, new af.a(7));
        hashMap.put(ef.n.class, new af.a(6));
        hashMap.put(ef.l.class, new af.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, ff.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = bVar;
        this.k = arrayList2;
        f fVar = new f(0);
        this.l = fVar;
        arrayList3.add(fVar);
        linkedHashSet.add(fVar);
    }

    public final void a(gf.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.n.add(aVar);
        this.o.add(aVar);
    }

    public final void b(p pVar) {
        l lVar = pVar.b;
        lVar.a();
        ArrayList arrayList = lVar.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ef.m mVar = (ef.m) obj;
            r rVar = pVar.a;
            mVar.g();
            ef.p pVar2 = (ef.p) rVar.e;
            mVar.e = pVar2;
            if (pVar2 != null) {
                pVar2.f = mVar;
            }
            mVar.f = rVar;
            rVar.e = mVar;
            ef.p pVar3 = (ef.p) rVar.b;
            mVar.b = pVar3;
            if (((ef.p) mVar.e) == null) {
                pVar3.c = mVar;
            }
            String str = mVar.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            int i10 = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(i10, charSequence.length());
            int i11 = 4 - (this.c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.a;
            subSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.a.charAt(this.b) != '\t') {
            this.b++;
            this.c++;
        } else {
            this.b++;
            int i10 = this.c;
            this.c = (4 - (i10 % 4)) + i10;
        }
    }

    public final void e(gf.a aVar) {
        if (h() == aVar) {
            a1.g.A(1, this.n);
        }
        if (aVar instanceof p) {
            b((p) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((gf.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.b;
        int i11 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.a.charAt(i10);
            if (charAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.e = i10;
        this.f = i11;
        this.g = i11 - this.c;
    }

    public final gf.a h() {
        return (gf.a) ic.a.g(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x01ef, code lost:
    
        if (r12 < 1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01f1, code lost:
    
        r6 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01f7, code lost:
    
        if (r6 >= r14.length()) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01f9, code lost:
    
        r8 = r14.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01ff, code lost:
    
        if (r8 == '\t') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0203, code lost:
    
        if (r8 == ' ') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0206, code lost:
    
        r8 = r14.subSequence(r5, r15).toString();
        r12 = new ef.q();
        r12.g = java.lang.Integer.parseInt(r8);
        r12.h = r3;
        r3 = new bf.m(r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x063b, code lost:
    
        if (r6 == 0) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06de, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:176:0x01dc. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        gf.a aVar;
        int i10;
        c cVar;
        boolean z10;
        c cVar2;
        int i11;
        int i12;
        char charAt;
        int i13;
        h hVar;
        c cVar3;
        i iVar;
        int i14;
        StringBuilder N;
        int i15;
        m mVar;
        char charAt2;
        m mVar2;
        int i16;
        int i17;
        String str2 = str;
        int length = str2.length();
        int i18 = 0;
        StringBuilder sb2 = null;
        for (int i19 = 0; i19 < length; i19++) {
            char charAt3 = str2.charAt(i19);
            if (charAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i19);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(charAt3);
            }
        }
        if (sb2 != null) {
            str2 = sb2.toString();
        }
        this.a = str2;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i20 = 1;
        for (gf.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            a h = aVar2.h(this);
            if (h == null) {
                break;
            }
            if (h.b) {
                e(aVar2);
                return;
            }
            int i21 = h.a;
            if (i21 != -1) {
                k(i21);
            } else {
                int i22 = h.c;
                if (i22 != -1) {
                    j(i22);
                }
            }
            i20++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i20, arrayList.size()));
        gf.a aVar3 = (gf.a) arrayList.get(i20 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i23 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        za.c cVar4 = new za.c(aVar3, 6);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i24 = ((af.a) it.next()).a;
                                i10 = i18;
                                char c10 = ' ';
                                Object obj = cVar4.b;
                                switch (i24) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder N2 = cVar4.N();
                                        if (N2 != null && N2.toString().contains("|") && !N2.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i25 = i10;
                                            int i26 = i25;
                                            int i27 = i26;
                                            while (true) {
                                                if (i26 >= subSequence.length()) {
                                                    break;
                                                } else {
                                                    char charAt4 = subSequence.charAt(i26);
                                                    if (charAt4 == '\t' || charAt4 == ' ') {
                                                        i26++;
                                                    } else if (charAt4 == '-' || charAt4 == ':') {
                                                        if (i27 != 0 || arrayList3.isEmpty()) {
                                                            if (charAt4 == ':') {
                                                                i26++;
                                                                i11 = 1;
                                                            } else {
                                                                i11 = i10;
                                                            }
                                                            int i28 = i10;
                                                            while (i26 < subSequence.length() && subSequence.charAt(i26) == '-') {
                                                                i26++;
                                                                i28 = 1;
                                                            }
                                                            if (i28 != 0) {
                                                                if (i26 >= subSequence.length() || subSequence.charAt(i26) != ':') {
                                                                    i12 = i10;
                                                                } else {
                                                                    i26++;
                                                                    i12 = 1;
                                                                }
                                                                arrayList3.add((i11 == 0 || i12 == 0) ? i11 != 0 ? ze.c.a : i12 != 0 ? ze.c.c : null : ze.c.b);
                                                                i27 = i10;
                                                            }
                                                        }
                                                    } else if (charAt4 == '|') {
                                                        i26++;
                                                        i27++;
                                                        if (i27 <= 1) {
                                                            i25 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i29 = af.b.i(N2);
                                                if (arrayList3.size() >= i29.size()) {
                                                    af.b bVar = new af.b(arrayList3, i29);
                                                    gf.a[] aVarArr = new gf.a[1];
                                                    aVarArr[i10] = bVar;
                                                    cVar2 = new c(aVarArr);
                                                    cVar2.a = this.b;
                                                    cVar2.b = true;
                                                    cVar = cVar2;
                                                    break;
                                                }
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i30 = this.e;
                                        if (b.i(this, i30)) {
                                            int i31 = this.c + this.g;
                                            int i32 = i31 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i33 = i30 + 1;
                                            if (i33 < charSequence2.length() && ((charAt = charSequence2.charAt(i33)) == '\t' || charAt == ' ')) {
                                                i32 = i31 + 2;
                                            }
                                            gf.a[] aVarArr2 = new gf.a[1];
                                            aVarArr2[i10] = new b();
                                            cVar = new c(aVarArr2);
                                            cVar.c = i32;
                                            break;
                                        }
                                        cVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i34 = this.g;
                                        if (i34 < 4) {
                                            int i35 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i36 = i35;
                                            int i37 = i10;
                                            int i38 = i37;
                                            while (true) {
                                                i13 = i35;
                                                if (i36 < length2) {
                                                    char charAt5 = charSequence3.charAt(i36);
                                                    if (charAt5 == '`') {
                                                        i37++;
                                                    } else if (charAt5 == '~') {
                                                        i38++;
                                                    }
                                                    i36++;
                                                    i35 = i13;
                                                }
                                            }
                                            int i39 = 3;
                                            if (i37 >= 3) {
                                                if (i38 == 0) {
                                                    int i40 = i13 + i37;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i40 >= length3) {
                                                            i40 = -1;
                                                        } else if (charSequence3.charAt(i40) != '`') {
                                                            i40++;
                                                        }
                                                    }
                                                    if (i40 == -1) {
                                                        hVar = new h('`', i37, i34);
                                                        if (hVar != null) {
                                                            gf.a[] aVarArr3 = new gf.a[1];
                                                            aVarArr3[i10] = hVar;
                                                            cVar3 = new c(aVarArr3);
                                                            cVar3.a = i13 + hVar.a.h;
                                                            cVar = cVar3;
                                                            break;
                                                        }
                                                    }
                                                    hVar = null;
                                                    if (hVar != null) {
                                                    }
                                                } else {
                                                    i39 = 3;
                                                }
                                            }
                                            if (i38 >= i39 && i37 == 0) {
                                                hVar = new h('~', i38, i34);
                                                if (hVar != null) {
                                                }
                                            }
                                            hVar = null;
                                            if (hVar != null) {
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.a;
                                            int i41 = this.e;
                                            int b10 = tb.b('#', charSequence4, i41, charSequence4.length()) - i41;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i42 = i41 + b10;
                                                if (i42 >= charSequence4.length()) {
                                                    iVar = new i(b10, "");
                                                } else {
                                                    char charAt6 = charSequence4.charAt(i42);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (charAt6 == ' ' || charAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i42) {
                                                                length4 = i42 - 1;
                                                            } else {
                                                                char charAt7 = charSequence4.charAt(length4);
                                                                if (charAt7 == c12 || charAt7 == c11) {
                                                                    length4--;
                                                                    c12 = '\t';
                                                                    c11 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i43 = length4;
                                                        while (true) {
                                                            if (i43 < i42) {
                                                                i43 = i42 - 1;
                                                            } else if (charSequence4.charAt(i43) == '#') {
                                                                i43--;
                                                            }
                                                        }
                                                        int i44 = i43;
                                                        while (true) {
                                                            if (i44 < i42) {
                                                                i44 = i42 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(i44);
                                                                if (charAt8 == '\t' || charAt8 == ' ') {
                                                                    i44--;
                                                                }
                                                            }
                                                        }
                                                        iVar = i44 != i43 ? new i(b10, charSequence4.subSequence(i42, i44 + 1).toString()) : new i(b10, charSequence4.subSequence(i42, length4 + 1).toString());
                                                    }
                                                }
                                                if (iVar == null) {
                                                    gf.a[] aVarArr4 = new gf.a[1];
                                                    aVarArr4[i10] = iVar;
                                                    cVar3 = new c(aVarArr4);
                                                    cVar3.a = charSequence4.length();
                                                } else {
                                                    char charAt9 = charSequence4.charAt(i41);
                                                    if (charAt9 != '-') {
                                                        if (charAt9 == '=') {
                                                            if (tb.c(tb.b('=', charSequence4, i41 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i14 = 1;
                                                                if (i14 > 0 && (N = cVar4.N()) != null) {
                                                                    gf.a[] aVarArr5 = new gf.a[1];
                                                                    aVarArr5[i10] = new i(i14, N.toString());
                                                                    cVar3 = new c(aVarArr5);
                                                                    cVar3.a = charSequence4.length();
                                                                    cVar3.b = true;
                                                                }
                                                            }
                                                        }
                                                        i14 = i10;
                                                        if (i14 > 0) {
                                                            gf.a[] aVarArr52 = new gf.a[1];
                                                            aVarArr52[i10] = new i(i14, N.toString());
                                                            cVar3 = new c(aVarArr52);
                                                            cVar3.a = charSequence4.length();
                                                            cVar3.b = true;
                                                        }
                                                    }
                                                    if (tb.c(tb.b('-', charSequence4, i41 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i14 = 2;
                                                        if (i14 > 0) {
                                                        }
                                                    }
                                                    i14 = i10;
                                                    if (i14 > 0) {
                                                    }
                                                }
                                                cVar = cVar3;
                                                break;
                                            }
                                            iVar = null;
                                            if (iVar == null) {
                                            }
                                            cVar = cVar3;
                                        }
                                        cVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i45 = i23;
                                        int i46 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < i45 && charSequence5.charAt(i46) == '<') {
                                            for (int i47 = 1; i47 <= 7; i47++) {
                                                if (i47 != 7 || !(((gf.a) obj).e() instanceof r)) {
                                                    Pattern[] patternArr = j.e[i47];
                                                    Pattern pattern = patternArr[i10];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i46, charSequence5.length())).find()) {
                                                        gf.a[] aVarArr6 = new gf.a[1];
                                                        aVarArr6[i10] = new j(pattern2);
                                                        cVar = new c(aVarArr6);
                                                        cVar.a = this.b;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        if (this.g >= 4) {
                                            if (!this.h && !(h().e() instanceof r)) {
                                                gf.a[] aVarArr7 = new gf.a[1];
                                                aVarArr7[i10] = new i();
                                                cVar = new c(aVarArr7);
                                                cVar.c = this.c + 4;
                                                break;
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 6:
                                        gf.a aVar4 = (gf.a) obj;
                                        int i48 = this.g;
                                        if (i48 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i49 = this.e;
                                            int i50 = this.c + i48;
                                            int i51 = cVar4.N() != null ? 1 : i10;
                                            CharSequence charSequence6 = this.a;
                                            char charAt10 = charSequence6.charAt(i49);
                                            if (charAt10 == '*' || charAt10 == '+' || charAt10 == '-') {
                                                i15 = i51;
                                                aVar = aVar3;
                                                int i52 = i49 + 1;
                                                if (i52 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i52)) == '\t' || charAt2 == ' ') {
                                                    ef.c cVar5 = new ef.c();
                                                    cVar5.g = charAt10;
                                                    mVar = new m(cVar5, i52);
                                                    if (mVar != null) {
                                                        ef.n nVar = mVar.a;
                                                        int i53 = mVar.b;
                                                        int i54 = (i53 - i49) + i50;
                                                        int length5 = charSequence6.length();
                                                        int i55 = i54;
                                                        while (true) {
                                                            if (i53 >= length5) {
                                                                i16 = i10;
                                                            } else {
                                                                char charAt11 = charSequence6.charAt(i53);
                                                                if (charAt11 == '\t') {
                                                                    i55 = (4 - (i55 % 4)) + i55;
                                                                } else if (charAt11 == ' ') {
                                                                    i55++;
                                                                } else {
                                                                    i16 = 1;
                                                                }
                                                                i53++;
                                                            }
                                                        }
                                                        if (i15 == 0 || ((!(nVar instanceof ef.q) || ((ef.q) nVar).g == 1) && i16 != 0)) {
                                                            if (i16 == 0 || i55 - i54 > 4) {
                                                                i55 = i54 + 1;
                                                            }
                                                            mVar2 = new m(nVar, i55);
                                                            if (mVar2 != null) {
                                                                ef.n nVar2 = mVar2.a;
                                                                int i56 = mVar2.b;
                                                                o oVar = new o(i56 - this.c);
                                                                if (aVar4 instanceof n) {
                                                                    ef.n nVar3 = ((n) aVar4).a;
                                                                    if ((((nVar3 instanceof ef.c) && (nVar2 instanceof ef.c)) ? Character.valueOf(((ef.c) nVar3).g).equals(Character.valueOf(((ef.c) nVar2).g)) : ((nVar3 instanceof ef.q) && (nVar2 instanceof ef.q)) ? Character.valueOf(((ef.q) nVar3).h).equals(Character.valueOf(((ef.q) nVar2).h)) : i10) != 0) {
                                                                        gf.a[] aVarArr8 = new gf.a[1];
                                                                        aVarArr8[i10] = oVar;
                                                                        c cVar6 = new c(aVarArr8);
                                                                        cVar6.c = i56;
                                                                        cVar = cVar6;
                                                                        break;
                                                                    }
                                                                }
                                                                n nVar4 = new n(nVar2);
                                                                gf.a[] aVarArr9 = new gf.a[2];
                                                                aVarArr9[i10] = nVar4;
                                                                aVarArr9[1] = oVar;
                                                                cVar2 = new c(aVarArr9);
                                                                cVar2.c = i56;
                                                                cVar = cVar2;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    mVar2 = null;
                                                    if (mVar2 != null) {
                                                    }
                                                }
                                                mVar = null;
                                                if (mVar != null) {
                                                }
                                                mVar2 = null;
                                                if (mVar2 != null) {
                                                }
                                            } else {
                                                int length6 = charSequence6.length();
                                                int i57 = i49;
                                                int i58 = i10;
                                                while (true) {
                                                    i15 = i51;
                                                    if (i57 < length6) {
                                                        char charAt12 = charSequence6.charAt(i57);
                                                        aVar = aVar3;
                                                        if (charAt12 != ')' && charAt12 != '.') {
                                                            switch (charAt12) {
                                                                case '0':
                                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i58++;
                                                                    if (i58 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i57++;
                                                                        i51 = i15;
                                                                        aVar3 = aVar;
                                                                    }
                                                            }
                                                            if (mVar != null) {
                                                            }
                                                            mVar2 = null;
                                                            if (mVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        aVar = aVar3;
                                                    }
                                                }
                                                mVar = null;
                                                if (mVar != null) {
                                                }
                                                mVar2 = null;
                                                if (mVar2 != null) {
                                                }
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 7:
                                        if (this.g < 4) {
                                            int i59 = this.e;
                                            CharSequence charSequence7 = this.a;
                                            int length7 = charSequence7.length();
                                            int i60 = i10;
                                            int i61 = i60;
                                            int i62 = i61;
                                            while (true) {
                                                if (i59 >= length7) {
                                                    int i63 = i62;
                                                    if ((i60 >= 3 && i61 == 0 && i63 == 0) || ((i61 >= 3 && i60 == 0 && i63 == 0) || (i63 >= 3 && i60 == 0 && i61 == 0))) {
                                                        gf.a[] aVarArr10 = new gf.a[1];
                                                        aVarArr10[i10] = new f(1);
                                                        cVar = new c(aVarArr10);
                                                        cVar.a = charSequence7.length();
                                                    }
                                                } else {
                                                    char charAt13 = charSequence7.charAt(i59);
                                                    if (charAt13 == '\t' || charAt13 == c10) {
                                                        i62 = i62;
                                                    } else if (charAt13 == '*') {
                                                        i62++;
                                                    } else if (charAt13 == '-') {
                                                        i60++;
                                                    } else if (charAt13 == '_') {
                                                        i61++;
                                                    }
                                                    i59++;
                                                    c10 = ' ';
                                                }
                                            }
                                        }
                                        cVar = null;
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.g < i23) {
                                            int i64 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length8 = charSequence8.length();
                                            int i65 = i64;
                                            while (true) {
                                                if (i65 >= length8) {
                                                    i17 = length8 - i64;
                                                } else if ('$' != charSequence8.charAt(i65)) {
                                                    i17 = i65 - i64;
                                                } else {
                                                    i65++;
                                                }
                                            }
                                            if (i17 >= 2 && tb.b(' ', charSequence8, i64 + i17, length8) == length8) {
                                                gf.a[] aVarArr11 = new gf.a[1];
                                                aVarArr11[i10] = new cd.b(i17);
                                                cVar = new c(aVarArr11);
                                                cVar.a = length8 + 1;
                                                aVar = aVar3;
                                                break;
                                            }
                                        }
                                        cVar = null;
                                        aVar = aVar3;
                                        break;
                                }
                                if (cVar == null) {
                                    i18 = i10;
                                    aVar3 = aVar;
                                    i23 = 4;
                                }
                            } else {
                                i10 = i18;
                                aVar = aVar3;
                                cVar = null;
                            }
                        }
                        if (cVar == null) {
                            k(this.e);
                        } else {
                            if (!isEmpty) {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i66 = cVar.a;
                            if (i66 != -1) {
                                k(i66);
                            } else {
                                int i67 = cVar.c;
                                if (i67 != -1) {
                                    j(i67);
                                }
                            }
                            if (cVar.b) {
                                gf.a h10 = h();
                                z10 = true;
                                a1.g.A(1, arrayList);
                                this.o.remove(h10);
                                if (h10 instanceof p) {
                                    b((p) h10);
                                }
                                h10.e().g();
                            } else {
                                z10 = true;
                            }
                            gf.a[] aVarArr12 = (gf.a[]) cVar.d;
                            int length9 = aVarArr12.length;
                            int i68 = i10;
                            while (i68 < length9) {
                                gf.a aVar5 = aVarArr12[i68];
                                a(aVar5);
                                z11 = aVar5.f();
                                i68++;
                                aVar = aVar5;
                            }
                            i18 = i10;
                            aVar3 = aVar;
                        }
                    }
                }
            } else {
                aVar = aVar3;
            }
        }
        if (!isEmpty && !this.h && h().c()) {
            c();
            return;
        }
        if (!isEmpty) {
            f(arrayList2);
        }
        if (!aVar.f()) {
            c();
        } else {
            if (this.h) {
                return;
            }
            a(new p());
            c();
        }
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f;
        if (i10 >= i12) {
            this.b = this.e;
            this.c = i12;
        }
        int length = this.a.length();
        while (true) {
            i11 = this.c;
            if (i11 >= i10 || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i11 <= i10) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i10;
        this.d = true;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.b = i11;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i12 = this.b;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
