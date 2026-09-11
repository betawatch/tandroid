package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.h81;
import org.telegram.ui.co;
import org.telegram.ui.rc;
import org.telegram.ui.sc;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        g81 g81Var;
        switch (this.a) {
            case 0:
                ((j1) obj).K0((b2.e) this.c, this.b);
                break;
            case 1:
                sc scVar = (sc) this.c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.b.getClass();
                boolean z10 = RecyclerView.R(view) == scVar.e;
                rcVar.s = z10;
                if (!this.b) {
                    rcVar.v.f(z10, true);
                }
                rcVar.invalidate();
                break;
            case 2:
                co coVar = (co) this.c;
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
                    if ((t1Var.E8 && t1Var.G8) != z12 && coVar.B9()) {
                        t1Var.E8 = z12;
                        t1Var.G8 = coVar.B9();
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
                    ((f81) view3).setReordering(this.b && (g81Var = h81Var.y) != null && ((k2.g0) g81Var).i(R));
                    break;
                }
                break;
        }
    }
}
