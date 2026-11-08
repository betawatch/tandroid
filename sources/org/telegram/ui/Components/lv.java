package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class lv extends pj0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ hy g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(hy hyVar, Context context) {
        super(context, null);
        this.g3 = hyVar;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        hy hyVar = this.g3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, hyVar.h0, hyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        hy hyVar = this.g3;
        if (hyVar.q0 && hyVar.n0.G > 1) {
            this.e3 = true;
            hyVar.i0.h1(0, 0);
            hyVar.o0.setVisibility(0);
            hyVar.p0.k(0, 0);
            hyVar.q0 = false;
            this.e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        hy.f(hyVar, true);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f3) {
            return;
        }
        this.g3.n0.f();
        this.f3 = true;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
