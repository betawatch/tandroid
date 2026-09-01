package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ny0 extends tl0 {
    public boolean U2;
    public boolean V2;
    public final /* synthetic */ ry0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(ry0 ry0Var, Context context) {
        super(context, null);
        this.W2 = ry0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.U2 == canScrollHorizontally && this.V2 == canScrollHorizontally2) {
            return;
        }
        eg.s2 s2Var = this.W2.d;
        if (s2Var != null) {
            s2Var.invalidate();
        }
        this.U2 = canScrollHorizontally;
        this.V2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ot previewDelegate;
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        ry0 ry0Var = this.W2;
        ny0 ny0Var = ry0Var.e;
        previewDelegate = ry0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, ny0Var, previewDelegate, this.m2);
    }
}
