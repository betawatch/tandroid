package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ g9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = this.b;
                y9Var.U = floatValue;
                y9Var.o();
                m9 m9Var = y9Var.s;
                if (m9Var != null) {
                    m9Var.invalidate();
                }
                h1 h1Var = y9Var.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - y9Var.V) * y9Var.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var2 = this.b;
                y9Var2.U = floatValue2;
                n9 n9Var = y9Var2.v;
                if (n9Var != null && floatValue2 > 0.6f && w.c && n9Var.a) {
                    n9Var.a(false);
                }
                h1 h1Var2 = y9Var2.A0;
                if (h1Var2 != null) {
                    h1Var2.v((1.0f - y9Var2.V) * y9Var2.U);
                }
                y9Var2.o();
                m9 m9Var2 = y9Var2.s;
                if (m9Var2 != null) {
                    m9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var3 = this.b;
                y9Var3.Z = floatValue3;
                y9Var3.d0 = Utilities.clamp(y9Var3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                o9 o9Var = y9Var3.n0;
                q4 currentPeerView = o9Var == null ? null : o9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var4 = this.b;
                y9Var4.e0 = floatValue4;
                y9Var4.v.invalidate();
                break;
        }
    }
}
