package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cp0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq0 b;

    public /* synthetic */ cp0(dq0 dq0Var, int i10) {
        this.a = i10;
        this.b = dq0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        rb rbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    dq0 dq0Var = this.b;
                    dq0.s0(dq0Var);
                    dq0Var.m0 = dq0Var.l0;
                    break;
                }
                break;
            case 1:
                dq0 dq0Var2 = this.b;
                if (i11 != 0) {
                    dq0.s0(dq0Var2);
                    dq0Var2.m0 = dq0Var2.l0;
                }
                mc mcVar = mc.w;
                if (mcVar != null && (rbVar = mcVar.e) != null && (rbVar.getParent() instanceof View) && ((View) mc.w.e.getParent()).getParent() == dq0Var2.w) {
                    mc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = dq0Var2.K0) != null) {
                    eVar.f(i10, i11);
                    dq0.A0(dq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    dq0 dq0Var3 = this.b;
                    dq0.s0(dq0Var3);
                    dq0Var3.m0 = dq0Var3.l0;
                    break;
                }
                break;
        }
    }
}
