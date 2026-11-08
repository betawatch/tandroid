package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.ls;
import org.telegram.ui.hm0;
import org.telegram.ui.rc;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ea implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ ls c;

    public /* synthetic */ ea(ls lsVar, int i7) {
        this.a = i7;
        this.c = lsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                va vaVar = (va) this.c;
                vaVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da daVar = vaVar.C2;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (!this.b && vaVar.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                rc rcVar = (rc) this.c;
                rcVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.m0.invalidate();
                if (!this.b && rcVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                hm0 hm0Var = (hm0) this.c;
                hm0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm0Var.X.invalidate();
                if (!this.b && hm0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                v71 v71Var = (v71) this.c;
                v71Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.i2.invalidate();
                if (!this.b && v71Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
