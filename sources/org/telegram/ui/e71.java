package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e71 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ x71 e;

    public e71(x71 x71Var, boolean z10, int i7, int i10, boolean z11) {
        this.e = x71Var;
        this.a = z10;
        this.b = i7;
        this.c = i10;
        this.d = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.e;
        FrameLayout[] frameLayoutArr = x71Var.N0;
        x71Var.t1 = null;
        int i7 = this.c;
        int i10 = this.b;
        boolean z10 = this.a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = x71Var.b;
        if (i11 == 1 || i11 == 2) {
            x71Var.L0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i7 == 1) {
            frameLayoutArr[i10].setAlpha(0.0f);
        }
    }
}
