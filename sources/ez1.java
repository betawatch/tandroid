// default package

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ez1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ sy1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ChatActivityEnterView d;

    public ez1(ChatActivityEnterView chatActivityEnterView, sy1 sy1Var, float f, float f2) {
        this.d = chatActivityEnterView;
        this.a = sy1Var;
        this.b = f;
        this.c = f2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m6a m6aVar;
        sy1 sy1Var = this.a;
        sy1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        rx1 rx1Var = chatActivityEnterView.R0;
        if (chatActivityEnterView.F0 == sy1Var && (m6aVar = chatActivityEnterView.q0) != null && m6aVar.getVisibility() != 0) {
            float left = (this.b - sy1Var.getLeft()) - chatActivityEnterView.I;
            float left2 = this.c - rx1Var.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(d53.f);
            duration.addUpdateListener(new dz1(this, left, left2, (byte) 0));
            duration.addListener(new u5(this, duration, (byte) 10));
            chatActivityEnterView.q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.u2();
            rx1Var.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
