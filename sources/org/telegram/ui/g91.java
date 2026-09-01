package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g91 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha1 b;

    public /* synthetic */ g91(ha1 ha1Var, int i10) {
        this.a = i10;
        this.b = ha1Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        ha1 ha1Var;
        og.e eVar2;
        ha1 ha1Var2;
        og.e eVar3;
        switch (this.a) {
            case 0:
                ha1 ha1Var3 = this.b;
                if (ha1Var3.o0.size() != ha1Var3.p0.size() && !ha1Var3.t0 && ha1Var3.R.N0() > ha1Var3.U.Z - 20) {
                    ha1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = ha1Var3.z0) != null) {
                    eVar.f(i10, i11);
                    ha1.W(ha1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (ha1Var = this.b).z0) != null) {
                    eVar2.f(i10, i11);
                    ha1.W(ha1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (ha1Var2 = this.b).z0) != null) {
                    eVar3.f(i10, i11);
                    ha1.W(ha1Var2);
                    break;
                }
                break;
        }
    }
}
