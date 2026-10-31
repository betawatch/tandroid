package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.wv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.a) {
            case 0:
                wv0 wv0Var = this.b.d1;
                if (wv0Var != null) {
                    wv0Var.run();
                    break;
                }
                break;
            case 1:
                wv0 wv0Var2 = this.b.d1;
                if (wv0Var2 != null) {
                    wv0Var2.run();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.b;
                lVar.o0 = floatValue;
                if (lVar.a != null && lVar.R0) {
                    float L = org.telegram.messenger.i0.L(23.0f);
                    float W1 = org.telegram.messenger.i0.W1(lVar.o0, org.telegram.messenger.i0.L(18.33f), org.telegram.messenger.i0.L(23.0f));
                    lVar.a.r(W1, L, L, W1);
                    lVar.invalidate();
                }
                if (lVar.P0 && (yVar = lVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), lVar.o0));
                }
                wv0 wv0Var3 = lVar.d1;
                if (wv0Var3 != null) {
                    wv0Var3.run();
                    break;
                }
                break;
            case 3:
                l lVar2 = this.b;
                lVar2.getClass();
                lVar2.C1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.f();
                break;
            default:
                l lVar3 = this.b;
                lVar3.getClass();
                lVar3.C1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.f();
                break;
        }
    }
}
