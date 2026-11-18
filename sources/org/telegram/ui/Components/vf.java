package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public vf(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.b = chatActivityEnterView;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.h3)) {
            int i7 = this.a;
            if (i7 != 3 && chatActivityEnterView.F0 != null && !org.telegram.messenger.g0.C1()) {
                chatActivityEnterView.F0.requestFocus();
            }
            chatActivityEnterView.F();
            if (i7 != 3) {
                pg pgVar = chatActivityEnterView.C2;
                if (pgVar != null) {
                    pgVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.g();
                }
            }
        }
    }
}
