package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ yf(ChatActivityEnterView chatActivityEnterView, int i9, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i9 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i9 == 0) {
                    chatActivityEnterView.v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                chatActivityEnterView.C1.setTranslationY(0.0f);
                chatActivityEnterView.C1.setVisibility(8);
                chatActivityEnterView.G3.unlock();
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                xu0 xu0Var = chatActivityEnterView2.h1;
                chatActivityEnterView2.v3 = false;
                chatActivityEnterView2.w3 = null;
                uf ufVar = chatActivityEnterView2.Q0;
                if (ufVar != null) {
                    if (chatActivityEnterView2.Y4 == null) {
                        ufVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.Q0.setLayerType(0, null);
                }
                if (xu0Var != null) {
                    xu0Var.requestLayout();
                    xu0Var.setForeground(null);
                    xu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.u2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.a2, true, true);
                }
                yd ydVar = chatActivityEnterView2.n0;
                if (ydVar != null) {
                    ydVar.run();
                    chatActivityEnterView2.n0 = null;
                }
                chatActivityEnterView2.G3.unlock();
                break;
        }
    }
}
