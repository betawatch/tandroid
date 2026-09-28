package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class vy0 extends yl0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ zy0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(zy0 zy0Var, Context context) {
        super(context, null);
        this.Z2 = zy0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
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

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.lt previewDelegate;
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        zy0 zy0Var = this.Z2;
        vy0 vy0Var = zy0Var.e;
        previewDelegate = zy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, vy0Var, previewDelegate, this.p2);
    }
}
