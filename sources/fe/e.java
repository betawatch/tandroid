package fe;

import androidx.car.app.navigation.model.Maneuver;
import f7.e8;
import ie.q;
import ie.r;
import ie.t;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(ie.b.class, ie.i.class, ie.h.class, ie.j.class, t.class, ie.n.class, ie.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final je.b j;
    public final List k;
    public final d l;
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
        hashMap.put(ie.b.class, new ee.a(1));
        hashMap.put(ie.i.class, new ee.a(3));
        hashMap.put(ie.h.class, new ee.a(2));
        hashMap.put(ie.j.class, new ee.a(4));
        hashMap.put(t.class, new ee.a(7));
        hashMap.put(ie.n.class, new ee.a(6));
        hashMap.put(ie.l.class, new ee.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, je.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = bVar;
        this.k = arrayList2;
        d dVar = new d(0);
        this.l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(ke.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.n.add(aVar);
        this.o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.b;
        kVar.a();
        ArrayList arrayList = kVar.c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ie.m mVar = (ie.m) obj;
            r rVar = oVar.a;
            mVar.g();
            ie.p pVar = (ie.p) rVar.e;
            mVar.e = pVar;
            if (pVar != null) {
                pVar.f = mVar;
            }
            mVar.f = rVar;
            rVar.e = mVar;
            ie.p pVar2 = (ie.p) rVar.b;
            mVar.b = pVar2;
            if (((ie.p) mVar.e) == null) {
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
            int i9 = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(i9, charSequence.length());
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
            int i9 = this.c;
            this.c = (4 - (i9 % 4)) + i9;
        }
    }

    public final void e(ke.a aVar) {
        if (h() == aVar) {
            aa.d.u(1, this.n);
        }
        if (aVar instanceof o) {
            b((o) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ke.a) list.get(size));
        }
    }

    public final void g() {
        int i9 = this.b;
        int i10 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = this.a.charAt(i9);
            if (charAt == '\t') {
                i9++;
                i10 += 4 - (i10 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i9++;
                i10++;
            }
        }
        this.e = i9;
        this.f = i10;
        this.g = i10 - this.c;
    }

    public final ke.a h() {
        return (ke.a) r0.j(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0210, code lost:
    
        if (r8 != ' ') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x05e6, code lost:
    
        if (r11 != 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05ec, code lost:
    
        if (r5.isEmpty() != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05ef, code lost:
    
        if (r13 != ':') goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x05f1, code lost:
    
        r8 = r8 + 1;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05f6, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x05fb, code lost:
    
        if (r8 >= r3.length()) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0603, code lost:
    
        if (r3.charAt(r8) != '-') goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0605, code lost:
    
        r8 = r8 + 1;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x060d, code lost:
    
        if (r13 != false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0614, code lost:
    
        if (r8 >= r3.length()) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x061c, code lost:
    
        if (r3.charAt(r8) != ':') goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x061e, code lost:
    
        r8 = r8 + 1;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0623, code lost:
    
        if (r11 == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0625, code lost:
    
        if (r13 == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0627, code lost:
    
        r11 = de.c.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x062a, code lost:
    
        if (r11 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x062c, code lost:
    
        r11 = de.c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x062f, code lost:
    
        if (r13 == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0631, code lost:
    
        r11 = de.c.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0634, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0622, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x05f5, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0640, code lost:
    
        if (r6 == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06de, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x01e5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0533  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        ke.a aVar;
        d8.b bVar;
        de.c cVar;
        char charAt;
        int i9;
        f fVar;
        d8.b bVar2;
        g gVar;
        int i10;
        StringBuilder A;
        boolean z10;
        l lVar;
        char charAt2;
        l lVar2;
        boolean z11;
        char charAt3;
        int i11;
        String str2 = str;
        int length = str2.length();
        StringBuilder sb2 = null;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt4 = str2.charAt(i12);
            if (charAt4 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i12);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(charAt4);
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
        int i13 = 1;
        for (ke.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            e4.h h = aVar2.h(this);
            if (h == null) {
                break;
            }
            if (h.c) {
                e(aVar2);
                return;
            }
            int i14 = h.a;
            if (i14 != -1) {
                k(i14);
            } else {
                int i15 = h.b;
                if (i15 != -1) {
                    j(i15);
                }
            }
            i13++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i13, arrayList.size()));
        ke.a aVar3 = (ke.a) arrayList.get(i13 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z12 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z12) {
                g();
                if (!this.h) {
                    int i16 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        xa.c cVar2 = new xa.c(aVar3, 14);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                char c10 = ' ';
                                switch (((ee.a) it.next()).a) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder A2 = cVar2.A();
                                        if (A2 != null && A2.toString().contains("|") && !A2.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            boolean z13 = false;
                                            int i17 = 0;
                                            while (true) {
                                                int i18 = 0;
                                                while (true) {
                                                    if (i17 >= subSequence.length()) {
                                                        break;
                                                    } else {
                                                        char charAt5 = subSequence.charAt(i17);
                                                        if (charAt5 == '\t' || charAt5 == ' ') {
                                                            i17++;
                                                        } else if (charAt5 != '-' && charAt5 != ':') {
                                                            if (charAt5 == '|') {
                                                                i17++;
                                                                i18++;
                                                                if (i18 <= 1) {
                                                                    z13 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                arrayList3.add(cVar);
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i19 = ee.b.i(A2);
                                                if (arrayList3.size() >= i19.size()) {
                                                    d8.b bVar3 = new d8.b(new ee.b(arrayList3, i19));
                                                    bVar3.a = this.b;
                                                    bVar3.c = true;
                                                    bVar = bVar3;
                                                    break;
                                                }
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i20 = this.e;
                                        if (a.i(this, i20)) {
                                            int i21 = this.c + this.g;
                                            int i22 = i21 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i23 = i20 + 1;
                                            if (i23 < charSequence2.length() && ((charAt = charSequence2.charAt(i23)) == '\t' || charAt == ' ')) {
                                                i22 = i21 + 2;
                                            }
                                            bVar = new d8.b(new a());
                                            bVar.b = i22;
                                            break;
                                        }
                                        bVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i24 = this.g;
                                        if (i24 < 4) {
                                            int i25 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i26 = i25;
                                            int i27 = 0;
                                            int i28 = 0;
                                            while (true) {
                                                i9 = i25;
                                                if (i26 < length2) {
                                                    char charAt6 = charSequence3.charAt(i26);
                                                    if (charAt6 == '`') {
                                                        i27++;
                                                    } else if (charAt6 == '~') {
                                                        i28++;
                                                    }
                                                    i26++;
                                                    i25 = i9;
                                                }
                                            }
                                            int i29 = 3;
                                            if (i27 >= 3) {
                                                if (i28 == 0) {
                                                    int i30 = i9 + i27;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i30 >= length3) {
                                                            i30 = -1;
                                                        } else if (charSequence3.charAt(i30) != '`') {
                                                            i30++;
                                                        }
                                                    }
                                                    if (i30 == -1) {
                                                        fVar = new f('`', i27, i24);
                                                        if (fVar != null) {
                                                            bVar2 = new d8.b(fVar);
                                                            bVar2.a = i9 + fVar.a.h;
                                                            bVar = bVar2;
                                                            break;
                                                        }
                                                    }
                                                    fVar = null;
                                                    if (fVar != null) {
                                                    }
                                                } else {
                                                    i29 = 3;
                                                }
                                            }
                                            if (i28 >= i29 && i27 == 0) {
                                                fVar = new f('~', i28, i24);
                                                if (fVar != null) {
                                                }
                                            }
                                            fVar = null;
                                            if (fVar != null) {
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.a;
                                            int i31 = this.e;
                                            int b10 = e8.b('#', charSequence4, i31, charSequence4.length()) - i31;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i32 = i31 + b10;
                                                if (i32 >= charSequence4.length()) {
                                                    gVar = new g(b10, "");
                                                } else {
                                                    char charAt7 = charSequence4.charAt(i32);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (charAt7 == ' ' || charAt7 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i32) {
                                                                length4 = i32 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(length4);
                                                                if (charAt8 == c12 || charAt8 == c11) {
                                                                    length4--;
                                                                    c11 = ' ';
                                                                    c12 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i33 = length4;
                                                        while (true) {
                                                            if (i33 < i32) {
                                                                i33 = i32 - 1;
                                                            } else if (charSequence4.charAt(i33) == '#') {
                                                                i33--;
                                                            }
                                                        }
                                                        int i34 = i33;
                                                        while (true) {
                                                            if (i34 < i32) {
                                                                i34 = i32 - 1;
                                                            } else {
                                                                char charAt9 = charSequence4.charAt(i34);
                                                                if (charAt9 == '\t' || charAt9 == ' ') {
                                                                    i34--;
                                                                }
                                                            }
                                                        }
                                                        gVar = i34 != i33 ? new g(b10, charSequence4.subSequence(i32, i34 + 1).toString()) : new g(b10, charSequence4.subSequence(i32, length4 + 1).toString());
                                                    }
                                                }
                                                if (gVar == null) {
                                                    bVar2 = new d8.b(gVar);
                                                    bVar2.a = charSequence4.length();
                                                } else {
                                                    char charAt10 = charSequence4.charAt(i31);
                                                    if (charAt10 != '-') {
                                                        if (charAt10 == '=') {
                                                            if (e8.c(e8.b('=', charSequence4, i31 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i10 = 1;
                                                                if (i10 > 0 && (A = cVar2.A()) != null) {
                                                                    bVar2 = new d8.b(new g(i10, A.toString()));
                                                                    bVar2.a = charSequence4.length();
                                                                    bVar2.c = true;
                                                                }
                                                            }
                                                        }
                                                        i10 = 0;
                                                        if (i10 > 0) {
                                                            bVar2 = new d8.b(new g(i10, A.toString()));
                                                            bVar2.a = charSequence4.length();
                                                            bVar2.c = true;
                                                        }
                                                    }
                                                    if (e8.c(e8.b('-', charSequence4, i31 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i10 = 2;
                                                        if (i10 > 0) {
                                                        }
                                                    }
                                                    i10 = 0;
                                                    if (i10 > 0) {
                                                    }
                                                }
                                                bVar = bVar2;
                                                break;
                                            }
                                            gVar = null;
                                            if (gVar == null) {
                                            }
                                            bVar = bVar2;
                                        }
                                        bVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i35 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < 4 && charSequence5.charAt(i35) == '<') {
                                            for (int i36 = 1; i36 <= 7; i36++) {
                                                if (i36 != 7 || !(((ke.a) cVar2.b).e() instanceof r)) {
                                                    Pattern[] patternArr = h.e[i36];
                                                    Pattern pattern = patternArr[0];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i35, charSequence5.length())).find()) {
                                                        bVar = new d8.b(new h(pattern2));
                                                        bVar.a = this.b;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        if (this.g >= 4) {
                                            if (!this.h && !(h().e() instanceof r)) {
                                                bVar = new d8.b(new g());
                                                bVar.b = this.c + 4;
                                                break;
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 6:
                                        ke.a aVar4 = (ke.a) cVar2.b;
                                        int i37 = this.g;
                                        if (i37 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i38 = this.e;
                                            int i39 = this.c + i37;
                                            boolean z14 = cVar2.A() != null;
                                            CharSequence charSequence6 = this.a;
                                            char charAt11 = charSequence6.charAt(i38);
                                            if (charAt11 == '*' || charAt11 == '+' || charAt11 == '-') {
                                                z10 = z14;
                                                aVar = aVar3;
                                                int i40 = i38 + 1;
                                                if (i40 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i40)) == '\t' || charAt2 == ' ') {
                                                    ie.c cVar3 = new ie.c();
                                                    cVar3.g = charAt11;
                                                    lVar = new l(cVar3, i40);
                                                    if (lVar != null) {
                                                        ie.n nVar = lVar.a;
                                                        int i41 = lVar.b;
                                                        int i42 = (i41 - i38) + i39;
                                                        int length5 = charSequence6.length();
                                                        int i43 = i42;
                                                        while (true) {
                                                            if (i41 >= length5) {
                                                                z11 = false;
                                                            } else {
                                                                char charAt12 = charSequence6.charAt(i41);
                                                                if (charAt12 == '\t') {
                                                                    i43 = (4 - (i43 % 4)) + i43;
                                                                } else if (charAt12 == ' ') {
                                                                    i43++;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                i41++;
                                                            }
                                                        }
                                                        if (!z10 || ((!(nVar instanceof q) || ((q) nVar).g == 1) && z11)) {
                                                            if (!z11 || i43 - i42 > 4) {
                                                                i43 = i42 + 1;
                                                            }
                                                            lVar2 = new l(nVar, i43);
                                                            if (lVar2 != null) {
                                                                ie.n nVar2 = lVar2.a;
                                                                int i44 = lVar2.b;
                                                                n nVar3 = new n(i44 - this.c);
                                                                if (aVar4 instanceof m) {
                                                                    ie.n nVar4 = ((m) aVar4).a;
                                                                    if (((nVar4 instanceof ie.c) && (nVar2 instanceof ie.c)) ? Character.valueOf(((ie.c) nVar4).g).equals(Character.valueOf(((ie.c) nVar2).g)) : ((nVar4 instanceof q) && (nVar2 instanceof q)) ? Character.valueOf(((q) nVar4).h).equals(Character.valueOf(((q) nVar2).h)) : false) {
                                                                        bVar2 = new d8.b(nVar3);
                                                                        bVar2.b = i44;
                                                                        bVar = bVar2;
                                                                        break;
                                                                    }
                                                                }
                                                                bVar = new d8.b(new m(nVar2), nVar3);
                                                                bVar.b = i44;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    lVar2 = null;
                                                    if (lVar2 != null) {
                                                    }
                                                }
                                                lVar = null;
                                                if (lVar != null) {
                                                }
                                                lVar2 = null;
                                                if (lVar2 != null) {
                                                }
                                            } else {
                                                int length6 = charSequence6.length();
                                                int i45 = i38;
                                                int i46 = 0;
                                                while (true) {
                                                    if (i45 < length6) {
                                                        int i47 = length6;
                                                        charAt3 = charSequence6.charAt(i45);
                                                        z10 = z14;
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
                                                                    i46++;
                                                                    if (i46 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i45++;
                                                                        length6 = i47;
                                                                        z14 = z10;
                                                                    }
                                                            }
                                                            if (lVar != null) {
                                                            }
                                                            lVar2 = null;
                                                            if (lVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z10 = z14;
                                                    }
                                                }
                                                if (i46 >= 1) {
                                                    int i48 = i45 + 1;
                                                    if (i48 < charSequence6.length()) {
                                                        char charAt13 = charSequence6.charAt(i48);
                                                        aVar = aVar3;
                                                        if (charAt13 != '\t') {
                                                            break;
                                                        }
                                                    } else {
                                                        aVar = aVar3;
                                                    }
                                                    String charSequence7 = charSequence6.subSequence(i38, i45).toString();
                                                    q qVar = new q();
                                                    qVar.g = Integer.parseInt(charSequence7);
                                                    qVar.h = charAt3;
                                                    lVar = new l(qVar, i48);
                                                    if (lVar != null) {
                                                    }
                                                    lVar2 = null;
                                                    if (lVar2 != null) {
                                                    }
                                                }
                                                aVar = aVar3;
                                                lVar = null;
                                                if (lVar != null) {
                                                }
                                                lVar2 = null;
                                                if (lVar2 != null) {
                                                }
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 7:
                                        if (this.g < 4) {
                                            int i49 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length7 = charSequence8.length();
                                            int i50 = 0;
                                            int i51 = 0;
                                            int i52 = 0;
                                            while (true) {
                                                if (i49 >= length7) {
                                                    int i53 = i51;
                                                    int i54 = i52;
                                                    if ((i50 >= 3 && i53 == 0 && i54 == 0) || ((i53 >= 3 && i50 == 0 && i54 == 0) || (i54 >= 3 && i50 == 0 && i53 == 0))) {
                                                        bVar = new d8.b(new d(1));
                                                        bVar.a = charSequence8.length();
                                                    }
                                                } else {
                                                    char charAt14 = charSequence8.charAt(i49);
                                                    if (charAt14 == '\t' || charAt14 == c10) {
                                                        i51 = i51;
                                                        i52 = i52;
                                                    } else if (charAt14 == '*') {
                                                        i52++;
                                                    } else if (charAt14 == '-') {
                                                        i50++;
                                                    } else if (charAt14 == '_') {
                                                        i51++;
                                                    }
                                                    i49++;
                                                    c10 = ' ';
                                                }
                                            }
                                        }
                                        bVar = null;
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.g < i16) {
                                            int i55 = this.e;
                                            CharSequence charSequence9 = this.a;
                                            int length8 = charSequence9.length();
                                            int i56 = i55;
                                            while (true) {
                                                if (i56 >= length8) {
                                                    i11 = length8 - i55;
                                                } else if ('$' != charSequence9.charAt(i56)) {
                                                    i11 = i56 - i55;
                                                } else {
                                                    i56++;
                                                }
                                            }
                                            if (i11 >= 2 && e8.b(' ', charSequence9, i55 + i11, length8) == length8) {
                                                bVar = new d8.b(new hc.b(i11));
                                                bVar.a = length8 + 1;
                                                aVar = aVar3;
                                                break;
                                            }
                                        }
                                        bVar = null;
                                        aVar = aVar3;
                                        break;
                                }
                                if (bVar == null) {
                                    aVar3 = aVar;
                                    i16 = 4;
                                }
                            } else {
                                aVar = aVar3;
                                bVar = null;
                            }
                        }
                        if (bVar == null) {
                            k(this.e);
                        } else {
                            if (!isEmpty) {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i57 = bVar.a;
                            if (i57 != -1) {
                                k(i57);
                            } else {
                                int i58 = bVar.b;
                                if (i58 != -1) {
                                    j(i58);
                                }
                            }
                            if (bVar.c) {
                                ke.a h10 = h();
                                aa.d.u(1, arrayList);
                                this.o.remove(h10);
                                if (h10 instanceof o) {
                                    b((o) h10);
                                }
                                h10.e().g();
                            }
                            ke.a[] aVarArr = (ke.a[]) bVar.d;
                            int length9 = aVarArr.length;
                            int i59 = 0;
                            while (i59 < length9) {
                                ke.a aVar5 = aVarArr[i59];
                                a(aVar5);
                                z12 = aVar5.f();
                                i59++;
                                aVar = aVar5;
                            }
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
            a(new o());
            c();
        }
    }

    public final void j(int i9) {
        int i10;
        int i11 = this.f;
        if (i9 >= i11) {
            this.b = this.e;
            this.c = i11;
        }
        int length = this.a.length();
        while (true) {
            i10 = this.c;
            if (i10 >= i9 || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i10 <= i9) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i9;
        this.d = true;
    }

    public final void k(int i9) {
        int i10 = this.e;
        if (i9 >= i10) {
            this.b = i10;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i11 = this.b;
            if (i11 >= i9 || i11 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
