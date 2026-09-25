package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                kVar.r1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                break;
            case 1:
                vz0 vz0Var = this.b.U0;
                if (vz0Var != null) {
                    vz0Var.run();
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
                vz0 vz0Var2 = kVar2.U0;
                if (vz0Var2 != null) {
                    vz0Var2.run();
                    break;
                }
                break;
            case 3:
                vz0 vz0Var3 = this.b.U0;
                if (vz0Var3 != null) {
                    vz0Var3.run();
                    break;
                }
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
