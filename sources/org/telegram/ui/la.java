package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                int i10 = org.telegram.ui.ActionBar.j6.z6;
                org.telegram.ui.ActionBar.f6 f6Var = maVar2.b;
                int d = i0.a.d(maVar2.B, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
                maVar2.e.b(d);
                maVar2.f.setTextColor(d);
                break;
        }
    }
}
