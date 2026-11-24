// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iy9 extends yp {
    public final /* synthetic */ byte c;
    public final /* synthetic */ vz9 d;

    public /* synthetic */ iy9(vz9 vz9Var, byte b) {
        this.c = b;
        this.d = vz9Var;
    }

    @Override // yp
    public final int i(int i) {
        int i2;
        byte b = this.c;
        vz9 vz9Var = this.d;
        switch (b) {
            case 0:
                return (vz9Var.x0.indexOfKey(i) >= 0 || vz9Var.A0.indexOfKey(i) >= 0 || i == vz9Var.f || i == vz9Var.E || i == vz9Var.n || i == vz9Var.h || i == vz9Var.w || i == vz9Var.a || i == vz9Var.y) ? vz9Var.s0.J : ((i < vz9Var.F || i >= vz9Var.G) && !vz9Var.R) ? 5 : 8;
            default:
                gz9 gz9Var = vz9Var.r0;
                int d = gz9Var.d(i);
                if (d == 6) {
                    return vz9Var.s0.J;
                }
                if (d == 5) {
                    return 8;
                }
                vz9 vz9Var2 = gz9Var.s;
                if (vz9Var2.a0 == 14) {
                    ArrayList arrayList = vz9Var2.D1;
                    if (arrayList != null && i >= (i2 = gz9Var.c) && i - i2 < arrayList.size()) {
                        return 8;
                    }
                } else {
                    if (i > gz9Var.c && (i - r0) - 1 < vz9Var2.E1.size()) {
                        return 8;
                    }
                }
                return 5;
        }
    }
}
