package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ x9(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ea eaVar = (ea) this.b;
                eaVar.d0 = f7;
                eaVar.f0 = f10;
                break;
            case 1:
                di.q6 q6Var = (di.q6) this.b;
                float f11 = f7 / 1000.0f;
                q6Var.t1 = f11;
                rg.v1 v1Var = q6Var.m1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
                q6Var.U0.invalidate();
                q6Var.l1.getTypefaceCell().setAlpha(1.0f - q6Var.t1);
                break;
            case 2:
                ng.i iVar = (ng.i) this.b;
                float f12 = f7 / 1000.0f;
                ah.w wVar = iVar.a;
                wVar.setPivotX(AndroidUtilities.dp(28.0f));
                wVar.setPivotY(AndroidUtilities.dp(28.0f));
                wVar.setScaleX(f12);
                wVar.setScaleY(f12);
                wVar.setAlpha(w7.p.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.b;
                float f13 = f7 / 1000.0f;
                o0Var.D1 = f13;
                rg.v1 v1Var2 = o0Var.v1;
                v1Var2.setAlpha(f13);
                v1Var2.invalidate();
                o0Var.d1.invalidate();
                o0Var.u1.getTypefaceCell().setAlpha(1.0f - o0Var.D1);
                break;
        }
    }
}
