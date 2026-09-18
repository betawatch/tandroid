package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                qg.t1 t1Var = r6Var.m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
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
                n6Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                qg.m0 m0Var = (qg.m0) this.b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                qg.t1 t1Var2 = m0Var.v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.d1.invalidate();
                m0Var.u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                break;
        }
    }
}
