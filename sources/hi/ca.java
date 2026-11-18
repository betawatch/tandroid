package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.fs;
import org.telegram.ui.lm0;
import org.telegram.ui.qc;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class ca implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ fs c;

    public /* synthetic */ ca(fs fsVar, int i7) {
        this.a = i7;
        this.c = fsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ta taVar = (ta) this.c;
                taVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba baVar = taVar.D2;
                if (baVar != null) {
                    baVar.invalidate();
                }
                if (!this.b && taVar.E2 > 0.5f) {
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
