package lh;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n4(as0 as0Var, int i10, zk0 zk0Var) {
        this.a = 1;
        this.c = as0Var;
        this.b = i10;
        this.d = zk0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.w1.a = i0.b.d(floatValue, num.intValue(), this.b);
                b6 b6Var = f6Var.P0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    break;
                }
                break;
            case 1:
                as0 as0Var = (as0) this.c;
                zk0 zk0Var = (zk0) this.d;
                as0Var.e.K1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                zk0Var.invalidate();
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.G1.a = i0.b.d(floatValue2, num2.intValue(), this.b);
                zf.j0 j0Var = l0Var.Y0;
                if (j0Var != null) {
                    j0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n4(av0 av0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = av0Var;
        this.d = num;
        this.b = i10;
    }
}
