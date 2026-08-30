package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pc(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.j81 j81Var;
        switch (this.a) {
            case 0:
                sc scVar = (sc) this.c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.b.getClass();
                boolean z4 = RecyclerView.R(view) == scVar.e;
                rcVar.s = z4;
                if (!this.b) {
                    rcVar.v.f(z4, true);
                }
                rcVar.invalidate();
                break;
            case 1:
                xn xnVar = (xn) this.c;
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z11 = this.b;
                if (!z10) {
                    if (view2 instanceof org.telegram.ui.Cells.v0) {
                        ((org.telegram.ui.Cells.v0) view2).b0 = z11;
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if ((t1Var.B8 && t1Var.D8) != z11 && xnVar.B9()) {
                        t1Var.B8 = z11;
                        t1Var.D8 = xnVar.B9();
                        t1Var.k8 = true;
                        t1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.k81 k81Var = (org.telegram.ui.Components.k81) this.c;
                View view3 = (View) obj;
                k81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.i81) {
                    ((org.telegram.ui.Components.i81) view3).setReordering(this.b && (j81Var = k81Var.y) != null && ((o2.o) j81Var).j(R));
                    break;
                }
                break;
        }
    }
}
