package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class bl extends org.telegram.ui.Components.qk0 {
    public final int[] l1;
    public ValueAnimator m1;
    public boolean n1;
    public final /* synthetic */ zn o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(zn znVar, zn znVar2, Activity activity, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(3, i10, activity, znVar2, e6Var);
        this.o1 = znVar;
        this.l1 = new int[2];
        this.n1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z10, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.n2) this.o1).actionBar;
        org.telegram.ui.ActionBar.v0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.l1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z11 = LocaleController.isRTL;
            float f7 = width2 + (dp * (z11 ? -1 : 1));
            if (z11) {
                s(f7 - x10, !this.n1);
            } else {
                s(f7 - width, !this.n1);
            }
            this.n1 = false;
        }
    }

    public final void s(float f7, boolean z10) {
        ValueAnimator valueAnimator = this.m1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.m1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.m1 = ofFloat;
        ofFloat.addUpdateListener(new b3(this, 5));
        this.m1.setInterpolator(org.telegram.ui.Components.qr.h);
        this.m1.setDuration(420L);
        this.m1.start();
    }
}
