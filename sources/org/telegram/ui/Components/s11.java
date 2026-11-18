package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                ((h41) this.b).M = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                l51 l51Var = (l51) this.b;
                if (l51Var.a.getTag() == null) {
                    l51Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                m51 m51Var = (m51) this.b;
                m51Var.b = 0.0f;
                m51Var.setTranslationY(0.0f);
                m51Var.a = null;
                break;
            case 6:
                f71 f71Var = (f71) this.b;
                f71Var.K = false;
                f71Var.setEnabled(true);
                e71 e71Var = f71Var.E;
                if (e71Var != null) {
                    e71Var.g(1.0f);
                }
                f71Var.invalidate();
                break;
            case 7:
                ((w71) this.b).f0 = null;
                break;
            default:
                ((c81) this.b).L = null;
                break;
        }
    }
}
