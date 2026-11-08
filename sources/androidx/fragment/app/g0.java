package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g0 implements f0 {
    public final int a;
    public final /* synthetic */ i0 b;

    public g0(i0 i0Var, int i7) {
        this.b = i0Var;
        this.a = i7;
    }

    @Override // androidx.fragment.app.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        i0 i0Var = this.b;
        r rVar = i0Var.z;
        int i7 = this.a;
        if (rVar == null || i7 >= 0 || !rVar.l().T(-1, 0)) {
            return i0Var.U(arrayList, arrayList2, i7, 1);
        }
        return false;
    }
}
