package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wy0 extends yl0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ az0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy0(az0 az0Var, Context context) {
        super(context, null);
        this.Z2 = az0Var;
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

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt previewDelegate;
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        az0 az0Var = this.Z2;
        wy0 wy0Var = az0Var.e;
        previewDelegate = az0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, wy0Var, previewDelegate, this.p2);
    }
}
