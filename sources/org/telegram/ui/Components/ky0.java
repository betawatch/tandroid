package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ky0 extends ml0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ oy0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky0(oy0 oy0Var, Context context) {
        super(context, null);
        this.Z2 = oy0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.X2 == canScrollHorizontally && this.Y2 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.Z2.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.X2 = canScrollHorizontally;
        this.Y2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.st previewDelegate;
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        oy0 oy0Var = this.Z2;
        ky0 ky0Var = oy0Var.e;
        previewDelegate = oy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ky0Var, previewDelegate, this.p2);
    }
}
