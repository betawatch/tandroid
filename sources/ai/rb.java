package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ rb(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar = this.b;
                kcVar.U = floatValue;
                kcVar.o();
                yb ybVar = kcVar.s;
                if (ybVar != null) {
                    ybVar.invalidate();
                }
                d2 d2Var = kcVar.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - kcVar.V) * kcVar.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar2 = this.b;
                kcVar2.U = floatValue2;
                zb zbVar = kcVar2.v;
                if (zbVar != null && floatValue2 > 0.6f && i0.c && zbVar.a) {
                    zbVar.a(false);
                }
                d2 d2Var2 = kcVar2.A0;
                if (d2Var2 != null) {
                    d2Var2.v((1.0f - kcVar2.V) * kcVar2.U);
                }
                kcVar2.o();
                yb ybVar2 = kcVar2.s;
                if (ybVar2 != null) {
                    ybVar2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar3 = this.b;
                kcVar3.Z = floatValue3;
                kcVar3.d0 = Utilities.clamp(kcVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                ac acVar = kcVar3.n0;
                f6 currentPeerView = acVar == null ? null : acVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc kcVar4 = this.b;
                kcVar4.e0 = floatValue4;
                kcVar4.v.invalidate();
                break;
        }
    }
}
