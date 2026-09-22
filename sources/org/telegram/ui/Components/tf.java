package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
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
        qg qgVar = chatActivityEnterView.N1;
        if (qgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = qgVar.V;
            chatActivityEnterView2.d4 = true;
            chatActivityEnterView2.e4 = System.currentTimeMillis();
        }
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setAlpha(0.0f);
        }
        if (this.a) {
            gk0 gk0Var = chatActivityEnterView.h1;
            if (gk0Var != null) {
                gk0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.y0();
        }
    }
}
