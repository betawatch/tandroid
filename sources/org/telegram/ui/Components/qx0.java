package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qx0 extends uk0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ tx0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(tx0 tx0Var, Context context) {
        super(context, null);
        this.g3 = tx0Var;
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

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht previewDelegate;
        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
        tx0 tx0Var = this.g3;
        qx0 qx0Var = tx0Var.e;
        previewDelegate = tx0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p5.q(motionEvent, qx0Var, previewDelegate, this.n2);
    }
}
