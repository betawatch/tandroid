package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
