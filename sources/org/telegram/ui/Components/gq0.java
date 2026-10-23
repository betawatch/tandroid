package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gq0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr0 b;

    public /* synthetic */ gq0(fr0 fr0Var, int i10) {
        this.a = i10;
        this.b = fr0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    fr0 fr0Var = this.b;
                    fr0.v0(fr0Var);
                    fr0Var.r0 = fr0Var.q0;
                    break;
                }
                break;
            case 1:
                fr0 fr0Var2 = this.b;
                if (i11 != 0) {
                    fr0.v0(fr0Var2);
                    fr0Var2.r0 = fr0Var2.q0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == fr0Var2.x) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = fr0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    fr0.E0(fr0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    fr0 fr0Var3 = this.b;
                    fr0.v0(fr0Var3);
                    fr0Var3.r0 = fr0Var3.q0;
                    break;
                }
                break;
        }
    }
}
