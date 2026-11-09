package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rn0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ rn0(no0 no0Var, int i7) {
        this.a = i7;
        this.b = no0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gb gbVar;
        switch (this.a) {
            case 0:
                no0 no0Var = this.b;
                if (i10 != 0) {
                    no0.I0(no0Var);
                    no0Var.i2 = no0Var.h2;
                }
                cc ccVar = cc.w;
                if (ccVar != null && (gbVar = ccVar.e) != null && (gbVar.getParent() instanceof View) && ((View) cc.w.e.getParent()).getParent() == no0Var.t1) {
                    cc.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    no0 no0Var2 = this.b;
                    no0.I0(no0Var2);
                    no0Var2.i2 = no0Var2.h2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    no0 no0Var3 = this.b;
                    no0.I0(no0Var3);
                    no0Var3.i2 = no0Var3.h2;
                    break;
                }
                break;
        }
    }
}
