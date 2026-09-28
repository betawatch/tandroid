package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ow extends yl0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ mz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(mz mzVar, Context context) {
        super(context, null);
        this.Z2 = mzVar;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        mz mzVar = this.Z2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, mzVar.h0, mzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mz mzVar = this.Z2;
        if (mzVar.q0 && mzVar.n0.G > 1) {
            this.X2 = true;
            mzVar.i0.h1(0, 0);
            mzVar.o0.setVisibility(0);
            mzVar.p0.k(0, 0);
            mzVar.q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mz.f(mzVar, true);
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Y2) {
            return;
        }
        this.Z2.n0.l();
        this.Y2 = true;
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
