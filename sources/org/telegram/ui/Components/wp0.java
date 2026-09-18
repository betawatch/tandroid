package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class wp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq0 b;

    public /* synthetic */ wp0(vq0 vq0Var, int i10) {
        this.a = i10;
        this.b = vq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        ub ubVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    vq0 vq0Var = this.b;
                    vq0.s0(vq0Var);
                    vq0Var.q0 = vq0Var.p0;
                    break;
                }
                break;
            case 1:
                vq0 vq0Var2 = this.b;
                if (i11 != 0) {
                    vq0.s0(vq0Var2);
                    vq0Var2.q0 = vq0Var2.p0;
                }
                qc qcVar = qc.w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.w.e.getParent()).getParent() == vq0Var2.w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = vq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    vq0.A0(vq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    vq0 vq0Var3 = this.b;
                    vq0.s0(vq0Var3);
                    vq0Var3.q0 = vq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
