package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a0 a0Var;
        switch (this.a) {
            case 0:
                ky0 ky0Var = this.b.Q0;
                if (ky0Var != null) {
                    ky0Var.run();
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.b;
                lVar.k0 = floatValue;
                if (lVar.a != null && lVar.M0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), lVar.k0);
                    lVar.a.q(lerp, dp, dp, lerp);
                    lVar.invalidate();
                }
                if (lVar.K0 && (a0Var = lVar.A) != null) {
                    a0Var.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), lVar.k0));
                }
                ky0 ky0Var2 = lVar.Q0;
                if (ky0Var2 != null) {
                    ky0Var2.run();
                    break;
                }
                break;
            case 2:
                ky0 ky0Var3 = this.b.Q0;
                if (ky0Var3 != null) {
                    ky0Var3.run();
                    break;
                }
                break;
            case 3:
                l lVar2 = this.b;
                lVar2.getClass();
                lVar2.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.b();
                break;
            default:
                l lVar3 = this.b;
                lVar3.getClass();
                lVar3.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.b();
                break;
        }
    }
}
