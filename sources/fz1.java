// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fz1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public fz1(ChatActivityEnterView chatActivityEnterView, boolean z, float f, float f2, float f3, float f4) {
        this.f = chatActivityEnterView;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z = this.a;
        if (z) {
            int i = ChatActivityEnterView.z7;
            chatActivityEnterView.f0();
        }
        m6a m6aVar = chatActivityEnterView.q0;
        if (m6aVar != null) {
            m6aVar.setVisibility(z ? 0 : 8);
            chatActivityEnterView.q0.setAlpha(this.d);
            chatActivityEnterView.q0.setTranslationX(this.e);
            f = chatActivityEnterView.q0.getTranslationX();
        } else {
            f = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f);
        chatActivityEnterView.H = f;
        chatActivityEnterView.u2();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        m6a m6aVar = chatActivityEnterView.q0;
        if (m6aVar != null) {
            m6aVar.setVisibility(8);
        }
        chatActivityEnterView.R0.setTranslationX(0.0f);
        chatActivityEnterView.H = 0.0f;
        chatActivityEnterView.u2();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f;
        boolean z = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z) {
            int i = ChatActivityEnterView.z7;
            chatActivityEnterView.f0();
            chatActivityEnterView.q0.setVisibility(0);
        }
        m6a m6aVar = chatActivityEnterView.q0;
        if (m6aVar != null) {
            m6aVar.setAlpha(this.b);
            chatActivityEnterView.q0.setTranslationX(this.c);
            f = chatActivityEnterView.q0.getTranslationX();
        } else {
            f = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f);
        chatActivityEnterView.H = f;
        chatActivityEnterView.u2();
        eq0 eq0Var = chatActivityEnterView.m0;
        if (eq0Var == null || eq0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.C0.clear();
    }
}
