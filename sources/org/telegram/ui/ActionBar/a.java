package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                k kVar = this.b;
                kVar.getClass();
                kVar.v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                break;
            case 1:
                oy0 oy0Var = this.b.W0;
                if (oy0Var != null) {
                    oy0Var.run();
                    break;
                }
                break;
            case 2:
                oy0 oy0Var2 = this.b.W0;
                if (oy0Var2 != null) {
                    oy0Var2.run();
                    break;
                }
                break;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.b;
                kVar2.o0 = floatValue;
                if (kVar2.a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.o0);
                    kVar2.a.y(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.o0));
                }
                oy0 oy0Var3 = kVar2.W0;
                if (oy0Var3 != null) {
                    oy0Var3.run();
                    break;
                }
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.v1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                break;
        }
    }
}
