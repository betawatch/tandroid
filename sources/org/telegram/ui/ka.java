package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ka implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ la b;

    public /* synthetic */ ka(la laVar, int i10) {
        this.a = i10;
        this.b = laVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                la laVar = this.b;
                laVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                laVar.n = floatValue;
                laVar.f.setTranslationX(floatValue * org.telegram.messenger.i0.L(16.0f));
                laVar.d.setAlpha(laVar.n);
                break;
            default:
                la laVar2 = this.b;
                laVar2.getClass();
                laVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.t6.z6;
                org.telegram.ui.ActionBar.p6 p6Var = laVar2.b;
                int f7 = i0.b.f(laVar2.E, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var));
                laVar2.e.b(f7);
                laVar2.f.setTextColor(f7);
                break;
        }
    }
}
