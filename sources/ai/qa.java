package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ qa(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                xa xaVar = (xa) this.b;
                xaVar.d0 = f7;
                xaVar.f0 = f10;
                break;
            case 1:
                ci.r6 r6Var = (ci.r6) this.b;
                float f11 = f7 / 1000.0f;
                r6Var.t1 = f11;
                qg.w1 w1Var = r6Var.m1;
                w1Var.setAlpha(f11);
                w1Var.invalidate();
                r6Var.U0.invalidate();
                r6Var.l1.getTypefaceCell().setAlpha(1.0f - r6Var.t1);
                break;
            case 2:
                mg.i iVar = (mg.i) this.b;
                float f12 = f7 / 1000.0f;
                ci.n6 n6Var = iVar.a;
                n6Var.setPivotX(AndroidUtilities.dp(28.0f));
                n6Var.setPivotY(AndroidUtilities.dp(28.0f));
                n6Var.setScaleX(f12);
                n6Var.setScaleY(f12);
                n6Var.setAlpha(w7.p.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.b;
                float f13 = f7 / 1000.0f;
                p0Var.D1 = f13;
                qg.w1 w1Var2 = p0Var.v1;
                w1Var2.setAlpha(f13);
                w1Var2.invalidate();
                p0Var.d1.invalidate();
                p0Var.u1.getTypefaceCell().setAlpha(1.0f - p0Var.D1);
                break;
        }
    }
}
