package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p20 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ p20(r20 r20Var, int i7) {
        this.a = i7;
        this.b = r20Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r20 r20Var = this.b;
                r20Var.x = floatValue;
                r20Var.e.setTranslationY(floatValue * org.telegram.messenger.g0.L(48.0f));
                r20Var.e.setPadding(0, 0, 0, (int) (r20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r20 r20Var2 = this.b;
                r20Var2.E = floatValue2;
                r20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, floatValue2));
                r20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.mj mjVar = r20Var2.f;
                if (mjVar != null && (bnVar = mjVar.a) != null && (q1Var = bnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f.a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                }
                r20Var2.h.setAlpha(r20Var2.E);
                break;
        }
    }
}
