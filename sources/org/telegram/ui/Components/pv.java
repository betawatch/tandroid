package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pv extends rg.d {
    public boolean f3;
    public final /* synthetic */ gy g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(gy gyVar, Context context) {
        super(context, null);
        this.g3 = gyVar;
    }

    @Override // rg.d, org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.g3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        gy gyVar = this.g3;
        ay ayVar = gyVar.z0;
        if (gyVar.C0 != null) {
            gyVar.B0.setUnderlineHeight(gyVar.D0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (ayVar != null && getAdapter() == ayVar && ayVar.d == 0) {
            ay ayVar2 = ayVar.O.x;
            if (ayVar2.Q.G0.F || ayVar2.D) {
                return;
            }
            if (gyVar.E0.N0() + 50 > ayVar.b()) {
                zx zxVar = ayVar.O;
                Objects.requireNonNull(zxVar);
                org.telegram.messenger.g0.h3(new ov(zxVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gy gyVar = this.g3;
        if (gyVar.f) {
            return false;
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        pv pvVar = gyVar.D0;
        gyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, pvVar, gyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        gy gyVar = this.g3;
        if (gyVar.I0 && gyVar.y0.b() > 0) {
            this.f3 = true;
            gyVar.E0.h1(0, 0);
            gyVar.I0 = false;
            this.f3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        gyVar.q(true);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
