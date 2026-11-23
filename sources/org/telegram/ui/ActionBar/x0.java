package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ y0 e;

    public x0(y0 y0Var, boolean z10, int i7, int i10, int i11) {
        this.e = y0Var;
        this.a = z10;
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
        y0 y0Var = this.e;
        y0Var.setTextColor(f11);
        y0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
