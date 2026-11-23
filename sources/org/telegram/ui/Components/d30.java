package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f30 b;

    public /* synthetic */ d30(f30 f30Var, int i7) {
        this.a = i7;
        this.b = f30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var = this.b;
                f30Var.x = floatValue;
                f30Var.e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                f30Var.e.setPadding(0, 0, 0, (int) (f30Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var2 = this.b;
                f30Var2.F = floatValue2;
                f30Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                f30Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, f30Var2.F));
                org.telegram.ui.nj njVar = f30Var2.f;
                if (njVar != null && (cnVar = njVar.a) != null && (b1Var = cnVar.a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                    f30Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, f30Var2.F));
                }
                f30Var2.h.setAlpha(f30Var2.F);
                break;
        }
    }
}
