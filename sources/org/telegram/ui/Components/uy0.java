package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class uy0 extends vl0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ yy0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy0(yy0 yy0Var, Context context) {
        super(context, null);
        this.Z2 = yy0Var;
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

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt previewDelegate;
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        yy0 yy0Var = this.Z2;
        uy0 uy0Var = yy0Var.e;
        previewDelegate = yy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, uy0Var, previewDelegate, this.p2);
    }
}
