package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qw extends zl0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ nz g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(nz nzVar, Context context) {
        super(context, null);
        this.g3 = nzVar;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.g3;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, nzVar.h0, nzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.g3;
        if (nzVar.q0 && nzVar.n0.G > 1) {
            this.e3 = true;
            nzVar.i0.h1(0, 0);
            nzVar.o0.setVisibility(0);
            nzVar.p0.k(0, 0);
            nzVar.q0 = false;
            this.e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nz.f(nzVar, true);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3) {
            return;
        }
        this.g3.n0.l();
        this.f3 = true;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
