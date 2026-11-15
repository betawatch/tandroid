package gf;

import a8.p0;
import c8.y0;
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
import kf.r;
import kf.t;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(kf.b.class, kf.i.class, kf.h.class, kf.j.class, t.class, kf.n.class, kf.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final lf.b j;
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
        hashMap.put(kf.b.class, new ff.a(1));
        hashMap.put(kf.i.class, new ff.a(3));
        hashMap.put(kf.h.class, new ff.a(2));
        hashMap.put(kf.j.class, new ff.a(4));
        hashMap.put(t.class, new ff.a(7));
        hashMap.put(kf.n.class, new ff.a(6));
        hashMap.put(kf.l.class, new ff.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(ArrayList arrayList, lf.b bVar, ArrayList arrayList2) {
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

    public final void a(mf.a aVar) {
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            kf.m mVar = (kf.m) obj;
            r rVar = pVar.a;
            mVar.g();
            kf.p pVar2 = (kf.p) rVar.e;
            mVar.e = pVar2;
            if (pVar2 != null) {
                pVar2.f = mVar;
            }
            mVar.f = rVar;
            rVar.e = mVar;
            kf.p pVar3 = (kf.p) rVar.b;
            mVar.b = pVar3;
            if (((kf.p) mVar.e) == null) {
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
            int i7 = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(i7, charSequence.length());
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
            int i7 = this.c;
            this.c = (4 - (i7 % 4)) + i7;
        }
    }

    public final void e(mf.a aVar) {
        if (h() == aVar) {
            p0.z(1, this.n);
        }
        if (aVar instanceof p) {
            b((p) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((mf.a) list.get(size));
        }
    }

    public final void g() {
        int i7 = this.b;
        int i10 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i7 >= length) {
                break;
            }
            char charAt = this.a.charAt(i7);
            if (charAt == '\t') {
                i7++;
                i10 += 4 - (i10 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i7++;
                i10++;
            }
        }
        this.e = i7;
        this.f = i10;
        this.g = i10 - this.c;
    }

    public final mf.a h() {
        return (mf.a) i5.c.h(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x01fd, code lost:
    
        if (r8 < 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01ff, code lost:
    
        r5 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0205, code lost:
    
        if (r5 >= r15.length()) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0207, code lost:
    
        r8 = r15.charAt(r5);
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x020f, code lost:
    
        if (r8 == '\t') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0213, code lost:
    
        if (r8 == ' ') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0218, code lost:
    
        r6 = r15.subSequence(r11, r14).toString();
        r8 = new kf.q();
        r8.g = java.lang.Integer.parseInt(r6);
        r8.h = r4;
        r4 = new gf.m(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0216, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x064c, code lost:
    
        if (r6 == 0) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06ed, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x01e8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x053a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        mf.a aVar;
        int i7;
        c cVar;
        boolean z10;
        int i10;
        int i11;
        char charAt;
        int i12;
        h hVar;
        c cVar2;
        i iVar;
        int i13;
        StringBuilder T;
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
        for (mf.a aVar2 : arrayList.subList(1, arrayList.size())) {
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
        mf.a aVar3 = (mf.a) arrayList.get(i19 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i22 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        d6.i iVar2 = new d6.i(aVar3, 23);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i7 = i17;
                                char c10 = ' ';
                                switch (((ff.a) it.next()).a) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder T2 = iVar2.T();
                                        if (T2 != null && T2.toString().contains("|") && !T2.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i23 = i7;
                                            int i24 = i23;
                                            int i25 = i24;
                                            while (true) {
                                                if (i24 >= subSequence.length()) {
                                                    break;
                                                } else {
                                                    char charAt4 = subSequence.charAt(i24);
                                                    if (charAt4 == '\t' || charAt4 == ' ') {
                                                        i24++;
                                                    } else if (charAt4 == '-' || charAt4 == ':') {
                                                        if (i25 != 0 || arrayList3.isEmpty()) {
                                                            if (charAt4 == ':') {
                                                                i24++;
                                                                i10 = 1;
                                                            } else {
                                                                i10 = i7;
                                                            }
                                                            int i26 = i7;
                                                            while (i24 < subSequence.length() && subSequence.charAt(i24) == '-') {
                                                                i24++;
                                                                i26 = 1;
                                                            }
                                                            if (i26 != 0) {
                                                                if (i24 >= subSequence.length() || subSequence.charAt(i24) != ':') {
                                                                    i11 = i7;
                                                                } else {
                                                                    i24++;
                                                                    i11 = 1;
                                                                }
                                                                arrayList3.add((i10 == 0 || i11 == 0) ? i10 != 0 ? ef.c.a : i11 != 0 ? ef.c.c : null : ef.c.b);
                                                                i25 = i7;
                                                            }
                                                        }
                                                    } else if (charAt4 == '|') {
                                                        i24++;
                                                        i25++;
                                                        if (i25 <= 1) {
                                                            i23 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i27 = ff.b.i(T2);
                                                if (arrayList3.size() >= i27.size()) {
                                                    ff.b bVar = new ff.b(arrayList3, i27);
                                                    mf.a[] aVarArr = new mf.a[1];
                                                    aVarArr[i7] = bVar;
                                                    c cVar3 = new c(aVarArr);
                                                    cVar3.a = this.b;
                                                    cVar3.b = true;
                                                    cVar = cVar3;
                                                    break;
                                                }
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i28 = this.e;
                                        if (b.i(this, i28)) {
                                            int i29 = this.c + this.g;
                                            int i30 = i29 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i31 = i28 + 1;
                                            if (i31 < charSequence2.length() && ((charAt = charSequence2.charAt(i31)) == '\t' || charAt == ' ')) {
                                                i30 = i29 + 2;
                                            }
                                            mf.a[] aVarArr2 = new mf.a[1];
                                            aVarArr2[i7] = new b();
                                            cVar = new c(aVarArr2);
                                            cVar.c = i30;
                                            break;
                                        }
                                        cVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i32 = this.g;
                                        if (i32 < 4) {
                                            int i33 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i34 = i33;
                                            int i35 = i7;
                                            int i36 = i35;
                                            while (true) {
                                                i12 = i33;
                                                if (i34 < length2) {
                                                    char charAt5 = charSequence3.charAt(i34);
                                                    if (charAt5 == '`') {
                                                        i35++;
                                                    } else if (charAt5 == '~') {
                                                        i36++;
                                                    }
                                                    i34++;
                                                    i33 = i12;
                                                }
                                            }
                                            int i37 = 3;
                                            if (i35 >= 3) {
                                                if (i36 == 0) {
                                                    int i38 = i12 + i35;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i38 >= length3) {
                                                            i38 = -1;
                                                        } else if (charSequence3.charAt(i38) != '`') {
                                                            i38++;
                                                        }
                                                    }
                                                    if (i38 == -1) {
                                                        hVar = new h('`', i35, i32);
                                                        if (hVar != null) {
                                                            mf.a[] aVarArr3 = new mf.a[1];
                                                            aVarArr3[i7] = hVar;
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
                                                    i37 = 3;
                                                }
                                            }
                                            if (i36 >= i37 && i35 == 0) {
                                                hVar = new h('~', i36, i32);
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
                                            int i39 = this.e;
                                            int b10 = y0.b('#', i39, charSequence4.length(), charSequence4) - i39;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i40 = i39 + b10;
                                                if (i40 >= charSequence4.length()) {
                                                    iVar = new i(b10, "");
                                                } else {
                                                    char charAt6 = charSequence4.charAt(i40);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (charAt6 == ' ' || charAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i40) {
                                                                length4 = i40 - 1;
                                                            } else {
                                                                char charAt7 = charSequence4.charAt(length4);
                                                                if (charAt7 == c12 || charAt7 == c11) {
                                                                    length4--;
                                                                    c11 = ' ';
                                                                    c12 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i41 = length4;
                                                        while (true) {
                                                            if (i41 < i40) {
                                                                i41 = i40 - 1;
                                                            } else if (charSequence4.charAt(i41) == '#') {
                                                                i41--;
                                                            }
                                                        }
                                                        int i42 = i41;
                                                        while (true) {
                                                            if (i42 < i40) {
                                                                i42 = i40 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(i42);
                                                                if (charAt8 == '\t' || charAt8 == ' ') {
                                                                    i42--;
                                                                }
                                                            }
                                                        }
                                                        iVar = i42 != i41 ? new i(b10, charSequence4.subSequence(i40, i42 + 1).toString()) : new i(b10, charSequence4.subSequence(i40, length4 + 1).toString());
                                                    }
                                                }
                                                if (iVar == null) {
                                                    mf.a[] aVarArr4 = new mf.a[1];
                                                    aVarArr4[i7] = iVar;
                                                    cVar2 = new c(aVarArr4);
                                                    cVar2.a = charSequence4.length();
                                                } else {
                                                    char charAt9 = charSequence4.charAt(i39);
                                                    if (charAt9 != '-') {
                                                        if (charAt9 == '=') {
                                                            if (y0.c(y0.b('=', i39 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i13 = 1;
                                                                if (i13 > 0 && (T = iVar2.T()) != null) {
                                                                    i iVar3 = new i(i13, T.toString());
                                                                    mf.a[] aVarArr5 = new mf.a[1];
                                                                    aVarArr5[i7] = iVar3;
                                                                    cVar2 = new c(aVarArr5);
                                                                    cVar2.a = charSequence4.length();
                                                                    cVar2.b = true;
                                                                }
                                                            }
                                                        }
                                                        i13 = i7;
                                                        if (i13 > 0) {
                                                            i iVar32 = new i(i13, T.toString());
                                                            mf.a[] aVarArr52 = new mf.a[1];
                                                            aVarArr52[i7] = iVar32;
                                                            cVar2 = new c(aVarArr52);
                                                            cVar2.a = charSequence4.length();
                                                            cVar2.b = true;
                                                        }
                                                    }
                                                    if (y0.c(y0.b('-', i39 + 1, charSequence4.length(), charSequence4), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i13 = 2;
                                                        if (i13 > 0) {
                                                        }
                                                    }
                                                    i13 = i7;
                                                    if (i13 > 0) {
                                                    }
                                                }
                                                cVar = cVar2;
                                                break;
                                            }
                                            iVar = null;
                                            if (iVar == null) {
                                            }
                                            cVar = cVar2;
                                        }
                                        cVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i43 = i22;
                                        int i44 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < i43 && charSequence5.charAt(i44) == '<') {
                                            for (int i45 = 1; i45 <= 7; i45++) {
                                                if (i45 != 7 || !(((mf.a) iVar2.b).e() instanceof r)) {
                                                    Pattern[] patternArr = j.e[i45];
                                                    Pattern pattern = patternArr[i7];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i44, charSequence5.length())).find()) {
                                                        mf.a[] aVarArr6 = new mf.a[1];
                                                        aVarArr6[i7] = new j(pattern2);
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
                                                mf.a[] aVarArr7 = new mf.a[1];
                                                aVarArr7[i7] = new i();
                                                cVar = new c(aVarArr7);
                                                cVar.c = this.c + 4;
                                                break;
                                            }
                                        }
                                        cVar = null;
                                        break;
                                    case 6:
                                        mf.a aVar4 = (mf.a) iVar2.b;
                                        int i46 = this.g;
                                        if (i46 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i47 = this.e;
                                            int i48 = this.c + i46;
                                            int i49 = iVar2.T() != null ? 1 : i7;
                                            CharSequence charSequence6 = this.a;
                                            char charAt10 = charSequence6.charAt(i47);
                                            if (charAt10 == '*' || charAt10 == '+' || charAt10 == '-') {
                                                i14 = i49;
                                                aVar = aVar3;
                                                int i50 = i47 + 1;
                                                if (i50 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i50)) == '\t' || charAt2 == ' ') {
                                                    kf.c cVar4 = new kf.c();
                                                    cVar4.g = charAt10;
                                                    mVar = new m(cVar4, i50);
                                                    if (mVar != null) {
                                                        kf.n nVar = mVar.a;
                                                        int i51 = mVar.b;
                                                        int i52 = (i51 - i47) + i48;
                                                        int length5 = charSequence6.length();
                                                        int i53 = i52;
                                                        while (true) {
                                                            if (i51 >= length5) {
                                                                i15 = i7;
                                                            } else {
                                                                char charAt11 = charSequence6.charAt(i51);
                                                                if (charAt11 == '\t') {
                                                                    i53 = (4 - (i53 % 4)) + i53;
                                                                } else if (charAt11 == ' ') {
                                                                    i53++;
                                                                } else {
                                                                    i15 = 1;
                                                                }
                                                                i51++;
                                                            }
                                                        }
                                                        if (i14 == 0 || ((!(nVar instanceof kf.q) || ((kf.q) nVar).g == 1) && i15 != 0)) {
                                                            if (i15 == 0 || i53 - i52 > 4) {
                                                                i53 = i52 + 1;
                                                            }
                                                            mVar2 = new m(nVar, i53);
                                                            if (mVar2 != null) {
                                                                kf.n nVar2 = mVar2.a;
                                                                int i54 = mVar2.b;
                                                                o oVar = new o(i54 - this.c);
                                                                if (aVar4 instanceof n) {
                                                                    kf.n nVar3 = ((n) aVar4).a;
                                                                    if ((((nVar3 instanceof kf.c) && (nVar2 instanceof kf.c)) ? Character.valueOf(((kf.c) nVar3).g).equals(Character.valueOf(((kf.c) nVar2).g)) : ((nVar3 instanceof kf.q) && (nVar2 instanceof kf.q)) ? Character.valueOf(((kf.q) nVar3).h).equals(Character.valueOf(((kf.q) nVar2).h)) : i7) != 0) {
                                                                        mf.a[] aVarArr8 = new mf.a[1];
                                                                        aVarArr8[i7] = oVar;
                                                                        cVar2 = new c(aVarArr8);
                                                                        cVar2.c = i54;
                                                                        cVar = cVar2;
                                                                        break;
                                                                    }
                                                                }
                                                                n nVar4 = new n(nVar2);
                                                                mf.a[] aVarArr9 = new mf.a[2];
                                                                aVarArr9[i7] = nVar4;
                                                                aVarArr9[1] = oVar;
                                                                cVar = new c(aVarArr9);
                                                                cVar.c = i54;
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
                                                int i55 = i47;
                                                int i56 = i7;
                                                while (true) {
                                                    if (i55 < length6) {
                                                        int i57 = length6;
                                                        char charAt12 = charSequence6.charAt(i55);
                                                        i14 = i49;
                                                        if (charAt12 != ')' && charAt12 != '.') {
                                                            switch (charAt12) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case ns.o0 /* 51 */:
                                                                case ns.p0 /* 52 */:
                                                                case ns.q0 /* 53 */:
                                                                case ns.r0 /* 54 */:
                                                                case ns.s0 /* 55 */:
                                                                case ns.t0 /* 56 */:
                                                                case ns.u0 /* 57 */:
                                                                    i56++;
                                                                    if (i56 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i55++;
                                                                        length6 = i57;
                                                                        i49 = i14;
                                                                    }
                                                            }
                                                            if (mVar != null) {
                                                            }
                                                            mVar2 = null;
                                                            if (mVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        i14 = i49;
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
                                            int i58 = this.e;
                                            CharSequence charSequence7 = this.a;
                                            int length7 = charSequence7.length();
                                            int i59 = i7;
                                            int i60 = i59;
                                            int i61 = i60;
                                            while (true) {
                                                if (i58 >= length7) {
                                                    int i62 = i60;
                                                    int i63 = i61;
                                                    if ((i59 >= 3 && i62 == 0 && i63 == 0) || ((i62 >= 3 && i59 == 0 && i63 == 0) || (i63 >= 3 && i59 == 0 && i62 == 0))) {
                                                        mf.a[] aVarArr10 = new mf.a[1];
                                                        aVarArr10[i7] = new f(1);
                                                        cVar = new c(aVarArr10);
                                                        cVar.a = charSequence7.length();
                                                    }
                                                } else {
                                                    char charAt13 = charSequence7.charAt(i58);
                                                    if (charAt13 == '\t' || charAt13 == c10) {
                                                        i60 = i60;
                                                        i61 = i61;
                                                    } else if (charAt13 == '*') {
                                                        i61++;
                                                    } else if (charAt13 == '-') {
                                                        i59++;
                                                    } else if (charAt13 == '_') {
                                                        i60++;
                                                    }
                                                    i58++;
                                                    c10 = ' ';
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
                                            if (i16 >= 2 && y0.b(' ', i64 + i16, length8, charSequence8) == length8) {
                                                mf.a[] aVarArr11 = new mf.a[1];
                                                aVarArr11[i7] = new zc.b(i16);
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
                                    i17 = i7;
                                    aVar3 = aVar;
                                    i22 = 4;
                                }
                            } else {
                                i7 = i17;
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
                                mf.a h7 = h();
                                z10 = true;
                                p0.z(1, arrayList);
                                this.o.remove(h7);
                                if (h7 instanceof p) {
                                    b((p) h7);
                                }
                                h7.e().g();
                            } else {
                                z10 = true;
                            }
                            mf.a[] aVarArr12 = (mf.a[]) cVar.d;
                            int length9 = aVarArr12.length;
                            int i68 = i7;
                            while (i68 < length9) {
                                mf.a aVar5 = aVarArr12[i68];
                                a(aVar5);
                                z11 = aVar5.f();
                                i68++;
                                aVar = aVar5;
                            }
                            i17 = i7;
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

    public final void j(int i7) {
        int i10;
        int i11 = this.f;
        if (i7 >= i11) {
            this.b = this.e;
            this.c = i11;
        }
        int length = this.a.length();
        while (true) {
            i10 = this.c;
            if (i10 >= i7 || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i10 <= i7) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i7;
        this.d = true;
    }

    public final void k(int i7) {
        int i10 = this.e;
        if (i7 >= i10) {
            this.b = i10;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i11 = this.b;
            if (i11 >= i7 || i11 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
