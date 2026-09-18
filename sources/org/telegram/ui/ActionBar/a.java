package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.g01;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        a0 a0Var;
        switch (this.a) {
            case 0:
                g01 g01Var = this.b.V0;
                if (g01Var != null) {
                    g01Var.run();
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.b;
                kVar.o0 = floatValue;
                if (kVar.a != null && kVar.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.o0);
                    kVar.a.r(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.P0 && (a0Var = kVar.E) != null) {
                    a0Var.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.o0));
                }
                g01 g01Var2 = kVar.V0;
                if (g01Var2 != null) {
                    g01Var2.run();
                    break;
                }
                break;
            case 2:
                g01 g01Var3 = this.b.V0;
                if (g01Var3 != null) {
                    g01Var3.run();
                    break;
                }
                break;
            case 3:
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                break;
        }
    }
}
