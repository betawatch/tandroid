package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z zVar;
        switch (this.a) {
            case 0:
                vy0 vy0Var = this.b.R0;
                if (vy0Var != null) {
                    vy0Var.run();
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.b;
                kVar.l0 = floatValue;
                if (kVar.a != null && kVar.N0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.l0);
                    kVar.a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.L0 && (zVar = kVar.B) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.l0));
                }
                vy0 vy0Var2 = kVar.R0;
                if (vy0Var2 != null) {
                    vy0Var2.run();
                    break;
                }
                break;
            case 2:
                vy0 vy0Var3 = this.b.R0;
                if (vy0Var3 != null) {
                    vy0Var3.run();
                    break;
                }
                break;
            case 3:
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                break;
        }
    }
}
