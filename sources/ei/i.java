package ei;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tk0;
import v7.u7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i {
    public final /* synthetic */ r a;

    public i(r rVar) {
        this.a = rVar;
    }

    public final void a() {
        int i10;
        r rVar = this.a;
        ArrayList arrayList = rVar.c;
        ArrayList arrayList2 = rVar.E;
        long j10 = rVar.t;
        long j11 = r.G;
        if (j10 != j11) {
            rVar.t = j11;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j12 = t6.Am + a7.b;
        if (rVar.s != j12) {
            rVar.s = j12;
            i10 |= 16;
        }
        Iterator it = rVar.n.iterator();
        while (it.hasNext()) {
            if (((tk0) it.next()).b0()) {
                rVar.i++;
            }
        }
        if (i10 == 0) {
            return;
        }
        if (u7.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                p pVar = (p) arrayList2.get(i11);
                pVar.a.a(pVar.b.c());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (u7.a(i10, 32)) {
                f fVar = qVar.b;
                s sVar = r.F;
                if (!Objects.equals(fVar.b, sVar)) {
                    fVar.b = sVar;
                    fVar.g(sVar);
                }
            }
            if (u7.a(i10, 16)) {
                qVar.b.updateColors();
            }
            qVar.b.invalidateSelf();
            qVar.a.invalidate();
            qVar.h = true;
        }
        rVar.u |= i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        ArrayList arrayList;
        int i10;
        boolean z11;
        Rect rect;
        boolean z12;
        boolean z13;
        boolean z14;
        r rVar = this.a;
        ArrayList arrayList2 = rVar.o;
        Trace.beginSection("G.CheckPositions");
        rVar.y = false;
        RectF rectF = rVar.e;
        Rect rect2 = rVar.x;
        Rect rect3 = rVar.w;
        gi.a aVar = rVar.B;
        ArrayList arrayList3 = rVar.c;
        RectF rectF2 = rVar.v;
        int width = rVar.m.getWidth();
        int height = rVar.m.getHeight();
        if (rVar.z == width && rVar.A == height) {
            z10 = false;
        } else {
            rVar.z = width;
            rVar.A = height;
            z10 = true;
        }
        if (rVar.f) {
            rVar.f = false;
            z10 = true;
        }
        int size = arrayList3.size();
        int i11 = 0;
        while (i11 < size) {
            q qVar = (q) arrayList3.get(i11);
            View view = qVar.a;
            RectF rectF3 = qVar.g;
            boolean z15 = z10;
            RectF rectF4 = qVar.f;
            int i12 = size;
            RectF rectF5 = qVar.d;
            int i13 = i11;
            RectF rectF6 = qVar.c;
            ArrayList arrayList4 = arrayList2;
            RectF rectF7 = qVar.e;
            RectF rectF8 = rectF;
            f fVar = qVar.b;
            ArrayList arrayList5 = arrayList3;
            if (zg.h.c(view, rVar.m, rectF2)) {
                if (rectF6.equals(rectF2)) {
                    z11 = false;
                } else {
                    rectF6.set(rectF2);
                    qVar.h = true;
                    fVar.i(rectF6.left, rectF6.top);
                    z11 = true;
                }
                fVar.b(rect3);
                rectF2.set(rect3);
                if (!rectF5.equals(rectF2)) {
                    rectF5.set(rectF2);
                    qVar.h = true;
                    z11 = true;
                }
                rectF2.offset(rectF6.left, rectF6.top);
                if (!rectF7.equals(rectF2)) {
                    rectF7.set(rectF2);
                    qVar.h = true;
                    z11 = true;
                }
                rectF2.set(rectF7);
                rectF2.inset(-fVar.c(), -fVar.d());
                if (!rectF4.equals(rectF2)) {
                    rectF4.set(rectF2);
                    qVar.h = true;
                    z11 = true;
                }
                rectF2.set(rectF7);
                Rect rect4 = fVar.a;
                rect2.set(rect4);
                if (rect4.isEmpty()) {
                    rect = rect3;
                } else {
                    float f7 = rect2.left;
                    float f10 = rectF6.left;
                    float f11 = rect2.top;
                    float f12 = rectF6.top;
                    rect = rect3;
                    rectF2.union(f7 + f10, f11 + f12, rect2.right + f10, rect2.bottom + f12);
                }
                rectF2.inset(-fVar.c(), -fVar.d());
                if (rectF3.equals(rectF2)) {
                    z12 = false;
                } else {
                    rectF3.set(rectF2);
                    z12 = true;
                }
                View view2 = qVar.a;
                if (!rectF7.isEmpty() && view2.isAttachedToWindow() && rectF7.intersects(0.0f, 0.0f, width, height) && fVar.c > 0) {
                    View view3 = view2;
                    while (view3 != null && view3 != rVar.m) {
                        if (view3.getVisibility() != 0 || view3.getAlpha() <= 0.0f) {
                            break;
                        }
                        Object parent = view3.getParent();
                        view3 = parent instanceof View ? (View) parent : null;
                    }
                    if (view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                        z13 = true;
                        z14 = qVar.i == z13 || (z13 && !(!z13 && fVar.e()));
                        if (z14) {
                            qVar.i = z13;
                            qVar.h = true;
                            z11 = true;
                        }
                        if (z14) {
                            z12 = true;
                        }
                        if ((!z13 || z14) && z12) {
                            z10 = true;
                            i11 = i13 + 1;
                            size = i12;
                            arrayList2 = arrayList4;
                            rectF = rectF8;
                            arrayList3 = arrayList5;
                            rect3 = rect;
                        } else if (z13 && z11) {
                            rVar.y = true;
                        }
                    }
                }
                z13 = false;
                if (qVar.i == z13) {
                }
                if (z14) {
                }
                if (z14) {
                }
                if (z13) {
                }
                z10 = true;
                i11 = i13 + 1;
                size = i12;
                arrayList2 = arrayList4;
                rectF = rectF8;
                arrayList3 = arrayList5;
                rect3 = rect;
            } else {
                rect = rect3;
            }
            z10 = z15;
            i11 = i13 + 1;
            size = i12;
            arrayList2 = arrayList4;
            rectF = rectF8;
            arrayList3 = arrayList5;
            rect3 = rect;
        }
        ArrayList arrayList6 = arrayList2;
        RectF rectF9 = rectF;
        ArrayList arrayList7 = arrayList3;
        boolean z16 = z10;
        if (z16) {
            aVar.b = 0;
            int size2 = arrayList7.size();
            int i14 = 0;
            while (i14 < size2) {
                ArrayList arrayList8 = arrayList7;
                q qVar2 = (q) arrayList8.get(i14);
                if (qVar2.i && qVar2.b.j()) {
                    RectF rectF10 = qVar2.g;
                    aVar.a(rectF10.left, rectF10.top, rectF10.right, rectF10.bottom);
                }
                i14++;
                arrayList7 = arrayList8;
            }
            arrayList = arrayList7;
            if (!rectF9.isEmpty()) {
                aVar.a(rectF9.left, rectF9.top, rectF9.right, rectF9.bottom);
            }
            gi.b bVar = rVar.d;
            gi.a aVar2 = rVar.C;
            bVar.getClass();
            if (aVar == aVar2) {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
            aVar2.b = 0;
            int i15 = aVar.b;
            for (int i16 = 0; i16 < i15; i16++) {
                RectF c10 = aVar.c(i16);
                float f13 = c10.left;
                float f14 = c10.top;
                float f15 = c10.right;
                float f16 = c10.bottom;
                int i17 = 0;
                while (i17 < aVar2.b) {
                    RectF c11 = aVar2.c(i17);
                    float f17 = c11.left;
                    float f18 = c11.right;
                    float f19 = bVar.a;
                    if (f15 >= f17 ? f18 >= f13 || f13 - f18 <= f19 : f17 - f15 <= f19) {
                        float f20 = c11.top;
                        float f21 = c11.bottom;
                        i10 = i15;
                        float f22 = bVar.b;
                        if (f16 >= f20 ? f21 >= f14 || f14 - f21 <= f22 : f20 - f16 <= f22) {
                            if (f17 < f13) {
                                f13 = f17;
                            }
                            if (f20 < f14) {
                                f14 = f20;
                            }
                            if (f18 > f15) {
                                f15 = f18;
                            }
                            if (f21 > f16) {
                                f16 = f21;
                            }
                            aVar2.d(i17);
                            i17 = 0;
                            i15 = i10;
                        }
                    } else {
                        i10 = i15;
                    }
                    i17++;
                    i15 = i10;
                }
                aVar2.a(f13, f14, f15, f16);
            }
            int i18 = aVar2.b;
            for (int i19 = 1; i19 < i18; i19++) {
                RectF c12 = aVar2.c(i19);
                float f23 = c12.left;
                float f24 = c12.top;
                float f25 = c12.right;
                float f26 = c12.bottom;
                int i20 = i19 - 1;
                while (i20 >= 0) {
                    RectF c13 = aVar2.c(i20);
                    float f27 = c13.top;
                    float f28 = c13.left;
                    int compare = Float.compare(f27, f24);
                    if (compare == 0) {
                        compare = Float.compare(f28, f23);
                    }
                    if (compare <= 0) {
                        break;
                    }
                    aVar2.c(i20 + 1).set(c13);
                    i20--;
                }
                aVar2.c(i20 + 1).set(f23, f24, f25, f26);
            }
        } else {
            arrayList = arrayList7;
        }
        Trace.endSection();
        int i21 = rVar.u;
        rVar.u = 0;
        if (z16) {
            i21 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList6.size();
            int i22 = 0;
            while (i22 < size3) {
                ArrayList arrayList9 = arrayList6;
                tg.f fVar2 = (tg.f) arrayList9.get(i22);
                if (fVar2.e) {
                    fVar2.e = false;
                    rVar.i++;
                }
                i22++;
                arrayList6 = arrayList9;
            }
        }
        long j10 = rVar.r;
        long j11 = rVar.i;
        if (j10 != j11) {
            rVar.r = j11;
            i21 |= 8;
        }
        long j12 = rVar.q;
        long j13 = rVar.h;
        if (j12 != j13) {
            rVar.q = j13;
            i21 |= 2;
        }
        long j14 = rVar.p;
        long j15 = rVar.g;
        if (j14 != j15) {
            rVar.p = j15;
            i21 |= 1;
        }
        if (i21 != 0 || rVar.y) {
            if (i21 != 0) {
                Trace.beginSection("G.Listeners");
                n nVar = rVar.a;
                if (nVar != null) {
                    nVar.j(i21);
                }
                Trace.endSection();
            }
            boolean a2 = u7.a(i21, 4);
            boolean z17 = u7.a(i21, 1) || u7.a(i21, 2);
            Trace.beginSection("G.UpdateDisplayLists");
            int size4 = arrayList.size();
            for (int i23 = 0; i23 < size4; i23++) {
                q qVar3 = (q) arrayList.get(i23);
                boolean z18 = qVar3.i;
                f fVar3 = qVar3.b;
                if (z18 && (qVar3.h || a2 || z17)) {
                    qVar3.h = false;
                    if (fVar3.j()) {
                        fVar3.a();
                    } else {
                        fVar3.invalidateSelf();
                        qVar3.a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
