package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ k3(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3 m3Var = this.b;
                m3Var.n = floatValue;
                m3Var.k.invalidate();
                if (m3Var.n > 1.0f && m3Var.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    m3Var.r = ofInt;
                    ofInt.addUpdateListener(new k3(m3Var, 2));
                    m3Var.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    m3Var.r.start();
                    break;
                }
                break;
            case 1:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var2 = this.b;
                m3Var2.m = intValue;
                m3Var2.k.invalidate();
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                m3 m3Var3 = this.b;
                if (m3Var3.i <= m3Var3.o / 2) {
                    intValue2 = -intValue2;
                }
                m3Var3.p = intValue2;
                m3Var3.k.invalidate();
                break;
        }
    }
}
