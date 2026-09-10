package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ i6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                float f11 = f7 / 1000.0f;
                r7Var.t1 = f11;
                pg.t1 t1Var = r7Var.m1;
                t1Var.setAlpha(f11);
                t1Var.invalidate();
                r7Var.U0.invalidate();
                r7Var.l1.getTypefaceCell().setAlpha(1.0f - r7Var.t1);
                break;
            case 1:
                lg.i iVar = (lg.i) this.b;
                float f12 = f7 / 1000.0f;
                n7 n7Var = iVar.a;
                n7Var.setPivotX(AndroidUtilities.dp(28.0f));
                n7Var.setPivotY(AndroidUtilities.dp(28.0f));
                n7Var.setScaleX(f12);
                n7Var.setScaleY(f12);
                n7Var.setAlpha(w7.q.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            case 2:
                pg.m0 m0Var = (pg.m0) this.b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                pg.t1 t1Var2 = m0Var.v1;
                t1Var2.setAlpha(f13);
                t1Var2.invalidate();
                m0Var.d1.invalidate();
                m0Var.u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                break;
            default:
                zh.p6 p6Var = (zh.p6) this.b;
                p6Var.d0 = f7;
                p6Var.f0 = f10;
                break;
        }
    }
}
