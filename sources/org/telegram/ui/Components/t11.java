package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t11(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fi.u2 u2Var = ((v11) this.b).f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                break;
            case 1:
                z11 z11Var = (z11) this.b;
                z11Var.M = 1.0f;
                z11Var.h.invalidate();
                break;
            case 2:
                ((k41) this.b).M = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                o51 o51Var = (o51) this.b;
                if (o51Var.a.getTag() == null) {
                    o51Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                p51 p51Var = (p51) this.b;
                p51Var.b = 0.0f;
                p51Var.setTranslationY(0.0f);
                p51Var.a = null;
                break;
            case 6:
                i71 i71Var = (i71) this.b;
                i71Var.K = false;
                i71Var.setEnabled(true);
                h71 h71Var = i71Var.E;
                if (h71Var != null) {
                    h71Var.g(1.0f);
                }
                i71Var.invalidate();
                break;
            case 7:
                ((z71) this.b).f0 = null;
                break;
            default:
                ((f81) this.b).L = null;
                break;
        }
    }
}
