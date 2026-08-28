package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class of extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public of(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.b = chatActivityEnterView;
        this.a = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.o2)) {
            int i9 = this.a;
            if (i9 != 3 && chatActivityEnterView.A0 != null && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                chatActivityEnterView.A0.requestFocus();
            }
            chatActivityEnterView.z();
            if (i9 != 3) {
                ig igVar = chatActivityEnterView.J1;
                if (igVar != null) {
                    igVar.setVisibility(8);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                if (recordCircle != null) {
                    recordCircle.d();
                }
            }
        }
    }
}
