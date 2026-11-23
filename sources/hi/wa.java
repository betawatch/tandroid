package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.fs;
import org.telegram.ui.jm0;
import org.telegram.ui.qc;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ fs c;

    public /* synthetic */ wa(fs fsVar, int i7) {
        this.a = i7;
        this.c = fsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nb nbVar = (nb) this.c;
                nbVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                va vaVar = nbVar.D2;
                if (vaVar != null) {
                    vaVar.invalidate();
                }
                if (!this.b && nbVar.E2 > 0.5f) {
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
                v71 v71Var = (v71) this.c;
                v71Var.k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.j2.invalidate();
                if (!this.b && v71Var.k2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
