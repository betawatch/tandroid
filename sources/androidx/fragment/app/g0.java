package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
