package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y yVar;
        switch (this.a) {
            case 0:
                uu0 uu0Var = this.b.e1;
                if (uu0Var != null) {
                    uu0Var.run();
                    break;
                }
                break;
            case 1:
                uu0 uu0Var2 = this.b.e1;
                if (uu0Var2 != null) {
                    uu0Var2.run();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.b;
                lVar.o0 = floatValue;
                if (lVar.a != null && lVar.R0) {
                    float L = org.telegram.messenger.g0.L(23.0f);
                    float W1 = org.telegram.messenger.g0.W1(lVar.o0, org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f));
                    lVar.a.s(W1, L, L, W1);
                    lVar.invalidate();
                }
                if (lVar.P0 && (yVar = lVar.E) != null) {
                    yVar.setTranslationX(-org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), lVar.o0));
                }
                uu0 uu0Var3 = lVar.e1;
                if (uu0Var3 != null) {
                    uu0Var3.run();
                    break;
                }
                break;
            case 3:
                l lVar2 = this.b;
                lVar2.getClass();
                lVar2.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.h();
                break;
            default:
                l lVar3 = this.b;
                lVar3.getClass();
                lVar3.D1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.h();
                break;
        }
    }
}
