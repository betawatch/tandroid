package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pz0 extends mm0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ tz0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(tz0 tz0Var, Context context) {
        super(context, null);
        this.h3 = tz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bh.r rVar = this.h3.d;
        if (rVar != null) {
            rVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.dt previewDelegate;
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        tz0 tz0Var = this.h3;
        pz0 pz0Var = tz0Var.e;
        previewDelegate = tz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, pz0Var, previewDelegate, this.n2);
    }
}
