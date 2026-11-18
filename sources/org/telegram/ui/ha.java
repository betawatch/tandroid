package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                iaVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = org.telegram.ui.ActionBar.n6.z6;
                org.telegram.ui.ActionBar.i6 i6Var = iaVar2.b;
                int f10 = i0.a.f(iaVar2.F, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var));
                iaVar2.e.b(f10);
                iaVar2.f.setTextColor(f10);
                break;
        }
    }
}
