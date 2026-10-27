package di;

import a8.ee;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ i8(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                p8 p8Var = (p8) this.b;
                p8Var.d0 = f7;
                p8Var.f0 = f10;
                break;
            case 1:
                fi.e6 e6Var = (fi.e6) this.b;
                float f11 = f7 / 1000.0f;
                e6Var.i1 = f11;
                sg.u1 u1Var = e6Var.b1;
                u1Var.setAlpha(f11);
                u1Var.invalidate();
                e6Var.J0.invalidate();
                e6Var.a1.getTypefaceCell().setAlpha(1.0f - e6Var.i1);
                break;
            case 2:
                og.i iVar = (og.i) this.b;
                float f12 = f7 / 1000.0f;
                bh.p pVar = iVar.a;
                pVar.setPivotX(AndroidUtilities.dp(28.0f));
                pVar.setPivotY(AndroidUtilities.dp(28.0f));
                pVar.setScaleX(f12);
                pVar.setScaleY(f12);
                pVar.setAlpha(ee.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.b;
                float f13 = f7 / 1000.0f;
                m0Var.s1 = f13;
                sg.u1 u1Var2 = m0Var.k1;
                u1Var2.setAlpha(f13);
                u1Var2.invalidate();
                m0Var.S0.invalidate();
                m0Var.j1.getTypefaceCell().setAlpha(1.0f - m0Var.s1);
                break;
        }
    }
}
