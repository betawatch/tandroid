package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import c8.zc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class h {
    public final /* synthetic */ q a;

    public h(q qVar) {
        this.a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.a;
        ArrayList arrayList = qVar.c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.t = j10;
            qVar.f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = l6.Am + s6.b;
        if (qVar.s != j11) {
            qVar.s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.n.iterator();
        while (it.hasNext()) {
            if (((qj0) it.next()).b0()) {
                qVar.i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (zc.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.a.a(oVar.b.h());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (zc.a(i7, 32)) {
                e eVar = pVar.b;
                r rVar = q.F;
                if (!Objects.equals(eVar.b, rVar)) {
                    eVar.b = rVar;
                    eVar.g(rVar);
                }
            }
            if (zc.a(i7, 16)) {
                pVar.b.updateColors();
            }
            pVar.b.invalidateSelf();
            pVar.a.invalidate();
            pVar.h = true;
        }
        qVar.u |= i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z9;
        ArrayList arrayList;
        int i7;
        boolean z10;
        Rect rect;
        boolean z11;
        boolean z12;
        boolean z13;
        q qVar = this.a;
        ArrayList arrayList2 = qVar.o;
        Trace.beginSection("G.CheckPositions");
        qVar.y = false;
        RectF rectF = qVar.e;
        Rect rect2 = qVar.x;
        Rect rect3 = qVar.w;
        qi.a aVar = qVar.B;
        ArrayList arrayList3 = qVar.c;
        RectF rectF2 = qVar.v;
        int width = qVar.m.getWidth();
        int height = qVar.m.getHeight();
        if (qVar.z == width && qVar.A == height) {
            z9 = false;
        } else {
            qVar.z = width;
            qVar.A = height;
            z9 = true;
        }
        if (qVar.f) {
            qVar.f = false;
            z9 = true;
        }
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = (p) arrayList3.get(i10);
            View view = pVar.a;
            RectF rectF3 = pVar.g;
            boolean z14 = z9;
            RectF rectF4 = pVar.f;
            int i11 = size;
            RectF rectF5 = pVar.d;
            int i12 = i10;
            RectF rectF6 = pVar.c;
            ArrayList arrayList4 = arrayList2;
            RectF rectF7 = pVar.e;
            RectF rectF8 = rectF;
            e eVar = pVar.b;
            ArrayList arrayList5 = arrayList3;
            if (jh.k.c(view, qVar.m, rectF2)) {
                if (rectF6.equals(rectF2)) {
                    z10 = false;
                } else {
                    rectF6.set(rectF2);
                    pVar.h = true;
                    eVar.i(rectF6.left, rectF6.top);
                    z10 = true;
                }
                eVar.b(rect3);
                rectF2.set(rect3);
                if (!rectF5.equals(rectF2)) {
                    rectF5.set(rectF2);
                    pVar.h = true;
                    z10 = true;
                }
                rectF2.offset(rectF6.left, rectF6.top);
                if (!rectF7.equals(rectF2)) {
                    rectF7.set(rectF2);
                    pVar.h = true;
                    z10 = true;
                }
                rectF2.set(rectF7);
                rectF2.inset(-eVar.c(), -eVar.d());
                if (!rectF4.equals(rectF2)) {
                    rectF4.set(rectF2);
                    pVar.h = true;
                    z10 = true;
                }
                rectF2.set(rectF7);
                Rect rect4 = eVar.a;
                rect2.set(rect4);
                if (rect4.isEmpty()) {
                    rect = rect3;
                } else {
                    float f10 = rect2.left;
                    float f11 = rectF6.left;
                    float f12 = rect2.top;
                    float f13 = rectF6.top;
                    rect = rect3;
                    rectF2.union(f10 + f11, f12 + f13, rect2.right + f11, rect2.bottom + f13);
                }
                rectF2.inset(-eVar.c(), -eVar.d());
                if (rectF3.equals(rectF2)) {
                    z11 = false;
                } else {
                    rectF3.set(rectF2);
                    z11 = true;
                }
                View view2 = pVar.a;
                if (!rectF7.isEmpty() && view2.isAttachedToWindow() && rectF7.intersects(0.0f, 0.0f, width, height) && eVar.c > 0) {
                    View view3 = view2;
                    while (view3 != null && view3 != qVar.m) {
                        if (view3.getVisibility() != 0 || view3.getAlpha() <= 0.0f) {
                            break;
                        }
                        Object parent = view3.getParent();
                        view3 = parent instanceof View ? (View) parent : null;
                    }
                    if (view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                        z12 = true;
                        z13 = pVar.i == z12 || (z12 && !(!z12 && eVar.e()));
                        if (z13) {
                            pVar.i = z12;
                            pVar.h = true;
                            z10 = true;
                        }
                        if (z13) {
                            z11 = true;
                        }
                        if ((!z12 || z13) && z11) {
                            z9 = true;
                            i10 = i12 + 1;
                            size = i11;
                            arrayList2 = arrayList4;
                            rectF = rectF8;
                            arrayList3 = arrayList5;
                            rect3 = rect;
                        } else if (z12 && z10) {
                            qVar.y = true;
                        }
                    }
                }
                z12 = false;
                if (pVar.i == z12) {
                }
                if (z13) {
                }
                if (z13) {
                }
                if (z12) {
                }
                z9 = true;
                i10 = i12 + 1;
                size = i11;
                arrayList2 = arrayList4;
                rectF = rectF8;
                arrayList3 = arrayList5;
                rect3 = rect;
            } else {
                rect = rect3;
            }
            z9 = z14;
            i10 = i12 + 1;
            size = i11;
            arrayList2 = arrayList4;
            rectF = rectF8;
            arrayList3 = arrayList5;
            rect3 = rect;
        }
        ArrayList arrayList6 = arrayList2;
        RectF rectF9 = rectF;
        ArrayList arrayList7 = arrayList3;
        boolean z15 = z9;
        if (z15) {
            aVar.b = 0;
            int size2 = arrayList7.size();
            int i13 = 0;
            while (i13 < size2) {
                ArrayList arrayList8 = arrayList7;
                p pVar2 = (p) arrayList8.get(i13);
                if (pVar2.i && pVar2.b.j()) {
                    RectF rectF10 = pVar2.g;
                    aVar.a(rectF10.left, rectF10.top, rectF10.right, rectF10.bottom);
                }
                i13++;
                arrayList7 = arrayList8;
            }
            arrayList = arrayList7;
            if (!rectF9.isEmpty()) {
                aVar.a(rectF9.left, rectF9.top, rectF9.right, rectF9.bottom);
            }
            qi.b bVar = qVar.d;
            qi.a aVar2 = qVar.C;
            bVar.getClass();
            if (aVar == aVar2) {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
            aVar2.b = 0;
            int i14 = aVar.b;
            for (int i15 = 0; i15 < i14; i15++) {
                RectF c10 = aVar.c(i15);
                float f14 = c10.left;
                float f15 = c10.top;
                float f16 = c10.right;
                float f17 = c10.bottom;
                int i16 = 0;
                while (i16 < aVar2.b) {
                    RectF c11 = aVar2.c(i16);
                    float f18 = c11.left;
                    float f19 = c11.right;
                    float f20 = bVar.a;
                    if (f16 >= f18 ? f19 >= f14 || f14 - f19 <= f20 : f18 - f16 <= f20) {
                        float f21 = c11.top;
                        float f22 = c11.bottom;
                        i7 = i14;
                        float f23 = bVar.b;
                        if (f17 >= f21 ? f22 >= f15 || f15 - f22 <= f23 : f21 - f17 <= f23) {
                            if (f18 < f14) {
                                f14 = f18;
                            }
                            if (f21 < f15) {
                                f15 = f21;
                            }
                            if (f19 > f16) {
                                f16 = f19;
                            }
                            if (f22 > f17) {
                                f17 = f22;
                            }
                            aVar2.d(i16);
                            i16 = 0;
                            i14 = i7;
                        }
                    } else {
                        i7 = i14;
                    }
                    i16++;
                    i14 = i7;
                }
                aVar2.a(f14, f15, f16, f17);
            }
            int i17 = aVar2.b;
            for (int i18 = 1; i18 < i17; i18++) {
                RectF c12 = aVar2.c(i18);
                float f24 = c12.left;
                float f25 = c12.top;
                float f26 = c12.right;
                float f27 = c12.bottom;
                int i19 = i18 - 1;
                while (i19 >= 0) {
                    RectF c13 = aVar2.c(i19);
                    float f28 = c13.top;
                    float f29 = c13.left;
                    int compare = Float.compare(f28, f25);
                    if (compare == 0) {
                        compare = Float.compare(f29, f24);
                    }
                    if (compare <= 0) {
                        break;
                    }
                    aVar2.c(i19 + 1).set(c13);
                    i19--;
                }
                aVar2.c(i19 + 1).set(f24, f25, f26, f27);
            }
        } else {
            arrayList = arrayList7;
        }
        Trace.endSection();
        int i20 = qVar.u;
        qVar.u = 0;
        if (z15) {
            i20 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList6.size();
            int i21 = 0;
            while (i21 < size3) {
                ArrayList arrayList9 = arrayList6;
                dh.g gVar = (dh.g) arrayList9.get(i21);
                if (gVar.e) {
                    gVar.e = false;
                    qVar.i++;
                }
                i21++;
                arrayList6 = arrayList9;
            }
        }
        long j3 = qVar.r;
        long j10 = qVar.i;
        if (j3 != j10) {
            qVar.r = j10;
            i20 |= 8;
        }
        long j11 = qVar.q;
        long j12 = qVar.h;
        if (j11 != j12) {
            qVar.q = j12;
            i20 |= 2;
        }
        long j13 = qVar.p;
        long j14 = qVar.g;
        if (j13 != j14) {
            qVar.p = j14;
            i20 |= 1;
        }
        if (i20 != 0 || qVar.y) {
            if (i20 != 0) {
                Trace.beginSection("G.Listeners");
                m mVar = qVar.a;
                if (mVar != null) {
                    mVar.l(i20);
                }
                Trace.endSection();
            }
            boolean a10 = zc.a(i20, 4);
            boolean z16 = zc.a(i20, 1) || zc.a(i20, 2);
            Trace.beginSection("G.UpdateDisplayLists");
            int size4 = arrayList.size();
            for (int i22 = 0; i22 < size4; i22++) {
                p pVar3 = (p) arrayList.get(i22);
                boolean z17 = pVar3.i;
                e eVar2 = pVar3.b;
                if (z17 && (pVar3.h || a10 || z16)) {
                    pVar3.h = false;
                    if (eVar2.j()) {
                        eVar2.a();
                    } else {
                        eVar2.invalidateSelf();
                        pVar3.a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
