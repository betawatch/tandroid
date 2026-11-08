package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f11(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                di.b3 b3Var = ((h11) this.b).f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                break;
            case 1:
                l11 l11Var = (l11) this.b;
                l11Var.L = 1.0f;
                l11Var.h.invalidate();
                break;
            case 2:
                ((t31) this.b).L = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                y41 y41Var = (y41) this.b;
                if (y41Var.a.getTag() == null) {
                    y41Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                z41 z41Var = (z41) this.b;
                z41Var.b = 0.0f;
                z41Var.setTranslationY(0.0f);
                z41Var.a = null;
                break;
            case 6:
                u61 u61Var = (u61) this.b;
                u61Var.J = false;
                u61Var.setEnabled(true);
                t61 t61Var = u61Var.D;
                if (t61Var != null) {
                    ((n) t61Var).y(1.0f);
                }
                u61Var.invalidate();
                break;
            case 7:
                ((l71) this.b).e0 = null;
                break;
            default:
                ((r71) this.b).K = null;
                break;
        }
    }
}
