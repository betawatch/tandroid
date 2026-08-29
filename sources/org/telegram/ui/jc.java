package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jc(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        org.telegram.ui.Components.x71 x71Var;
        switch (this.a) {
            case 0:
                mc mcVar = (mc) this.c;
                View view = (View) obj;
                lc lcVar = (lc) view;
                mcVar.b.getClass();
                boolean z10 = RecyclerView.R(view) == mcVar.e;
                lcVar.s = z10;
                if (!this.b) {
                    lcVar.v.f(z10, true);
                }
                lcVar.invalidate();
                break;
            case 1:
                tn tnVar = (tn) this.c;
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
                    if ((s1Var.A8 && s1Var.C8) != z12 && tnVar.B9()) {
                        s1Var.A8 = z12;
                        s1Var.C8 = tnVar.B9();
                        s1Var.j8 = true;
                        s1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) this.c;
                View view3 = (View) obj;
                y71Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.w71) {
                    ((org.telegram.ui.Components.w71) view3).setReordering(this.b && (x71Var = y71Var.y) != null && ((org.telegram.ui.Components.n) x71Var).f(R));
                    break;
                }
                break;
        }
    }
}
