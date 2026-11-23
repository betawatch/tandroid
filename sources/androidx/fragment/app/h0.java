package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h0 implements g0 {
    public final int a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, int i7) {
        this.b = j0Var;
        this.a = i7;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.b;
        s sVar = j0Var.z;
        int i7 = this.a;
        if (sVar == null || i7 >= 0 || !sVar.l().T(-1, 0)) {
            return j0Var.U(arrayList, arrayList2, i7, 1);
        }
        return false;
    }
}
