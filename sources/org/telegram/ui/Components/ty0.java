package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ty0 extends wl0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ xy0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(xy0 xy0Var, Context context) {
        super(context, null);
        this.Z2 = xy0Var;
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

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.lt previewDelegate;
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        xy0 xy0Var = this.Z2;
        ty0 ty0Var = xy0Var.e;
        previewDelegate = xy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ty0Var, previewDelegate, this.p2);
    }
}
