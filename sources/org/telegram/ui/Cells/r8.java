package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ t8 c;

    public /* synthetic */ r8(t8 t8Var, int i9, int i10) {
        this.a = i10;
        this.c = t8Var;
        this.b = i9;
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
                int i9 = this.b;
                t8 t8Var2 = this.c;
                t8Var2.setBackgroundColor(i9);
                t8Var2.r = 0;
                t8Var2.invalidate();
                break;
        }
    }
}
