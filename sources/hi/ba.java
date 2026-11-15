package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.is;
import org.telegram.ui.jm0;
import org.telegram.ui.qc;
import org.telegram.ui.t71;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                jm0 jm0Var = (jm0) this.c;
                jm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.Y.invalidate();
                if (!this.b && jm0Var.Z > 0.5f) {
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
