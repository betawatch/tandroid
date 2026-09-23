package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        if (animator.equals(chatActivityEnterView.s2)) {
            chatActivityEnterView.s2 = null;
        }
        chatActivityEnterView.y0();
        chatActivityEnterView.j1.setAlpha(1.0f);
        chatActivityEnterView.j1.setTranslationX(0.0f);
        rg rgVar = chatActivityEnterView.N1;
        if (rgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = rgVar.V;
            chatActivityEnterView2.d4 = true;
            chatActivityEnterView2.e4 = System.currentTimeMillis();
        }
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setAlpha(0.0f);
        }
        if (this.a) {
            hk0 hk0Var = chatActivityEnterView.h1;
            if (hk0Var != null) {
                hk0Var.setVisibility(8);
            }
            ke keVar = chatActivityEnterView.e1;
            if (keVar != null) {
                keVar.setVisibility(8);
            }
            chatActivityEnterView.y0();
        }
    }
}
