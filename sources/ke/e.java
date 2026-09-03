package ke;

import androidx.car.app.navigation.model.Maneuver;
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
import k7.v;
import ne.q;
import ne.r;
import ne.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(ne.b.class, ne.i.class, ne.h.class, ne.j.class, t.class, ne.n.class, ne.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final oe.b j;
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
        hashMap.put(ne.b.class, new je.a(1));
        hashMap.put(ne.i.class, new je.a(3));
        hashMap.put(ne.h.class, new je.a(2));
        hashMap.put(ne.j.class, new je.a(4));
        hashMap.put(t.class, new je.a(7));
        hashMap.put(ne.n.class, new je.a(6));
        hashMap.put(ne.l.class, new je.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(ArrayList arrayList, oe.b bVar, ArrayList arrayList2) {
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

    public final void a(pe.a aVar) {
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ne.m mVar = (ne.m) obj;
            r rVar = oVar.a;
            mVar.g();
            ne.p pVar = (ne.p) rVar.e;
            mVar.e = pVar;
            if (pVar != null) {
                pVar.f = mVar;
            }
            mVar.f = rVar;
            rVar.e = mVar;
            ne.p pVar2 = (ne.p) rVar.b;
            mVar.b = pVar2;
            if (((ne.p) mVar.e) == null) {
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
            StringBuilder sb = new StringBuilder(subSequence2.length() + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
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

    public final void e(pe.a aVar) {
        if (h() == aVar) {
            android.support.v4.media.a.u(1, this.n);
        }
        if (aVar instanceof o) {
            b((o) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((pe.a) list.get(size));
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

    public final pe.a h() {
        return (pe.a) l.d.i(1, this.n);
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
    
        r11 = ie.c.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x062a, code lost:
    
        if (r11 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x062c, code lost:
    
        r11 = ie.c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x062f, code lost:
    
        if (r13 == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0631, code lost:
    
        r11 = ie.c.c;
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
        pe.a aVar;
        h8.b bVar;
        ie.c cVar;
        char charAt;
        int i10;
        f fVar;
        h8.b bVar2;
        g gVar;
        int i11;
        StringBuilder n10;
        boolean z4;
        l lVar;
        char charAt2;
        l lVar2;
        boolean z10;
        char charAt3;
        int i12;
        String str2 = str;
        int length = str2.length();
        StringBuilder sb = null;
        for (int i13 = 0; i13 < length; i13++) {
            char charAt4 = str2.charAt(i13);
            if (charAt4 == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append((CharSequence) str2, 0, i13);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(charAt4);
            }
        }
        if (sb != null) {
            str2 = sb.toString();
        }
        this.a = str2;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i14 = 1;
        for (pe.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            j4.h h = aVar2.h(this);
            if (h == null) {
                break;
            }
            if (h.c) {
                e(aVar2);
                return;
            }
            int i15 = h.a;
            if (i15 != -1) {
                k(i15);
            } else {
                int i16 = h.b;
                if (i16 != -1) {
                    j(i16);
                }
            }
            i14++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i14, arrayList.size()));
        pe.a aVar3 = (pe.a) arrayList.get(i14 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i17 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        y5.h hVar = new y5.h(aVar3, 22);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                char c3 = ' ';
                                switch (((je.a) it.next()).a) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder n11 = hVar.n();
                                        if (n11 != null && n11.toString().contains("|") && !n11.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            boolean z12 = false;
                                            int i18 = 0;
                                            while (true) {
                                                int i19 = 0;
                                                while (true) {
                                                    if (i18 >= subSequence.length()) {
                                                        break;
                                                    } else {
                                                        char charAt5 = subSequence.charAt(i18);
                                                        if (charAt5 == '\t' || charAt5 == ' ') {
                                                            i18++;
                                                        } else if (charAt5 != '-' && charAt5 != ':') {
                                                            if (charAt5 == '|') {
                                                                i18++;
                                                                i19++;
                                                                if (i19 <= 1) {
                                                                    z12 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                arrayList3.add(cVar);
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i20 = je.b.i(n11);
                                                if (arrayList3.size() >= i20.size()) {
                                                    h8.b bVar3 = new h8.b(new je.b(arrayList3, i20));
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
                                        int i21 = this.e;
                                        if (a.i(this, i21)) {
                                            int i22 = this.c + this.g;
                                            int i23 = i22 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i24 = i21 + 1;
                                            if (i24 < charSequence2.length() && ((charAt = charSequence2.charAt(i24)) == '\t' || charAt == ' ')) {
                                                i23 = i22 + 2;
                                            }
                                            bVar = new h8.b(new a());
                                            bVar.b = i23;
                                            break;
                                        }
                                        bVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i25 = this.g;
                                        if (i25 < 4) {
                                            int i26 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i27 = i26;
                                            int i28 = 0;
                                            int i29 = 0;
                                            while (true) {
                                                i10 = i26;
                                                if (i27 < length2) {
                                                    char charAt6 = charSequence3.charAt(i27);
                                                    if (charAt6 == '`') {
                                                        i28++;
                                                    } else if (charAt6 == '~') {
                                                        i29++;
                                                    }
                                                    i27++;
                                                    i26 = i10;
                                                }
                                            }
                                            int i30 = 3;
                                            if (i28 >= 3) {
                                                if (i29 == 0) {
                                                    int i31 = i10 + i28;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i31 >= length3) {
                                                            i31 = -1;
                                                        } else if (charSequence3.charAt(i31) != '`') {
                                                            i31++;
                                                        }
                                                    }
                                                    if (i31 == -1) {
                                                        fVar = new f('`', i28, i25);
                                                        if (fVar != null) {
                                                            bVar2 = new h8.b(fVar);
                                                            bVar2.a = i10 + fVar.a.h;
                                                            bVar = bVar2;
                                                            break;
                                                        }
                                                    }
                                                    fVar = null;
                                                    if (fVar != null) {
                                                    }
                                                } else {
                                                    i30 = 3;
                                                }
                                            }
                                            if (i29 >= i30 && i28 == 0) {
                                                fVar = new f('~', i29, i25);
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
                                            int i32 = this.e;
                                            int b10 = v.b('#', charSequence4, i32, charSequence4.length()) - i32;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i33 = i32 + b10;
                                                if (i33 >= charSequence4.length()) {
                                                    gVar = new g(b10, "");
                                                } else {
                                                    char charAt7 = charSequence4.charAt(i33);
                                                    char c10 = ' ';
                                                    char c11 = '\t';
                                                    if (charAt7 == ' ' || charAt7 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i33) {
                                                                length4 = i33 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(length4);
                                                                if (charAt8 == c11 || charAt8 == c10) {
                                                                    length4--;
                                                                    c10 = ' ';
                                                                    c11 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i34 = length4;
                                                        while (true) {
                                                            if (i34 < i33) {
                                                                i34 = i33 - 1;
                                                            } else if (charSequence4.charAt(i34) == '#') {
                                                                i34--;
                                                            }
                                                        }
                                                        int i35 = i34;
                                                        while (true) {
                                                            if (i35 < i33) {
                                                                i35 = i33 - 1;
                                                            } else {
                                                                char charAt9 = charSequence4.charAt(i35);
                                                                if (charAt9 == '\t' || charAt9 == ' ') {
                                                                    i35--;
                                                                }
                                                            }
                                                        }
                                                        gVar = i35 != i34 ? new g(b10, charSequence4.subSequence(i33, i35 + 1).toString()) : new g(b10, charSequence4.subSequence(i33, length4 + 1).toString());
                                                    }
                                                }
                                                if (gVar == null) {
                                                    bVar2 = new h8.b(gVar);
                                                    bVar2.a = charSequence4.length();
                                                } else {
                                                    char charAt10 = charSequence4.charAt(i32);
                                                    if (charAt10 != '-') {
                                                        if (charAt10 == '=') {
                                                            if (v.c(v.b('=', charSequence4, i32 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i11 = 1;
                                                                if (i11 > 0 && (n10 = hVar.n()) != null) {
                                                                    bVar2 = new h8.b(new g(i11, n10.toString()));
                                                                    bVar2.a = charSequence4.length();
                                                                    bVar2.c = true;
                                                                }
                                                            }
                                                        }
                                                        i11 = 0;
                                                        if (i11 > 0) {
                                                            bVar2 = new h8.b(new g(i11, n10.toString()));
                                                            bVar2.a = charSequence4.length();
                                                            bVar2.c = true;
                                                        }
                                                    }
                                                    if (v.c(v.b('-', charSequence4, i32 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i11 = 2;
                                                        if (i11 > 0) {
                                                        }
                                                    }
                                                    i11 = 0;
                                                    if (i11 > 0) {
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
                                        int i36 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < 4 && charSequence5.charAt(i36) == '<') {
                                            for (int i37 = 1; i37 <= 7; i37++) {
                                                if (i37 != 7 || !(((pe.a) hVar.b).e() instanceof r)) {
                                                    Pattern[] patternArr = h.e[i37];
                                                    Pattern pattern = patternArr[0];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i36, charSequence5.length())).find()) {
                                                        bVar = new h8.b(new h(pattern2));
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
                                                bVar = new h8.b(new g());
                                                bVar.b = this.c + 4;
                                                break;
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 6:
                                        pe.a aVar4 = (pe.a) hVar.b;
                                        int i38 = this.g;
                                        if (i38 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i39 = this.e;
                                            int i40 = this.c + i38;
                                            boolean z13 = hVar.n() != null;
                                            CharSequence charSequence6 = this.a;
                                            char charAt11 = charSequence6.charAt(i39);
                                            if (charAt11 == '*' || charAt11 == '+' || charAt11 == '-') {
                                                z4 = z13;
                                                aVar = aVar3;
                                                int i41 = i39 + 1;
                                                if (i41 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i41)) == '\t' || charAt2 == ' ') {
                                                    ne.c cVar2 = new ne.c();
                                                    cVar2.g = charAt11;
                                                    lVar = new l(cVar2, i41);
                                                    if (lVar != null) {
                                                        ne.n nVar = lVar.a;
                                                        int i42 = lVar.b;
                                                        int i43 = (i42 - i39) + i40;
                                                        int length5 = charSequence6.length();
                                                        int i44 = i43;
                                                        while (true) {
                                                            if (i42 >= length5) {
                                                                z10 = false;
                                                            } else {
                                                                char charAt12 = charSequence6.charAt(i42);
                                                                if (charAt12 == '\t') {
                                                                    i44 = (4 - (i44 % 4)) + i44;
                                                                } else if (charAt12 == ' ') {
                                                                    i44++;
                                                                } else {
                                                                    z10 = true;
                                                                }
                                                                i42++;
                                                            }
                                                        }
                                                        if (!z4 || ((!(nVar instanceof q) || ((q) nVar).g == 1) && z10)) {
                                                            if (!z10 || i44 - i43 > 4) {
                                                                i44 = i43 + 1;
                                                            }
                                                            lVar2 = new l(nVar, i44);
                                                            if (lVar2 != null) {
                                                                ne.n nVar2 = lVar2.a;
                                                                int i45 = lVar2.b;
                                                                n nVar3 = new n(i45 - this.c);
                                                                if (aVar4 instanceof m) {
                                                                    ne.n nVar4 = ((m) aVar4).a;
                                                                    if (((nVar4 instanceof ne.c) && (nVar2 instanceof ne.c)) ? Character.valueOf(((ne.c) nVar4).g).equals(Character.valueOf(((ne.c) nVar2).g)) : ((nVar4 instanceof q) && (nVar2 instanceof q)) ? Character.valueOf(((q) nVar4).h).equals(Character.valueOf(((q) nVar2).h)) : false) {
                                                                        bVar2 = new h8.b(nVar3);
                                                                        bVar2.b = i45;
                                                                        bVar = bVar2;
                                                                        break;
                                                                    }
                                                                }
                                                                bVar = new h8.b(new m(nVar2), nVar3);
                                                                bVar.b = i45;
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
                                                int i46 = i39;
                                                int i47 = 0;
                                                while (true) {
                                                    if (i46 < length6) {
                                                        int i48 = length6;
                                                        charAt3 = charSequence6.charAt(i46);
                                                        z4 = z13;
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
                                                                    i47++;
                                                                    if (i47 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i46++;
                                                                        length6 = i48;
                                                                        z13 = z4;
                                                                    }
                                                            }
                                                            if (lVar != null) {
                                                            }
                                                            lVar2 = null;
                                                            if (lVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z4 = z13;
                                                    }
                                                }
                                                if (i47 >= 1) {
                                                    int i49 = i46 + 1;
                                                    if (i49 < charSequence6.length()) {
                                                        char charAt13 = charSequence6.charAt(i49);
                                                        aVar = aVar3;
                                                        if (charAt13 != '\t') {
                                                            break;
                                                        }
                                                    } else {
                                                        aVar = aVar3;
                                                    }
                                                    String charSequence7 = charSequence6.subSequence(i39, i46).toString();
                                                    q qVar = new q();
                                                    qVar.g = Integer.parseInt(charSequence7);
                                                    qVar.h = charAt3;
                                                    lVar = new l(qVar, i49);
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
                                            int i50 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length7 = charSequence8.length();
                                            int i51 = 0;
                                            int i52 = 0;
                                            int i53 = 0;
                                            while (true) {
                                                if (i50 >= length7) {
                                                    int i54 = i52;
                                                    int i55 = i53;
                                                    if ((i51 >= 3 && i54 == 0 && i55 == 0) || ((i54 >= 3 && i51 == 0 && i55 == 0) || (i55 >= 3 && i51 == 0 && i54 == 0))) {
                                                        bVar = new h8.b(new d(1));
                                                        bVar.a = charSequence8.length();
                                                    }
                                                } else {
                                                    char charAt14 = charSequence8.charAt(i50);
                                                    if (charAt14 == '\t' || charAt14 == c3) {
                                                        i52 = i52;
                                                        i53 = i53;
                                                    } else if (charAt14 == '*') {
                                                        i53++;
                                                    } else if (charAt14 == '-') {
                                                        i51++;
                                                    } else if (charAt14 == '_') {
                                                        i52++;
                                                    }
                                                    i50++;
                                                    c3 = ' ';
                                                }
                                            }
                                        }
                                        bVar = null;
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.g < i17) {
                                            int i56 = this.e;
                                            CharSequence charSequence9 = this.a;
                                            int length8 = charSequence9.length();
                                            int i57 = i56;
                                            while (true) {
                                                if (i57 >= length8) {
                                                    i12 = length8 - i56;
                                                } else if ('$' != charSequence9.charAt(i57)) {
                                                    i12 = i57 - i56;
                                                } else {
                                                    i57++;
                                                }
                                            }
                                            if (i12 >= 2 && v.b(' ', charSequence9, i56 + i12, length8) == length8) {
                                                bVar = new h8.b(new lc.b(i12));
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
                                    i17 = 4;
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
                            int i58 = bVar.a;
                            if (i58 != -1) {
                                k(i58);
                            } else {
                                int i59 = bVar.b;
                                if (i59 != -1) {
                                    j(i59);
                                }
                            }
                            if (bVar.c) {
                                pe.a h9 = h();
                                android.support.v4.media.a.u(1, arrayList);
                                this.o.remove(h9);
                                if (h9 instanceof o) {
                                    b((o) h9);
                                }
                                h9.e().g();
                            }
                            pe.a[] aVarArr = (pe.a[]) bVar.d;
                            int length9 = aVarArr.length;
                            int i60 = 0;
                            while (i60 < length9) {
                                pe.a aVar5 = aVarArr[i60];
                                a(aVar5);
                                z11 = aVar5.f();
                                i60++;
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
