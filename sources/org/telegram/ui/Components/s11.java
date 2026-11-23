package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s11(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fi.u2 u2Var = ((u11) this.b).f;
                u2Var.setScaleX(1.0f);
                u2Var.setScaleY(1.0f);
                u2Var.invalidate();
                break;
            case 1:
                y11 y11Var = (y11) this.b;
                y11Var.M = 1.0f;
                y11Var.h.invalidate();
                break;
            case 2:
                ((j41) this.b).M = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                n51 n51Var = (n51) this.b;
                if (n51Var.a.getTag() == null) {
                    n51Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                o51 o51Var = (o51) this.b;
                o51Var.b = 0.0f;
                o51Var.setTranslationY(0.0f);
                o51Var.a = null;
                break;
            case 6:
                j71 j71Var = (j71) this.b;
                j71Var.K = false;
                j71Var.setEnabled(true);
                i71 i71Var = j71Var.E;
                if (i71Var != null) {
                    i71Var.c(1.0f);
                }
                j71Var.invalidate();
                break;
            case 7:
                ((a81) this.b).f0 = null;
                break;
            default:
                ((g81) this.b).L = null;
                break;
        }
    }
}
