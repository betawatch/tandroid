package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class la implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma b;

    public /* synthetic */ la(ma maVar, int i10) {
        this.a = i10;
        this.b = maVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ma maVar = this.b;
                maVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                maVar.n = floatValue;
                maVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                maVar.d.setAlpha(maVar.n);
                break;
            default:
                ma maVar2 = this.b;
                maVar2.getClass();
                maVar2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.k6.z6;
                org.telegram.ui.ActionBar.g6 g6Var = maVar2.b;
                int d = i0.a.d(maVar2.B, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n6, g6Var));
                maVar2.e.b(d);
                maVar2.f.setTextColor(d);
                break;
        }
    }
}
