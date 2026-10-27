package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qq0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    public /* synthetic */ qq0(nr0 nr0Var, int i10) {
        this.a = i10;
        this.b = nr0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ub ubVar;
        switch (this.a) {
            case 0:
                nr0 nr0Var = this.b;
                if (i11 != 0) {
                    nr0.r0(nr0Var);
                    nr0Var.r0 = nr0Var.q0;
                }
                qc qcVar = qc.x;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.x.e.getParent()).getParent() == nr0Var.x) {
                    qc.e();
                    break;
                }
                break;
            case 1:
                if (i11 != 0) {
                    nr0 nr0Var2 = this.b;
                    nr0.r0(nr0Var2);
                    nr0Var2.r0 = nr0Var2.q0;
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    nr0 nr0Var3 = this.b;
                    nr0.r0(nr0Var3);
                    nr0Var3.r0 = nr0Var3.q0;
                    break;
                }
                break;
        }
    }
}
