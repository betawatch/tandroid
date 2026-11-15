package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q8 c;

    public /* synthetic */ o8(q8 q8Var, int i7, int i10) {
        this.a = i10;
        this.c = q8Var;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q8 q8Var = this.c;
                q8Var.r = 0;
                q8Var.setBackgroundColor(this.b);
                q8Var.invalidate();
                break;
            default:
                int i7 = this.b;
                q8 q8Var2 = this.c;
                q8Var2.setBackgroundColor(i7);
                q8Var2.r = 0;
                q8Var2.invalidate();
                break;
        }
    }
}
