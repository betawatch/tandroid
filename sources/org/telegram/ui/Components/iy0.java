package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class iy0 extends ml0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ my0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(my0 my0Var, Context context) {
        super(context, null);
        this.Z2 = my0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
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

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt previewDelegate;
        org.telegram.ui.pt q6 = org.telegram.ui.pt.q();
        my0 my0Var = this.Z2;
        iy0 iy0Var = my0Var.e;
        previewDelegate = my0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, iy0Var, previewDelegate, this.p2);
    }
}
