package af;

import androidx.car.app.navigation.model.Maneuver;
import df.t;
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
import v7.f5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(df.b.class, df.i.class, df.h.class, df.j.class, t.class, df.n.class, df.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final ef.b j;
    public final List k;
    public final g l;
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
        hashMap.put(df.b.class, new b(0));
        hashMap.put(df.i.class, new b(2));
        hashMap.put(df.h.class, new b(1));
        hashMap.put(df.j.class, new b(3));
        hashMap.put(t.class, new b(6));
        hashMap.put(df.n.class, new b(5));
        hashMap.put(df.l.class, new b(4));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public h(ArrayList arrayList, ef.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = bVar;
        this.k = arrayList2;
        g gVar = new g(0);
        this.l = gVar;
        arrayList3.add(gVar);
        linkedHashSet.add(gVar);
    }

    public final void a(ff.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.n.add(aVar);
        this.o.add(aVar);
    }

    public final void b(r rVar) {
        n nVar = rVar.b;
        nVar.a();
        ArrayList arrayList = nVar.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            df.m mVar = (df.m) obj;
            df.r rVar2 = rVar.a;
            mVar.g();
            df.p pVar = (df.p) rVar2.e;
            mVar.e = pVar;
            if (pVar != null) {
                pVar.f = mVar;
            }
            mVar.f = rVar2;
            rVar2.e = mVar;
            df.p pVar2 = (df.p) rVar2.b;
            mVar.b = pVar2;
            if (((df.p) mVar.e) == null) {
                pVar2.c = mVar;
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

    public final void e(ff.a aVar) {
        if (h() == aVar) {
            a1.g.y(1, this.n);
        }
        if (aVar instanceof r) {
            b((r) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ff.a) list.get(size));
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

    public final ff.a h() {
        return (ff.a) i2.d.g(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x01a0, code lost:
    
        if (r18 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06d7, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:248:0x02c2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x060f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        ff.a aVar;
        int i10;
        d dVar;
        boolean z10;
        int i11;
        char charAt;
        int i12;
        i iVar;
        d dVar2;
        j jVar;
        int i13;
        StringBuilder h;
        d dVar3;
        d dVar4;
        d dVar5;
        int i14;
        o oVar;
        char charAt2;
        o oVar2;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        d dVar6;
        d dVar7;
        int i17;
        int i18;
        int i19;
        String str2 = str;
        int length = str2.length();
        int i20 = 0;
        StringBuilder sb2 = null;
        for (int i21 = 0; i21 < length; i21++) {
            char charAt5 = str2.charAt(i21);
            if (charAt5 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i21);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(charAt5);
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
        int i22 = 1;
        for (ff.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            a h10 = aVar2.h(this);
            if (h10 == null) {
                break;
            }
            if (h10.b) {
                e(aVar2);
                return;
            }
            int i23 = h10.a;
            if (i23 != -1) {
                k(i23);
            } else {
                int i24 = h10.c;
                if (i24 != -1) {
                    j(i24);
                }
            }
            i22++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i22, arrayList.size()));
        ff.a aVar3 = (ff.a) arrayList.get(i22 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof df.r) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i25 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        a6.i iVar2 = new a6.i(aVar3, 3);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i10 = i20;
                                char c10 = '\t';
                                char c11 = ' ';
                                switch (((b) it.next()).a) {
                                    case 0:
                                        aVar = aVar3;
                                        i11 = 3;
                                        int i26 = this.e;
                                        if (c.i(this, i26)) {
                                            int i27 = this.c + this.g;
                                            int i28 = i27 + 1;
                                            CharSequence charSequence = this.a;
                                            int i29 = i26 + 1;
                                            if (i29 < charSequence.length() && ((charAt = charSequence.charAt(i29)) == '\t' || charAt == ' ')) {
                                                i28 = i27 + 2;
                                            }
                                            ff.a[] aVarArr = new ff.a[1];
                                            aVarArr[i10] = new c();
                                            dVar = new d(aVarArr);
                                            dVar.c = i28;
                                            break;
                                        } else {
                                            dVar = null;
                                            break;
                                        }
                                    case 1:
                                        aVar = aVar3;
                                        int i30 = this.g;
                                        if (i30 >= 4) {
                                            i11 = 3;
                                        } else {
                                            int i31 = this.e;
                                            CharSequence charSequence2 = this.a;
                                            int length2 = charSequence2.length();
                                            int i32 = i31;
                                            int i33 = i10;
                                            int i34 = i33;
                                            while (true) {
                                                i12 = i31;
                                                if (i32 < length2) {
                                                    char charAt6 = charSequence2.charAt(i32);
                                                    if (charAt6 == '`') {
                                                        i33++;
                                                    } else if (charAt6 == '~') {
                                                        i34++;
                                                    }
                                                    i32++;
                                                    i31 = i12;
                                                }
                                            }
                                            i11 = 3;
                                            if (i33 >= 3) {
                                                if (i34 == 0) {
                                                    int i35 = i12 + i33;
                                                    int length3 = charSequence2.length();
                                                    while (true) {
                                                        if (i35 >= length3) {
                                                            i35 = -1;
                                                        } else if (charSequence2.charAt(i35) != '`') {
                                                            i35++;
                                                        }
                                                    }
                                                    if (i35 != -1) {
                                                        i11 = 3;
                                                        iVar = null;
                                                        if (iVar != null) {
                                                            ff.a[] aVarArr2 = new ff.a[1];
                                                            aVarArr2[i10] = iVar;
                                                            dVar2 = new d(aVarArr2);
                                                            dVar2.a = i12 + iVar.a.h;
                                                            dVar = dVar2;
                                                            break;
                                                        }
                                                    } else {
                                                        iVar = new i('`', i33, i30);
                                                        i11 = 3;
                                                        if (iVar != null) {
                                                        }
                                                    }
                                                } else {
                                                    i11 = 3;
                                                }
                                            }
                                            if (i34 >= i11 && i33 == 0) {
                                                iVar = new i('~', i34, i30);
                                                if (iVar != null) {
                                                }
                                            }
                                            iVar = null;
                                            if (iVar != null) {
                                            }
                                        }
                                        dVar2 = null;
                                        dVar = dVar2;
                                    case 2:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence3 = this.a;
                                            int i36 = this.e;
                                            int b10 = f5.b('#', charSequence3, i36, charSequence3.length()) - i36;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i37 = i36 + b10;
                                                if (i37 >= charSequence3.length()) {
                                                    jVar = new j(b10, "");
                                                } else {
                                                    char charAt7 = charSequence3.charAt(i37);
                                                    char c12 = ' ';
                                                    char c13 = '\t';
                                                    if (charAt7 == ' ' || charAt7 == '\t') {
                                                        int length4 = charSequence3.length() - 1;
                                                        while (true) {
                                                            if (length4 < i37) {
                                                                length4 = i37 - 1;
                                                            } else {
                                                                char charAt8 = charSequence3.charAt(length4);
                                                                if (charAt8 == c13 || charAt8 == c12) {
                                                                    length4--;
                                                                    c13 = '\t';
                                                                    c12 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i38 = length4;
                                                        while (true) {
                                                            if (i38 < i37) {
                                                                i38 = i37 - 1;
                                                            } else if (charSequence3.charAt(i38) == '#') {
                                                                i38--;
                                                            }
                                                        }
                                                        int i39 = i38;
                                                        while (true) {
                                                            if (i39 < i37) {
                                                                i39 = i37 - 1;
                                                            } else {
                                                                char charAt9 = charSequence3.charAt(i39);
                                                                if (charAt9 == '\t' || charAt9 == ' ') {
                                                                    i39--;
                                                                }
                                                            }
                                                        }
                                                        jVar = i39 != i38 ? new j(b10, charSequence3.subSequence(i37, i39 + 1).toString()) : new j(b10, charSequence3.subSequence(i37, length4 + 1).toString());
                                                    }
                                                }
                                                if (jVar == null) {
                                                    ff.a[] aVarArr3 = new ff.a[1];
                                                    aVarArr3[i10] = jVar;
                                                    dVar3 = new d(aVarArr3);
                                                    dVar3.a = charSequence3.length();
                                                } else {
                                                    char charAt10 = charSequence3.charAt(i36);
                                                    if (charAt10 != '-') {
                                                        if (charAt10 == '=') {
                                                            if (f5.c(f5.b('=', charSequence3, i36 + 1, charSequence3.length()), charSequence3.length(), charSequence3) >= charSequence3.length()) {
                                                                i13 = 1;
                                                                if (i13 > 0 && (h = iVar2.h()) != null) {
                                                                    j jVar2 = new j(i13, h.toString());
                                                                    ff.a[] aVarArr4 = new ff.a[1];
                                                                    aVarArr4[i10] = jVar2;
                                                                    dVar3 = new d(aVarArr4);
                                                                    dVar3.a = charSequence3.length();
                                                                    dVar3.b = true;
                                                                }
                                                            }
                                                        }
                                                        i13 = i10;
                                                        if (i13 > 0) {
                                                            j jVar22 = new j(i13, h.toString());
                                                            ff.a[] aVarArr42 = new ff.a[1];
                                                            aVarArr42[i10] = jVar22;
                                                            dVar3 = new d(aVarArr42);
                                                            dVar3.a = charSequence3.length();
                                                            dVar3.b = true;
                                                        }
                                                    }
                                                    if (f5.c(f5.b('-', charSequence3, i36 + 1, charSequence3.length()), charSequence3.length(), charSequence3) >= charSequence3.length()) {
                                                        i13 = 2;
                                                        if (i13 > 0) {
                                                        }
                                                    }
                                                    i13 = i10;
                                                    if (i13 > 0) {
                                                    }
                                                }
                                                dVar4 = dVar3;
                                                dVar = dVar4;
                                                i11 = 3;
                                                break;
                                            }
                                            jVar = null;
                                            if (jVar == null) {
                                            }
                                            dVar4 = dVar3;
                                            dVar = dVar4;
                                            i11 = 3;
                                        }
                                        dVar4 = null;
                                        dVar = dVar4;
                                        i11 = 3;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        int i40 = i25;
                                        int i41 = this.e;
                                        CharSequence charSequence4 = this.a;
                                        if (this.g < i40 && charSequence4.charAt(i41) == '<') {
                                            for (int i42 = 1; i42 <= 7; i42++) {
                                                if (i42 != 7 || !(((ff.a) iVar2.b).e() instanceof df.r)) {
                                                    Pattern[] patternArr = k.e[i42];
                                                    Pattern pattern = patternArr[i10];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence4.subSequence(i41, charSequence4.length())).find()) {
                                                        ff.a[] aVarArr5 = new ff.a[1];
                                                        aVarArr5[i10] = new k(pattern2);
                                                        dVar5 = new d(aVarArr5);
                                                        dVar5.a = this.b;
                                                        dVar4 = dVar5;
                                                        dVar = dVar4;
                                                        i11 = 3;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        dVar4 = null;
                                        dVar = dVar4;
                                        i11 = 3;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        if (this.g >= 4) {
                                            if (!this.h && !(h().e() instanceof df.r)) {
                                                ff.a[] aVarArr6 = new ff.a[1];
                                                aVarArr6[i10] = new j();
                                                dVar5 = new d(aVarArr6);
                                                dVar5.c = this.c + 4;
                                                dVar4 = dVar5;
                                                dVar = dVar4;
                                                i11 = 3;
                                                break;
                                            }
                                        }
                                        dVar4 = null;
                                        dVar = dVar4;
                                        i11 = 3;
                                        break;
                                    case 5:
                                        ff.a aVar4 = (ff.a) iVar2.b;
                                        int i43 = this.g;
                                        if (i43 < 4) {
                                            int i44 = this.e;
                                            int i45 = this.c + i43;
                                            int i46 = iVar2.h() != null ? 1 : i10;
                                            CharSequence charSequence5 = this.a;
                                            char charAt11 = charSequence5.charAt(i44);
                                            if (charAt11 == '*' || charAt11 == '+' || charAt11 == '-') {
                                                i14 = i46;
                                                aVar = aVar3;
                                                int i47 = i44 + 1;
                                                if (i47 >= charSequence5.length() || (charAt2 = charSequence5.charAt(i47)) == '\t' || charAt2 == ' ') {
                                                    df.c cVar = new df.c();
                                                    cVar.g = charAt11;
                                                    oVar = new o(cVar, i47);
                                                    if (oVar != null) {
                                                        df.n nVar = oVar.a;
                                                        int i48 = oVar.b;
                                                        int i49 = (i48 - i44) + i45;
                                                        int length5 = charSequence5.length();
                                                        int i50 = i49;
                                                        while (true) {
                                                            if (i48 >= length5) {
                                                                i15 = i10;
                                                            } else {
                                                                char charAt12 = charSequence5.charAt(i48);
                                                                if (charAt12 == '\t') {
                                                                    i50 = (4 - (i50 % 4)) + i50;
                                                                } else if (charAt12 == ' ') {
                                                                    i50++;
                                                                } else {
                                                                    i15 = 1;
                                                                }
                                                                i48++;
                                                            }
                                                        }
                                                        if (i14 == 0 || ((!(nVar instanceof df.q) || ((df.q) nVar).g == 1) && i15 != 0)) {
                                                            if (i15 == 0 || i50 - i49 > 4) {
                                                                i50 = i49 + 1;
                                                            }
                                                            oVar2 = new o(nVar, i50);
                                                            if (oVar2 != null) {
                                                                df.n nVar2 = oVar2.a;
                                                                int i51 = oVar2.b;
                                                                q qVar = new q(i51 - this.c);
                                                                if (aVar4 instanceof p) {
                                                                    df.n nVar3 = ((p) aVar4).a;
                                                                    if ((((nVar3 instanceof df.c) && (nVar2 instanceof df.c)) ? Character.valueOf(((df.c) nVar3).g).equals(Character.valueOf(((df.c) nVar2).g)) : ((nVar3 instanceof df.q) && (nVar2 instanceof df.q)) ? Character.valueOf(((df.q) nVar3).h).equals(Character.valueOf(((df.q) nVar2).h)) : i10) != 0) {
                                                                        ff.a[] aVarArr7 = new ff.a[1];
                                                                        aVarArr7[i10] = qVar;
                                                                        dVar4 = new d(aVarArr7);
                                                                        dVar4.c = i51;
                                                                        dVar = dVar4;
                                                                    }
                                                                }
                                                                p pVar = new p(nVar2);
                                                                ff.a[] aVarArr8 = new ff.a[2];
                                                                aVarArr8[i10] = pVar;
                                                                aVarArr8[1] = qVar;
                                                                dVar4 = new d(aVarArr8);
                                                                dVar4.c = i51;
                                                                dVar = dVar4;
                                                            }
                                                        }
                                                    }
                                                    oVar2 = null;
                                                    if (oVar2 != null) {
                                                    }
                                                }
                                                oVar = null;
                                                if (oVar != null) {
                                                }
                                                oVar2 = null;
                                                if (oVar2 != null) {
                                                }
                                            } else {
                                                int length6 = charSequence5.length();
                                                int i52 = i44;
                                                int i53 = i10;
                                                while (true) {
                                                    i14 = i46;
                                                    if (i52 < length6) {
                                                        charAt3 = charSequence5.charAt(i52);
                                                        aVar = aVar3;
                                                        if (charAt3 != ')' && charAt3 != '.') {
                                                            switch (charAt3) {
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
                                                                    i53++;
                                                                    if (i53 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i52++;
                                                                        i46 = i14;
                                                                        aVar3 = aVar;
                                                                    }
                                                            }
                                                            if (oVar != null) {
                                                            }
                                                            oVar2 = null;
                                                            if (oVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        aVar = aVar3;
                                                    }
                                                }
                                                if (i53 >= 1 && ((i16 = i52 + 1) >= charSequence5.length() || (charAt4 = charSequence5.charAt(i16)) == '\t' || charAt4 == ' ')) {
                                                    String charSequence6 = charSequence5.subSequence(i44, i52).toString();
                                                    df.q qVar2 = new df.q();
                                                    qVar2.g = Integer.parseInt(charSequence6);
                                                    qVar2.h = charAt3;
                                                    oVar = new o(qVar2, i16);
                                                    if (oVar != null) {
                                                    }
                                                    oVar2 = null;
                                                    if (oVar2 != null) {
                                                    }
                                                }
                                                oVar = null;
                                                if (oVar != null) {
                                                }
                                                oVar2 = null;
                                                if (oVar2 != null) {
                                                }
                                            }
                                            i11 = 3;
                                            break;
                                        } else {
                                            aVar = aVar3;
                                        }
                                        dVar4 = null;
                                        dVar = dVar4;
                                        i11 = 3;
                                        break;
                                    case 6:
                                        if (this.g < 4) {
                                            int i54 = this.e;
                                            CharSequence charSequence7 = this.a;
                                            int length7 = charSequence7.length();
                                            int i55 = i10;
                                            int i56 = i55;
                                            int i57 = i56;
                                            while (true) {
                                                if (i54 < length7) {
                                                    char charAt13 = charSequence7.charAt(i54);
                                                    if (charAt13 != '\t' && charAt13 != ' ') {
                                                        if (charAt13 == '*') {
                                                            i57++;
                                                        } else if (charAt13 == '-') {
                                                            i55++;
                                                        } else if (charAt13 == '_') {
                                                            i56++;
                                                        }
                                                    }
                                                    i54++;
                                                } else if ((i55 >= 3 && i56 == 0 && i57 == 0) || ((i56 >= 3 && i55 == 0 && i57 == 0) || (i57 >= 3 && i55 == 0 && i56 == 0))) {
                                                    ff.a[] aVarArr9 = new ff.a[1];
                                                    aVarArr9[i10] = new g(1);
                                                    dVar6 = new d(aVarArr9);
                                                    dVar6.a = charSequence7.length();
                                                }
                                            }
                                            dVar7 = dVar6;
                                            dVar = dVar7;
                                            aVar = aVar3;
                                            i11 = 3;
                                            break;
                                        }
                                        dVar7 = null;
                                        dVar = dVar7;
                                        aVar = aVar3;
                                        i11 = 3;
                                        break;
                                    case 7:
                                        if (this.g < 4) {
                                            int i58 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length8 = charSequence8.length();
                                            int i59 = i58;
                                            while (true) {
                                                if (i59 >= length8) {
                                                    i17 = length8 - i58;
                                                } else if ('$' != charSequence8.charAt(i59)) {
                                                    i17 = i59 - i58;
                                                } else {
                                                    i59++;
                                                }
                                            }
                                            if (i17 >= 2 && f5.b(' ', charSequence8, i58 + i17, length8) == length8) {
                                                ff.a[] aVarArr10 = new ff.a[1];
                                                aVarArr10[i10] = new bd.b(i17);
                                                dVar6 = new d(aVarArr10);
                                                dVar6.a = length8 + 1;
                                                dVar7 = dVar6;
                                                dVar = dVar7;
                                                aVar = aVar3;
                                                i11 = 3;
                                                break;
                                            }
                                        }
                                        dVar7 = null;
                                        dVar = dVar7;
                                        aVar = aVar3;
                                        i11 = 3;
                                        break;
                                    default:
                                        CharSequence charSequence9 = this.a;
                                        StringBuilder h11 = iVar2.h();
                                        if (h11 != null && h11.toString().contains("|") && !h11.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence9.subSequence(this.b, charSequence9.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i60 = i10;
                                            int i61 = i60;
                                            int i62 = i61;
                                            while (true) {
                                                if (i60 >= subSequence.length()) {
                                                    break;
                                                } else {
                                                    char charAt14 = subSequence.charAt(i60);
                                                    if (charAt14 == c10 || charAt14 == c11) {
                                                        i60++;
                                                    } else if (charAt14 == '-' || charAt14 == ':') {
                                                        if (i62 != 0 || arrayList3.isEmpty()) {
                                                            if (charAt14 == ':') {
                                                                i60++;
                                                                i18 = 1;
                                                            } else {
                                                                i18 = i10;
                                                            }
                                                            int i63 = i10;
                                                            while (i60 < subSequence.length() && subSequence.charAt(i60) == '-') {
                                                                i60++;
                                                                i63 = 1;
                                                            }
                                                            if (i63 != 0) {
                                                                if (i60 >= subSequence.length() || subSequence.charAt(i60) != ':') {
                                                                    i19 = i10;
                                                                } else {
                                                                    i60++;
                                                                    i19 = 1;
                                                                }
                                                                arrayList3.add((i18 == 0 || i19 == 0) ? i18 != 0 ? ye.c.a : i19 != 0 ? ye.c.c : null : ye.c.b);
                                                                i62 = i10;
                                                            }
                                                        }
                                                    } else if (charAt14 == '|') {
                                                        i60++;
                                                        int i64 = i62 + 1;
                                                        if (i64 <= 1) {
                                                            i62 = i64;
                                                            i61 = 1;
                                                        }
                                                    }
                                                    c10 = '\t';
                                                    c11 = ' ';
                                                }
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i65 = ze.a.i(h11);
                                                if (arrayList3.size() >= i65.size()) {
                                                    ze.a aVar5 = new ze.a(arrayList3, i65);
                                                    ff.a[] aVarArr11 = new ff.a[1];
                                                    aVarArr11[i10] = aVar5;
                                                    dVar7 = new d(aVarArr11);
                                                    dVar7.a = this.b;
                                                    dVar7.b = true;
                                                    dVar = dVar7;
                                                    aVar = aVar3;
                                                    i11 = 3;
                                                    break;
                                                }
                                            }
                                        }
                                        dVar7 = null;
                                        dVar = dVar7;
                                        aVar = aVar3;
                                        i11 = 3;
                                        break;
                                }
                                if (dVar == null) {
                                    i20 = i10;
                                    aVar3 = aVar;
                                    i25 = 4;
                                }
                            } else {
                                i10 = i20;
                                aVar = aVar3;
                                dVar = null;
                            }
                        }
                        if (dVar == null) {
                            k(this.e);
                        } else {
                            if (!isEmpty) {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i66 = dVar.a;
                            if (i66 != -1) {
                                k(i66);
                            } else {
                                int i67 = dVar.c;
                                if (i67 != -1) {
                                    j(i67);
                                }
                            }
                            if (dVar.b) {
                                ff.a h12 = h();
                                z10 = true;
                                a1.g.y(1, arrayList);
                                this.o.remove(h12);
                                if (h12 instanceof r) {
                                    b((r) h12);
                                }
                                h12.e().g();
                            } else {
                                z10 = true;
                            }
                            ff.a[] aVarArr12 = (ff.a[]) dVar.d;
                            int length9 = aVarArr12.length;
                            int i68 = i10;
                            while (i68 < length9) {
                                ff.a aVar6 = aVarArr12[i68];
                                a(aVar6);
                                i68++;
                                aVar = aVar6;
                                z11 = aVar6.f();
                            }
                            i20 = i10;
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
            a(new r());
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
