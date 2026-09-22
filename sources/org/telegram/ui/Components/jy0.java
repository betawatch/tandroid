package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jy0 extends ll0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ ny0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ny0 ny0Var, Context context) {
        super(context, null);
        this.Z2 = ny0Var;
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

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt previewDelegate;
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        ny0 ny0Var = this.Z2;
        jy0 jy0Var = ny0Var.e;
        previewDelegate = ny0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, jy0Var, previewDelegate, this.p2);
    }
}
