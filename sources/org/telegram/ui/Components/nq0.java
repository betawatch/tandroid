package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nq0 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ nq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        xb xbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    mr0 mr0Var = this.b;
                    mr0.t0(mr0Var);
                    mr0Var.q0 = mr0Var.p0;
                    break;
                }
                break;
            case 1:
                mr0 mr0Var2 = this.b;
                if (i11 != 0) {
                    mr0.t0(mr0Var2);
                    mr0Var2.q0 = mr0Var2.p0;
                }
                tc tcVar = tc.w;
                if (tcVar != null && (xbVar = tcVar.e) != null && (xbVar.getParent() instanceof View) && ((View) tc.w.e.getParent()).getParent() == mr0Var2.w) {
                    tc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = mr0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    mr0.B0(mr0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    mr0 mr0Var3 = this.b;
                    mr0.t0(mr0Var3);
                    mr0Var3.q0 = mr0Var3.p0;
                    break;
                }
                break;
        }
    }
}
