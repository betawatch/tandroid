package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sx0 extends zk0 {
    public boolean T2;
    public boolean U2;
    public final /* synthetic */ wx0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0(wx0 wx0Var, Context context) {
        super(context, null);
        this.V2 = wx0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.T2 == canScrollHorizontally && this.U2 == canScrollHorizontally2) {
            return;
        }
        ag.p1 p1Var = this.V2.d;
        if (p1Var != null) {
            p1Var.invalidate();
        }
        this.T2 = canScrollHorizontally;
        this.U2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht previewDelegate;
        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
        wx0 wx0Var = this.V2;
        sx0 sx0Var = wx0Var.e;
        previewDelegate = wx0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, sx0Var, previewDelegate, this.l2);
    }
}
