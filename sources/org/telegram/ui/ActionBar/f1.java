package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g1 e;

    public f1(g1 g1Var, boolean z10, int i9, int i10, int i11) {
        this.e = g1Var;
        this.a = z10;
        this.b = i9;
        this.c = i10;
        this.d = i11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = this.a ? 1.0f : 0.0f;
        int i9 = this.b;
        int i10 = this.c;
        int d = i0.a.d(f10, i9, i10);
        g1 g1Var = this.e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f10, this.d, i10));
    }
}
