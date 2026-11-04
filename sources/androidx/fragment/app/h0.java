package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 implements g0 {
    public final int a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, int i3) {
        this.b = j0Var;
        this.a = i3;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.b;
        s sVar = j0Var.z;
        int i3 = this.a;
        if (sVar == null || i3 >= 0 || !sVar.l().T(-1, 0)) {
            return j0Var.U(arrayList, arrayList2, i3, 1);
        }
        return false;
    }
}
