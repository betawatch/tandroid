package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bg extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public bg(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = chatActivityEnterView;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f7;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z10 = this.a;
        if (z10) {
            int i10 = ChatActivityEnterView.m5;
            chatActivityEnterView.b0();
        }
        hp0 hp0Var = chatActivityEnterView.p0;
        if (hp0Var != null) {
            hp0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.p0.setAlpha(this.d);
            chatActivityEnterView.p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        hp0 hp0Var = chatActivityEnterView.p0;
        if (hp0Var != null) {
            hp0Var.setVisibility(8);
        }
        chatActivityEnterView.Q0.setTranslationX(0.0f);
        chatActivityEnterView.G = 0.0f;
        chatActivityEnterView.J1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i10 = ChatActivityEnterView.m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.p0.setVisibility(0);
        }
        hp0 hp0Var = chatActivityEnterView.p0;
        if (hp0Var != null) {
            hp0Var.setAlpha(this.b);
            chatActivityEnterView.p0.setTranslationX(this.c);
            f7 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        di.f0 f0Var = chatActivityEnterView.l0;
        if (f0Var == null || f0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.B0.clear();
    }
}
