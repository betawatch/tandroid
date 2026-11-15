package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;

    public /* synthetic */ n10(s10 s10Var, int i7) {
        this.a = i7;
        this.b = s10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s10 s10Var = this.b;
                s10Var.b.setVisibility(8);
                s10Var.F = false;
                s10Var.G = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
