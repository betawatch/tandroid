package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class fq0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;

    public /* synthetic */ fq0(er0 er0Var, int i10) {
        this.a = i10;
        this.b = er0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    er0 er0Var = this.b;
                    er0.v0(er0Var);
                    er0Var.r0 = er0Var.q0;
                    break;
                }
                break;
            case 1:
                er0 er0Var2 = this.b;
                if (i11 != 0) {
                    er0.v0(er0Var2);
                    er0Var2.r0 = er0Var2.q0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == er0Var2.x) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = er0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    er0.E0(er0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    er0 er0Var3 = this.b;
                    er0.v0(er0Var3);
                    er0Var3.r0 = er0Var3.q0;
                    break;
                }
                break;
        }
    }
}
