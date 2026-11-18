package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class vw0 extends ck0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ yw0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(yw0 yw0Var, Context context) {
        super(context, null);
        this.h3 = yw0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bi.a3 a3Var = this.h3.d;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ls previewDelegate;
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        yw0 yw0Var = this.h3;
        vw0 vw0Var = yw0Var.e;
        previewDelegate = yw0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, vw0Var, previewDelegate, this.o2);
    }
}
