package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public gf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
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
        eg egVar = chatActivityEnterView.J1;
        if (egVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = egVar.R;
            chatActivityEnterView2.Z3 = true;
            chatActivityEnterView2.a4 = System.currentTimeMillis();
        }
        bf bfVar = chatActivityEnterView.A0;
        if (bfVar != null) {
            bfVar.setAlpha(0.0f);
        }
        if (this.a) {
            xj0 xj0Var = chatActivityEnterView.d1;
            if (xj0Var != null) {
                xj0Var.setVisibility(8);
            }
            wd wdVar = chatActivityEnterView.a1;
            if (wdVar != null) {
                wdVar.setVisibility(8);
            }
            chatActivityEnterView.x0();
        }
    }
}
