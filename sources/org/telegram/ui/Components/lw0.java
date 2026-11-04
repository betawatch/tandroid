package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lw0 extends tj0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ ow0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.h3 = ow0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i3) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        kw0 kw0Var = this.h3.d;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.gs previewDelegate;
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ow0 ow0Var = this.h3;
        lw0 lw0Var = ow0Var.e;
        previewDelegate = ow0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, lw0Var, previewDelegate, this.o2);
    }
}
