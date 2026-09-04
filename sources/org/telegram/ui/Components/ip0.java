package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ip0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ ip0(hq0 hq0Var, int i10) {
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    hq0 hq0Var = this.b;
                    hq0.s0(hq0Var);
                    hq0Var.q0 = hq0Var.p0;
                    break;
                }
                break;
            case 1:
                hq0 hq0Var2 = this.b;
                if (i11 != 0) {
                    hq0.s0(hq0Var2);
                    hq0Var2.q0 = hq0Var2.p0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == hq0Var2.w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = hq0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    hq0.A0(hq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    hq0 hq0Var3 = this.b;
                    hq0.s0(hq0Var3);
                    hq0Var3.q0 = hq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
