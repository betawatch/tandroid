package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z9) {
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
        ag agVar = chatActivityEnterView.O1;
        if (agVar != null && org.telegram.messenger.iz.O < 3) {
            ChatActivityEnterView chatActivityEnterView2 = agVar.b0;
            chatActivityEnterView2.e4 = true;
            chatActivityEnterView2.f4 = System.currentTimeMillis();
        }
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setAlpha(0.0f);
        }
        if (this.a) {
            ji0 ji0Var = chatActivityEnterView.h1;
            if (ji0Var != null) {
                ji0Var.setVisibility(8);
            }
            ud udVar = chatActivityEnterView.e1;
            if (udVar != null) {
                udVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
