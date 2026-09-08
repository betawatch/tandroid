package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class xa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb b;

    public /* synthetic */ xa(pb pbVar, int i10) {
        this.a = i10;
        this.b = pbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar = this.b;
                pbVar.U = floatValue;
                pbVar.o();
                db dbVar = pbVar.s;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                t1 t1Var = pbVar.A0;
                if (t1Var != null) {
                    t1Var.v((1.0f - pbVar.V) * pbVar.U);
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar2 = this.b;
                pbVar2.U = floatValue2;
                eb ebVar = pbVar2.v;
                if (ebVar != null && floatValue2 > 0.6f && b0.c && ebVar.a) {
                    ebVar.a(false);
                }
                t1 t1Var2 = pbVar2.A0;
                if (t1Var2 != null) {
                    t1Var2.v((1.0f - pbVar2.V) * pbVar2.U);
                }
                pbVar2.o();
                db dbVar2 = pbVar2.s;
                if (dbVar2 != null) {
                    dbVar2.invalidate();
                    break;
                }
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar3 = this.b;
                pbVar3.Z = floatValue3;
                pbVar3.d0 = Utilities.clamp(pbVar3.Z / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                fb fbVar = pbVar3.n0;
                o5 currentPeerView = fbVar == null ? null : fbVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb pbVar4 = this.b;
                pbVar4.e0 = floatValue4;
                pbVar4.v.invalidate();
                break;
        }
    }
}
