package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bw extends hg.e {
    public boolean f3;
    public final /* synthetic */ vy g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(vy vyVar, Context context) {
        super(context, null);
        this.g3 = vyVar;
    }

    @Override // hg.e, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.g3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        vy vyVar = this.g3;
        qy qyVar = vyVar.z0;
        if (vyVar.C0 != null) {
            vyVar.B0.setUnderlineHeight(vyVar.D0.canScrollVertically(-1) ? org.telegram.messenger.i0.f1() : 0);
        }
        if (qyVar != null && getAdapter() == qyVar && qyVar.d == 0) {
            qy qyVar2 = qyVar.O.x;
            if (qyVar2.Q.G0.F || qyVar2.D) {
                return;
            }
            if (vyVar.E0.N0() + 50 > qyVar.b()) {
                py pyVar = qyVar.O;
                Objects.requireNonNull(pyVar);
                org.telegram.messenger.i0.g3(new aw(pyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vy vyVar = this.g3;
        if (vyVar.f) {
            return false;
        }
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        bw bwVar = vyVar.D0;
        vyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p5.q(motionEvent, bwVar, vyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.g3;
        if (vyVar.I0 && vyVar.y0.b() > 0) {
            this.f3 = true;
            vyVar.E0.h1(0, 0);
            vyVar.I0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vyVar.q(true);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
