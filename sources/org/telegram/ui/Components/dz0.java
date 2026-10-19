package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class dz0 extends im0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ hz0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz0(hz0 hz0Var, Context context) {
        super(context, null);
        this.X2 = hz0Var;
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

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ct previewDelegate;
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        hz0 hz0Var = this.X2;
        dz0 dz0Var = hz0Var.e;
        previewDelegate = hz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, dz0Var, previewDelegate, this.n2);
    }
}
