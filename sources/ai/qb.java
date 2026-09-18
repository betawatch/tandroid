package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc b;

    public /* synthetic */ qb(jc jcVar, int i10) {
        this.a = i10;
        this.b = jcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar = this.b;
                jcVar.U = floatValue;
                jcVar.o();
                xb xbVar = jcVar.s;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                d2 d2Var = jcVar.A0;
                if (d2Var != null) {
                    d2Var.v((1.0f - jcVar.V) * jcVar.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar2 = this.b;
                jcVar2.U = floatValue2;
                yb ybVar = jcVar2.v;
                if (ybVar != null && floatValue2 > 0.6f && i0.c && ybVar.a) {
                    ybVar.a(false);
                }
                d2 d2Var2 = jcVar2.A0;
                if (d2Var2 != null) {
                    d2Var2.v((1.0f - jcVar2.V) * jcVar2.U);
                }
                jcVar2.o();
                xb xbVar2 = jcVar2.s;
                if (xbVar2 != null) {
                    xbVar2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar3 = this.b;
                jcVar3.Z = floatValue3;
                jcVar3.d0 = Utilities.clamp(jcVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                zb zbVar = jcVar3.n0;
                f6 currentPeerView = zbVar == null ? null : zbVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc jcVar4 = this.b;
                jcVar4.e0 = floatValue4;
                jcVar4.v.invalidate();
                break;
        }
    }
}
