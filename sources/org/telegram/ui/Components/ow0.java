package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ow0 extends uj0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ rw0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(rw0 rw0Var, Context context) {
        super(context, null);
        this.h3 = rw0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bi.g2 g2Var = this.h3.d;
        if (g2Var != null) {
            g2Var.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        rw0 rw0Var = this.h3;
        ow0 ow0Var = rw0Var.e;
        previewDelegate = rw0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, ow0Var, previewDelegate, this.o2);
    }
}
