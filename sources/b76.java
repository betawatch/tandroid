// default package

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class b76 implements Iterable {
    public final x66 a;
    public final t84 c;
    public final a76 d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public b76(x66 x66Var, Interpolator interpolator, long j) {
        this.a = x66Var;
        this.d = new a76(this, x66Var);
        if (interpolator == null || j <= 0) {
            this.c = null;
        } else {
            this.c = new t84(0, new xh4((Object) this, (byte) 10), interpolator, j);
        }
    }

    public final void h(float f) {
        a76 a76Var = this.d;
        boolean z = a76Var.a.n(f) || (a76Var.c.a(f) || (a76Var.g.a(f) || (a76Var.f.a(f) || (a76Var.e.a(f) || (a76Var.d.a(f) || a76Var.b.a(f))))));
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y66 y66Var = (y66) obj;
            boolean z2 = y66Var.f.a(f) || (y66Var.e.a(f) || (y66Var.d.a(f) || y66Var.c.a(f)));
            Object obj2 = y66Var.a;
            if (obj2 instanceof bdc) {
                z2 = ((bdc) obj2).a(f) || z2;
            }
            z = z2 || z;
        }
        if (z) {
            this.a.H();
            if (f == 1.0f) {
                l(true);
            }
        }
    }

    public final y66 i(int i) {
        return (y66) this.b.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final void j(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            y66 y66Var = (y66) obj;
            Object obj2 = y66Var.a;
            adc adcVar = y66Var.f;
            bdc bdcVar = y66Var.e;
            if (obj2 instanceof z66) {
                z66 z66Var = (z66) obj2;
                boolean z2 = y66Var.b == 0;
                arrayList2.size();
                int b = z66Var.b(z2);
                int width = z66Var.getWidth();
                int height = z66Var.getHeight();
                int i6 = b + width + i;
                int i7 = i2 + b + height;
                if (!z || y66Var.c() <= 0.0f) {
                    arrayList = arrayList2;
                    bdcVar.d(i, i2, i6, i7);
                    adcVar.d(b);
                } else {
                    float f = i;
                    float f2 = i2;
                    float f3 = i6;
                    arrayList = arrayList2;
                    float f4 = i7;
                    if (bdcVar.b(f, f2, f3, f4)) {
                        k();
                        bdcVar.e(f, f2, f3, f4);
                    }
                    float f5 = b;
                    if (adcVar.b(f5)) {
                        k();
                        adcVar.c = f5;
                    }
                }
                i3 = Math.max(i3, width);
                i4 = Math.max(i4, height);
                i2 = i7;
                i = i6;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.b;
        if (z) {
            int size2 = arrayList3.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj3 = arrayList3.get(i8);
                i8++;
                Object obj4 = ((y66) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj5 = arrayList3.get(i9);
            i9++;
            Object obj6 = ((y66) obj5).a;
        }
        a76 a76Var = this.d;
        if (!z) {
            a76Var.f.d(i);
            a76Var.g.d(i2);
            a76Var.d.d(i3);
            a76Var.e.d(i4);
            a76Var.a.c();
            return;
        }
        adc adcVar2 = a76Var.f;
        x66 x66Var = a76Var.a;
        adc adcVar3 = a76Var.e;
        adc adcVar4 = a76Var.d;
        adc adcVar5 = a76Var.g;
        float f6 = i;
        if (adcVar2.b(f6)) {
            k();
            a76Var.f.c = f6;
        }
        float f7 = i2;
        if (adcVar5.b(f7)) {
            k();
            adcVar5.c = f7;
        }
        float f8 = i3;
        if (adcVar4.b(f8)) {
            k();
            adcVar4.c = f8;
        }
        float f9 = i4;
        if (adcVar3.b(f9)) {
            k();
            adcVar3.c = f9;
        }
        if (x66Var.m()) {
            k();
            x66Var.p();
        }
    }

    public final void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        t84 t84Var = this.c;
        if (t84Var == null) {
            l(false);
            return;
        }
        t84Var.b();
        l(false);
        t84Var.c(0.0f);
    }

    public final void l(boolean z) {
        ArrayList arrayList = this.b;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y66 y66Var = (y66) arrayList.get(size);
            y66Var.a(z);
            if (y66Var.c() == 0.0f && y66Var.h) {
                arrayList.remove(size);
                Object obj = y66Var.a;
                if (obj instanceof ve3) {
                    ((ve3) obj).a();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        a76 a76Var = this.d;
        a76Var.b.c(z);
        a76Var.d.c(z);
        a76Var.e.c(z);
        a76Var.f.c(z);
        a76Var.g.c(z);
        a76Var.c.c(z);
        a76Var.a.j(z);
    }

    public final void m(List list, boolean z) {
        boolean isEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        t84 t84Var = this.c;
        a76 a76Var = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z) {
            if (t84Var != null) {
                t84Var.b();
                l(false);
                t84Var.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((y66) arrayList2.get(size)).a;
                if (obj instanceof ve3) {
                    ((ve3) obj).a();
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
                    y66 y66Var = new y66(arrayList.size(), it.next(), true);
                    arrayList2.add(y66Var);
                    arrayList.add(y66Var);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            a76Var.a(size2, false);
            j(false);
            this.a.H();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((y66) arrayList.get(i2)).equals(list.get(i2))) {
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
        k();
        if (list == null || list.isEmpty()) {
            if (!this.f) {
                int size3 = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    if (((y66) obj2).d.b(0.0f)) {
                        k();
                        break;
                    }
                }
            }
            if (this.f) {
                int size4 = arrayList2.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    y66 y66Var2 = (y66) obj3;
                    if (y66Var2.d.b(0.0f)) {
                        k();
                        y66Var2.d.c = 0.0f;
                        y66Var2.h = true;
                        int binarySearch = Collections.binarySearch(arrayList, y66Var2);
                        if (binarySearch >= 0) {
                            arrayList.remove(binarySearch);
                        }
                        a76Var.a(arrayList.size(), true);
                    }
                }
            }
            z2 = true;
            z3 = false;
        } else {
            boolean z5 = false;
            int i5 = 0;
            boolean z6 = false;
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                y66 y66Var3 = (y66) arrayList2.get(i6);
                Object obj4 = y66Var3.a;
                adc adcVar = y66Var3.d;
                adc adcVar2 = y66Var3.c;
                int indexOf = list.indexOf(obj4);
                if (indexOf != -1) {
                    i5++;
                    float f = indexOf;
                    if (adcVar2.b(f)) {
                        k();
                        adcVar2.c = f;
                    }
                    if (y66Var3.b != indexOf) {
                        y66Var3.b = indexOf;
                        z5 = z5 || !y66Var3.h;
                        z6 = true;
                    }
                    if (adcVar.b(1.0f)) {
                        k();
                        adcVar.c = 1.0f;
                        y66Var3.h = false;
                        arrayList.add(y66Var3);
                        a76Var.a(arrayList.size(), true);
                        z5 = true;
                    }
                } else if (adcVar.b(0.0f)) {
                    k();
                    adcVar.c = 0.0f;
                    y66Var3.h = true;
                    if (z5) {
                        z4 = arrayList.remove(y66Var3);
                    } else {
                        int binarySearch2 = Collections.binarySearch(arrayList, y66Var3);
                        if (binarySearch2 >= 0) {
                            arrayList.remove(binarySearch2);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        iy8.d();
                        return;
                    }
                    a76Var.a(arrayList.size(), true);
                } else {
                    continue;
                }
            }
            if (z5) {
                Collections.sort(arrayList);
            }
            if (i5 < list.size()) {
                arrayList2.ensureCapacity((list.size() - i5) + arrayList2.size());
                int i7 = 0;
                for (Object obj5 : list) {
                    if (obj5 == null) {
                        int size5 = arrayList2.size();
                        i = 0;
                        int i8 = 0;
                        while (i8 < size5) {
                            Object obj6 = arrayList2.get(i8);
                            i8++;
                            if (((y66) obj6).a == null) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        i = -1;
                    } else {
                        int size6 = arrayList2.size();
                        i = 0;
                        int i9 = 0;
                        while (i9 < size6) {
                            Object obj7 = arrayList2.get(i9);
                            i9++;
                            if (obj5.equals(((y66) obj7).a)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        i = -1;
                    }
                    if (i == -1) {
                        if (i7 != arrayList2.size()) {
                            z6 = true;
                        }
                        k();
                        y66 y66Var4 = new y66(i7, obj5, false);
                        y66Var4.d.c = 1.0f;
                        y66Var4.h = false;
                        arrayList2.add(y66Var4);
                        int binarySearch3 = Collections.binarySearch(arrayList, y66Var4);
                        if (binarySearch3 >= 0) {
                            lq5.j("Element already exists in list");
                            return;
                        } else {
                            arrayList.add((-binarySearch3) - 1, y66Var4);
                            a76Var.a(arrayList.size(), true);
                        }
                    }
                    i7++;
                }
            }
            z3 = z6;
            z2 = true;
        }
        if (z3) {
            Collections.sort(arrayList2);
        }
        j(z2);
        if (this.f) {
            this.f = false;
            if (t84Var != null) {
                t84Var.a(1.0f);
                return;
            }
            return;
        }
        if (t84Var == null) {
            int size7 = arrayList2.size();
            int i10 = 0;
            while (i10 < size7) {
                Object obj8 = arrayList2.get(i10);
                i10++;
                y66 y66Var5 = (y66) obj8;
                adc adcVar3 = y66Var5.d;
                adcVar3.b = adcVar3.a;
                adc adcVar4 = y66Var5.c;
                adcVar4.b = adcVar4.a;
            }
        }
    }
}
