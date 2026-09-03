package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cl extends org.telegram.ui.Components.pk0 {
    public final int[] i1;
    public ValueAnimator j1;
    public boolean k1;
    public final /* synthetic */ zn l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(zn znVar, zn znVar2, Activity activity, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, activity, znVar2, f6Var);
        this.l1 = znVar;
        this.i1 = new int[2];
        this.k1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.k kVar;
        super.onLayout(z4, i10, i11, i12, i13);
        kVar = ((org.telegram.ui.ActionBar.p2) this.l1).actionBar;
        org.telegram.ui.ActionBar.w0 k10 = kVar.j(null).k(28);
        if (k10 != null) {
            int[] iArr = this.i1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            k10.getLocationInWindow(iArr);
            float width2 = (k10.getWidth() / 2.0f) + iArr[0];
            int dp = AndroidUtilities.dp(20.0f);
            boolean z10 = LocaleController.isRTL;
            float f10 = width2 + (dp * (z10 ? -1 : 1));
            if (z10) {
                s(f10 - x10, !this.k1);
            } else {
                s(f10 - width, !this.k1);
            }
            this.k1 = false;
        }
    }

    public final void s(float f10, boolean z4) {
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j1 = null;
        }
        if (!z4) {
            setBubbleOffset(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, f10);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new g3(this, 6));
        this.j1.setInterpolator(org.telegram.ui.Components.mr.h);
        this.j1.setDuration(420L);
        this.j1.start();
    }
}
