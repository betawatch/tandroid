package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j01(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n01 n01Var = (n01) this.b;
                if (n01Var.K == animator) {
                    n01Var.K = null;
                    break;
                }
                break;
            case 1:
                ei.e3 e3Var = ((b11) this.b).f;
                e3Var.setScaleX(1.0f);
                e3Var.setScaleY(1.0f);
                e3Var.invalidate();
                break;
            case 2:
                f11 f11Var = (f11) this.b;
                f11Var.M = 1.0f;
                f11Var.h.invalidate();
                break;
            case 3:
                ((n31) this.b).M = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                s41 s41Var = (s41) this.b;
                if (s41Var.a.getTag() == null) {
                    s41Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                t41 t41Var = (t41) this.b;
                t41Var.b = 0.0f;
                t41Var.setTranslationY(0.0f);
                t41Var.a = null;
                break;
            case 7:
                m61 m61Var = (m61) this.b;
                m61Var.K = false;
                m61Var.setEnabled(true);
                l61 l61Var = m61Var.E;
                if (l61Var != null) {
                    ((y00) l61Var).x(1.0f);
                }
                m61Var.invalidate();
                break;
            case 8:
                ((d71) this.b).f0 = null;
                break;
            default:
                ((j71) this.b).L = null;
                break;
        }
    }
}
