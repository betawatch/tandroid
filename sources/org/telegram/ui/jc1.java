package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cd1 e;

    public jc1(cd1 cd1Var, boolean z4, int i10, int i11, boolean z10) {
        this.e = cd1Var;
        this.a = z4;
        this.b = i10;
        this.c = i11;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cd1 cd1Var = this.e;
        FrameLayout[] frameLayoutArr = cd1Var.I0;
        cd1Var.o1 = null;
        int i10 = this.c;
        int i11 = this.b;
        boolean z4 = this.a;
        if (z4 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = cd1Var.b;
        if (i12 == 1 || i12 == 2) {
            cd1Var.G0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i10 == 1) {
            frameLayoutArr[i11].setAlpha(0.0f);
        }
    }
}
