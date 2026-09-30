package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class xp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq0 b;

    public /* synthetic */ xp0(wq0 wq0Var, int i10) {
        this.a = i10;
        this.b = wq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    wq0 wq0Var = this.b;
                    wq0.s0(wq0Var);
                    wq0Var.q0 = wq0Var.p0;
                    break;
                }
                break;
            case 1:
                wq0 wq0Var2 = this.b;
                if (i11 != 0) {
                    wq0.s0(wq0Var2);
                    wq0Var2.q0 = wq0Var2.p0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == wq0Var2.w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = wq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    wq0.A0(wq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    wq0 wq0Var3 = this.b;
                    wq0.s0(wq0Var3);
                    wq0Var3.q0 = wq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
