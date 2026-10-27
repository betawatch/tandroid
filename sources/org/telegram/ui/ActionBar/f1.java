package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g1 e;

    public f1(g1 g1Var, boolean z10, int i10, int i11, int i12) {
        this.e = g1Var;
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
        int f10 = i0.a.f(f7, i10, i11);
        g1 g1Var = this.e;
        g1Var.setTextColor(f10);
        g1Var.setIconColor(i0.a.f(f7, this.d, i11));
    }
}
