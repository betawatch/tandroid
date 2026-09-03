package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jw extends rl0 {
    public boolean U2;
    public boolean V2;
    public final /* synthetic */ kz W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(kz kzVar, Context context) {
        super(context, null);
        this.W2 = kzVar;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
        kz kzVar = this.W2;
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, kzVar.e0, kzVar.d2, this.m2);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        kz kzVar = this.W2;
        if (kzVar.n0 && kzVar.k0.D > 1) {
            this.U2 = true;
            kzVar.f0.h1(0, 0);
            kzVar.l0.setVisibility(0);
            kzVar.m0.k(0, 0);
            kzVar.n0 = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        kz.f(kzVar, true);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.V2) {
            return;
        }
        this.W2.k0.l();
        this.V2 = true;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
