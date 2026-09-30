package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class g0 extends rz {
    public final /* synthetic */ int U;
    public final /* synthetic */ oi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(oi oiVar, int i10, yl0 yl0Var, int i11) {
        super(i10, 0, yl0Var);
        this.U = i11;
        this.V = oiVar;
    }

    @Override // s4.o0
    public int[] t(View view, Rect rect) {
        switch (this.U) {
            case 4:
                int C = this.n - C();
                int top = (view.getTop() + rect.top) - view.getScrollY();
                int height = rect.height() + top;
                int min = Math.min(0, top);
                int max = Math.max(0, height - C);
                if (min == 0) {
                    min = Math.min(top, max);
                }
                return new int[]{0, min};
            default:
                return super.t(view, rect);
        }
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.U) {
            case 0:
                f0 f0Var = new f0(this, recyclerView.getContext());
                f0Var.a = i10;
                w0(f0Var);
                break;
            case 1:
                pj pjVar = new pj(this, recyclerView.getContext());
                pjVar.a = i10;
                w0(pjVar);
                break;
            case 2:
                gk gkVar = new gk(this, recyclerView.getContext());
                gkVar.a = i10;
                w0(gkVar);
                break;
            case 3:
                al alVar = new al(this, recyclerView.getContext());
                alVar.a = i10;
                w0(alVar);
                break;
            default:
                kn knVar = new kn(this, recyclerView.getContext());
                knVar.a = i10;
                w0(knVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(il ilVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = ilVar;
    }
}
