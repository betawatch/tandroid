package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g11(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                di.b3 b3Var = ((i11) this.b).f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                break;
            case 1:
                m11 m11Var = (m11) this.b;
                m11Var.L = 1.0f;
                m11Var.h.invalidate();
                break;
            case 2:
                ((u31) this.b).L = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                z41 z41Var = (z41) this.b;
                if (z41Var.a.getTag() == null) {
                    z41Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                a51 a51Var = (a51) this.b;
                a51Var.b = 0.0f;
                a51Var.setTranslationY(0.0f);
                a51Var.a = null;
                break;
            case 6:
                v61 v61Var = (v61) this.b;
                v61Var.J = false;
                v61Var.setEnabled(true);
                u61 u61Var = v61Var.D;
                if (u61Var != null) {
                    ((n) u61Var).y(1.0f);
                }
                v61Var.invalidate();
                break;
            case 7:
                ((m71) this.b).e0 = null;
                break;
            default:
                ((s71) this.b).K = null;
                break;
        }
    }
}
