package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra b;

    public /* synthetic */ qa(ra raVar, int i10) {
        this.a = i10;
        this.b = raVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ra raVar = this.b;
                raVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                raVar.n = floatValue;
                raVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                raVar.d.setAlpha(raVar.n);
                break;
            default:
                ra raVar2 = this.b;
                raVar2.getClass();
                raVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.h6.z6;
                org.telegram.ui.ActionBar.d6 d6Var = raVar2.b;
                int f7 = i0.a.f(raVar2.E, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.n6, d6Var));
                raVar2.e.b(f7);
                raVar2.f.setTextColor(f7);
                break;
        }
    }
}
