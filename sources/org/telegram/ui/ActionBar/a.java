package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                kVar.s1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.b();
                break;
            case 1:
                e01 e01Var = this.b.V0;
                if (e01Var != null) {
                    e01Var.run();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.b;
                kVar2.o0 = floatValue;
                if (kVar2.a != null && kVar2.R0) {
                    float dp = AndroidUtilities.dp(23.0f);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), kVar2.o0);
                    kVar2.a.r(lerp, dp, dp, lerp);
                    kVar2.invalidate();
                }
                if (kVar2.P0 && (zVar = kVar2.E) != null) {
                    zVar.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), kVar2.o0));
                }
                e01 e01Var2 = kVar2.V0;
                if (e01Var2 != null) {
                    e01Var2.run();
                    break;
                }
                break;
            case 3:
                e01 e01Var3 = this.b.V0;
                if (e01Var3 != null) {
                    e01Var3.run();
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
