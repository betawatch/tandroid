package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class f0 extends sz {
    public final /* synthetic */ int U;
    public final /* synthetic */ pi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(pi piVar, int i10, zl0 zl0Var, int i11) {
        super(i10, 0, zl0Var);
        this.U = i11;
        this.V = piVar;
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
                e0 e0Var = new e0(this, recyclerView.getContext());
                e0Var.a = i10;
                w0(e0Var);
                break;
            case 1:
                qj qjVar = new qj(this, recyclerView.getContext());
                qjVar.a = i10;
                w0(qjVar);
                break;
            case 2:
                hk hkVar = new hk(this, recyclerView.getContext());
                hkVar.a = i10;
                w0(hkVar);
                break;
            case 3:
                bl blVar = new bl(this, recyclerView.getContext());
                blVar.a = i10;
                w0(blVar);
                break;
            default:
                ln lnVar = new ln(this, recyclerView.getContext());
                lnVar.a = i10;
                w0(lnVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(jl jlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = jlVar;
    }
}
