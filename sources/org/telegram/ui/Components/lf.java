package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z4) {
        this.b = chatActivityEnterView;
        this.a = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.p2)) {
            chatActivityEnterView.p2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.g1.setAlpha(1.0f);
        chatActivityEnterView.g1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.K1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.S;
            chatActivityEnterView2.a4 = true;
            chatActivityEnterView2.b4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.a) {
            rk0 rk0Var = chatActivityEnterView.e1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.b1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
