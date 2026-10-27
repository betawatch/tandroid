package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qz0 extends nm0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ uz0 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(uz0 uz0Var, Context context) {
        super(context, null);
        this.h3 = uz0Var;
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

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft previewDelegate;
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        uz0 uz0Var = this.h3;
        qz0 qz0Var = uz0Var.e;
        previewDelegate = uz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, qz0Var, previewDelegate, this.n2);
    }
}
