package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class p8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r8 c;

    public /* synthetic */ p8(r8 r8Var, int i7, int i10) {
        this.a = i10;
        this.c = r8Var;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r8 r8Var = this.c;
                r8Var.r = 0;
                r8Var.setBackgroundColor(this.b);
                r8Var.invalidate();
                break;
            default:
                int i7 = this.b;
                r8 r8Var2 = this.c;
                r8Var2.setBackgroundColor(i7);
                r8Var2.r = 0;
                r8Var2.invalidate();
                break;
        }
    }
}
