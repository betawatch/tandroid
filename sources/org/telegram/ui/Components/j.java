package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(ChatActivityEnterView chatActivityEnterView, int i) {
        this.b = chatActivityEnterView;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.j3)) {
            byte b = this.a;
            if (b != 3 && chatActivityEnterView.F0 != null && !gm.A1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.C();
            if (b != 3) {
                l lVar = chatActivityEnterView.E2;
                if (lVar != null) {
                    lVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
