package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.pk0 {
    public final int[] l1;
    public ValueAnimator m1;
    public boolean n1;
    public final /* synthetic */ eo o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(eo eoVar, eo eoVar2, Activity activity, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(3, i10, activity, eoVar2, f6Var);
        this.o1 = eoVar;
        this.l1 = new int[2];
        this.n1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        super.onLayout(z10, i10, i11, i12, i13);
        lVar = ((org.telegram.ui.ActionBar.p2) this.o1).actionBar;
        org.telegram.ui.ActionBar.w0 k10 = lVar.j(null).k(28);
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
        ofFloat.addUpdateListener(new d3(this, 6));
        this.m1.setInterpolator(org.telegram.ui.Components.wr.h);
        this.m1.setDuration(420L);
        this.m1.start();
    }
}
