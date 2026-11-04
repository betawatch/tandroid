package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sn0 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ sn0(oo0 oo0Var, int i3) {
        this.a = i3;
        this.b = oo0Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        fb fbVar;
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.b;
                if (i10 != 0) {
                    oo0.I0(oo0Var);
                    oo0Var.j2 = oo0Var.i2;
                }
                ac acVar = ac.w;
                if (acVar != null && (fbVar = acVar.e) != null && (fbVar.getParent() instanceof View) && ((View) ac.w.e.getParent()).getParent() == oo0Var.u1) {
                    ac.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    oo0 oo0Var2 = this.b;
                    oo0.I0(oo0Var2);
                    oo0Var2.j2 = oo0Var2.i2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    oo0 oo0Var3 = this.b;
                    oo0.I0(oo0Var3);
                    oo0Var3.j2 = oo0Var3.i2;
                    break;
                }
                break;
        }
    }
}
