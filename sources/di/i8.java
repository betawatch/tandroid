package di;

import a8.ee;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                sg.v1 v1Var = e6Var.b1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
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
                sg.n0 n0Var = (sg.n0) this.b;
                float f13 = f7 / 1000.0f;
                n0Var.s1 = f13;
                sg.v1 v1Var2 = n0Var.k1;
                v1Var2.setAlpha(f13);
                v1Var2.invalidate();
                n0Var.S0.invalidate();
                n0Var.j1.getTypefaceCell().setAlpha(1.0f - n0Var.s1);
                break;
        }
    }
}
