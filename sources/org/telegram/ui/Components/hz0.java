package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class hz0 extends mm0 {
    public boolean Y2;
    public boolean Z2;
    public final /* synthetic */ lz0 a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz0(lz0 lz0Var, Context context) {
        super(context, null);
        this.a3 = lz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.Y2 == canScrollHorizontally && this.Z2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.a3.d;
        if (xVar != null) {
            xVar.invalidate();
        }
        this.Y2 = canScrollHorizontally;
        this.Z2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        lz0 lz0Var = this.a3;
        hz0 hz0Var = lz0Var.e;
        previewDelegate = lz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, hz0Var, previewDelegate, this.n2);
    }
}
