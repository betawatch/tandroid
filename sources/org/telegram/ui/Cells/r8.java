package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t8 c;

    public /* synthetic */ r8(t8 t8Var, int i10, int i11) {
        this.a = i11;
        this.c = t8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t8 t8Var = this.c;
                t8Var.r = 0;
                t8Var.setBackgroundColor(this.b);
                t8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                t8 t8Var2 = this.c;
                t8Var2.setBackgroundColor(i10);
                t8Var2.r = 0;
                t8Var2.invalidate();
                break;
        }
    }
}
