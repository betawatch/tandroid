package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ro0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ ro0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bb bbVar;
        switch (this.a) {
            case 0:
                pp0 pp0Var = this.b;
                if (i11 != 0) {
                    pp0.I0(pp0Var);
                    pp0Var.i2 = pp0Var.h2;
                }
                wb wbVar = wb.w;
                if (wbVar != null && (bbVar = wbVar.e) != null && (bbVar.getParent() instanceof View) && ((View) wb.w.e.getParent()).getParent() == pp0Var.t1) {
                    wb.e();
                    break;
                }
                break;
            case 1:
                if (i11 != 0) {
                    pp0 pp0Var2 = this.b;
                    pp0.I0(pp0Var2);
                    pp0Var2.i2 = pp0Var2.h2;
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    pp0 pp0Var3 = this.b;
                    pp0.I0(pp0Var3);
                    pp0Var3.i2 = pp0Var3.h2;
                    break;
                }
                break;
        }
    }
}
