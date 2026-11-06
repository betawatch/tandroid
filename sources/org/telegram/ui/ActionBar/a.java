package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.ru0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        y yVar;
        switch (this.a) {
            case 0:
                ru0 ru0Var = this.b.e1;
                if (ru0Var != null) {
                    ru0Var.run();
                    break;
                }
                break;
            case 1:
                ru0 ru0Var2 = this.b.e1;
                if (ru0Var2 != null) {
                    ru0Var2.run();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.b;
                kVar.o0 = floatValue;
                if (kVar.a != null && kVar.R0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(kVar.o0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    kVar.a.s(W1, L, L, W1);
                    kVar.invalidate();
                }
                if (kVar.P0 && (yVar = kVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), kVar.o0));
                }
                ru0 ru0Var3 = kVar.e1;
                if (ru0Var3 != null) {
                    ru0Var3.run();
                    break;
                }
                break;
            case 3:
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.f();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f();
                break;
        }
    }
}
