package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s8 c;

    public /* synthetic */ q8(s8 s8Var, int i10, int i11) {
        this.a = i11;
        this.c = s8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s8 s8Var = this.c;
                s8Var.r = 0;
                s8Var.setBackgroundColor(this.b);
                s8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                s8 s8Var2 = this.c;
                s8Var2.setBackgroundColor(i10);
                s8Var2.r = 0;
                s8Var2.invalidate();
                break;
        }
    }
}
