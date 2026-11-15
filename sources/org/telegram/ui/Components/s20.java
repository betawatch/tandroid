package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u20 b;

    public /* synthetic */ s20(u20 u20Var, int i7) {
        this.a = i7;
        this.b = u20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.bn bnVar;
        di.c1 c1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u20 u20Var = this.b;
                u20Var.x = floatValue;
                u20Var.e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                u20Var.e.setPadding(0, 0, 0, (int) (u20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u20 u20Var2 = this.b;
                u20Var2.F = floatValue2;
                u20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                u20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, u20Var2.F));
                org.telegram.ui.mj mjVar = u20Var2.f;
                if (mjVar != null && (bnVar = mjVar.a) != null && (c1Var = bnVar.a4) != null) {
                    c1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                    u20Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                }
                u20Var2.h.setAlpha(u20Var2.F);
                break;
        }
    }
}
