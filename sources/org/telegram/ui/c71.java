package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c71 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ u71 e;

    public c71(u71 u71Var, boolean z9, int i7, int i10, boolean z10) {
        this.e = u71Var;
        this.a = z9;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u71 u71Var = this.e;
        FrameLayout[] frameLayoutArr = u71Var.M0;
        u71Var.s1 = null;
        int i7 = this.c;
        int i10 = this.b;
        boolean z9 = this.a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = u71Var.b;
        if (i11 == 1 || i11 == 2) {
            u71Var.K0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i7 == 1) {
            frameLayoutArr[i10].setAlpha(0.0f);
        }
    }
}
