package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.f01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                f01 f01Var = this.b.U0;
                if (f01Var != null) {
                    f01Var.run();
                    break;
                }
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.b;
                kVar.o0 = floatValue;
                if (kVar.a != null && kVar.Q0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar.o0);
                    kVar.a.q(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.O0 && (zVar = kVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.o0));
                }
                f01 f01Var2 = kVar.U0;
                if (f01Var2 != null) {
                    f01Var2.run();
                    break;
                }
                break;
            case 2:
                f01 f01Var3 = this.b.U0;
                if (f01Var3 != null) {
                    f01Var3.run();
                    break;
                }
                break;
            case 3:
                k kVar2 = this.b;
                kVar2.getClass();
                kVar2.r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.b();
                break;
            default:
                k kVar3 = this.b;
                kVar3.getClass();
                kVar3.r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.b();
                break;
        }
    }
}
