package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ww0 extends ek0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ zw0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(zw0 zw0Var, Context context) {
        super(context, null);
        this.h3 = zw0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bi.g3 g3Var = this.h3.d;
        if (g3Var != null) {
            g3Var.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        zw0 zw0Var = this.h3;
        ww0 ww0Var = zw0Var.e;
        previewDelegate = zw0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, ww0Var, previewDelegate, this.o2);
    }
}
