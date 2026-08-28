package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kc(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.l71 l71Var;
        switch (this.a) {
            case 0:
                nc ncVar = (nc) this.c;
                View view = (View) obj;
                mc mcVar = (mc) view;
                ncVar.b.getClass();
                boolean z10 = RecyclerView.R(view) == ncVar.e;
                mcVar.s = z10;
                if (!this.b) {
                    mcVar.v.f(z10, true);
                }
                mcVar.invalidate();
                break;
            case 1:
                qn qnVar = (qn) this.c;
                View view2 = (View) obj;
                boolean z11 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z12 = this.b;
                if (!z11) {
                    if (view2 instanceof org.telegram.ui.Cells.w0) {
                        ((org.telegram.ui.Cells.w0) view2).a0 = z12;
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if ((t1Var.A8 && t1Var.C8) != z12 && qnVar.B9()) {
                        t1Var.A8 = z12;
                        t1Var.C8 = qnVar.B9();
                        t1Var.j8 = true;
                        t1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) this.c;
                View view3 = (View) obj;
                m71Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.k71) {
                    ((org.telegram.ui.Components.k71) view3).setReordering(this.b && (l71Var = m71Var.y) != null && ((n2.p) l71Var).o(R));
                    break;
                }
                break;
        }
    }
}
