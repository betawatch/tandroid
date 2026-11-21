package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ e1(i2 i2Var, int i7) {
        this.a = i7;
        this.b = i2Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        i2 i2Var = this.b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = i2Var.c;
                boolean z10 = i2Var.v1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.v1 = z11;
                    m2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.q.y;
                        int i11 = i2Var.f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.y1, (-i11) / 3.0f));
                    }
                    m2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                    break;
                }
                break;
            case 1:
                i1 i1Var = i2Var.q1;
                ValueAnimator valueAnimator = i1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.A(num.intValue());
                    h2 h2Var = i2Var.r1;
                    h2Var.G = num.intValue();
                    h2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i12 = i2.C1;
                i2Var.N0(intValue);
                break;
        }
    }
}
