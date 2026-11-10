package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.ls;
import org.telegram.ui.km0;
import org.telegram.ui.rc;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                km0 km0Var = (km0) this.c;
                km0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                km0Var.X.invalidate();
                if (!this.b && km0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                x71 x71Var = (x71) this.c;
                x71Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.i2.invalidate();
                if (!this.b && x71Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
