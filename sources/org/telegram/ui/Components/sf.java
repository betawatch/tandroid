package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        u71 u71Var = chatActivityEnterView.f1;
        if (u71Var != null) {
            u71Var.setVisibility(8);
        }
        hk0 hk0Var = chatActivityEnterView.h1;
        if (hk0Var != null) {
            hk0Var.setVisibility(8);
        }
        chatActivityEnterView.o4 = 0.0f;
        chatActivityEnterView.y0();
        chatActivityEnterView.q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
