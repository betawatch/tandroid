package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class e0 extends yz {
    public final /* synthetic */ int U;
    public final /* synthetic */ li V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(li liVar, int i10, im0 im0Var, int i11) {
        super(i10, 0, im0Var);
        this.U = i11;
        this.V = liVar;
    }

    @Override // s4.n0
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

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.U) {
            case 0:
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.a = i10;
                w0(d0Var);
                break;
            case 1:
                mj mjVar = new mj(this, recyclerView.getContext());
                mjVar.a = i10;
                w0(mjVar);
                break;
            case 2:
                dk dkVar = new dk(this, recyclerView.getContext());
                dkVar.a = i10;
                w0(dkVar);
                break;
            case 3:
                jl jlVar = new jl(this, recyclerView.getContext());
                jlVar.a = i10;
                w0(jlVar);
                break;
            default:
                sn snVar = new sn(this, recyclerView.getContext());
                snVar.a = i10;
                w0(snVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(rl rlVar, ai.u1 u1Var) {
        super(0, 0, u1Var);
        this.U = 3;
        this.V = rlVar;
    }
}
