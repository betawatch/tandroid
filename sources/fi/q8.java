package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ q8(i9 i9Var, int i7) {
        this.a = i7;
        this.b = i9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var = this.b;
                i9Var.V = floatValue;
                i9Var.q();
                w8 w8Var = i9Var.s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                e1 e1Var = i9Var.B0;
                if (e1Var != null) {
                    e1Var.v((1.0f - i9Var.W) * i9Var.V);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var2 = this.b;
                i9Var2.V = floatValue2;
                x8 x8Var = i9Var2.w;
                if (x8Var != null && floatValue2 > 0.6f && v.c && x8Var.a) {
                    x8Var.a(false);
                }
                e1 e1Var2 = i9Var2.B0;
                if (e1Var2 != null) {
                    e1Var2.v((1.0f - i9Var2.W) * i9Var2.V);
                }
                i9Var2.q();
                w8 w8Var2 = i9Var2.s;
                if (w8Var2 != null) {
                    w8Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var3 = this.b;
                i9Var3.a0 = floatValue3;
                i9Var3.e0 = Utilities.i(i9Var3.a0 / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                y8 y8Var = i9Var3.o0;
                b4 currentPeerView = y8Var == null ? null : y8Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9 i9Var4 = this.b;
                i9Var4.f0 = floatValue4;
                i9Var4.w.invalidate();
                break;
        }
    }
}
