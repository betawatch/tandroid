package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.li0 {
    public final int[] n1;
    public ValueAnimator o1;
    public boolean p1;
    public final /* synthetic */ wm q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(wm wmVar, wm wmVar2, Activity activity, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i3, activity, wmVar2, e6Var);
        this.q1 = wmVar;
        this.n1 = new int[2];
        this.p1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z10, i3, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.d2) this.q1).actionBar;
        org.telegram.ui.ActionBar.q0 j10 = kVar.n(null).j(28);
        if (j10 != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j10.getLocationInWindow(iArr);
            float width2 = (j10.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            boolean z11 = org.telegram.messenger.bd.a0;
            float f10 = width2 + (L * (z11 ? -1 : 1));
            if (z11) {
                s(!this.p1, f10 - x10);
            } else {
                s(!this.p1, f10 - width);
            }
            this.p1 = false;
        }
    }

    public final void s(boolean z10, float f10) {
        ValueAnimator valueAnimator = this.o1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o1 = null;
        }
        if (!z10) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V0, f10);
        this.o1 = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 5));
        this.o1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.o1.setDuration(420L);
        this.o1.start();
    }
}
