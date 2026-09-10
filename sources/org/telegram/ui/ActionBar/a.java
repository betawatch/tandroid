package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.k01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        z zVar;
        switch (this.a) {
            case 0:
                k01 k01Var = this.b.U0;
                if (k01Var != null) {
                    k01Var.run();
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.b;
                lVar.o0 = floatValue;
                if (lVar.a != null && lVar.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), lVar.o0);
                    lVar.a.q(lerp, dp, dp, lerp);
                    lVar.invalidate();
                }
                if (lVar.O0 && (zVar = lVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), lVar.o0));
                }
                k01 k01Var2 = lVar.U0;
                if (k01Var2 != null) {
                    k01Var2.run();
                    break;
                }
                break;
            case 2:
                k01 k01Var3 = this.b.U0;
                if (k01Var3 != null) {
                    k01Var3.run();
                    break;
                }
                break;
            case 3:
                l lVar2 = this.b;
                lVar2.getClass();
                lVar2.r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar2.b();
                break;
            default:
                l lVar3 = this.b;
                lVar3.getClass();
                lVar3.r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar3.b();
                break;
        }
    }
}
