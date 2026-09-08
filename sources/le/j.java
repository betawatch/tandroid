package le;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j implements Iterable {
    public final f a;
    public final e c;
    public final i d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public j(f fVar, Interpolator interpolator, long j3) {
        this.a = fVar;
        this.d = new i(this, fVar);
        if (interpolator == null || j3 <= 0) {
            this.c = null;
        } else {
            this.c = new e(0, new l.d(this, 2), interpolator, j3);
        }
    }

    public final void i(float f7) {
        i iVar = this.d;
        boolean z10 = iVar.a.j(f7) || (iVar.c.a(f7) || (iVar.g.a(f7) || (iVar.f.a(f7) || (iVar.e.a(f7) || (iVar.d.a(f7) || iVar.b.a(f7))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar = (g) obj;
            boolean z11 = gVar.f.a(f7) || (gVar.e.a(f7) || (gVar.d.a(f7) || gVar.c.a(f7)));
            Object obj2 = gVar.a;
            if (obj2 instanceof n) {
                z11 = ((n) obj2).a(f7) || z11;
            }
            z10 = z11 || z10;
        }
        if (z10) {
            this.a.q();
            if (f7 == 1.0f) {
                q(true);
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final g n(int i10) {
        return (g) this.b.get(i10);
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
            g gVar = (g) obj;
            Object obj2 = gVar.a;
            m mVar = gVar.f;
            n nVar = gVar.e;
            if (obj2 instanceof h) {
                h hVar = (h) obj2;
                boolean z11 = gVar.b == 0;
                arrayList2.size();
                int b10 = hVar.b(z11);
                int width = hVar.getWidth();
                int height = hVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (!z10 || gVar.c() <= 0.0f) {
                    arrayList = arrayList2;
                    nVar.d(i10, i11, i15, i16);
                    mVar.d(b10);
                } else {
                    float f7 = i10;
                    float f10 = i11;
                    float f11 = i15;
                    arrayList = arrayList2;
                    float f12 = i16;
                    if (nVar.b(f7, f10, f11, f12)) {
                        p();
                        nVar.e(f7, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (mVar.b(f13)) {
                        p();
                        mVar.c = f13;
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
                Object obj4 = ((g) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((g) obj5).a;
        }
        i iVar = this.d;
        if (!z10) {
            iVar.f.d(i10);
            iVar.g.d(i11);
            iVar.d.d(i12);
            iVar.e.d(i13);
            iVar.a.c();
            return;
        }
        m mVar2 = iVar.f;
        f fVar = iVar.a;
        m mVar3 = iVar.e;
        m mVar4 = iVar.d;
        m mVar5 = iVar.g;
        float f14 = i10;
        if (mVar2.b(f14)) {
            p();
            iVar.f.c = f14;
        }
        float f15 = i11;
        if (mVar5.b(f15)) {
            p();
            mVar5.c = f15;
        }
        float f16 = i12;
        if (mVar4.b(f16)) {
            p();
            mVar4.c = f16;
        }
        float f17 = i13;
        if (mVar3.b(f17)) {
            p();
            mVar3.c = f17;
        }
        if (fVar.i()) {
            p();
            fVar.k();
        }
    }

    public final void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        e eVar = this.c;
        if (eVar == null) {
            q(false);
            return;
        }
        eVar.b();
        q(false);
        eVar.c(0.0f);
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            gVar.a(z10);
            if (gVar.c() == 0.0f && gVar.h) {
                arrayList.remove(size);
                Object obj = gVar.a;
                if (obj instanceof oe.a) {
                    ((oe.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        i iVar = this.d;
        iVar.b.c(z10);
        iVar.d.c(z10);
        iVar.e.c(z10);
        iVar.f.c(z10);
        iVar.g.c(z10);
        iVar.c.c(z10);
        iVar.a.h(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        e eVar = this.c;
        i iVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z10) {
            if (eVar != null) {
                eVar.b();
                q(false);
                eVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((g) arrayList2.get(size)).a;
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
                    g gVar = new g(arrayList.size(), it.next(), true);
                    arrayList2.add(gVar);
                    arrayList.add(gVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            i.a(iVar, size2, false);
            o(false);
            this.a.q();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (((g) arrayList.get(i11)).equals(list.get(i11))) {
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
                    if (((g) obj2).d.b(0.0f)) {
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
                    g gVar2 = (g) obj3;
                    if (gVar2.d.b(0.0f)) {
                        p();
                        gVar2.d.c = 0.0f;
                        gVar2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, gVar2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        i.a(iVar, arrayList.size(), true);
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
                g gVar3 = (g) arrayList2.get(i15);
                Object obj4 = gVar3.a;
                m mVar = gVar3.d;
                m mVar2 = gVar3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i14++;
                    float f7 = indexOf;
                    if (mVar2.b(f7)) {
                        p();
                        mVar2.c = f7;
                    }
                    if (gVar3.b != indexOf) {
                        gVar3.b = indexOf;
                        z14 = z14 || !gVar3.h;
                        z15 = true;
                    }
                    if (mVar.b(1.0f)) {
                        p();
                        mVar.c = 1.0f;
                        gVar3.h = false;
                        arrayList.add(gVar3);
                        i.a(iVar, arrayList.size(), true);
                        z14 = true;
                    }
                } else if (mVar.b(0.0f)) {
                    p();
                    mVar.c = 0.0f;
                    gVar3.h = true;
                    if (z14) {
                        z13 = arrayList.remove(gVar3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, gVar3);
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
                    i.a(iVar, arrayList.size(), true);
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
                            if (((g) obj6).a == null) {
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
                            if (obj5.equals(((g) obj7).a)) {
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
                        g gVar4 = new g(i16, obj5, false);
                        gVar4.d.c = 1.0f;
                        gVar4.h = false;
                        arrayList2.add(gVar4);
                        int binarySearch3 = Collections.binarySearch(arrayList, gVar4);
                        if (binarySearch3 >= 0) {
                            throw new IllegalArgumentException("Element already exists in list");
                        }
                        arrayList.add((-binarySearch3) - 1, gVar4);
                        i.a(iVar, arrayList.size(), true);
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
            if (eVar != null) {
                eVar.a(1.0f);
                return;
            }
            return;
        }
        if (eVar == null) {
            int size7 = arrayList2.size();
            int i19 = 0;
            while (i19 < size7) {
                Object obj8 = arrayList2.get(i19);
                i19++;
                g gVar5 = (g) obj8;
                m mVar3 = gVar5.d;
                mVar3.b = mVar3.a;
                m mVar4 = gVar5.c;
                mVar4.b = mVar4.a;
            }
        }
    }
}
