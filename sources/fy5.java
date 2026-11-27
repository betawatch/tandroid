// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fy5 implements ps3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fy5(FrameLayout frameLayout, boolean z, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = z;
    }

    @Override // ps3
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                wy5 wy5Var = (wy5) frameLayout;
                zv7 zv7Var = wy5Var.f1;
                if (vpaVar == wy5Var.p1) {
                    wy5Var.p1 = null;
                    if (!z2) {
                        zv7Var.setVisibility(8);
                    }
                    zv7Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                wy5 wy5Var2 = (wy5) frameLayout;
                sy5 sy5Var = wy5Var2.q1;
                if (vpaVar == wy5Var2.w1) {
                    wy5Var2.w1 = null;
                    if (!z2) {
                        sy5Var.setVisibility(8);
                        a78.e(wy5Var2.z1).g();
                        sy5Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                b27 b27Var = (b27) frameLayout;
                if (!z) {
                    b27Var.L = null;
                    b27Var.setVisibility(z2 ? 8 : 0);
                    if (b27Var.O && z2) {
                        b27Var.O = false;
                        b27Var.b.setLayoutManager(b27Var.getNeededLayoutManager());
                        b27Var.J = true;
                        b27Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
