package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vk;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c0 extends ly {
    public final /* synthetic */ int U;
    public final /* synthetic */ uh V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(uh uhVar, int i7, pj0 pj0Var, int i10) {
        super(i7, 0, pj0Var);
        this.U = i10;
        this.V = uhVar;
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
                si siVar = new si(this, recyclerView.getContext());
                siVar.a = i7;
                w0(siVar);
                break;
            case 2:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.a = i7;
                w0(kjVar);
                break;
            case 3:
                rk rkVar = new rk(this, recyclerView.getContext());
                rkVar.a = i7;
                w0(rkVar);
                break;
            default:
                qm qmVar = new qm(this, recyclerView.getContext());
                qmVar.a = i7;
                w0(qmVar);
                break;
        }
    }

    @Override // v4.b0
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((vk) this.V).L.getHeight());
                break;
            default:
                super.z0(a1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vk vkVar, bi.q1 q1Var) {
        super(0, 0, q1Var);
        this.U = 3;
        this.V = vkVar;
    }
}
