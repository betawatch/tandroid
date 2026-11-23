package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ m1(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        r2 r2Var = this.b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = r2Var.c;
                boolean z10 = r2Var.v1;
                boolean z11 = r2Var.d;
                if (z10 != z11) {
                    r2Var.v1 = z11;
                    m2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (r2Var.d) {
                        int i10 = org.telegram.messenger.g0.q.y;
                        int i11 = r2Var.f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - r2Var.y1, (-i11) / 3.0f));
                    }
                    m2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                    break;
                }
                break;
            case 1:
                q1 q1Var = r2Var.q1;
                ValueAnimator valueAnimator = q1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && q1Var.getCurrentPosition() != num.intValue()) {
                    q1Var.C(num.intValue());
                    q2 q2Var = r2Var.r1;
                    q2Var.G = num.intValue();
                    q2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i12 = r2.D1;
                r2Var.N0(intValue);
                break;
        }
    }
}
