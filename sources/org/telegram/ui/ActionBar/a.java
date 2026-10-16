package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tz0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        y yVar;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.getClass();
                kVar.s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                break;
            case 1:
                tz0 tz0Var = this.b.U0;
                if (tz0Var != null) {
                    tz0Var.run();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.b;
                kVar2.o0 = floatValue;
                if (kVar2.a != null && kVar2.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.o0);
                    kVar2.a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.O0 && (yVar = kVar2.E) != null) {
                    yVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.o0));
                }
                tz0 tz0Var2 = kVar2.U0;
                if (tz0Var2 != null) {
                    tz0Var2.run();
                    break;
                }
                break;
            case 3:
                tz0 tz0Var3 = this.b.U0;
                if (tz0Var3 != null) {
                    tz0Var3.run();
                    break;
                }
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
