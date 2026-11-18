package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class co0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo0 b;

    public /* synthetic */ co0(yo0 yo0Var, int i7) {
        this.a = i7;
        this.b = yo0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        lb lbVar;
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.b;
                if (i10 != 0) {
                    yo0.J0(yo0Var);
                    yo0Var.m2 = yo0Var.l2;
                }
                gc gcVar = gc.w;
                if (gcVar != null && (lbVar = gcVar.e) != null && (lbVar.getParent() instanceof View) && ((View) gc.w.e.getParent()).getParent() == yo0Var.x1) {
                    gc.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    yo0 yo0Var2 = this.b;
                    yo0.J0(yo0Var2);
                    yo0Var2.m2 = yo0Var2.l2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    yo0 yo0Var3 = this.b;
                    yo0.J0(yo0Var3);
                    yo0Var3.m2 = yo0Var3.l2;
                    break;
                }
                break;
        }
    }
}
