package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa b;

    public /* synthetic */ oa(pa paVar, int i10) {
        this.a = i10;
        this.b = paVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pa paVar = this.b;
                paVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                paVar.n = floatValue;
                paVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                paVar.d.setAlpha(paVar.n);
                break;
            default:
                pa paVar2 = this.b;
                paVar2.getClass();
                paVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.j6.z6;
                org.telegram.ui.ActionBar.f6 f6Var = paVar2.b;
                int d = i0.a.d(paVar2.E, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
                paVar2.e.b(d);
                paVar2.f.setTextColor(d);
                break;
        }
    }
}
