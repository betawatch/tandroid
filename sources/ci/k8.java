package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ k8(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                r8 r8Var = (r8) this.b;
                r8Var.d0 = f7;
                r8Var.f0 = f10;
                break;
            case 1:
                ei.f6 f6Var = (ei.f6) this.b;
                float f11 = f7 / 1000.0f;
                f6Var.t1 = f11;
                rg.t1 t1Var = f6Var.m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                f6Var.U0.invalidate();
                f6Var.l1.getTypefaceCell().setAlpha(1.0f - f6Var.t1);
                break;
            case 2:
                ng.i iVar = (ng.i) this.b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.r.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                rg.t1 t1Var2 = m0Var.v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.d1.invalidate();
                m0Var.u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                break;
        }
    }
}
