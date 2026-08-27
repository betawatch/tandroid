package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ uf(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.a = i11;
        this.c = chatActivityEnterView;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i10 == 0) {
                    chatActivityEnterView.v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                chatActivityEnterView.C1.setTranslationY(0.0f);
                chatActivityEnterView.C1.setVisibility(8);
                chatActivityEnterView.G3.unlock();
                ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.n(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                zu0 zu0Var = chatActivityEnterView2.h1;
                chatActivityEnterView2.v3 = false;
                chatActivityEnterView2.w3 = null;
                qf qfVar = chatActivityEnterView2.Q0;
                if (qfVar != null) {
                    if (chatActivityEnterView2.Y4 == null) {
                        qfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.Q0.setLayerType(0, null);
                }
                if (zu0Var != null) {
                    zu0Var.requestLayout();
                    zu0Var.setForeground(null);
                    zu0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.u2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.s1(0, chatActivityEnterView2.a2, true, true);
                }
                ud udVar = chatActivityEnterView2.n0;
                if (udVar != null) {
                    udVar.run();
                    chatActivityEnterView2.n0 = null;
                }
                chatActivityEnterView2.G3.unlock();
                break;
        }
    }
}
