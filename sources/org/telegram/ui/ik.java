package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ik extends org.telegram.ui.Components.xi0 {
    public final int[] n1;
    public ValueAnimator o1;
    public boolean p1;
    public final /* synthetic */ bn q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(bn bnVar, bn bnVar2, Activity activity, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(3, i7, activity, bnVar2, h6Var);
        this.q1 = bnVar;
        this.n1 = new int[2];
        this.p1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z10, i7, i10, i11, i12);
        kVar = ((org.telegram.ui.ActionBar.g2) this.q1).actionBar;
        org.telegram.ui.ActionBar.q0 j3 = kVar.p(null).j(28);
        if (j3 != null) {
            int[] iArr = this.n1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j3.getLocationInWindow(iArr);
            float width2 = (j3.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.g0.L(20.0f);
            boolean z11 = org.telegram.messenger.gd.a0;
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
        ofFloat.addUpdateListener(new a3(this, 5));
        this.o1.setInterpolator(org.telegram.ui.Components.nr.h);
        this.o1.setDuration(420L);
        this.o1.start();
    }
}
