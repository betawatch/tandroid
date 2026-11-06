package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ p7(b8 b8Var, int i7) {
        this.a = i7;
        this.b = b8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.s2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c2 = false;
                break;
            case 1:
                b8 b8Var = this.b;
                b8Var.Y1.setVisibility(4);
                b8Var.Z1.setImageBitmap(null);
                b8Var.c2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
