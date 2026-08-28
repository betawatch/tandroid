package ih;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ x7(int i9, FrameLayout frameLayout) {
        this.a = i9;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                e8 e8Var = (e8) this.b;
                e8Var.W = f10;
                e8Var.b0 = f11;
                break;
            case 1:
                kh.g6 g6Var = (kh.g6) this.b;
                float f12 = f10 / 1000.0f;
                g6Var.p1 = f12;
                yf.t1 t1Var = g6Var.i1;
                t1Var.setAlpha(f12);
                t1Var.invalidate();
                g6Var.Q0.invalidate();
                g6Var.h1.getTypefaceCell().setAlpha(1.0f - g6Var.p1);
                break;
            case 2:
                uf.h hVar2 = (uf.h) this.b;
                float f13 = f10 / 1000.0f;
                fh.v vVar = hVar2.a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f13);
                vVar.setScaleY(f13);
                vVar.setAlpha(g7.n.a(f13, 0.0f, 1.0f));
                hVar2.invalidate();
                break;
            default:
                yf.l0 l0Var = (yf.l0) this.b;
                float f14 = f10 / 1000.0f;
                l0Var.z1 = f14;
                yf.t1 t1Var2 = l0Var.r1;
                t1Var2.setAlpha(f14);
                t1Var2.invalidate();
                l0Var.Z0.invalidate();
                l0Var.q1.getTypefaceCell().setAlpha(1.0f - l0Var.z1);
                break;
        }
    }
}
