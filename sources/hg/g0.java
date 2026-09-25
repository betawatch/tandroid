package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.zk;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g0 extends qz {
    public final /* synthetic */ int U;
    public final /* synthetic */ oi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(oi oiVar, int i10, wl0 wl0Var, int i11) {
        super(i10, 0, wl0Var);
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
                oj ojVar = new oj(this, recyclerView.getContext());
                ojVar.a = i10;
                w0(ojVar);
                break;
            case 2:
                fk fkVar = new fk(this, recyclerView.getContext());
                fkVar.a = i10;
                w0(fkVar);
                break;
            case 3:
                zk zkVar = new zk(this, recyclerView.getContext());
                zkVar.a = i10;
                w0(zkVar);
                break;
            default:
                jn jnVar = new jn(this, recyclerView.getContext());
                jnVar.a = i10;
                w0(jnVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(hl hlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = hlVar;
    }
}
