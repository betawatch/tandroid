package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fz0 extends zl0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ jz0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(jz0 jz0Var, Context context) {
        super(context, null);
        this.g3 = jz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.e3 == canScrollHorizontally && this.f3 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.g3.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.e3 = canScrollHorizontally;
        this.f3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.pt previewDelegate;
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        jz0 jz0Var = this.g3;
        fz0 fz0Var = jz0Var.e;
        previewDelegate = jz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, fz0Var, previewDelegate, this.p2);
    }
}
