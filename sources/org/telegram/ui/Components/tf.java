package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
            hk0 hk0Var = chatActivityEnterView.h1;
            if (hk0Var != null) {
                hk0Var.setVisibility(8);
            }
            ie ieVar = chatActivityEnterView.e1;
            if (ieVar != null) {
                ieVar.setVisibility(8);
            }
            chatActivityEnterView.y0();
        }
    }
}
