package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ov extends sg.d {
    public boolean g3;
    public final /* synthetic */ ey h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(ey eyVar, Context context) {
        super(context, null);
        this.h3 = eyVar;
    }

    @Override // sg.d, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.o2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i3) {
        ey eyVar = this.h3;
        yx yxVar = eyVar.A0;
        if (eyVar.D0 != null) {
            eyVar.C0.setUnderlineHeight(eyVar.E0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (yxVar != null && getAdapter() == yxVar && yxVar.d == 0) {
            yx yxVar2 = yxVar.P.x;
            if (yxVar2.R.H0.G || yxVar2.E) {
                return;
            }
            if (eyVar.F0.N0() + 50 > yxVar.b()) {
                xx xxVar = yxVar.P;
                Objects.requireNonNull(xxVar);
                org.telegram.messenger.g0.h3(new nv(xxVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ey eyVar = this.h3;
        if (eyVar.f) {
            return false;
        }
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ov ovVar = eyVar.E0;
        eyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, ovVar, eyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ey eyVar = this.h3;
        if (eyVar.J0 && eyVar.z0.b() > 0) {
            this.g3 = true;
            eyVar.F0.h1(0, 0);
            eyVar.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        eyVar.q(true);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
