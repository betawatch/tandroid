package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public cf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
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
            int i10 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
        }
        do0 do0Var = chatActivityEnterView.p0;
        if (do0Var != null) {
            do0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.p0.setAlpha(this.d);
            chatActivityEnterView.p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        do0 do0Var = chatActivityEnterView.p0;
        if (do0Var != null) {
            do0Var.setVisibility(8);
        }
        chatActivityEnterView.Q0.setTranslationX(0.0f);
        chatActivityEnterView.G = 0.0f;
        chatActivityEnterView.I1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i10 = ChatActivityEnterView.s5;
            chatActivityEnterView.X();
            chatActivityEnterView.p0.setVisibility(0);
        }
        do0 do0Var = chatActivityEnterView.p0;
        if (do0Var != null) {
            do0Var.setAlpha(this.b);
            chatActivityEnterView.p0.setTranslationX(this.c);
            f7 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.I1();
        xh.w wVar = chatActivityEnterView.l0;
        if (wVar == null || wVar.getTag() != null) {
            return;
        }
        chatActivityEnterView.B0.clear();
    }
}
