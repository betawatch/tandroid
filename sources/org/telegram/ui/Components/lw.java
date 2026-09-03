package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lw extends sl0 {
    public boolean U2;
    public boolean V2;
    public final /* synthetic */ mz W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(mz mzVar, Context context) {
        super(context, null);
        this.W2 = mzVar;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.W2;
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, mzVar.e0, mzVar.d2, this.m2);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mz mzVar = this.W2;
        if (mzVar.n0 && mzVar.k0.D > 1) {
            this.U2 = true;
            mzVar.f0.h1(0, 0);
            mzVar.l0.setVisibility(0);
            mzVar.m0.k(0, 0);
            mzVar.n0 = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        mz.f(mzVar, true);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.V2) {
            return;
        }
        this.W2.k0.l();
        this.V2 = true;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
