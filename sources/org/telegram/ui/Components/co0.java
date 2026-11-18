package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
