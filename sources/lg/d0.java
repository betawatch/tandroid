package lg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uk;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d0 extends jy {
    public final /* synthetic */ int U;
    public final /* synthetic */ th V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(th thVar, int i3, tj0 tj0Var, int i10) {
        super(i3, 0, tj0Var);
        this.U = i10;
        this.V = thVar;
    }

    @Override // u4.o0
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

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        switch (this.U) {
            case 0:
                c0 c0Var = new c0(this, recyclerView.getContext());
                c0Var.a = i3;
                w0(c0Var);
                break;
            case 1:
                ti tiVar = new ti(this, recyclerView.getContext());
                tiVar.a = i3;
                w0(tiVar);
                break;
            case 2:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.a = i3;
                w0(kjVar);
                break;
            case 3:
                qk qkVar = new qk(this, recyclerView.getContext());
                qkVar.a = i3;
                w0(qkVar);
                break;
            default:
                qm qmVar = new qm(this, recyclerView.getContext());
                qmVar.a = i3;
                w0(qmVar);
                break;
        }
    }

    @Override // u4.b0
    public void z0(u4.a1 a1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((uk) this.V).M.getHeight());
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(uk ukVar, ci.j1 j1Var) {
        super(0, 0, j1Var);
        this.U = 3;
        this.V = ukVar;
    }
}
