package jg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e0 extends yz {
    public final /* synthetic */ int U;
    public final /* synthetic */ li V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(li liVar, int i10, mm0 mm0Var, int i11) {
        super(i10, 0, mm0Var);
        this.U = i11;
        this.V = liVar;
    }

    @Override // s4.p0
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

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
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
                tn tnVar = new tn(this, recyclerView.getContext());
                tnVar.a = i10;
                w0(tnVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(sl slVar, bi.r1 r1Var) {
        super(0, 0, r1Var);
        this.U = 3;
        this.V = slVar;
    }
}
