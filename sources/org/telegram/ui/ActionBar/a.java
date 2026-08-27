package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ky0 ky0Var = this.b.Q0;
                if (ky0Var != null) {
                    ky0Var.run();
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.b;
                kVar.k0 = floatValue;
                if (kVar.a != null && kVar.M0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.k0);
                    kVar.a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.K0 && (zVar = kVar.A) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.k0));
                }
                ky0 ky0Var2 = kVar.Q0;
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
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.n1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                break;
        }
    }
}
