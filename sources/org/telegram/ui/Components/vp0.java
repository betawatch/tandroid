package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ vp0(uq0 uq0Var, int i10) {
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    uq0 uq0Var = this.b;
                    uq0.s0(uq0Var);
                    uq0Var.q0 = uq0Var.p0;
                    break;
                }
                break;
            case 1:
                uq0 uq0Var2 = this.b;
                if (i11 != 0) {
                    uq0.s0(uq0Var2);
                    uq0Var2.q0 = uq0Var2.p0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == uq0Var2.w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = uq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    uq0.A0(uq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    uq0 uq0Var3 = this.b;
                    uq0.s0(uq0Var3);
                    uq0Var3.q0 = uq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
