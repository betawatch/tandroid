package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f91 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga1 b;

    public /* synthetic */ f91(ga1 ga1Var, int i10) {
        this.a = i10;
        this.b = ga1Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        ga1 ga1Var;
        ng.e eVar2;
        ga1 ga1Var2;
        ng.e eVar3;
        switch (this.a) {
            case 0:
                ga1 ga1Var3 = this.b;
                if (ga1Var3.o0.size() != ga1Var3.p0.size() && !ga1Var3.t0 && ga1Var3.R.N0() > ga1Var3.U.Z - 20) {
                    ga1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = ga1Var3.z0) != null) {
                    eVar.f(i10, i11);
                    ga1.W(ga1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (ga1Var = this.b).z0) != null) {
                    eVar2.f(i10, i11);
                    ga1.W(ga1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (ga1Var2 = this.b).z0) != null) {
                    eVar3.f(i10, i11);
                    ga1.W(ga1Var2);
                    break;
                }
                break;
        }
    }
}
