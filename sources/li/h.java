package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.zl0;
import w7.e0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class h {
    public final /* synthetic */ p a;

    public h(p pVar) {
        this.a = pVar;
    }

    public final void a() {
        int i10;
        p pVar = this.a;
        ArrayList arrayList = pVar.c;
        ArrayList arrayList2 = pVar.A;
        long j3 = pVar.r;
        long j10 = p.C;
        if (j3 != j10) {
            pVar.r = j10;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j11 = i6.Hl;
        if (pVar.q != j11) {
            pVar.q = j11;
            i10 |= 16;
        }
        Iterator it = pVar.l.iterator();
        while (it.hasNext()) {
            if (((zl0) it.next()).b0()) {
                pVar.g++;
            }
        }
        if (i10 == 0) {
            return;
        }
        if (e0.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList2.get(i11);
                nVar.a.a(nVar.b.f());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            o oVar = (o) arrayList.get(i12);
            if (e0.a(i10, 32)) {
                e eVar = oVar.b;
                q qVar = p.B;
                if (!Objects.equals(eVar.a, qVar)) {
                    eVar.a = qVar;
                    eVar.g(qVar);
                }
            }
            if (e0.a(i10, 16)) {
                oVar.b.k();
            }
            oVar.b.invalidateSelf();
            oVar.a.invalidate();
            oVar.g = true;
        }
        pVar.s |= i10;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        p pVar = this.a;
        ArrayList arrayList = pVar.m;
        Trace.beginSection("G.CheckPositions");
        Rect rect = pVar.u;
        ni.a aVar = pVar.x;
        ArrayList arrayList2 = pVar.c;
        RectF rectF = pVar.t;
        int width = pVar.k.getWidth();
        int height = pVar.k.getHeight();
        if (pVar.v == width && pVar.w == height) {
            z10 = false;
        } else {
            pVar.v = width;
            pVar.w = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            o oVar = (o) arrayList2.get(i10);
            View view = oVar.a;
            RectF rectF2 = oVar.f;
            RectF rectF3 = oVar.d;
            RectF rectF4 = oVar.c;
            boolean z13 = z10;
            RectF rectF5 = oVar.e;
            int i11 = size;
            e eVar = oVar.b;
            int i12 = i10;
            if (hh.k.c(view, pVar.k, rectF)) {
                if (rectF4.equals(rectF)) {
                    z11 = false;
                } else {
                    rectF4.set(rectF);
                    oVar.g = true;
                    eVar.i(rectF4.left, rectF4.top);
                    z11 = true;
                }
                eVar.b(rect);
                rectF.set(rect);
                if (rectF3.equals(rectF)) {
                    z12 = true;
                } else {
                    rectF3.set(rectF);
                    z12 = true;
                    oVar.g = true;
                    z11 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    oVar.g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-eVar.c(), -eVar.d());
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    oVar.g = true;
                    z11 = true;
                }
                View view2 = oVar.a;
                boolean z14 = !rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, (float) width, (float) height) && eVar.b > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f;
                boolean z15 = oVar.h != z14 || (z14 && !(z14 && eVar.e()));
                if (z15) {
                    oVar.h = z14;
                    oVar.g = true;
                    z11 = true;
                }
                if ((z14 || z15) && z11) {
                    z10 = true;
                    i10 = i12 + 1;
                    size = i11;
                }
            }
            z10 = z13;
            i10 = i12 + 1;
            size = i11;
        }
        boolean z16 = z10;
        if (z16) {
            aVar.b = 0;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                o oVar2 = (o) arrayList2.get(i13);
                if (oVar2.h && oVar2.b.j()) {
                    RectF rectF6 = oVar2.f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            ni.b bVar = pVar.d;
            ni.a aVar2 = pVar.y;
            bVar.getClass();
            if (aVar == aVar2) {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
            aVar2.b = 0;
            int i14 = aVar.b;
            for (int i15 = 0; i15 < i14; i15++) {
                RectF c10 = aVar.c(i15);
                float f7 = c10.left;
                float f10 = c10.top;
                float f11 = c10.right;
                float f12 = c10.bottom;
                int i16 = 0;
                while (i16 < aVar2.b) {
                    RectF c11 = aVar2.c(i16);
                    float f13 = c11.left;
                    float f14 = c11.right;
                    ni.a aVar3 = aVar;
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
                            aVar2.d(i16);
                            i16 = 0;
                            aVar = aVar3;
                        }
                    }
                    i16++;
                    aVar = aVar3;
                }
                aVar2.a(f7, f10, f11, f12);
            }
            int i17 = aVar2.b;
            for (int i18 = 1; i18 < i17; i18++) {
                RectF c12 = aVar2.c(i18);
                float f19 = c12.left;
                float f20 = c12.top;
                float f21 = c12.right;
                float f22 = c12.bottom;
                int i19 = i18 - 1;
                while (i19 >= 0) {
                    RectF c13 = aVar2.c(i19);
                    float f23 = c13.top;
                    float f24 = c13.left;
                    int compare = Float.compare(f23, f20);
                    if (compare == 0) {
                        compare = Float.compare(f24, f19);
                    }
                    if (compare <= 0) {
                        break;
                    }
                    aVar2.c(i19 + 1).set(c13);
                    i19--;
                }
                aVar2.c(i19 + 1).set(f19, f20, f21, f22);
            }
        }
        Trace.endSection();
        int i20 = pVar.s;
        pVar.s = 0;
        if (z16) {
            i20 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList.size();
            for (int i21 = 0; i21 < size3; i21++) {
                ah.i iVar = (ah.i) arrayList.get(i21);
                if (iVar.e) {
                    iVar.e = false;
                    pVar.g++;
                }
            }
        }
        long j3 = pVar.p;
        long j10 = pVar.g;
        if (j3 != j10) {
            pVar.p = j10;
            i20 |= 8;
        }
        long j11 = pVar.o;
        long j12 = pVar.f;
        if (j11 != j12) {
            pVar.o = j12;
            i20 |= 2;
        }
        long j13 = pVar.n;
        long j14 = pVar.e;
        if (j13 != j14) {
            pVar.n = j14;
            i20 |= 1;
        }
        if (i20 != 0) {
            Trace.beginSection("G.Listeners");
            l lVar = pVar.a;
            if (lVar != null) {
                lVar.k(i20);
            }
            Trace.endSection();
            boolean a2 = e0.a(i20, 4);
            boolean z17 = true;
            if (!e0.a(i20, 1) && !e0.a(i20, 2)) {
                z17 = false;
            }
            Trace.beginSection("G.UpdateDisplayLists");
            int size4 = arrayList2.size();
            for (int i22 = 0; i22 < size4; i22++) {
                o oVar3 = (o) arrayList2.get(i22);
                boolean z18 = oVar3.h;
                e eVar2 = oVar3.b;
                if (z18 && (oVar3.g || a2 || z17)) {
                    oVar3.g = false;
                    if (eVar2.j()) {
                        eVar2.a();
                    } else {
                        eVar2.invalidateSelf();
                        oVar3.a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
