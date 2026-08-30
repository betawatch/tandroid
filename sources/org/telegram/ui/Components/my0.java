package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class my0 extends sl0 {
    public boolean U2;
    public boolean V2;
    public final /* synthetic */ qy0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(qy0 qy0Var, Context context) {
        super(context, null);
        this.W2 = qy0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.U2 == canScrollHorizontally && this.V2 == canScrollHorizontally2) {
            return;
        }
        dg.u2 u2Var = this.W2.d;
        if (u2Var != null) {
            u2Var.invalidate();
        }
        this.U2 = canScrollHorizontally;
        this.V2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt previewDelegate;
        org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
        qy0 qy0Var = this.W2;
        my0 my0Var = qy0Var.e;
        previewDelegate = qy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, my0Var, previewDelegate, this.m2);
    }
}
