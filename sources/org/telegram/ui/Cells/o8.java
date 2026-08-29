package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ q8 c;

    public /* synthetic */ o8(q8 q8Var, int i10, int i11) {
        this.a = i11;
        this.c = q8Var;
        this.b = i10;
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
                int i10 = this.b;
                q8 q8Var2 = this.c;
                q8Var2.setBackgroundColor(i10);
                q8Var2.r = 0;
                q8Var2.invalidate();
                break;
        }
    }
}
