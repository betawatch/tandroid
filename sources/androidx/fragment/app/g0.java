package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
