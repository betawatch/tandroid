package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;

    public /* synthetic */ d1(i2 i2Var, int i7) {
        this.a = i7;
        this.b = i2Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        i2 i2Var = this.b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = i2Var.c;
                boolean z10 = i2Var.v1;
                boolean z11 = i2Var.d;
                if (z10 != z11) {
                    i2Var.v1 = z11;
                    k2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (i2Var.d) {
                        int i10 = org.telegram.messenger.g0.q.y;
                        int i11 = i2Var.f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - i2Var.y1, (-i11) / 3.0f));
                    }
                    k2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                    break;
                }
                break;
            case 1:
                i1 i1Var = i2Var.q1;
                ValueAnimator valueAnimator = i1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.C(num.intValue());
                    h2 h2Var = i2Var.r1;
                    h2Var.G = num.intValue();
                    h2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i12 = i2.C1;
                i2Var.M0(intValue);
                break;
        }
    }
}
