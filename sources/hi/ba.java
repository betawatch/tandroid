package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.is;
import org.telegram.ui.im0;
import org.telegram.ui.qc;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ is c;

    public /* synthetic */ ba(is isVar, int i7) {
        this.a = i7;
        this.c = isVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sa saVar = (sa) this.c;
                saVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = saVar.D2;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                if (!this.b && saVar.E2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                qc qcVar = (qc) this.c;
                qcVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.n0.invalidate();
                if (!this.b && qcVar.o0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                im0 im0Var = (im0) this.c;
                im0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.Y.invalidate();
                if (!this.b && im0Var.Z > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                t71 t71Var = (t71) this.c;
                t71Var.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.j2.invalidate();
                if (!this.b && t71Var.k2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
