package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ aa(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ha haVar = (ha) this.b;
                haVar.d0 = f7;
                haVar.f0 = f10;
                break;
            case 1:
                di.o6 o6Var = (di.o6) this.b;
                float f11 = f7 / 1000.0f;
                o6Var.t1 = f11;
                rg.v1 v1Var = o6Var.m1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
                o6Var.U0.invalidate();
                o6Var.l1.getTypefaceCell().setAlpha(1.0f - o6Var.t1);
                break;
            case 2:
                ng.i iVar = (ng.i) this.b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.s.a(f12, 0.0f, 1.0f));
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
