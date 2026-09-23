package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class i0 implements h0 {
    public final int a;
    public final /* synthetic */ k0 b;

    public i0(k0 k0Var, int i10) {
        this.b = k0Var;
        this.a = i10;
    }

    @Override // androidx.fragment.app.h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        k0 k0Var = this.b;
        s sVar = k0Var.z;
        int i10 = this.a;
        if (sVar == null || i10 >= 0 || !sVar.l().T(-1, 0)) {
            return k0Var.U(i10, 1, arrayList, arrayList2);
        }
        return false;
    }
}
