package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g1 e;

    public f1(g1 g1Var, boolean z4, int i10, int i11, int i12) {
        this.e = g1Var;
        this.a = z4;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = this.a ? 1.0f : 0.0f;
        int i10 = this.b;
        int i11 = this.c;
        int d = i0.a.d(f10, i10, i11);
        g1 g1Var = this.e;
        g1Var.setTextColor(d);
        g1Var.setIconColor(i0.a.d(f10, this.d, i11));
    }
}
