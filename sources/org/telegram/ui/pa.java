package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa b;

    public /* synthetic */ pa(qa qaVar, int i10) {
        this.a = i10;
        this.b = qaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qa qaVar = this.b;
                qaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qaVar.n = floatValue;
                qaVar.f.setTranslationX(floatValue * AndroidUtilities.dp(16.0f));
                qaVar.d.setAlpha(qaVar.n);
                break;
            default:
                qa qaVar2 = this.b;
                qaVar2.getClass();
                qaVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = org.telegram.ui.ActionBar.y6.z6;
                org.telegram.ui.ActionBar.u6 u6Var = qaVar2.b;
                int f7 = i0.a.f(qaVar2.E, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.n6, u6Var));
                qaVar2.e.b(f7);
                qaVar2.f.setTextColor(f7);
                break;
        }
    }
}
