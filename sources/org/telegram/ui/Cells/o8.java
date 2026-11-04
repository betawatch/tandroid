package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q8 c;

    public /* synthetic */ o8(q8 q8Var, int i3, int i10) {
        this.a = i10;
        this.c = q8Var;
        this.b = i3;
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
                int i3 = this.b;
                q8 q8Var2 = this.c;
                q8Var2.setBackgroundColor(i3);
                q8Var2.r = 0;
                q8Var2.invalidate();
                break;
        }
    }
}
