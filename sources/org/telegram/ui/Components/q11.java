package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u11 u11Var = (u11) this.b;
                if (u11Var.J == animator) {
                    u11Var.J = null;
                    break;
                }
                break;
            case 1:
                ih.c cVar = ((k21) this.b).f;
                cVar.setScaleX(1.0f);
                cVar.setScaleY(1.0f);
                cVar.invalidate();
                break;
            case 2:
                o21 o21Var = (o21) this.b;
                o21Var.L = 1.0f;
                o21Var.h.invalidate();
                break;
            case 3:
                ((x41) this.b).L = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                c61 c61Var = (c61) this.b;
                if (c61Var.a.getTag() == null) {
                    c61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                d61 d61Var = (d61) this.b;
                d61Var.b = 0.0f;
                d61Var.setTranslationY(0.0f);
                d61Var.a = null;
                break;
            case 7:
                w71 w71Var = (w71) this.b;
                w71Var.J = false;
                w71Var.setEnabled(true);
                v71 v71Var = w71Var.D;
                if (v71Var != null) {
                    ((n2.u) v71Var).J(1.0f);
                }
                w71Var.invalidate();
                break;
            case 8:
                ((n81) this.b).e0 = null;
                break;
            default:
                ((t81) this.b).K = null;
                break;
        }
    }
}
