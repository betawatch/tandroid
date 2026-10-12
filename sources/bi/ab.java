package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ ab(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = this.b;
                sbVar.U = floatValue;
                sbVar.o();
                gb gbVar = sbVar.s;
                if (gbVar != null) {
                    gbVar.invalidate();
                }
                t1 t1Var = sbVar.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - sbVar.V) * sbVar.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar2 = this.b;
                sbVar2.U = floatValue2;
                hb hbVar = sbVar2.v;
                if (hbVar != null && floatValue2 > 0.6f && b0.c && hbVar.a) {
                    hbVar.a(false);
                }
                t1 t1Var2 = sbVar2.A0;
                if (t1Var2 != null) {
                    t1Var2.v((1.0f - sbVar2.V) * sbVar2.U);
                }
                sbVar2.o();
                gb gbVar2 = sbVar2.s;
                if (gbVar2 != null) {
                    gbVar2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar3 = this.b;
                sbVar3.Z = floatValue3;
                sbVar3.d0 = Utilities.clamp(sbVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                ib ibVar = sbVar3.n0;
                q5 currentPeerView = ibVar == null ? null : ibVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar4 = this.b;
                sbVar4.e0 = floatValue4;
                sbVar4.v.invalidate();
                break;
        }
    }
}
