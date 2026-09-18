package li;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import hh.k;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n;
import w7.d0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ i a;

    public /* synthetic */ c(i iVar) {
        this.a = iVar;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        boolean z12;
        i iVar = this.a;
        ArrayList arrayList = iVar.i;
        mi.a aVar = iVar.p;
        ArrayList arrayList2 = iVar.c;
        RectF rectF = iVar.m;
        int width = iVar.h.getWidth();
        int height = iVar.h.getHeight();
        if (iVar.n == width && iVar.o == height) {
            z10 = false;
        } else {
            iVar.n = width;
            iVar.o = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            h hVar = (h) arrayList2.get(i10);
            View view = hVar.a;
            RectF rectF2 = hVar.f;
            RectF rectF3 = hVar.d;
            RectF rectF4 = hVar.c;
            RectF rectF5 = hVar.e;
            boolean z13 = z10;
            ch.d dVar = hVar.b;
            int i11 = size;
            if (k.c(view, iVar.h, rectF)) {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    hVar.g = true;
                    dVar.t(rectF4.left, rectF4.top);
                    z13 = true;
                }
                rectF.set(dVar.getBounds());
                if (rectF3.equals(rectF)) {
                    z11 = true;
                } else {
                    rectF3.set(rectF);
                    z11 = true;
                    hVar.g = true;
                    z13 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (rectF5.equals(rectF)) {
                    z12 = z13;
                } else {
                    rectF5.set(rectF);
                    hVar.g = z11;
                    z12 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-dVar.h, -dVar.i);
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    hVar.g = true;
                    z12 = true;
                }
                View view2 = hVar.a;
                boolean z14 = !rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, (float) width, (float) height) && dVar.l > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f;
                boolean z15 = z14 && dVar.j();
                if (hVar.h != z14 || (z14 && !z15)) {
                    hVar.h = z14;
                    hVar.g = true;
                    z10 = true;
                    i10++;
                    size = i11;
                } else {
                    z10 = z12;
                }
            } else {
                z10 = z13;
            }
            i10++;
            size = i11;
        }
        boolean z16 = z10;
        if (z16) {
            aVar.b = 0;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                h hVar2 = (h) arrayList2.get(i12);
                if (hVar2.h) {
                    RectF rectF6 = hVar2.f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            mi.b bVar = iVar.d;
            mi.a aVar2 = iVar.q;
            bVar.getClass();
            if (aVar == aVar2) {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
            aVar2.b = 0;
            int i13 = aVar.b;
            for (int i14 = 0; i14 < i13; i14++) {
                RectF c10 = aVar.c(i14);
                float f7 = c10.left;
                float f10 = c10.top;
                float f11 = c10.right;
                float f12 = c10.bottom;
                int i15 = 0;
                while (i15 < aVar2.b) {
                    RectF c11 = aVar2.c(i15);
                    float f13 = c11.left;
                    float f14 = c11.right;
                    mi.a aVar3 = aVar;
                    float f15 = bVar.a;
                    if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                        float f16 = c11.top;
                        float f17 = c11.bottom;
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
                            aVar2.d(i15);
                            i15 = 0;
                            aVar = aVar3;
                        }
                    }
                    i15++;
                    aVar = aVar3;
                }
                aVar2.a(f7, f10, f11, f12);
            }
            int i16 = aVar2.b;
            for (int i17 = 1; i17 < i16; i17++) {
                RectF c12 = aVar2.c(i17);
                float f19 = c12.left;
                float f20 = c12.top;
                float f21 = c12.right;
                float f22 = c12.bottom;
                int i18 = i17 - 1;
                while (i18 >= 0) {
                    RectF c13 = aVar2.c(i18);
                    float f23 = c13.top;
                    float f24 = c13.left;
                    int compare = Float.compare(f23, f20);
                    if (compare == 0) {
                        compare = Float.compare(f24, f19);
                    }
                    if (compare <= 0) {
                        break;
                    }
                    aVar2.c(i18 + 1).set(c13);
                    i18--;
                }
                aVar2.c(i18 + 1).set(f19, f20, f21, f22);
            }
        }
        ArrayList arrayList3 = iVar.s;
        int size3 = arrayList3.size();
        boolean z17 = false;
        for (int i19 = 0; i19 < size3; i19++) {
            g gVar = (g) arrayList3.get(i19);
            n nVar = gVar.b;
            fh.c cVar = gVar.a;
            int themedColor = nVar.a.getThemedColor(j6.a7);
            if (cVar.a.getColor() != themedColor) {
                cVar.a(themedColor);
                z17 = true;
            }
        }
        int i20 = z16 ? 4 : 0;
        if (z17) {
            i20 |= 16;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size4 = arrayList.size();
            for (int i21 = 0; i21 < size4; i21++) {
                ah.i iVar2 = (ah.i) arrayList.get(i21);
                if (iVar2.e) {
                    iVar2.e = false;
                    iVar.g++;
                }
            }
        }
        long j3 = iVar.l;
        long j10 = iVar.g;
        if (j3 != j10) {
            iVar.l = j10;
            i20 |= 8;
        }
        long j11 = iVar.k;
        long j12 = iVar.f;
        if (j11 != j12) {
            iVar.k = j12;
            i20 |= 2;
        }
        long j13 = iVar.j;
        long j14 = iVar.e;
        if (j13 != j14) {
            iVar.j = j14;
            i20 |= 1;
        }
        if (i20 != 0) {
            f fVar = iVar.a;
            if (fVar != null) {
                fVar.j(i20);
            }
            boolean a2 = d0.a(i20, 16);
            boolean a10 = d0.a(i20, 4);
            int size5 = arrayList2.size();
            for (int i22 = 0; i22 < size5; i22++) {
                h hVar3 = (h) arrayList2.get(i22);
                boolean z18 = hVar3.h;
                ch.d dVar2 = hVar3.b;
                if (z18 && (hVar3.g || a10 || a2)) {
                    hVar3.g = false;
                    if (a2) {
                        dVar2.v();
                    }
                    if (Build.VERSION.SDK_INT < 29 || !(dVar2 instanceof ch.e)) {
                        dVar2.invalidateSelf();
                    } else {
                        dVar2.w();
                    }
                }
            }
        }
    }
}
