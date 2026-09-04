package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.yk;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e0 extends pz {
    public final /* synthetic */ int U;
    public final /* synthetic */ ni V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(ni niVar, int i10, ll0 ll0Var, int i11) {
        super(i10, 0, ll0Var);
        this.U = i11;
        this.V = niVar;
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
                d0 d0Var = new d0(this, recyclerView.getContext());
                d0Var.a = i10;
                w0(d0Var);
                break;
            case 1:
                nj njVar = new nj(this, recyclerView.getContext());
                njVar.a = i10;
                w0(njVar);
                break;
            case 2:
                ek ekVar = new ek(this, recyclerView.getContext());
                ekVar.a = i10;
                w0(ekVar);
                break;
            case 3:
                yk ykVar = new yk(this, recyclerView.getContext());
                ykVar.a = i10;
                w0(ykVar);
                break;
            default:
                hn hnVar = new hn(this, recyclerView.getContext());
                hnVar.a = i10;
                w0(hnVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(gl glVar, bi.o0 o0Var) {
        super(0, 0, o0Var);
        this.U = 3;
        this.V = glVar;
    }
}
