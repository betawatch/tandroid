package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wk;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c0 extends ly {
    public final /* synthetic */ int U;
    public final /* synthetic */ vh V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(vh vhVar, int i7, pj0 pj0Var, int i10) {
        super(i7, 0, pj0Var);
        this.U = i10;
        this.V = vhVar;
    }

    @Override // v4.n0
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

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        switch (this.U) {
            case 0:
                b0 b0Var = new b0(this, recyclerView.getContext());
                b0Var.a = i7;
                w0(b0Var);
                break;
            case 1:
                ti tiVar = new ti(this, recyclerView.getContext());
                tiVar.a = i7;
                w0(tiVar);
                break;
            case 2:
                lj ljVar = new lj(this, recyclerView.getContext());
                ljVar.a = i7;
                w0(ljVar);
                break;
            case 3:
                sk skVar = new sk(this, recyclerView.getContext());
                skVar.a = i7;
                w0(skVar);
                break;
            default:
                rm rmVar = new rm(this, recyclerView.getContext());
                rmVar.a = i7;
                w0(rmVar);
                break;
        }
    }

    @Override // v4.b0
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((wk) this.V).L.getHeight());
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(wk wkVar, bi.q1 q1Var) {
        super(0, 0, q1Var);
        this.U = 3;
        this.V = wkVar;
    }
}
