package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.ru0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.a) {
            case 0:
                ru0 ru0Var = this.b.f1;
                if (ru0Var != null) {
                    ru0Var.run();
                    break;
                }
                break;
            case 1:
                ru0 ru0Var2 = this.b.f1;
                if (ru0Var2 != null) {
                    ru0Var2.run();
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
                if (kVar.Q0 && (zVar = kVar.F) != null) {
                    zVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.p0));
                }
                ru0 ru0Var3 = kVar.f1;
                if (ru0Var3 != null) {
                    ru0Var3.run();
                    break;
                }
                break;
            case 3:
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.i();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.E1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.i();
                break;
        }
    }
}
