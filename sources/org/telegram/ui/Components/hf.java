package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class hf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public hf(ChatActivityEnterView chatActivityEnterView, boolean z9, float f10, float f11, float f12, float f13) {
        this.f = chatActivityEnterView;
        this.a = z9;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z9 = this.a;
        if (z9) {
            int i7 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
        }
        cn0 cn0Var = chatActivityEnterView.p0;
        if (cn0Var != null) {
            cn0Var.setVisibility(z9 ? 0 : 8);
            chatActivityEnterView.p0.setAlpha(this.d);
            chatActivityEnterView.p0.setTranslationX(this.e);
            f10 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f10);
        chatActivityEnterView.G = f10;
        chatActivityEnterView.L1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        cn0 cn0Var = chatActivityEnterView.p0;
        if (cn0Var != null) {
            cn0Var.setVisibility(8);
        }
        chatActivityEnterView.Q0.setTranslationX(0.0f);
        chatActivityEnterView.G = 0.0f;
        chatActivityEnterView.L1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z9 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z9) {
            int i7 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
            chatActivityEnterView.p0.setVisibility(0);
        }
        cn0 cn0Var = chatActivityEnterView.p0;
        if (cn0Var != null) {
            cn0Var.setAlpha(this.b);
            chatActivityEnterView.p0.setTranslationX(this.c);
            f10 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f10);
        chatActivityEnterView.G = f10;
        chatActivityEnterView.L1();
        hi.y yVar = chatActivityEnterView.l0;
        if (yVar == null || yVar.getTag() != null) {
            return;
        }
        chatActivityEnterView.B0.clear();
    }
}
