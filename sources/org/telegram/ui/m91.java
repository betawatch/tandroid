package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m91 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ na1 b;

    public /* synthetic */ m91(na1 na1Var, int i10) {
        this.a = i10;
        this.b = na1Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        na1 na1Var;
        og.e eVar2;
        na1 na1Var2;
        og.e eVar3;
        switch (this.a) {
            case 0:
                na1 na1Var3 = this.b;
                if (na1Var3.o0.size() != na1Var3.p0.size() && !na1Var3.t0 && na1Var3.R.N0() > na1Var3.U.Z - 20) {
                    na1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = na1Var3.z0) != null) {
                    eVar.f(i10, i11);
                    na1.W(na1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (na1Var = this.b).z0) != null) {
                    eVar2.f(i10, i11);
                    na1.W(na1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (na1Var2 = this.b).z0) != null) {
                    eVar3.f(i10, i11);
                    na1.W(na1Var2);
                    break;
                }
                break;
        }
    }
}
