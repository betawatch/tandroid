package gi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.jx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b4(ViewGroup viewGroup, Serializable serializable, int i3, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m5 m5Var = (m5) this.c;
                Integer num = (Integer) this.d;
                m5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                i5 i5Var = m5Var.D0;
                if (i5Var != null) {
                    i5Var.invalidate();
                    break;
                }
                break;
            case 1:
                yq0 yq0Var = (yq0) this.c;
                tj0 tj0Var = (tj0) this.d;
                yq0Var.e.S1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                tj0Var.invalidate();
                break;
            case 2:
                jx jxVar = (jx) this.c;
                float[] fArr = (float[]) this.d;
                jxVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i3 = 0;
                while (i3 < 3) {
                    jxVar.f[i3] = org.telegram.messenger.g0.T1(fArr[i3], i3 == this.b ? 1.0f : 0.0f, floatValue);
                    i3++;
                }
                jxVar.a();
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.c;
                Integer num2 = (Integer) this.d;
                f0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                ug.d0 d0Var = f0Var.M0;
                if (d0Var != null) {
                    d0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b4(yq0 yq0Var, int i3, tj0 tj0Var) {
        this.a = 1;
        this.c = yq0Var;
        this.b = i3;
        this.d = tj0Var;
    }
}
