package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gz0 extends mm0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ kz0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0(kz0 kz0Var, Context context) {
        super(context, null);
        this.X2 = kz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.X2.d;
        if (xVar != null) {
            xVar.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.vt previewDelegate;
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        kz0 kz0Var = this.X2;
        gz0 gz0Var = kz0Var.e;
        previewDelegate = kz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, gz0Var, previewDelegate, this.n2);
    }
}
