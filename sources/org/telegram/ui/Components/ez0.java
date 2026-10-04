package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ez0 extends zl0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ iz0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(iz0 iz0Var, Context context) {
        super(context, null);
        this.g3 = iz0Var;
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
        iz0 iz0Var = this.g3;
        ez0 ez0Var = iz0Var.e;
        previewDelegate = iz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ez0Var, previewDelegate, this.p2);
    }
}
