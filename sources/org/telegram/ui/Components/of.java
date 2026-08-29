package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class of extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public of(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.o2)) {
            chatActivityEnterView.o2 = null;
        }
        chatActivityEnterView.x0();
        chatActivityEnterView.f1.setAlpha(1.0f);
        chatActivityEnterView.f1.setTranslationX(0.0f);
        lg lgVar = chatActivityEnterView.J1;
        if (lgVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = lgVar.R;
            chatActivityEnterView2.Z3 = true;
            chatActivityEnterView2.a4 = System.currentTimeMillis();
        }
        jf jfVar = chatActivityEnterView.A0;
        if (jfVar != null) {
            jfVar.setAlpha(0.0f);
        }
        if (this.a) {
            gk0 gk0Var = chatActivityEnterView.d1;
            if (gk0Var != null) {
                gk0Var.setVisibility(8);
            }
            de deVar = chatActivityEnterView.a1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
