package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ff extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ff(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = chatActivityEnterView;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z10 = this.a;
        if (z10) {
            int i3 = ChatActivityEnterView.t5;
            chatActivityEnterView.X();
        }
        fn0 fn0Var = chatActivityEnterView.q0;
        if (fn0Var != null) {
            fn0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.q0.setAlpha(this.d);
            chatActivityEnterView.q0.setTranslationX(this.e);
            f10 = chatActivityEnterView.q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.K1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        fn0 fn0Var = chatActivityEnterView.q0;
        if (fn0Var != null) {
            fn0Var.setVisibility(8);
        }
        chatActivityEnterView.R0.setTranslationX(0.0f);
        chatActivityEnterView.H = 0.0f;
        chatActivityEnterView.K1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i3 = ChatActivityEnterView.t5;
            chatActivityEnterView.X();
            chatActivityEnterView.q0.setVisibility(0);
        }
        fn0 fn0Var = chatActivityEnterView.q0;
        if (fn0Var != null) {
            fn0Var.setAlpha(this.b);
            chatActivityEnterView.q0.setTranslationX(this.c);
            f10 = chatActivityEnterView.q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.K1();
        ii.a0 a0Var = chatActivityEnterView.m0;
        if (a0Var == null || a0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.C0.clear();
    }
}
