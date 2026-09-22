package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.bo;
import org.telegram.ui.qc;
import org.telegram.ui.rc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        g81 g81Var;
        switch (this.a) {
            case 0:
                ((k1) obj).K0((b2.e) this.c, this.b);
                break;
            case 1:
                rc rcVar = (rc) this.c;
                View view = (View) obj;
                qc qcVar = (qc) view;
                rcVar.b.getClass();
                boolean z10 = RecyclerView.R(view) == rcVar.e;
                qcVar.s = z10;
                if (!this.b) {
                    qcVar.v.f(z10, true);
                }
                qcVar.invalidate();
                break;
            case 2:
                bo boVar = (bo) this.c;
                View view2 = (View) obj;
                boolean z11 = view2 instanceof t1;
                boolean z12 = this.b;
                if (!z11) {
                    if (view2 instanceof org.telegram.ui.Cells.w0) {
                        ((org.telegram.ui.Cells.w0) view2).e0 = z12;
                        break;
                    }
                } else {
                    t1 t1Var = (t1) view2;
                    if ((t1Var.E8 && t1Var.G8) != z12 && boVar.B9()) {
                        t1Var.E8 = z12;
                        t1Var.G8 = boVar.B9();
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                h81 h81Var = (h81) this.c;
                View view3 = (View) obj;
                h81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof f81) {
                    ((f81) view3).setReordering(this.b && (g81Var = h81Var.y) != null && ((ka.c) g81Var).d(R));
                    break;
                }
                break;
        }
    }
}
