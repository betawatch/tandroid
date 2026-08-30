package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lp0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ lp0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        nb nbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    lq0 lq0Var = this.b;
                    lq0.s0(lq0Var);
                    lq0Var.n0 = lq0Var.m0;
                    break;
                }
                break;
            case 1:
                lq0 lq0Var2 = this.b;
                if (i11 != 0) {
                    lq0.s0(lq0Var2);
                    lq0Var2.n0 = lq0Var2.m0;
                }
                ic icVar = ic.w;
                if (icVar != null && (nbVar = icVar.e) != null && (nbVar.getParent() instanceof View) && ((View) ic.w.e.getParent()).getParent() == lq0Var2.w) {
                    ic.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = lq0Var2.L0) != null) {
                    eVar.f(i10, i11);
                    lq0.A0(lq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    lq0 lq0Var3 = this.b;
                    lq0.s0(lq0Var3);
                    lq0Var3.n0 = lq0Var3.m0;
                    break;
                }
                break;
        }
    }
}
