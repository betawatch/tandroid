package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s8 c;

    public /* synthetic */ q8(s8 s8Var, int i7, int i10) {
        this.a = i10;
        this.c = s8Var;
        this.b = i7;
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
                int i7 = this.b;
                s8 s8Var2 = this.c;
                s8Var2.setBackgroundColor(i7);
                s8Var2.r = 0;
                s8Var2.invalidate();
                break;
        }
    }
}
