package hi;

import android.animation.ValueAnimator;
import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ e1(j2 j2Var, int i7) {
        this.a = i7;
        this.b = j2Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        j2 j2Var = this.b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = j2Var.c;
                boolean z10 = j2Var.v1;
                boolean z11 = j2Var.d;
                if (z10 != z11) {
                    j2Var.v1 = z11;
                    n2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (j2Var.d) {
                        int i10 = org.telegram.messenger.g0.q.y;
                        int i11 = j2Var.f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - j2Var.y1, (-i11) / 3.0f));
                    }
                    n2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.j1.w).start();
                    break;
                }
                break;
            case 1:
                i1 i1Var = j2Var.q1;
                ValueAnimator valueAnimator = i1Var.T;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && i1Var.getCurrentPosition() != num.intValue()) {
                    i1Var.A(num.intValue());
                    i2 i2Var = j2Var.r1;
                    i2Var.G = num.intValue();
                    i2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i12 = j2.C1;
                j2Var.N0(intValue);
                break;
        }
    }
}
