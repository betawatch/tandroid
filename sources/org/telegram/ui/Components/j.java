package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        if (animator.equals(chatActivityEnterView.i3)) {
            byte b = this.a;
            if (b != 3 && chatActivityEnterView.F0 != null && !hl.A1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.F();
            if (b != 3) {
                l lVar = chatActivityEnterView.D2;
                if (lVar != null) {
                    lVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.h();
                }
            }
        }
    }
}
