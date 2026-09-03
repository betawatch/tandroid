package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class of extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public of(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.b = chatActivityEnterView;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.p2)) {
            int i10 = this.a;
            if (i10 != 3 && chatActivityEnterView.B0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.B0.requestFocus();
            }
            chatActivityEnterView.A();
            if (i10 != 3) {
                ig igVar = chatActivityEnterView.K1;
                if (igVar != null) {
                    igVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
