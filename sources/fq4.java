// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fq4 implements eq4 {
    public final int a;
    public final /* synthetic */ hq4 b;

    public fq4(hq4 hq4Var, int i) {
        this.b = hq4Var;
        this.a = i;
    }

    @Override // eq4
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        hq4 hq4Var = this.b;
        dp4 dp4Var = hq4Var.z;
        int i = this.a;
        if (dp4Var == null || i >= 0 || !dp4Var.l().T(-1, 0)) {
            return hq4Var.U(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
