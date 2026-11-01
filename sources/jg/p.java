package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.oy;
import vh.b4;
import vh.y3;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(ViewGroup viewGroup, Serializable serializable, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                Integer num = (Integer) this.d;
                r0Var.t1.a = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                n0 n0Var = r0Var.L0;
                if (n0Var != null) {
                    n0Var.invalidate();
                    break;
                }
                break;
            case 1:
                as0 as0Var = (as0) this.c;
                uk0 uk0Var = (uk0) this.d;
                as0Var.e.R1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                uk0Var.invalidate();
                break;
            case 2:
                oy oyVar = (oy) this.c;
                float[] fArr = (float[]) this.d;
                oyVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = 0;
                while (i10 < 3) {
                    oyVar.f[i10] = org.telegram.messenger.i0.T1(fArr[i10], i10 == this.b ? 1.0f : 0.0f, floatValue);
                    i10++;
                }
                oyVar.a();
                break;
            default:
                b4 b4Var = (b4) this.c;
                Integer num2 = (Integer) this.d;
                b4Var.j1.a = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                y3 y3Var = b4Var.C0;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p(as0 as0Var, int i10, uk0 uk0Var) {
        this.a = 1;
        this.c = as0Var;
        this.b = i10;
        this.d = uk0Var;
    }
}
