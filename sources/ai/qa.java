package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                ci.q6 q6Var = (ci.q6) this.b;
                float f11 = f7 / 1000.0f;
                q6Var.t1 = f11;
                qg.t1 t1Var = q6Var.m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                q6Var.U0.invalidate();
                q6Var.l1.getTypefaceCell().setAlpha(1.0f - q6Var.t1);
                break;
            case 2:
                mg.i iVar = (mg.i) this.b;
                float f12 = f7 / 1000.0f;
                ci.m6 m6Var = iVar.a;
                m6Var.setPivotX(AndroidUtilities.dp(28.0f));
                m6Var.setPivotY(AndroidUtilities.dp(28.0f));
                m6Var.setScaleX(f12);
                m6Var.setScaleY(f12);
                m6Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
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
