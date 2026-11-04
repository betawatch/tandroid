package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ c1(i2 i2Var, int i3) {
        this.a = i3;
        this.b = i2Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        i2 i2Var = this.b;
        Integer num = (Integer) obj;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.j2 j2Var = i2Var.c;
                boolean z10 = i2Var.s1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.s1 = z11;
                    j2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.q.y;
                        int i11 = i2Var.f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.v1, (-i11) / 3.0f));
                    }
                    j2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
                    break;
                }
                break;
            case 1:
                g1 g1Var = i2Var.n1;
                ValueAnimator valueAnimator = g1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && g1Var.getCurrentPosition() != num.intValue()) {
                    g1Var.D(num.intValue());
                    h2 h2Var = i2Var.o1;
                    h2Var.G = num.intValue();
                    h2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i12 = i2.z1;
                i2Var.M0(intValue);
                break;
        }
    }
}
