package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.gs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class ba implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ gs c;

    public /* synthetic */ ba(gs gsVar, int i7) {
        this.a = i7;
        this.c = gsVar;
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
                lm0 lm0Var = (lm0) this.c;
                lm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm0Var.Y.invalidate();
                if (!this.b && lm0Var.Z > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                x71 x71Var = (x71) this.c;
                x71Var.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.j2.invalidate();
                if (!this.b && x71Var.k2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
