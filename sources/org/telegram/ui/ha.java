package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia b;

    public /* synthetic */ ha(ia iaVar, int i7) {
        this.a = i7;
        this.b = iaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ia iaVar = this.b;
                iaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iaVar.n = floatValue;
                iaVar.f.setTranslationX(floatValue * org.telegram.messenger.g0.L(16.0f));
                iaVar.d.setAlpha(iaVar.n);
                break;
            default:
                ia iaVar2 = this.b;
                iaVar2.getClass();
                iaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.k6.z6;
                org.telegram.ui.ActionBar.f6 f6Var = iaVar2.b;
                int f10 = i0.a.f(iaVar2.E, org.telegram.ui.ActionBar.k6.w0(i7, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, f6Var));
                iaVar2.e.b(f10);
                iaVar2.f.setTextColor(f10);
                break;
        }
    }
}
