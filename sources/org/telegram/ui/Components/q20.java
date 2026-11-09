package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s20 b;

    public /* synthetic */ q20(s20 s20Var, int i7) {
        this.a = i7;
        this.b = s20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.dn dnVar;
        bi.q1 q1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s20 s20Var = this.b;
                s20Var.x = floatValue;
                s20Var.e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                s20Var.e.setPadding(0, 0, 0, (int) (s20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s20 s20Var2 = this.b;
                s20Var2.E = floatValue2;
                s20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                s20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, s20Var2.E));
                org.telegram.ui.oj ojVar = s20Var2.f;
                if (ojVar != null && (dnVar = ojVar.a) != null && (q1Var = dnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                    s20Var2.f.a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                }
                s20Var2.h.setAlpha(s20Var2.E);
                break;
        }
    }
}
