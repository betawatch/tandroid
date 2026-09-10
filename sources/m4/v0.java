package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.eo;
import org.telegram.ui.sc;
import org.telegram.ui.tc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        t81 t81Var;
        switch (this.a) {
            case 0:
                ((l1) obj).K0((b2.e) this.c, this.b);
                break;
            case 1:
                tc tcVar = (tc) this.c;
                View view = (View) obj;
                sc scVar = (sc) view;
                tcVar.b.getClass();
                boolean z10 = RecyclerView.R(view) == tcVar.e;
                scVar.s = z10;
                if (!this.b) {
                    scVar.v.f(z10, true);
                }
                scVar.invalidate();
                break;
            case 2:
                eo eoVar = (eo) this.c;
                View view2 = (View) obj;
                boolean z11 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z12 = this.b;
                if (!z11) {
                    if (view2 instanceof org.telegram.ui.Cells.w0) {
                        ((org.telegram.ui.Cells.w0) view2).e0 = z12;
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if ((t1Var.E8 && t1Var.G8) != z12 && eoVar.B9()) {
                        t1Var.E8 = z12;
                        t1Var.G8 = eoVar.B9();
                        t1Var.n8 = true;
                        t1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                u81 u81Var = (u81) this.c;
                View view3 = (View) obj;
                u81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof s81) {
                    ((s81) view3).setReordering(this.b && (t81Var = u81Var.y) != null && ((l2.h) t81Var).j(R));
                    break;
                }
                break;
        }
    }
}
