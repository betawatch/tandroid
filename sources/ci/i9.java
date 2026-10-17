package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa b;

    public /* synthetic */ i9(aa aaVar, int i10) {
        this.a = i10;
        this.b = aaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = this.b;
                aaVar.U = floatValue;
                aaVar.o();
                o9 o9Var = aaVar.s;
                if (o9Var != null) {
                    o9Var.invalidate();
                }
                h1 h1Var = aaVar.A0;
                if (h1Var != null) {
                    h1Var.v((1.0f - aaVar.V) * aaVar.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar2 = this.b;
                aaVar2.U = floatValue2;
                p9 p9Var = aaVar2.v;
                if (p9Var != null && floatValue2 > 0.6f && w.c && p9Var.a) {
                    p9Var.a(false);
                }
                h1 h1Var2 = aaVar2.A0;
                if (h1Var2 != null) {
                    h1Var2.v((1.0f - aaVar2.V) * aaVar2.U);
                }
                aaVar2.o();
                o9 o9Var2 = aaVar2.s;
                if (o9Var2 != null) {
                    o9Var2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar3 = this.b;
                aaVar3.Z = floatValue3;
                aaVar3.d0 = Utilities.clamp(aaVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                q9 q9Var = aaVar3.n0;
                q4 currentPeerView = q9Var == null ? null : q9Var.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar4 = this.b;
                aaVar4.e0 = floatValue4;
                aaVar4.v.invalidate();
                break;
        }
    }
}
