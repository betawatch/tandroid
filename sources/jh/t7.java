package jh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ t7(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                a8 a8Var = (a8) this.b;
                a8Var.W = f10;
                a8Var.b0 = f11;
                break;
            case 1:
                lh.f6 f6Var = (lh.f6) this.b;
                float f12 = f10 / 1000.0f;
                f6Var.p1 = f12;
                zf.t1 t1Var = f6Var.i1;
                t1Var.setAlpha(f12);
                t1Var.invalidate();
                f6Var.Q0.invalidate();
                f6Var.h1.getTypefaceCell().setAlpha(1.0f - f6Var.p1);
                break;
            case 2:
                vf.i iVar = (vf.i) this.b;
                float f13 = f10 / 1000.0f;
                vf.g gVar = iVar.a;
                gVar.setPivotX(AndroidUtilities.dp(28.0f));
                gVar.setPivotY(AndroidUtilities.dp(28.0f));
                gVar.setScaleX(f13);
                gVar.setScaleY(f13);
                gVar.setAlpha(h7.n.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.b;
                float f14 = f10 / 1000.0f;
                l0Var.z1 = f14;
                zf.t1 t1Var2 = l0Var.r1;
                t1Var2.setAlpha(f14);
                t1Var2.invalidate();
                l0Var.Z0.invalidate();
                l0Var.q1.getTypefaceCell().setAlpha(1.0f - l0Var.z1);
                break;
        }
    }
}
