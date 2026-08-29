package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class by0 extends jl0 {
    public boolean T2;
    public boolean U2;
    public final /* synthetic */ fy0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(fy0 fy0Var, Context context) {
        super(context, null);
        this.V2 = fy0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.T2 == canScrollHorizontally && this.U2 == canScrollHorizontally2) {
            return;
        }
        bg.x2 x2Var = this.V2.d;
        if (x2Var != null) {
            x2Var.invalidate();
        }
        this.T2 = canScrollHorizontally;
        this.U2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fy0 fy0Var = this.V2;
        by0 by0Var = fy0Var.e;
        previewDelegate = fy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, by0Var, previewDelegate, this.l2);
    }
}
