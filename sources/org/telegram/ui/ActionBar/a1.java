package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ b1 e;

    public a1(b1 b1Var, boolean z10, int i10, int i11, int i12) {
        this.e = b1Var;
        this.a = z10;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f7 = this.a ? 1.0f : 0.0f;
        int i10 = this.b;
        int i11 = this.c;
        int f10 = i0.b.f(f7, i10, i11);
        b1 b1Var = this.e;
        b1Var.setTextColor(f10);
        b1Var.setIconColor(i0.b.f(f7, this.d, i11));
    }
}
