// default package

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay5 implements ht3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ay5(FrameLayout frameLayout, boolean z, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = z;
    }

    @Override // ht3
    public final void a(zna znaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = this.c;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                ry5 ry5Var = (ry5) frameLayout;
                tu7 tu7Var = ry5Var.l1;
                if (znaVar == ry5Var.v1) {
                    ry5Var.v1 = null;
                    if (!z2) {
                        tu7Var.setVisibility(8);
                    }
                    tu7Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                ry5 ry5Var2 = (ry5) frameLayout;
                ny5 ny5Var = ry5Var2.w1;
                if (znaVar == ry5Var2.C1) {
                    ry5Var2.C1 = null;
                    if (!z2) {
                        ny5Var.setVisibility(8);
                        m58.e(ry5Var2.F1).g();
                        ny5Var.getAdapter().f();
                        break;
                    }
                }
                break;
            default:
                u17 u17Var = (u17) frameLayout;
                if (!z) {
                    u17Var.L = null;
                    u17Var.setVisibility(z2 ? 8 : 0);
                    if (u17Var.O && z2) {
                        u17Var.O = false;
                        u17Var.b.setLayoutManager(u17Var.getNeededLayoutManager());
                        u17Var.J = true;
                        u17Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
