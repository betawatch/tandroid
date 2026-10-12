package ig;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.oj;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.vn;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class e0 extends b00 {
    public final /* synthetic */ int U;
    public final /* synthetic */ ni V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(ni niVar, int i10, mm0 mm0Var, int i11) {
        super(i10, 0, mm0Var);
        this.U = i11;
        this.V = niVar;
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
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.a = i10;
                w0(mlVar);
                break;
            default:
                vn vnVar = new vn(this, recyclerView.getContext());
                vnVar.a = i10;
                w0(vnVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ul ulVar, bi.o0 o0Var) {
        super(0, 0, o0Var);
        this.U = 3;
        this.V = ulVar;
    }
}
