package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h0 implements g0 {
    public final int a;
    public final /* synthetic */ j0 b;

    public h0(j0 j0Var, int i9) {
        this.b = j0Var;
        this.a = i9;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        j0 j0Var = this.b;
        s sVar = j0Var.z;
        int i9 = this.a;
        if (sVar == null || i9 >= 0 || !sVar.l().T(-1, 0)) {
            return j0Var.U(i9, 1, arrayList, arrayList2);
        }
        return false;
    }
}
