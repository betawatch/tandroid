package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qx0 extends wk0 {
    public boolean T2;
    public boolean U2;
    public final /* synthetic */ ux0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(ux0 ux0Var, Context context) {
        super(context, null);
        this.V2 = ux0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i9, int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.T2 == canScrollHorizontally && this.U2 == canScrollHorizontally2) {
            return;
        }
        fh.d2 d2Var = this.V2.d;
        if (d2Var != null) {
            d2Var.invalidate();
        }
        this.T2 = canScrollHorizontally;
        this.U2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        ux0 ux0Var = this.V2;
        qx0 qx0Var = ux0Var.e;
        previewDelegate = ux0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, qx0Var, previewDelegate, this.l2);
    }
}
