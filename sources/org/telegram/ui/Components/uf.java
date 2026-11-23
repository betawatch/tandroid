package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public uf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.j3)) {
            chatActivityEnterView.j3 = null;
        }
        chatActivityEnterView.X0();
        chatActivityEnterView.a2.setAlpha(1.0f);
        chatActivityEnterView.a2.setTranslationX(0.0f);
        qg qgVar = chatActivityEnterView.E2;
        if (qgVar != null && org.telegram.messenger.bz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.Q0;
            chatActivityEnterView2.U4 = true;
            chatActivityEnterView2.V4 = System.currentTimeMillis();
        }
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar != null) {
            hfVar.setAlpha(chatActivityEnterView.i0() ? 1.0f : 0.0f);
        }
        if (this.a) {
            zi0 zi0Var = chatActivityEnterView.i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            ee eeVar = chatActivityEnterView.f1;
            if (eeVar != null) {
                eeVar.setVisibility(8);
            }
            chatActivityEnterView.X0();
        }
    }
}
