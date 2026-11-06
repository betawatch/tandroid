package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j01(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n01 n01Var = (n01) this.b;
                if (n01Var.J == animator) {
                    n01Var.J = null;
                    break;
                }
                break;
            case 1:
                di.b3 b3Var = ((b11) this.b).f;
                b3Var.setScaleX(1.0f);
                b3Var.setScaleY(1.0f);
                b3Var.invalidate();
                break;
            case 2:
                f11 f11Var = (f11) this.b;
                f11Var.L = 1.0f;
                f11Var.h.invalidate();
                break;
            case 3:
                ((n31) this.b).L = null;
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
                u41 u41Var = (u41) this.b;
                u41Var.b = 0.0f;
                u41Var.setTranslationY(0.0f);
                u41Var.a = null;
                break;
            case 7:
                o61 o61Var = (o61) this.b;
                o61Var.J = false;
                o61Var.setEnabled(true);
                n61 n61Var = o61Var.D;
                if (n61Var != null) {
                    ((n) n61Var).y(1.0f);
                }
                o61Var.invalidate();
                break;
            case 8:
                ((f71) this.b).e0 = null;
                break;
            default:
                ((l71) this.b).K = null;
                break;
        }
    }
}
