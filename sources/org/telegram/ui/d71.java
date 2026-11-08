package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d71 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ v71 e;

    public d71(v71 v71Var, boolean z9, int i7, int i10, boolean z10) {
        this.e = v71Var;
        this.a = z9;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.e;
        FrameLayout[] frameLayoutArr = v71Var.M0;
        v71Var.s1 = null;
        int i7 = this.c;
        int i10 = this.b;
        boolean z9 = this.a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = v71Var.b;
        if (i11 == 1 || i11 == 2) {
            v71Var.K0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i7 == 1) {
            frameLayoutArr[i10].setAlpha(0.0f);
        }
    }
}
