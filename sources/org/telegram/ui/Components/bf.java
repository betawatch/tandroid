package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public bf(ChatActivityEnterView chatActivityEnterView, boolean z9) {
        this.b = chatActivityEnterView;
        this.a = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.t2)) {
            chatActivityEnterView.t2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.k1.setAlpha(1.0f);
        chatActivityEnterView.k1.setTranslationX(0.0f);
        zf zfVar = chatActivityEnterView.O1;
        if (zfVar != null && org.telegram.messenger.iz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = zfVar.b0;
            chatActivityEnterView2.e4 = true;
            chatActivityEnterView2.f4 = System.currentTimeMillis();
        }
        we weVar = chatActivityEnterView.E0;
        if (weVar != null) {
            weVar.setAlpha(0.0f);
        }
        if (this.a) {
            ji0 ji0Var = chatActivityEnterView.h1;
            if (ji0Var != null) {
                ji0Var.setVisibility(8);
            }
            td tdVar = chatActivityEnterView.e1;
            if (tdVar != null) {
                tdVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
