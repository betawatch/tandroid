package le;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class k implements Iterable {
    public final g a;
    public final f c;
    public final j d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public k(g gVar, Interpolator interpolator, long j3) {
        this.a = gVar;
        this.d = new j(this, gVar);
        if (interpolator == null || j3 <= 0) {
            this.c = null;
        } else {
            this.c = new f(0, new l.d(this), interpolator, j3);
        }
    }

    public final void i(float f7) {
        j jVar = this.d;
        boolean z10 = jVar.a.h(f7) || (jVar.c.a(f7) || (jVar.g.a(f7) || (jVar.f.a(f7) || (jVar.e.a(f7) || (jVar.d.a(f7) || jVar.b.a(f7))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h hVar = (h) obj;
            boolean z11 = hVar.f.a(f7) || (hVar.e.a(f7) || (hVar.d.a(f7) || hVar.c.a(f7)));
            Object obj2 = hVar.a;
            if (obj2 instanceof o) {
                z11 = ((o) obj2).a(f7) || z11;
            }
            z10 = z11 || z10;
        }
        if (z10) {
            this.a.u();
            if (f7 == 1.0f) {
                q(true);
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final h n(int i10) {
        return (h) this.b.get(i10);
    }

    public final void o(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            h hVar = (h) obj;
            Object obj2 = hVar.a;
            n nVar = hVar.f;
            o oVar = hVar.e;
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                boolean z11 = hVar.b == 0;
                arrayList2.size();
                int b10 = iVar.b(z11);
                int width = iVar.getWidth();
                int height = iVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (!z10 || hVar.c() <= 0.0f) {
                    arrayList = arrayList2;
                    oVar.d(i10, i11, i15, i16);
                    nVar.d(b10);
                } else {
                    float f7 = i10;
                    float f10 = i11;
                    float f11 = i15;
                    arrayList = arrayList2;
                    float f12 = i16;
                    if (oVar.b(f7, f10, f11, f12)) {
                        p();
                        oVar.e(f7, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (nVar.b(f13)) {
                        p();
                        nVar.c = f13;
                    }
                }
                i12 = Math.max(i12, width);
                i13 = Math.max(i13, height);
                i11 = i16;
                i10 = i15;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.b;
        if (z10) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((h) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((h) obj5).a;
        }
        j jVar = this.d;
        if (!z10) {
            jVar.f.d(i10);
            jVar.g.d(i11);
            jVar.d.d(i12);
            jVar.e.d(i13);
            jVar.a.a();
            return;
        }
        n nVar2 = jVar.f;
        g gVar = jVar.a;
        n nVar3 = jVar.e;
        n nVar4 = jVar.d;
        n nVar5 = jVar.g;
        float f14 = i10;
        if (nVar2.b(f14)) {
            p();
            jVar.f.c = f14;
        }
        float f15 = i11;
        if (nVar5.b(f15)) {
            p();
            nVar5.c = f15;
        }
        float f16 = i12;
        if (nVar4.b(f16)) {
            p();
            nVar4.c = f16;
        }
        float f17 = i13;
        if (nVar3.b(f17)) {
            p();
            nVar3.c = f17;
        }
        if (gVar.g()) {
            p();
            gVar.i();
        }
    }

    public final void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        f fVar = this.c;
        if (fVar == null) {
            q(false);
            return;
        }
        fVar.b();
        q(false);
        fVar.c(0.0f);
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            hVar.a(z10);
            if (hVar.c() == 0.0f && hVar.h) {
                arrayList.remove(size);
                Object obj = hVar.a;
                if (obj instanceof oe.a) {
                    ((oe.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        j jVar = this.d;
        jVar.b.c(z10);
        jVar.d.c(z10);
        jVar.e.c(z10);
        jVar.f.c(z10);
        jVar.g.c(z10);
        jVar.c.c(z10);
        jVar.a.e(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        f fVar = this.c;
        j jVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z10) {
            if (fVar != null) {
                fVar.b();
                q(false);
                fVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((h) arrayList2.get(size)).a;
                if (obj instanceof oe.a) {
                    ((oe.a) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            int size2 = list != null ? list.size() : 0;
            if (size2 > 0) {
                arrayList2.ensureCapacity(size2);
                arrayList.ensureCapacity(size2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = new h(arrayList.size(), it.next(), true);
                    arrayList2.add(hVar);
                    arrayList.add(hVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            j.a(jVar, size2, false);
            o(false);
            this.a.u();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (((h) arrayList.get(i11)).equals(list.get(i11))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (isEmpty) {
            return;
        }
        p();
        if (list == null || list.isEmpty()) {
            if (!this.f) {
                int size3 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    if (((h) obj2).d.b(0.0f)) {
                        p();
                        break;
                    }
                }
            }
            if (this.f) {
                int size4 = arrayList2.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    h hVar2 = (h) obj3;
                    if (hVar2.d.b(0.0f)) {
                        p();
                        hVar2.d.c = 0.0f;
                        hVar2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, hVar2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        j.a(jVar, arrayList.size(), true);
                    }
                }
            }
            z11 = true;
            z12 = false;
        } else {
            boolean z14 = false;
            int i14 = 0;
            boolean z15 = false;
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                h hVar3 = (h) arrayList2.get(i15);
                Object obj4 = hVar3.a;
                n nVar = hVar3.d;
                n nVar2 = hVar3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i14++;
                    float f7 = indexOf;
                    if (nVar2.b(f7)) {
                        p();
                        nVar2.c = f7;
                    }
                    if (hVar3.b != indexOf) {
                        hVar3.b = indexOf;
                        z14 = z14 || !hVar3.h;
                        z15 = true;
                    }
                    if (nVar.b(1.0f)) {
                        p();
                        nVar.c = 1.0f;
                        hVar3.h = false;
                        arrayList.add(hVar3);
                        j.a(jVar, arrayList.size(), true);
                        z14 = true;
                    }
                } else if (nVar.b(0.0f)) {
                    p();
                    nVar.c = 0.0f;
                    hVar3.h = true;
                    if (z14) {
                        z13 = arrayList.remove(hVar3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, hVar3);
                        if (binarySearch2 >= 0) {
                            arrayList.remove(binarySearch2);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (!z13) {
                        throw new IllegalArgumentException();
                    }
                    j.a(jVar, arrayList.size(), true);
                } else {
                    continue;
                }
            }
            if (z14) {
                Collections.sort(arrayList);
            }
            if (i14 < list.size()) {
                arrayList2.ensureCapacity((list.size() - i14) + arrayList2.size());
                int i16 = 0;
                for (Object obj5 : list) {
                    if (obj5 == null) {
                        int size5 = arrayList2.size();
                        i10 = 0;
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj6 = arrayList2.get(i17);
                            i17++;
                            if (((h) obj6).a == null) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        i10 = -1;
                    } else {
                        int size6 = arrayList2.size();
                        i10 = 0;
                        int i18 = 0;
                        while (i18 < size6) {
                            Object obj7 = arrayList2.get(i18);
                            i18++;
                            if (obj5.equals(((h) obj7).a)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        i10 = -1;
                    }
                    if (i10 == -1) {
                        if (i16 != arrayList2.size()) {
                            z15 = true;
                        }
                        p();
                        h hVar4 = new h(i16, obj5, false);
                        hVar4.d.c = 1.0f;
                        hVar4.h = false;
                        arrayList2.add(hVar4);
                        int binarySearch3 = Collections.binarySearch(arrayList, hVar4);
                        if (binarySearch3 >= 0) {
                            throw new IllegalArgumentException("Element already exists in list");
                        }
                        arrayList.add((-binarySearch3) - 1, hVar4);
                        j.a(jVar, arrayList.size(), true);
                    }
                    i16++;
                }
            }
            z12 = z15;
            z11 = true;
        }
        if (z12) {
            Collections.sort(arrayList2);
        }
        o(z11);
        if (this.f) {
            this.f = false;
            if (fVar != null) {
                fVar.a(1.0f);
                return;
            }
            return;
        }
        if (fVar == null) {
            int size7 = arrayList2.size();
            int i19 = 0;
            while (i19 < size7) {
                Object obj8 = arrayList2.get(i19);
                i19++;
                h hVar5 = (h) obj8;
                n nVar3 = hVar5.d;
                nVar3.b = nVar3.a;
                n nVar4 = hVar5.c;
                nVar4.b = nVar4.a;
            }
        }
    }
}
