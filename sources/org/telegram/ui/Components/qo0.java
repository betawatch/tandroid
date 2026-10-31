package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qo0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ qo0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bb bbVar;
        switch (this.a) {
            case 0:
                op0 op0Var = this.b;
                if (i11 != 0) {
                    op0.I0(op0Var);
                    op0Var.i2 = op0Var.h2;
                }
                wb wbVar = wb.w;
                if (wbVar != null && (bbVar = wbVar.e) != null && (bbVar.getParent() instanceof View) && ((View) wb.w.e.getParent()).getParent() == op0Var.t1) {
                    wb.e();
                    break;
                }
                break;
            case 1:
                if (i11 != 0) {
                    op0 op0Var2 = this.b;
                    op0.I0(op0Var2);
                    op0Var2.i2 = op0Var2.h2;
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    op0 op0Var3 = this.b;
                    op0.I0(op0Var3);
                    op0Var3.i2 = op0Var3.h2;
                    break;
                }
                break;
        }
    }
}
