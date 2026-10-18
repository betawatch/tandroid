package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class t8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v8 c;

    public /* synthetic */ t8(v8 v8Var, int i10, int i11) {
        this.a = i11;
        this.c = v8Var;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v8 v8Var = this.c;
                v8Var.r = 0;
                v8Var.setBackgroundColor(this.b);
                v8Var.invalidate();
                break;
            default:
                int i10 = this.b;
                v8 v8Var2 = this.c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.r = 0;
                v8Var2.invalidate();
                break;
        }
    }
}
