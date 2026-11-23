package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class xw0 extends ek0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ ax0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(ax0 ax0Var, Context context) {
        super(context, null);
        this.h3 = ax0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bi.e3 e3Var = this.h3.d;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ax0 ax0Var = this.h3;
        xw0 xw0Var = ax0Var.e;
        previewDelegate = ax0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, xw0Var, previewDelegate, this.o2);
    }
}
