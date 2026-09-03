package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n91 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa1 b;

    public /* synthetic */ n91(oa1 oa1Var, int i10) {
        this.a = i10;
        this.b = oa1Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        oa1 oa1Var;
        ng.e eVar2;
        oa1 oa1Var2;
        ng.e eVar3;
        switch (this.a) {
            case 0:
                oa1 oa1Var3 = this.b;
                if (oa1Var3.o0.size() != oa1Var3.p0.size() && !oa1Var3.t0 && oa1Var3.R.N0() > oa1Var3.U.Z - 20) {
                    oa1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = oa1Var3.z0) != null) {
                    eVar.f(i10, i11);
                    oa1.W(oa1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (oa1Var = this.b).z0) != null) {
                    eVar2.f(i10, i11);
                    oa1.W(oa1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (oa1Var2 = this.b).z0) != null) {
                    eVar3.f(i10, i11);
                    oa1.W(oa1Var2);
                    break;
                }
                break;
        }
    }
}
