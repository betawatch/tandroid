package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lc(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.n71 n71Var;
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.c;
                View view = (View) obj;
                nc ncVar = (nc) view;
                ocVar.b.getClass();
                boolean z10 = RecyclerView.R(view) == ocVar.e;
                ncVar.s = z10;
                if (!this.b) {
                    ncVar.v.f(z10, true);
                }
                ncVar.invalidate();
                break;
            case 1:
                rn rnVar = (rn) this.c;
                View view2 = (View) obj;
                boolean z11 = view2 instanceof org.telegram.ui.Cells.s1;
                boolean z12 = this.b;
                if (!z11) {
                    if (view2 instanceof org.telegram.ui.Cells.v0) {
                        ((org.telegram.ui.Cells.v0) view2).a0 = z12;
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                    if ((s1Var.A8 && s1Var.C8) != z12 && rnVar.B9()) {
                        s1Var.A8 = z12;
                        s1Var.C8 = rnVar.B9();
                        s1Var.j8 = true;
                        s1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.o71 o71Var = (org.telegram.ui.Components.o71) this.c;
                View view3 = (View) obj;
                o71Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.m71) {
                    ((org.telegram.ui.Components.m71) view3).setReordering(this.b && (n71Var = o71Var.y) != null && ((m5.o) n71Var).q(R));
                    break;
                }
                break;
        }
    }
}
