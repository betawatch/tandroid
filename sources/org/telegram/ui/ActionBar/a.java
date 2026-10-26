package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.my0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                my0 my0Var = this.b.W0;
                if (my0Var != null) {
                    my0Var.run();
                    break;
                }
                break;
            case 2:
                my0 my0Var2 = this.b.W0;
                if (my0Var2 != null) {
                    my0Var2.run();
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
                my0 my0Var3 = kVar2.W0;
                if (my0Var3 != null) {
                    my0Var3.run();
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
