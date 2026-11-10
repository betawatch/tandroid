package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ z0 e;

    public y0(z0 z0Var, boolean z9, int i7, int i10, int i11) {
        this.e = z0Var;
        this.a = z9;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = this.a ? 1.0f : 0.0f;
        int i7 = this.b;
        int i10 = this.c;
        int f11 = i0.a.f(f10, i7, i10);
        z0 z0Var = this.e;
        z0Var.setTextColor(f11);
        z0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
