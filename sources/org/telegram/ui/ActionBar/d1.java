package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ e1 e;

    public d1(e1 e1Var, boolean z10, int i10, int i11, int i12) {
        this.e = e1Var;
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
        e1 e1Var = this.e;
        e1Var.setTextColor(f10);
        e1Var.setIconColor(i0.a.f(f7, this.d, i11));
    }
}
