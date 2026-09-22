package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ na b;

    public /* synthetic */ ma(na naVar, int i10) {
        this.a = i10;
        this.b = naVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                na naVar = this.b;
                naVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.n = floatValue;
                naVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                naVar.d.setAlpha(naVar.n);
                break;
            default:
                na naVar2 = this.b;
                naVar2.getClass();
                naVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.i6.z6;
                org.telegram.ui.ActionBar.e6 e6Var = naVar2.b;
                int d = i0.a.d(naVar2.E, org.telegram.ui.ActionBar.i6.v0(i10, e6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.n6, e6Var));
                naVar2.e.b(d);
                naVar2.f.setTextColor(d);
                break;
        }
    }
}
