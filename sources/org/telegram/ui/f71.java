package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f71 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ x71 e;

    public f71(x71 x71Var, boolean z9, int i7, int i10, boolean z10) {
        this.e = x71Var;
        this.a = z9;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.e;
        FrameLayout[] frameLayoutArr = x71Var.M0;
        x71Var.s1 = null;
        int i7 = this.c;
        int i10 = this.b;
        boolean z9 = this.a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = x71Var.b;
        if (i11 == 1 || i11 == 2) {
            x71Var.K0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i7 == 1) {
            frameLayoutArr[i10].setAlpha(0.0f);
        }
    }
}
