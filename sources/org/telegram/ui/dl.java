package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dl extends org.telegram.ui.Components.nj0 {
    public final int[] m1;
    public ValueAnimator n1;
    public boolean o1;
    public final /* synthetic */ un p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(un unVar, un unVar2, Activity activity, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(3, i10, activity, unVar2, p6Var);
        this.p1 = unVar;
        this.m1 = new int[2];
        this.o1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        super.onLayout(z10, i10, i11, i12, i13);
        lVar = ((org.telegram.ui.ActionBar.k2) this.p1).actionBar;
        org.telegram.ui.ActionBar.t0 j10 = lVar.m(null).j(28);
        if (j10 != null) {
            int[] iArr = this.m1;
            getLocationInWindow(iArr);
            float x10 = getX();
            float width = getWidth() + x10;
            j10.getLocationInWindow(iArr);
            float width2 = (j10.getWidth() / 2.0f) + iArr[0];
            int L = org.telegram.messenger.i0.L(20.0f);
            boolean z11 = org.telegram.messenger.dd.X;
            float f7 = width2 + (L * (z11 ? -1 : 1));
            if (z11) {
                s(!this.o1, f7 - x10);
            } else {
                s(!this.o1, f7 - width);
            }
            this.o1 = false;
        }
    }

    public final void s(boolean z10, float f7) {
        ValueAnimator valueAnimator = this.n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n1 = null;
        }
        if (!z10) {
            setBubbleOffset(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U0, f7);
        this.n1 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 5));
        this.n1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.n1.setDuration(420L);
        this.n1.start();
    }
}
