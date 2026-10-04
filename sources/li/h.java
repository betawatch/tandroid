package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import w7.e0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class h {
    public final /* synthetic */ m a;

    public h(m mVar) {
        this.a = mVar;
    }

    public final void a() {
        int i10;
        m mVar = this.a;
        ArrayList arrayList = mVar.c;
        ArrayList arrayList2 = mVar.z;
        long j3 = mVar.q;
        long j10 = m.B;
        if (j3 != j10) {
            mVar.q = j10;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j11 = i6.Hl;
        if (mVar.p != j11) {
            mVar.p = j11;
            i10 |= 16;
        }
        if (i10 == 0) {
            return;
        }
        if (e0.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                k kVar = (k) arrayList2.get(i11);
                kVar.a.a(kVar.b.f());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l lVar = (l) arrayList.get(i12);
            if (e0.a(i10, 32)) {
                e eVar = lVar.b;
                n nVar = m.A;
                if (!Objects.equals(eVar.a, nVar)) {
                    eVar.a = nVar;
                    eVar.g(nVar);
                }
            }
            if (e0.a(i10, 16)) {
                lVar.b.k();
            }
            lVar.b.invalidateSelf();
            lVar.a.invalidate();
            lVar.g = true;
        }
        mVar.r |= i10;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        m mVar = this.a;
        ArrayList arrayList = mVar.l;
        Trace.beginSection("G.CheckPositions");
        Rect rect = mVar.t;
        ni.a aVar = mVar.w;
        ArrayList arrayList2 = mVar.c;
        RectF rectF = mVar.s;
        int width = mVar.k.getWidth();
        int height = mVar.k.getHeight();
        if (mVar.u == width && mVar.v == height) {
            z10 = false;
        } else {
            mVar.u = width;
            mVar.v = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = (l) arrayList2.get(i10);
            View view = lVar.a;
            RectF rectF2 = lVar.f;
            RectF rectF3 = lVar.d;
            RectF rectF4 = lVar.c;
            boolean z13 = z10;
            RectF rectF5 = lVar.e;
            int i11 = size;
            e eVar = lVar.b;
            int i12 = i10;
            if (hh.k.c(view, mVar.k, rectF)) {
                if (rectF4.equals(rectF)) {
                    z11 = false;
                } else {
                    rectF4.set(rectF);
                    lVar.g = true;
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
                    lVar.g = true;
                    z11 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    lVar.g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-eVar.c(), -eVar.d());
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    lVar.g = true;
                    z11 = true;
                }
                View view2 = lVar.a;
                boolean z14 = !rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, (float) width, (float) height) && eVar.b > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f;
                boolean z15 = lVar.h != z14 || (z14 && !(z14 && eVar.e()));
                if (z15) {
                    lVar.h = z14;
                    lVar.g = true;
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
                l lVar2 = (l) arrayList2.get(i13);
                if (lVar2.h && lVar2.b.j()) {
                    RectF rectF6 = lVar2.f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            ni.b bVar = mVar.d;
            ni.a aVar2 = mVar.x;
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
        int i20 = mVar.r;
        mVar.r = 0;
        if (z16) {
            i20 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList.size();
            for (int i21 = 0; i21 < size3; i21++) {
                ah.i iVar = (ah.i) arrayList.get(i21);
                if (iVar.e) {
                    iVar.e = false;
                    mVar.g++;
                }
            }
        }
        long j3 = mVar.o;
        long j10 = mVar.g;
        if (j3 != j10) {
            mVar.o = j10;
            i20 |= 8;
        }
        long j11 = mVar.n;
        long j12 = mVar.f;
        if (j11 != j12) {
            mVar.n = j12;
            i20 |= 2;
        }
        long j13 = mVar.m;
        long j14 = mVar.e;
        if (j13 != j14) {
            mVar.m = j14;
            i20 |= 1;
        }
        if (i20 != 0) {
            Trace.beginSection("G.Listeners");
            i iVar2 = mVar.a;
            if (iVar2 != null) {
                iVar2.k(i20);
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
                l lVar3 = (l) arrayList2.get(i22);
                boolean z18 = lVar3.h;
                e eVar2 = lVar3.b;
                if (z18 && (lVar3.g || a2 || z17)) {
                    lVar3.g = false;
                    if (eVar2.j()) {
                        eVar2.a();
                    } else {
                        eVar2.invalidateSelf();
                        lVar3.a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
