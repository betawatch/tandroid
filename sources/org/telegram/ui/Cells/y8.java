package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a9 c;

    public /* synthetic */ y8(a9 a9Var, int i10, int i11) {
        this.a = i11;
        this.c = a9Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a9 a9Var = this.c;
                a9Var.r = 0;
                a9Var.setBackgroundColor(this.b);
                a9Var.invalidate();
                break;
            default:
                int i10 = this.b;
                a9 a9Var2 = this.c;
                a9Var2.setBackgroundColor(i10);
                a9Var2.r = 0;
                a9Var2.invalidate();
                break;
        }
    }
}
