package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class px0 extends tk0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ sx0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px0(sx0 sx0Var, Context context) {
        super(context, null);
        this.g3 = sx0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.e3 == canScrollHorizontally && this.f3 == canScrollHorizontally2) {
            return;
        }
        jg.l0 l0Var = this.g3.d;
        if (l0Var != null) {
            l0Var.invalidate();
        }
        this.e3 = canScrollHorizontally;
        this.f3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.jt previewDelegate;
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        sx0 sx0Var = this.g3;
        px0 px0Var = sx0Var.e;
        previewDelegate = sx0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p5.q(motionEvent, px0Var, previewDelegate, this.n2);
    }
}
