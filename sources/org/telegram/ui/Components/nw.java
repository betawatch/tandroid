package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nw extends ll0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ kz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(kz kzVar, Context context) {
        super(context, null);
        this.Z2 = kzVar;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.Z2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, kzVar.h0, kzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.Z2;
        if (kzVar.q0 && kzVar.n0.G > 1) {
            this.X2 = true;
            kzVar.i0.h1(0, 0);
            kzVar.o0.setVisibility(0);
            kzVar.p0.k(0, 0);
            kzVar.q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kz.f(kzVar, true);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Y2) {
            return;
        }
        this.Z2.n0.l();
        this.Y2 = true;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
