package lg;

import android.animation.ValueAnimator;
import c3.i0;
import org.telegram.ui.Components.voip.x;
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, float f7, float f10, float f11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = f7;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q qVar = (q) this.e;
                qVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = qVar.b;
                hVar.d = this.b * floatValue;
                hVar.e = this.c * floatValue;
                hVar.i = floatValue * this.d;
                break;
            case 1:
                x xVar = (x) this.e;
                xVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.y0 = i0.z(1.0f, floatValue2, 1.0f, this.b * floatValue2);
                xVar.r0 = this.c * floatValue2;
                xVar.s0 = this.d * floatValue2;
                xVar.invalidate();
                break;
            default:
                zd1 zd1Var = (zd1) this.e;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var.f1 = i0.z(1.0f, floatValue3, 1.0f, this.b * floatValue3);
                zd1Var.Y0 = this.c * floatValue3;
                zd1Var.Z0 = this.d * floatValue3;
                zd1Var.s.invalidate();
                break;
        }
    }
}
