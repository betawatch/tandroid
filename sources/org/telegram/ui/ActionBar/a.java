package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.pu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i3) {
        this.a = i3;
        this.b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        x xVar;
        switch (this.a) {
            case 0:
                pu0 pu0Var = this.b.f1;
                if (pu0Var != null) {
                    pu0Var.run();
                    break;
                }
                break;
            case 1:
                pu0 pu0Var2 = this.b.f1;
                if (pu0Var2 != null) {
                    pu0Var2.run();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.b;
                kVar.p0 = floatValue;
                if (kVar.a != null && kVar.S0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.p0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.Q0 && (xVar = kVar.F) != null) {
                    xVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.p0));
                }
                pu0 pu0Var3 = kVar.f1;
                if (pu0Var3 != null) {
                    pu0Var3.run();
                    break;
                }
                break;
            case 3:
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.f();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f();
                break;
        }
    }
}
