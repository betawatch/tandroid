package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lw0 extends pj0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ ow0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.g3 = ow0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.e3 == canScrollHorizontally && this.f3 == canScrollHorizontally2) {
            return;
        }
        bi.e5 e5Var = this.g3.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
        this.e3 = canScrollHorizontally;
        this.f3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.is previewDelegate;
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        ow0 ow0Var = this.g3;
        lw0 lw0Var = ow0Var.e;
        previewDelegate = ow0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, lw0Var, previewDelegate, this.n2);
    }
}
