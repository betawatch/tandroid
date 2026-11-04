package df;

import b8.ec;
import gf.r;
import gf.t;
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
import k2.p1;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(gf.b.class, gf.i.class, gf.h.class, gf.j.class, t.class, gf.n.class, gf.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final hf.b j;
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
        hashMap.put(gf.b.class, new cf.a(1));
        hashMap.put(gf.i.class, new cf.a(3));
        hashMap.put(gf.h.class, new cf.a(2));
        hashMap.put(gf.j.class, new cf.a(4));
        hashMap.put(t.class, new cf.a(7));
        hashMap.put(gf.n.class, new cf.a(6));
        hashMap.put(gf.l.class, new cf.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, hf.b bVar, ArrayList arrayList2) {
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

    public final void a(jf.a aVar) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            gf.m mVar = (gf.m) obj;
            r rVar = pVar.a;
            mVar.g();
            gf.p pVar2 = (gf.p) rVar.e;
            mVar.e = pVar2;
            if (pVar2 != null) {
                pVar2.f = mVar;
            }
            mVar.f = rVar;
            rVar.e = mVar;
            gf.p pVar3 = (gf.p) rVar.b;
            mVar.b = pVar3;
            if (((gf.p) mVar.e) == null) {
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
            int i3 = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(i3, charSequence.length());
            int i10 = 4 - (this.c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i10);
            for (int i11 = 0; i11 < i10; i11++) {
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
            int i3 = this.c;
            this.c = (4 - (i3 % 4)) + i3;
        }
    }

    public final void e(jf.a aVar) {
        if (h() == aVar) {
            a1.g.y(1, this.n);
        }
        if (aVar instanceof p) {
            b((p) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((jf.a) list.get(size));
        }
    }

    public final void g() {
        int i3 = this.b;
        int i10 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = this.a.charAt(i3);
            if (charAt == '\t') {
                i3++;
                i10 += 4 - (i10 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i3++;
                i10++;
            }
        }
        this.e = i3;
        this.f = i10;
        this.g = i10 - this.c;
    }

    public final jf.a h() {
        return (jf.a) p1.h(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x01f2, code lost:
    
        if (r8 < 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01f4, code lost:
    
        r5 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01fa, code lost:
    
        if (r5 >= r14.length()) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01fc, code lost:
    
        r8 = r14.charAt(r5);
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0204, code lost:
    
        if (r8 == '\t') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0208, code lost:
    
        if (r8 == ' ') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x020d, code lost:
    
        r6 = r14.subSequence(r11, r15).toString();
        r8 = new gf.q();
        r8.g = java.lang.Integer.parseInt(r6);
        r8.h = r4;
        r4 = new df.m(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x020b, code lost:
    
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0646, code lost:
    
        if (r6 == 0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06e8, code lost:
    
        k(r23.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x01dd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0533  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        jf.a aVar;
        int i3;
        c cVar;
        boolean z10;
        c cVar2;
        int i10;
        int i11;
        char charAt;
        int i12;
        h hVar;
        i iVar;
        int i13;
        StringBuilder h02;
        c cVar3;
        int i14;
        m mVar;
        char charAt2;
        m mVar2;
        int i15;
        int i16;
        String str2 = str;
        int length = str2.length();
        int i17 = 0;
        StringBuilder sb2 = null;
        for (int i18 = 0; i18 < length; i18++) {
            char charAt3 = str2.charAt(i18);
            if (charAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i18);
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
        int i19 = 1;
        for (jf.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            a h = aVar2.h(this);
            if (h == null) {
                break;
            }
            if (h.b) {
                e(aVar2);
                return;
            }
            int i20 = h.a;
            if (i20 != -1) {
                k(i20);
            } else {
                int i21 = h.c;
                if (i21 != -1) {
                    j(i21);
                }
            }
            i19++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i19, arrayList.size()));
        jf.a aVar3 = (jf.a) arrayList.get(i19 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i22 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        android.support.v4.media.c cVar4 = new android.support.v4.media.c(aVar3, 15);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i23 = ((cf.a) it.next()).a;
                                i3 = i17;
                                char c2 = ' ';
                                Object obj = cVar4.b;
                                switch (i23) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder h03 = cVar4.h0();
                                        if (h03 != null && h03.toString().contains("|") && !h03.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i24 = i3;
                                            int i25 = i24;
                                            int i26 = i25;
                                            while (true) {
                                                if (i25 >= subSequence.length()) {
                                                    break;
                                                } else {
                                                    char charAt4 = subSequence.charAt(i25);
                                                    if (charAt4 == '\t' || charAt4 == ' ') {
                                                        i25++;
                                                    } else if (charAt4 == '-' || charAt4 == ':') {
                                                        if (i26 != 0 || arrayList3.isEmpty()) {
                                                            if (charAt4 == ':') {
                                                                i25++;
                                                                i10 = 1;
                                                            } else {
                                                                i10 = i3;
                                                            }
                                                            int i27 = i3;
                                                            while (i25 < subSequence.length() && subSequence.charAt(i25) == '-') {
                                                                i25++;
                                                                i27 = 1;
                                                            }
                                                            if (i27 != 0) {
                                                                if (i25 >= subSequence.length() || subSequence.charAt(i25) != ':') {
                                                                    i11 = i3;
                                                                } else {
                                                                    i25++;
                                                                    i11 = 1;
                                                                }
                                                                arrayList3.add((i10 == 0 || i11 == 0) ? i10 != 0 ? bf.c.a : i11 != 0 ? bf.c.c : null : bf.c.b);
                                                                i26 = i3;
                                                            }
                                                        }
                                                    } else if (charAt4 == '|') {
                                                        i25++;
                                                        i26++;
                                                        if (i26 <= 1) {
                                                            i24 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i28 = cf.b.i(h03);
                                                if (arrayList3.size() >= i28.size()) {
                                                    cf.b bVar = new cf.b(arrayList3, i28);
                                                    jf.a[] aVarArr = new jf.a[1];
                                                    aVarArr[i3] = bVar;
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
                                        int i29 = this.e;
                                        if (b.i(this, i29)) {
                                            int i30 = this.c + this.g;
                                            int i31 = i30 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i32 = i29 + 1;
                                            if (i32 < charSequence2.length() && ((charAt = charSequence2.charAt(i32)) == '\t' || charAt == ' ')) {
                                                i31 = i30 + 2;
                                            }
                                            jf.a[] aVarArr2 = new jf.a[1];
                                            aVarArr2[i3] = new b();
                                            cVar = new c(aVarArr2);
                                            cVar.c = i31;
                                            break;
                                        }
                                        cVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i33 = this.g;
                                        if (i33 < 4) {
                                            int i34 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i35 = i34;
                                            int i36 = i3;
                                            int i37 = i36;
                                            while (true) {
                                                i12 = i34;
                                                if (i35 < length2) {
                                                    char charAt5 = charSequence3.charAt(i35);
                                                    if (charAt5 == '`') {
                                                        i36++;
                                                    } else if (charAt5 == '~') {
                                                        i37++;
                                                    }
                                                    i35++;
                                                    i34 = i12;
                                                }
                                            }
                                            int i38 = 3;
                                            if (i36 >= 3) {
                                                if (i37 == 0) {
                                                    int i39 = i12 + i36;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i39 >= length3) {
                                                            i39 = -1;
                                                        } else if (charSequence3.charAt(i39) != '`') {
                                                            i39++;
                                                        }
                                                    }
                                                    if (i39 == -1) {
                                                        hVar = new h('`', i36, i33);
                                                        if (hVar != null) {
                                                            jf.a[] aVarArr3 = new jf.a[1];
                                                            aVarArr3[i3] = hVar;
                                                            cVar2 = new c(aVarArr3);
                                                            cVar2.a = i12 + hVar.a.h;
                                                            cVar = cVar2;
                                                            break;
                                                        }
                                                    }
                                                    hVar = null;
                                                    if (hVar != null) {
                                                    }
                                                } else {
                                                    i38 = 3;
                                                }
                                            }
                                            if (i37 >= i38 && i36 == 0) {
                                                hVar = new h('~', i37, i33);
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
                                            int i40 = this.e;
                                            int b10 = ec.b('#', i40, charSequence4.length(), charSequence4) - i40;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i41 = i40 + b10;
                                                if (i41 >= charSequence4.length()) {
                                                    iVar = new i(b10, "");
                                                } else {
                                                    char charAt6 = charSequence4.charAt(i41);
                                                    char c10 = ' ';
                                                    char c11 = '\t';
                                                    if (charAt6 == ' ' || charAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i41) {
                                                                length4 = i41 - 1;
                                                            } else {
                                                                char charAt7 = charSequence4.charAt(length4);
                                                                if (charAt7 == c11 || charAt7 == c10) {
                                                                    length4--;
                                                                    c11 = '\t';
                                                                    c10 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i42 = length4;
                                                        while (true) {
                                                            if (i42 < i41) {
                                                                i42 = i41 - 1;
                                                            } else if (charSequence4.charAt(i42) == '#') {
                                                                i42--;
                                                            }
                                                        }
                                                        int i43 = i42;
                                                        while (true) {
                                                            if (i43 < i41) {
                                                                i43 = i41 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(i43);
                                                                if (charAt8 == '\t' || charAt8 == ' ') {
                                                                    i43--;
                                                                }
                                                            }
                                                        }
                                                        iVar = i43 != i42 ? new i(b10, charSequence4.subSequence(i41, i43 + 1).toString()) : new i(b10, charSequence4.subSequence(i41, length4 + 1).toString());
                                                    }
                                                }
                                                if (iVar == null) {
                                                    jf.a[] aVarArr4 = new jf.a[1];
                                                    aVarArr4[i3] = iVar;
                                                    cVar3 = new c(aVarArr4);
                                                    cVar3.a = charSequence4.length();
                                                    cVar = cVar3;
                                                    break;
                                                } else {
                                                    char charAt9 = charSequence4.charAt(i40);
                                                    if (charAt9 != '-') {
                                                        if (charAt9 == '=') {
                                                            if (ec.c(ec.b('=', i40 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i13 = 1;
                                                                if (i13 > 0 && (h02 = cVar4.h0()) != null) {
                                                                    i iVar2 = new i(i13, h02.toString());
                                                                    jf.a[] aVarArr5 = new jf.a[1];
                                                                    aVarArr5[i3] = iVar2;
                                                                    c cVar5 = new c(aVarArr5);
                                                                    cVar5.a = charSequence4.length();
                                                                    cVar5.b = true;
                                                                    cVar = cVar5;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        i13 = i3;
                                                        if (i13 > 0) {
                                                            i iVar22 = new i(i13, h02.toString());
                                                            jf.a[] aVarArr52 = new jf.a[1];
                                                            aVarArr52[i3] = iVar22;
                                                            c cVar52 = new c(aVarArr52);
                                                            cVar52.a = charSequence4.length();
                                                            cVar52.b = true;
                                                            cVar = cVar52;
                                                        }
                                                    }
                                                    if (ec.c(ec.b('-', i40 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i13 = 2;
                                                        if (i13 > 0) {
                                                        }
                                                    }
                                                    i13 = i3;
                                                    if (i13 > 0) {
                                                    }
                                                }
                                            }
                                            iVar = null;
                                            if (iVar == null) {
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i44 = i22;
                                        int i45 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < i44 && charSequence5.charAt(i45) == '<') {
                                            for (int i46 = 1; i46 <= 7; i46++) {
                                                if (i46 != 7 || !(((jf.a) obj).e() instanceof r)) {
                                                    Pattern[] patternArr = j.e[i46];
                                                    Pattern pattern = patternArr[i3];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i45, charSequence5.length())).find()) {
                                                        jf.a[] aVarArr6 = new jf.a[1];
                                                        aVarArr6[i3] = new j(pattern2);
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
                                                jf.a[] aVarArr7 = new jf.a[1];
                                                aVarArr7[i3] = new i();
                                                cVar = new c(aVarArr7);
                                                cVar.c = this.c + 4;
                                                break;
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 6:
                                        jf.a aVar4 = (jf.a) obj;
                                        int i47 = this.g;
                                        if (i47 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i48 = this.e;
                                            int i49 = this.c + i47;
                                            int i50 = cVar4.h0() != null ? 1 : i3;
                                            CharSequence charSequence6 = this.a;
                                            char charAt10 = charSequence6.charAt(i48);
                                            if (charAt10 == '*' || charAt10 == '+' || charAt10 == '-') {
                                                i14 = i50;
                                                aVar = aVar3;
                                                int i51 = i48 + 1;
                                                if (i51 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i51)) == '\t' || charAt2 == ' ') {
                                                    gf.c cVar6 = new gf.c();
                                                    cVar6.g = charAt10;
                                                    mVar = new m(cVar6, i51);
                                                    if (mVar != null) {
                                                        gf.n nVar = mVar.a;
                                                        int i52 = mVar.b;
                                                        int i53 = (i52 - i48) + i49;
                                                        int length5 = charSequence6.length();
                                                        int i54 = i53;
                                                        while (true) {
                                                            if (i52 >= length5) {
                                                                i15 = i3;
                                                            } else {
                                                                char charAt11 = charSequence6.charAt(i52);
                                                                if (charAt11 == '\t') {
                                                                    i54 = (4 - (i54 % 4)) + i54;
                                                                } else if (charAt11 == ' ') {
                                                                    i54++;
                                                                } else {
                                                                    i15 = 1;
                                                                }
                                                                i52++;
                                                            }
                                                        }
                                                        if (i14 == 0 || ((!(nVar instanceof gf.q) || ((gf.q) nVar).g == 1) && i15 != 0)) {
                                                            if (i15 == 0 || i54 - i53 > 4) {
                                                                i54 = i53 + 1;
                                                            }
                                                            mVar2 = new m(nVar, i54);
                                                            if (mVar2 != null) {
                                                                gf.n nVar2 = mVar2.a;
                                                                int i55 = mVar2.b;
                                                                o oVar = new o(i55 - this.c);
                                                                if (aVar4 instanceof n) {
                                                                    gf.n nVar3 = ((n) aVar4).a;
                                                                    if ((((nVar3 instanceof gf.c) && (nVar2 instanceof gf.c)) ? Character.valueOf(((gf.c) nVar3).g).equals(Character.valueOf(((gf.c) nVar2).g)) : ((nVar3 instanceof gf.q) && (nVar2 instanceof gf.q)) ? Character.valueOf(((gf.q) nVar3).h).equals(Character.valueOf(((gf.q) nVar2).h)) : i3) != 0) {
                                                                        jf.a[] aVarArr8 = new jf.a[1];
                                                                        aVarArr8[i3] = oVar;
                                                                        cVar3 = new c(aVarArr8);
                                                                        cVar3.c = i55;
                                                                        cVar = cVar3;
                                                                        break;
                                                                    }
                                                                }
                                                                n nVar4 = new n(nVar2);
                                                                jf.a[] aVarArr9 = new jf.a[2];
                                                                aVarArr9[i3] = nVar4;
                                                                aVarArr9[1] = oVar;
                                                                cVar = new c(aVarArr9);
                                                                cVar.c = i55;
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
                                                int i56 = i48;
                                                int i57 = i3;
                                                while (true) {
                                                    if (i56 < length6) {
                                                        int i58 = length6;
                                                        char charAt12 = charSequence6.charAt(i56);
                                                        i14 = i50;
                                                        if (charAt12 != ')' && charAt12 != '.') {
                                                            switch (charAt12) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case hs.o0 /* 51 */:
                                                                case hs.p0 /* 52 */:
                                                                case hs.q0 /* 53 */:
                                                                case hs.r0 /* 54 */:
                                                                case hs.s0 /* 55 */:
                                                                case hs.t0 /* 56 */:
                                                                case hs.u0 /* 57 */:
                                                                    i57++;
                                                                    if (i57 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i56++;
                                                                        length6 = i58;
                                                                        i50 = i14;
                                                                    }
                                                            }
                                                            if (mVar != null) {
                                                            }
                                                            mVar2 = null;
                                                            if (mVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        i14 = i50;
                                                    }
                                                }
                                                aVar = aVar3;
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
                                            int i60 = i3;
                                            int i61 = i60;
                                            int i62 = i61;
                                            while (true) {
                                                if (i59 >= length7) {
                                                    int i63 = i62;
                                                    if ((i60 >= 3 && i61 == 0 && i63 == 0) || ((i61 >= 3 && i60 == 0 && i63 == 0) || (i63 >= 3 && i60 == 0 && i61 == 0))) {
                                                        jf.a[] aVarArr10 = new jf.a[1];
                                                        aVarArr10[i3] = new f(1);
                                                        cVar = new c(aVarArr10);
                                                        cVar.a = charSequence7.length();
                                                    }
                                                } else {
                                                    char charAt13 = charSequence7.charAt(i59);
                                                    if (charAt13 == '\t' || charAt13 == c2) {
                                                        i62 = i62;
                                                    } else if (charAt13 == '*') {
                                                        i62++;
                                                    } else if (charAt13 == '-') {
                                                        i60++;
                                                    } else if (charAt13 == '_') {
                                                        i61++;
                                                    }
                                                    i59++;
                                                    c2 = ' ';
                                                }
                                            }
                                        }
                                        cVar = null;
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.g < i22) {
                                            int i64 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length8 = charSequence8.length();
                                            int i65 = i64;
                                            while (true) {
                                                if (i65 >= length8) {
                                                    i16 = length8 - i64;
                                                } else if ('$' != charSequence8.charAt(i65)) {
                                                    i16 = i65 - i64;
                                                } else {
                                                    i65++;
                                                }
                                            }
                                            if (i16 >= 2 && ec.b(' ', i64 + i16, length8, charSequence8) == length8) {
                                                jf.a[] aVarArr11 = new jf.a[1];
                                                aVarArr11[i3] = new wc.b(i16);
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
                                    i17 = i3;
                                    aVar3 = aVar;
                                    i22 = 4;
                                }
                            } else {
                                i3 = i17;
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
                                jf.a h7 = h();
                                z10 = true;
                                a1.g.y(1, arrayList);
                                this.o.remove(h7);
                                if (h7 instanceof p) {
                                    b((p) h7);
                                }
                                h7.e().g();
                            } else {
                                z10 = true;
                            }
                            jf.a[] aVarArr12 = (jf.a[]) cVar.d;
                            int length9 = aVarArr12.length;
                            int i68 = i3;
                            while (i68 < length9) {
                                jf.a aVar5 = aVarArr12[i68];
                                a(aVar5);
                                z11 = aVar5.f();
                                i68++;
                                aVar = aVar5;
                            }
                            i17 = i3;
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

    public final void j(int i3) {
        int i10;
        int i11 = this.f;
        if (i3 >= i11) {
            this.b = this.e;
            this.c = i11;
        }
        int length = this.a.length();
        while (true) {
            i10 = this.c;
            if (i10 >= i3 || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i10 <= i3) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i3;
        this.d = true;
    }

    public final void k(int i3) {
        int i10 = this.e;
        if (i3 >= i10) {
            this.b = i10;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i11 = this.b;
            if (i11 >= i3 || i11 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
