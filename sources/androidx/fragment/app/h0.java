package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h0 implements g0 {
    public final int a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, int i10) {
        this.b = j0Var;
        this.a = i10;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.b;
        s sVar = j0Var.z;
        int i10 = this.a;
        if (sVar == null || i10 >= 0 || !sVar.l().T(-1, 0)) {
            return j0Var.U(i10, 1, arrayList, arrayList2);
        }
        return false;
    }
}
