package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ h3(j3 j3Var, int i10) {
        this.a = i10;
        this.b = j3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j3 j3Var = this.b;
                j3Var.r = 0;
                j3Var.invalidate();
                break;
            default:
                j3 j3Var2 = this.b;
                j3Var2.s = 0;
                j3Var2.invalidate();
                break;
        }
    }
}
