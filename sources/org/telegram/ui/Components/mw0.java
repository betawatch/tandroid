package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mw0 extends qj0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ pw0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw0(pw0 pw0Var, Context context) {
        super(context, null);
        this.g3 = pw0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.e3 == canScrollHorizontally && this.f3 == canScrollHorizontally2) {
            return;
        }
        bi.e5 e5Var = this.g3.d;
        if (e5Var != null) {
            e5Var.invalidate();
        }
        this.e3 = canScrollHorizontally;
        this.f3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ks previewDelegate;
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        pw0 pw0Var = this.g3;
        mw0 mw0Var = pw0Var.e;
        previewDelegate = pw0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, mw0Var, previewDelegate, this.n2);
    }
}
