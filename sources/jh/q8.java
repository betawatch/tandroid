package jh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ q8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var = this.b;
                i9Var.Q = floatValue;
                i9Var.o();
                w8 w8Var = i9Var.s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                d1 d1Var = i9Var.w0;
                if (d1Var != null) {
                    d1Var.v((1.0f - i9Var.R) * i9Var.Q);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var2 = this.b;
                i9Var2.Q = floatValue2;
                x8 x8Var = i9Var2.v;
                if (x8Var != null && floatValue2 > 0.6f && t.c && x8Var.a) {
                    x8Var.a(false);
                }
                d1 d1Var2 = i9Var2.w0;
                if (d1Var2 != null) {
                    d1Var2.v((1.0f - i9Var2.R) * i9Var2.Q);
                }
                i9Var2.o();
                w8 w8Var2 = i9Var2.s;
                if (w8Var2 != null) {
                    w8Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var3 = this.b;
                i9Var3.V = floatValue3;
                i9Var3.Z = Utilities.clamp(i9Var3.V / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                y8 y8Var = i9Var3.j0;
                e4 currentPeerView = y8Var == null ? null : y8Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var4 = this.b;
                i9Var4.a0 = floatValue4;
                i9Var4.v.invalidate();
                break;
        }
    }
}
