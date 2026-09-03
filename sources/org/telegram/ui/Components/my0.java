package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class my0 extends sl0 {
    public boolean U2;
    public boolean V2;
    public final /* synthetic */ qy0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(qy0 qy0Var, Context context) {
        super(context, null);
        this.W2 = qy0Var;
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

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ot previewDelegate;
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        qy0 qy0Var = this.W2;
        my0 my0Var = qy0Var.e;
        previewDelegate = qy0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, my0Var, previewDelegate, this.m2);
    }
}
