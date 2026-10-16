package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yw extends mm0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ wz X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(wz wzVar, Context context) {
        super(context, null);
        this.X2 = wzVar;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.X2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, wzVar.h0, wzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wz wzVar = this.X2;
        if (wzVar.q0 && wzVar.n0.G > 1) {
            this.V2 = true;
            wzVar.i0.h1(0, 0);
            wzVar.o0.setVisibility(0);
            wzVar.p0.k(0, 0);
            wzVar.q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wz.f(wzVar, true);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.W2) {
            return;
        }
        this.X2.n0.l();
        this.W2 = true;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
