package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g0 implements f0 {
    public final int a;
    public final /* synthetic */ i0 b;

    public g0(i0 i0Var, int i10) {
        this.b = i0Var;
        this.a = i10;
    }

    @Override // androidx.fragment.app.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        i0 i0Var = this.b;
        r rVar = i0Var.z;
        int i10 = this.a;
        if (rVar == null || i10 >= 0 || !rVar.l().T(-1, 0)) {
            return i0Var.U(i10, 1, arrayList, arrayList2);
        }
        return false;
    }
}
