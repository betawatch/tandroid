package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ x8(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var = this.b;
                p9Var.U = floatValue;
                p9Var.q();
                d9 d9Var = p9Var.s;
                if (d9Var != null) {
                    d9Var.invalidate();
                }
                g1 g1Var = p9Var.A0;
                if (g1Var != null) {
                    g1Var.v((1.0f - p9Var.V) * p9Var.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var2 = this.b;
                p9Var2.U = floatValue2;
                e9 e9Var = p9Var2.w;
                if (e9Var != null && floatValue2 > 0.6f && v.c && e9Var.a) {
                    e9Var.a(false);
                }
                g1 g1Var2 = p9Var2.A0;
                if (g1Var2 != null) {
                    g1Var2.v((1.0f - p9Var2.V) * p9Var2.U);
                }
                p9Var2.q();
                d9 d9Var2 = p9Var2.s;
                if (d9Var2 != null) {
                    d9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var3 = this.b;
                p9Var3.Z = floatValue3;
                p9Var3.d0 = Utilities.i(p9Var3.Z / org.telegram.messenger.g0.L(200.0f), 1.0f, 0.0f);
                f9 f9Var = p9Var3.n0;
                i4 currentPeerView = f9Var == null ? null : f9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9 p9Var4 = this.b;
                p9Var4.e0 = floatValue4;
                p9Var4.w.invalidate();
                break;
        }
    }
}
