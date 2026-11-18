package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c30 b;

    public /* synthetic */ a30(c30 c30Var, int i7) {
        this.a = i7;
        this.b = c30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var = this.b;
                c30Var.x = floatValue;
                c30Var.e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                c30Var.e.setPadding(0, 0, 0, (int) (c30Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c30 c30Var2 = this.b;
                c30Var2.F = floatValue2;
                c30Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                c30Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, c30Var2.F));
                org.telegram.ui.nj njVar = c30Var2.f;
                if (njVar != null && (cnVar = njVar.a) != null && (b1Var = cnVar.a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                    c30Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                }
                c30Var2.h.setAlpha(c30Var2.F);
                break;
        }
    }
}
