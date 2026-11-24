// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aw5 implements xr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ aw5(FrameLayout frameLayout, boolean z, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = z;
    }

    @Override // xr3
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                rw5 rw5Var = (rw5) frameLayout;
                ss7 ss7Var = rw5Var.l1;
                if (ylaVar == rw5Var.v1) {
                    rw5Var.v1 = null;
                    if (!z2) {
                        ss7Var.setVisibility(8);
                    }
                    ss7Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                rw5 rw5Var2 = (rw5) frameLayout;
                nw5 nw5Var = rw5Var2.w1;
                if (ylaVar == rw5Var2.C1) {
                    rw5Var2.C1 = null;
                    if (!z2) {
                        nw5Var.setVisibility(8);
                        k38.e(rw5Var2.F1).g();
                        nw5Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                uz6 uz6Var = (uz6) frameLayout;
                if (!z) {
                    uz6Var.L = null;
                    uz6Var.setVisibility(z2 ? 8 : 0);
                    if (uz6Var.O && z2) {
                        uz6Var.O = false;
                        uz6Var.b.setLayoutManager(uz6Var.getNeededLayoutManager());
                        uz6Var.J = true;
                        uz6Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
