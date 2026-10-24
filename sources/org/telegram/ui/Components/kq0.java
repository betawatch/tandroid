package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kq0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    public /* synthetic */ kq0(ir0 ir0Var, int i10) {
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    ir0 ir0Var = this.b;
                    ir0.z0(ir0Var);
                    ir0Var.r0 = ir0Var.q0;
                    break;
                }
                break;
            case 1:
                ir0 ir0Var2 = this.b;
                if (i11 != 0) {
                    ir0.z0(ir0Var2);
                    ir0Var2.r0 = ir0Var2.q0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == ir0Var2.x) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = ir0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    ir0.J0(ir0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    ir0 ir0Var3 = this.b;
                    ir0.z0(ir0Var3);
                    ir0Var3.r0 = ir0Var3.q0;
                    break;
                }
                break;
        }
    }
}
