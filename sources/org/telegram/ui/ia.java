package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja b;

    public /* synthetic */ ia(ja jaVar, int i9) {
        this.a = i9;
        this.b = jaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ja jaVar = this.b;
                jaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jaVar.n = floatValue;
                jaVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                jaVar.d.setAlpha(jaVar.n);
                break;
            default:
                ja jaVar2 = this.b;
                jaVar2.getClass();
                jaVar2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i9 = org.telegram.ui.ActionBar.f6.z6;
                org.telegram.ui.ActionBar.b6 b6Var = jaVar2.b;
                int d = i0.a.d(jaVar2.A, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.n6, b6Var));
                jaVar2.e.b(d);
                jaVar2.f.setTextColor(d);
                break;
        }
    }
}
