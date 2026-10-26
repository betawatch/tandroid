package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pq0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ pq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ub ubVar;
        switch (this.a) {
            case 0:
                mr0 mr0Var = this.b;
                if (i11 != 0) {
                    mr0.r0(mr0Var);
                    mr0Var.r0 = mr0Var.q0;
                }
                qc qcVar = qc.x;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.x.e.getParent()).getParent() == mr0Var.x) {
                    qc.e();
                    break;
                }
                break;
            case 1:
                if (i11 != 0) {
                    mr0 mr0Var2 = this.b;
                    mr0.r0(mr0Var2);
                    mr0Var2.r0 = mr0Var2.q0;
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    mr0 mr0Var3 = this.b;
                    mr0.r0(mr0Var3);
                    mr0Var3.r0 = mr0Var3.q0;
                    break;
                }
                break;
        }
    }
}
