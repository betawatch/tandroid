package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq0 b;

    public /* synthetic */ jp0(iq0 iq0Var, int i10) {
        this.a = i10;
        this.b = iq0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        sb sbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    iq0 iq0Var = this.b;
                    iq0.s0(iq0Var);
                    iq0Var.q0 = iq0Var.p0;
                    break;
                }
                break;
            case 1:
                iq0 iq0Var2 = this.b;
                if (i11 != 0) {
                    iq0.s0(iq0Var2);
                    iq0Var2.q0 = iq0Var2.p0;
                }
                oc ocVar = oc.w;
                if (ocVar != null && (sbVar = ocVar.e) != null && (sbVar.getParent() instanceof View) && ((View) oc.w.e.getParent()).getParent() == iq0Var2.w) {
                    oc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = iq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    iq0.A0(iq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    iq0 iq0Var3 = this.b;
                    iq0.s0(iq0Var3);
                    iq0Var3.q0 = iq0Var3.p0;
                    break;
                }
                break;
        }
    }
}
