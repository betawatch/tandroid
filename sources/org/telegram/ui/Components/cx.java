package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cx extends qm0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ a00 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(a00 a00Var, Context context) {
        super(context, null);
        this.X2 = a00Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        a00 a00Var = this.X2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, a00Var.h0, a00Var.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a00 a00Var = this.X2;
        if (a00Var.q0 && a00Var.n0.G > 1) {
            this.V2 = true;
            a00Var.i0.h1(0, 0);
            a00Var.o0.setVisibility(0);
            a00Var.p0.k(0, 0);
            a00Var.q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        a00.f(a00Var, true);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.W2) {
            return;
        }
        this.X2.n0.l();
        this.W2 = true;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
