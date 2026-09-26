package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public vf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.t2)) {
            chatActivityEnterView.t2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.k1.setAlpha(1.0f);
        chatActivityEnterView.k1.setTranslationX(0.0f);
        sg sgVar = chatActivityEnterView.O1;
        if (sgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = sgVar.V;
            chatActivityEnterView2.e4 = true;
            chatActivityEnterView2.f4 = System.currentTimeMillis();
        }
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setAlpha(0.0f);
        }
        if (this.a) {
            rk0 rk0Var = chatActivityEnterView.h1;
            if (rk0Var != null) {
                rk0Var.setVisibility(8);
            }
            le leVar = chatActivityEnterView.e1;
            if (leVar != null) {
                leVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
