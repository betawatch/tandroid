package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class eq0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0 b;

    public /* synthetic */ eq0(dr0 dr0Var, int i10) {
        this.a = i10;
        this.b = dr0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    dr0 dr0Var = this.b;
                    dr0.t0(dr0Var);
                    dr0Var.q0 = dr0Var.p0;
                    break;
                }
                break;
            case 1:
                dr0 dr0Var2 = this.b;
                if (i11 != 0) {
                    dr0.t0(dr0Var2);
                    dr0Var2.q0 = dr0Var2.p0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == dr0Var2.w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = dr0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    dr0.B0(dr0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    dr0 dr0Var3 = this.b;
                    dr0.t0(dr0Var3);
                    dr0Var3.q0 = dr0Var3.p0;
                    break;
                }
                break;
        }
    }
}
