package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i11(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fi.w2 w2Var = ((k11) this.b).f;
                w2Var.setScaleX(1.0f);
                w2Var.setScaleY(1.0f);
                w2Var.invalidate();
                break;
            case 1:
                o11 o11Var = (o11) this.b;
                o11Var.M = 1.0f;
                o11Var.h.invalidate();
                break;
            case 2:
                ((x31) this.b).M = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                b51 b51Var = (b51) this.b;
                if (b51Var.a.getTag() == null) {
                    b51Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                c51 c51Var = (c51) this.b;
                c51Var.b = 0.0f;
                c51Var.setTranslationY(0.0f);
                c51Var.a = null;
                break;
            case 6:
                v61 v61Var = (v61) this.b;
                v61Var.K = false;
                v61Var.setEnabled(true);
                u61 u61Var = v61Var.E;
                if (u61Var != null) {
                    ((cf) u61Var).q(1.0f);
                }
                v61Var.invalidate();
                break;
            case 7:
                ((m71) this.b).f0 = null;
                break;
            default:
                ((s71) this.b).L = null;
                break;
        }
    }
}
