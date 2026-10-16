package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hz0 extends mm0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ lz0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(lz0 lz0Var, Context context) {
        super(context, null);
        this.X2 = lz0Var;
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.vt previewDelegate;
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        lz0 lz0Var = this.X2;
        hz0 hz0Var = lz0Var.e;
        previewDelegate = lz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, hz0Var, previewDelegate, this.n2);
    }
}
