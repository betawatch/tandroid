// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class iq4 implements hq4 {
    public final int a;
    public final /* synthetic */ kq4 b;

    public iq4(kq4 kq4Var, int i) {
        this.b = kq4Var;
        this.a = i;
    }

    @Override // hq4
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        kq4 kq4Var = this.b;
        gp4 gp4Var = kq4Var.z;
        int i = this.a;
        if (gp4Var == null || i >= 0 || !gp4Var.l().T(-1, 0)) {
            return kq4Var.U(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
