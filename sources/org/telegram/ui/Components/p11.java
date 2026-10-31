package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t11 t11Var = (t11) this.b;
                if (t11Var.I == animator) {
                    t11Var.I = null;
                    break;
                }
                break;
            case 1:
                ih.c cVar = ((j21) this.b).f;
                cVar.setScaleX(1.0f);
                cVar.setScaleY(1.0f);
                cVar.invalidate();
                break;
            case 2:
                n21 n21Var = (n21) this.b;
                n21Var.L = 1.0f;
                n21Var.h.invalidate();
                break;
            case 3:
                ((w41) this.b).L = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                b61 b61Var = (b61) this.b;
                if (b61Var.a.getTag() == null) {
                    b61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                c61 c61Var = (c61) this.b;
                c61Var.b = 0.0f;
                c61Var.setTranslationY(0.0f);
                c61Var.a = null;
                break;
            case 7:
                v71 v71Var = (v71) this.b;
                v71Var.J = false;
                v71Var.setEnabled(true);
                u71 u71Var = v71Var.D;
                if (u71Var != null) {
                    ((n2.u) u71Var).J(1.0f);
                }
                v71Var.invalidate();
                break;
            case 8:
                ((m81) this.b).e0 = null;
                break;
            default:
                ((s81) this.b).K = null;
                break;
        }
    }
}
