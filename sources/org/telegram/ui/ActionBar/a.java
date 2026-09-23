package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xz0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                xz0 xz0Var = this.b.U0;
                if (xz0Var != null) {
                    xz0Var.run();
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
                    kVar.a.r(lerp, dp, dp, lerp);
                    kVar.invalidate();
                }
                if (kVar.O0 && (zVar = kVar.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar.o0));
                }
                xz0 xz0Var2 = kVar.U0;
                if (xz0Var2 != null) {
                    xz0Var2.run();
                    break;
                }
                break;
            case 2:
                xz0 xz0Var3 = this.b.U0;
                if (xz0Var3 != null) {
                    xz0Var3.run();
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
