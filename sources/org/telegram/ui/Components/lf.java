package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ChatActivityEnterView b;

    public lf(ChatActivityEnterView chatActivityEnterView, boolean z10) {
        this.b = chatActivityEnterView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (animator.equals(chatActivityEnterView.o2)) {
            chatActivityEnterView.o2 = null;
        }
        chatActivityEnterView.w0();
        chatActivityEnterView.f1.setAlpha(1.0f);
        chatActivityEnterView.f1.setTranslationX(0.0f);
        ig igVar = chatActivityEnterView.J1;
        if (igVar != null && SharedConfig.lockRecordAudioVideoHint < 3) {
            ChatActivityEnterView chatActivityEnterView2 = igVar.R;
            chatActivityEnterView2.Z3 = true;
            chatActivityEnterView2.a4 = System.currentTimeMillis();
        }
        ff ffVar = chatActivityEnterView.A0;
        if (ffVar != null) {
            ffVar.setAlpha(0.0f);
        }
        if (this.a) {
            vj0 vj0Var = chatActivityEnterView.d1;
            if (vj0Var != null) {
                vj0Var.setVisibility(8);
            }
            ae aeVar = chatActivityEnterView.a1;
            if (aeVar != null) {
                aeVar.setVisibility(8);
            }
            chatActivityEnterView.w0();
        }
    }
}
