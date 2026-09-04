package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class u8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ w8 c;

    public /* synthetic */ u8(w8 w8Var, int i10, int i11) {
        this.a = i11;
        this.c = w8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w8 w8Var = this.c;
                w8Var.r = 0;
                w8Var.setBackgroundColor(this.b);
                w8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                w8 w8Var2 = this.c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.r = 0;
                w8Var2.invalidate();
                break;
        }
    }
}
