package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kq0 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr0 b;

    public /* synthetic */ kq0(jr0 jr0Var, int i10) {
        this.a = i10;
        this.b = jr0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        wb wbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    jr0 jr0Var = this.b;
                    jr0.t0(jr0Var);
                    jr0Var.q0 = jr0Var.p0;
                    break;
                }
                break;
            case 1:
                jr0 jr0Var2 = this.b;
                if (i11 != 0) {
                    jr0.t0(jr0Var2);
                    jr0Var2.q0 = jr0Var2.p0;
                }
                sc scVar = sc.w;
                if (scVar != null && (wbVar = scVar.e) != null && (wbVar.getParent() instanceof View) && ((View) sc.w.e.getParent()).getParent() == jr0Var2.w) {
                    sc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = jr0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    jr0.B0(jr0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    jr0 jr0Var3 = this.b;
                    jr0.t0(jr0Var3);
                    jr0Var3.q0 = jr0Var3.p0;
                    break;
                }
                break;
        }
    }
}
