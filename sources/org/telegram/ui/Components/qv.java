package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qv extends rg.d {
    public boolean f3;
    public final /* synthetic */ hy g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(hy hyVar, Context context) {
        super(context, null);
        this.g3 = hyVar;
    }

    @Override // rg.d, org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.g3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        hy hyVar = this.g3;
        cy cyVar = hyVar.z0;
        if (hyVar.C0 != null) {
            hyVar.B0.setUnderlineHeight(hyVar.D0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (cyVar != null && getAdapter() == cyVar && cyVar.d == 0) {
            cy cyVar2 = cyVar.O.x;
            if (cyVar2.Q.G0.F || cyVar2.D) {
                return;
            }
            if (hyVar.E0.N0() + 50 > cyVar.b()) {
                ay ayVar = cyVar.O;
                Objects.requireNonNull(ayVar);
                org.telegram.messenger.g0.h3(new pv(ayVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hy hyVar = this.g3;
        if (hyVar.f) {
            return false;
        }
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        qv qvVar = hyVar.D0;
        hyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, qvVar, hyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        hy hyVar = this.g3;
        if (hyVar.I0 && hyVar.y0.b() > 0) {
            this.f3 = true;
            hyVar.E0.h1(0, 0);
            hyVar.I0 = false;
            this.f3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        hyVar.q(true);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
