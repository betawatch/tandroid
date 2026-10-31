package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j30 b;

    public /* synthetic */ h30(j30 j30Var, int i10) {
        this.a = i10;
        this.b = j30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.vn vnVar;
        ag.b1 b1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var = this.b;
                j30Var.x = floatValue;
                j30Var.e.setTranslationY(floatValue * org.telegram.messenger.i0.L(48.0f));
                j30Var.e.setPadding(0, 0, 0, (int) (j30Var.x * org.telegram.messenger.i0.L(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j30 j30Var2 = this.b;
                j30Var2.E = floatValue2;
                j30Var2.n.setScaleX(org.telegram.messenger.i0.T1(0.95f, 1.0f, floatValue2));
                j30Var2.n.setScaleY(org.telegram.messenger.i0.T1(0.95f, 1.0f, j30Var2.E));
                org.telegram.ui.ik ikVar = j30Var2.f;
                if (ikVar != null && (vnVar = ikVar.a) != null && (b1Var = vnVar.Z3) != null) {
                    b1Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                    j30Var2.f.a.Z3.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                }
                j30Var2.h.setAlpha(j30Var2.E);
                break;
        }
    }
}
