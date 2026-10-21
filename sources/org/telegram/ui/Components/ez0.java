package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ez0 extends jm0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ iz0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(iz0 iz0Var, Context context) {
        super(context, null);
        this.X2 = iz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.X2.d;
        if (xVar != null) {
            xVar.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.jm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ct previewDelegate;
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        iz0 iz0Var = this.X2;
        ez0 ez0Var = iz0Var.e;
        previewDelegate = iz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ez0Var, previewDelegate, this.n2);
    }
}
