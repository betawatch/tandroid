package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ z0 e;

    public y0(z0 z0Var, boolean z10, int i7, int i10, int i11) {
        this.e = z0Var;
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
        z0 z0Var = this.e;
        z0Var.setTextColor(f11);
        z0Var.setIconColor(i0.a.f(f10, this.d, i10));
    }
}
