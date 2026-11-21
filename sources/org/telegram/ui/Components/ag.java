package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ag extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
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
            int i7 = ChatActivityEnterView.s7;
            chatActivityEnterView.h0();
        }
        rn0 rn0Var = chatActivityEnterView.q0;
        if (rn0Var != null) {
            rn0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.q0.setAlpha(this.d);
            chatActivityEnterView.q0.setTranslationX(this.e);
            f10 = chatActivityEnterView.q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.q2();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        rn0 rn0Var = chatActivityEnterView.q0;
        if (rn0Var != null) {
            rn0Var.setVisibility(8);
        }
        chatActivityEnterView.R0.setTranslationX(0.0f);
        chatActivityEnterView.H = 0.0f;
        chatActivityEnterView.q2();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i7 = ChatActivityEnterView.s7;
            chatActivityEnterView.h0();
            chatActivityEnterView.q0.setVisibility(0);
        }
        rn0 rn0Var = chatActivityEnterView.q0;
        if (rn0Var != null) {
            rn0Var.setAlpha(this.b);
            chatActivityEnterView.q0.setTranslationX(this.c);
            f10 = chatActivityEnterView.q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.q2();
        ki.y yVar = chatActivityEnterView.m0;
        if (yVar == null || yVar.getTag() != null) {
            return;
        }
        chatActivityEnterView.C0.clear();
    }
}
