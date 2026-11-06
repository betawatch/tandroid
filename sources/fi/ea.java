package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.ls;
import org.telegram.ui.hm0;
import org.telegram.ui.rc;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                u71 u71Var = (u71) this.c;
                u71Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u71Var.i2.invalidate();
                if (!this.b && u71Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
