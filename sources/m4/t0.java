package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.bo;
import org.telegram.ui.sc;
import org.telegram.ui.tc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        h81 h81Var;
        switch (this.a) {
            case 0:
                ((k1) obj).K0((b2.e) this.c, this.b);
                break;
            case 1:
                tc tcVar = (tc) this.c;
                View view = (View) obj;
                sc scVar = (sc) view;
                tcVar.b.getClass();
                boolean z10 = RecyclerView.S(view) == tcVar.e;
                scVar.s = z10;
                if (!this.b) {
                    scVar.v.f(z10, true);
                }
                scVar.invalidate();
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
                i81 i81Var = (i81) this.c;
                View view3 = (View) obj;
                i81Var.v.getClass();
                int S = RecyclerView.S(view3);
                if (view3 instanceof g81) {
                    ((g81) view3).setReordering(this.b && (h81Var = i81Var.y) != null && ((ka.c) h81Var).d(S));
                    break;
                }
                break;
        }
    }
}
