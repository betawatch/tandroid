package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wv extends tk0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ vy g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(vy vyVar, Context context) {
        super(context, null);
        this.g3 = vyVar;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        vy vyVar = this.g3;
        return super.onInterceptTouchEvent(motionEvent) || p5.q(motionEvent, vyVar.h0, vyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.g3;
        if (vyVar.q0 && vyVar.n0.G > 1) {
            this.e3 = true;
            vyVar.i0.h1(0, 0);
            vyVar.o0.setVisibility(0);
            vyVar.p0.k(0, 0);
            vyVar.q0 = false;
            this.e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vy.f(vyVar, true);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3) {
            return;
        }
        this.g3.n0.f();
        this.f3 = true;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
