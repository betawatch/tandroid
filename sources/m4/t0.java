package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        v81 v81Var;
        switch (this.a) {
            case 0:
                ((j1) obj).K0((b2.e) this.c, this.b);
                break;
            case 1:
                sc scVar = (sc) this.c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.b.getClass();
                boolean z10 = RecyclerView.S(view) == scVar.e;
                rcVar.s = z10;
                if (!this.b) {
                    rcVar.v.f(z10, true);
                }
                rcVar.invalidate();
                break;
            case 2:
                zn znVar = (zn) this.c;
                View view2 = (View) obj;
                boolean z11 = view2 instanceof u1;
                boolean z12 = this.b;
                if (!z11) {
                    if (view2 instanceof org.telegram.ui.Cells.w0) {
                        ((org.telegram.ui.Cells.w0) view2).e0 = z12;
                        break;
                    }
                } else {
                    u1 u1Var = (u1) view2;
                    if ((u1Var.E8 && u1Var.G8) != z12 && znVar.B9()) {
                        u1Var.E8 = z12;
                        u1Var.G8 = znVar.B9();
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                w81 w81Var = (w81) this.c;
                View view3 = (View) obj;
                w81Var.v.getClass();
                int S = RecyclerView.S(view3);
                if (view3 instanceof u81) {
                    ((u81) view3).setReordering(this.b && (v81Var = w81Var.y) != null && ((l.d) v81Var).G(S));
                    break;
                }
                break;
        }
    }
}
