package fg;

import android.widget.FrameLayout;
import jg.a2;
import jg.r0;
import org.telegram.messenger.i0;
import th.j6;
import vh.b4;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ c(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                float f11 = f7 / 1000.0f;
                i iVar = lVar.a;
                iVar.setPivotX(i0.L(28.0f));
                iVar.setPivotY(i0.L(28.0f));
                iVar.setScaleX(f11);
                iVar.setScaleY(f11);
                iVar.setAlpha(u.a(f11, 0.0f, 1.0f));
                lVar.invalidate();
                break;
            case 1:
                r0 r0Var = (r0) this.b;
                float f12 = f7 / 1000.0f;
                r0Var.m1 = f12;
                a2 a2Var = r0Var.e1;
                a2Var.setAlpha(f12);
                a2Var.invalidate();
                r0Var.M0.invalidate();
                r0Var.d1.getTypefaceCell().setAlpha(1.0f - r0Var.m1);
                break;
            case 2:
                j6 j6Var = (j6) this.b;
                j6Var.d0 = f7;
                j6Var.f0 = f10;
                break;
            default:
                b4 b4Var = (b4) this.b;
                float f13 = f7 / 1000.0f;
                b4Var.c1 = f13;
                a2 a2Var2 = b4Var.V0;
                a2Var2.setAlpha(f13);
                a2Var2.invalidate();
                b4Var.D0.invalidate();
                b4Var.U0.getTypefaceCell().setAlpha(1.0f - b4Var.c1);
                break;
        }
    }
}
