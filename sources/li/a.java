package li;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import hh.k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a {
    public final /* synthetic */ e a;

    public final void a() {
        boolean z10;
        mi.a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        e eVar = this.a;
        ArrayList arrayList = eVar.d;
        mi.a aVar2 = eVar.p;
        RectF rectF = eVar.m;
        int width = eVar.i.getWidth();
        int height = eVar.i.getHeight();
        if (eVar.n == width && eVar.o == height) {
            z10 = false;
        } else {
            eVar.n = width;
            eVar.o = height;
            z10 = true;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            View view = dVar.a;
            RectF rectF2 = dVar.f;
            RectF rectF3 = dVar.d;
            RectF rectF4 = dVar.c;
            RectF rectF5 = dVar.e;
            ch.d dVar2 = dVar.b;
            boolean z14 = z10;
            if (k.c(view, eVar.i, rectF)) {
                if (rectF4.equals(rectF)) {
                    z11 = z14;
                } else {
                    rectF4.set(rectF);
                    dVar.g = true;
                    dVar2.t(rectF4.left, rectF4.top);
                    z11 = true;
                }
                rectF.set(dVar2.getBounds());
                if (rectF3.equals(rectF)) {
                    z12 = true;
                } else {
                    rectF3.set(rectF);
                    z12 = true;
                    dVar.g = true;
                    z11 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    dVar.g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-dVar2.h, -dVar2.i);
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    dVar.g = true;
                    z11 = true;
                }
                View view2 = dVar.a;
                boolean z15 = !rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, (float) width, (float) height) && dVar2.l > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f;
                boolean z16 = z15 && dVar2.j();
                if (dVar.h != z15 || (z15 && !z16)) {
                    dVar.h = z15;
                    dVar.g = true;
                    z13 = true;
                } else {
                    z13 = z11;
                }
                z10 = z13;
            } else {
                z10 = z14;
            }
        }
        boolean z17 = z10;
        if (z17) {
            aVar2.b = 0;
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                d dVar3 = (d) obj2;
                if (dVar3.h) {
                    RectF rectF6 = dVar3.f;
                    aVar2.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            mi.b bVar = eVar.e;
            mi.a aVar3 = eVar.q;
            bVar.getClass();
            if (aVar2 == aVar3) {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
            aVar3.b = 0;
            int i12 = aVar2.b;
            for (int i13 = 0; i13 < i12; i13++) {
                RectF b10 = aVar2.b(i13);
                float f7 = b10.left;
                float f10 = b10.top;
                float f11 = b10.right;
                float f12 = b10.bottom;
                int i14 = 0;
                while (i14 < aVar3.b) {
                    RectF b11 = aVar3.b(i14);
                    float f13 = b11.left;
                    float f14 = b11.right;
                    float f15 = bVar.a;
                    if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                        float f16 = b11.top;
                        float f17 = b11.bottom;
                        aVar = aVar2;
                        float f18 = bVar.b;
                        if (f12 >= f16 ? f17 >= f10 || f10 - f17 <= f18 : f16 - f12 <= f18) {
                            if (f13 < f7) {
                                f7 = f13;
                            }
                            if (f16 < f10) {
                                f10 = f16;
                            }
                            if (f14 > f11) {
                                f11 = f14;
                            }
                            if (f17 > f12) {
                                f12 = f17;
                            }
                            aVar3.c(i14);
                            i14 = 0;
                            aVar2 = aVar;
                        }
                    } else {
                        aVar = aVar2;
                    }
                    i14++;
                    aVar2 = aVar;
                }
                aVar3.a(f7, f10, f11, f12);
            }
            int i15 = aVar3.b;
            for (int i16 = 1; i16 < i15; i16++) {
                RectF b12 = aVar3.b(i16);
                float f19 = b12.left;
                float f20 = b12.top;
                float f21 = b12.right;
                float f22 = b12.bottom;
                int i17 = i16 - 1;
                while (i17 >= 0) {
                    RectF b13 = aVar3.b(i17);
                    float f23 = b13.top;
                    float f24 = b13.left;
                    int compare = Float.compare(f23, f20);
                    if (compare == 0) {
                        compare = Float.compare(f24, f19);
                    }
                    if (compare <= 0) {
                        break;
                    }
                    aVar3.b(i17 + 1).set(b13);
                    i17--;
                }
                aVar3.b(i17 + 1).set(f19, f20, f21, f22);
            }
        }
        ArrayList arrayList2 = eVar.s;
        if (arrayList2.size() > 0) {
            arrayList2.get(0).getClass();
            throw new ClassCastException();
        }
        Iterator it = eVar.c.iterator();
        if (it.hasNext()) {
            throw a4.a.k(it);
        }
        int i18 = z17 ? 4 : 0;
        long j3 = eVar.l;
        long j10 = eVar.h;
        if (j3 != j10) {
            eVar.l = j10;
            i18 |= 8;
        }
        long j11 = eVar.k;
        long j12 = eVar.g;
        if (j11 != j12) {
            eVar.k = j12;
            i18 |= 2;
        }
        long j13 = eVar.j;
        long j14 = eVar.f;
        if (j13 != j14) {
            eVar.j = j14;
            i18 |= 1;
        }
        if (i18 != 0) {
            c cVar = eVar.a;
            if (cVar != null) {
                cVar.b(i18);
            }
            int size3 = arrayList.size();
            int i19 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList.get(i19);
                i19++;
                d dVar4 = (d) obj3;
                boolean z18 = dVar4.h;
                ch.d dVar5 = dVar4.b;
                if (z18 && dVar4.g) {
                    dVar4.g = false;
                    if (Build.VERSION.SDK_INT < 29 || !(dVar5 instanceof ch.e)) {
                        dVar5.invalidateSelf();
                    } else {
                        dVar5.w();
                    }
                }
            }
        }
    }
}
