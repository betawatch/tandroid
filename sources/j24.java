// default package

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j24 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j24(pda pdaVar, int i, sca scaVar) {
        this.a = (byte) 3;
        this.c = pdaVar;
        this.b = i;
        this.d = scaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                l24 l24Var = (l24) obj2;
                float[] fArr = (float[]) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = 0;
                while (i2 < 3) {
                    l24Var.f[i2] = gl.R1(fArr[i2], i2 == i ? 1.0f : 0.0f, floatValue);
                    i2++;
                }
                l24Var.a();
                break;
            case 1:
                rw5 rw5Var = (rw5) obj2;
                rw5Var.A1.a = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) obj).intValue(), i);
                ow5 ow5Var = rw5Var.S0;
                if (ow5Var != null) {
                    ow5Var.invalidate();
                    break;
                }
                break;
            case 2:
                wt7 wt7Var = (wt7) obj2;
                wt7Var.q1.a = bm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) obj).intValue(), i);
                tt7 tt7Var = wt7Var.J0;
                if (tt7Var != null) {
                    tt7Var.invalidate();
                    break;
                }
                break;
            default:
                ((pda) obj2).e.S1.put(i, (Float) valueAnimator.getAnimatedValue());
                ((sca) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ j24(ViewGroup viewGroup, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i;
    }
}
