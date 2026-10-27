package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd1 b;

    public /* synthetic */ nd1(rd1 rd1Var, int i10) {
        this.a = i10;
        this.b = rd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rd1 rd1Var = this.b;
                rd1Var.v = 0;
                rd1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
