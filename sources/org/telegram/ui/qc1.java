package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ jd1 e;

    public qc1(jd1 jd1Var, boolean z4, int i10, int i11, boolean z10) {
        this.e = jd1Var;
        this.a = z4;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jd1 jd1Var = this.e;
        FrameLayout[] frameLayoutArr = jd1Var.I0;
        jd1Var.o1 = null;
        int i10 = this.c;
        int i11 = this.b;
        boolean z4 = this.a;
        if (z4 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = jd1Var.b;
        if (i12 == 1 || i12 == 2) {
            jd1Var.G0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i10 == 1) {
            frameLayoutArr[i11].setAlpha(0.0f);
        }
    }
}
