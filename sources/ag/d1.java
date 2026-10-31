package ag;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.zm;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d1 extends az {
    public final /* synthetic */ int U;
    public final /* synthetic */ uh V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(uh uhVar, int i10, tk0 tk0Var, int i11) {
        super(i10, 0, tk0Var);
        this.U = i11;
        this.V = uhVar;
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

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.U) {
            case 0:
                c1 c1Var = new c1(this, recyclerView.getContext());
                c1Var.a = i10;
                w0(c1Var);
                break;
            case 1:
                ti tiVar = new ti(this, recyclerView.getContext());
                tiVar.a = i10;
                w0(tiVar);
                break;
            case 2:
                mj mjVar = new mj(this, recyclerView.getContext());
                mjVar.a = i10;
                w0(mjVar);
                break;
            case 3:
                tk tkVar = new tk(this, recyclerView.getContext());
                tkVar.a = i10;
                w0(tkVar);
                break;
            default:
                zm zmVar = new zm(this, recyclerView.getContext());
                zmVar.a = i10;
                w0(zmVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(bl blVar, b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = blVar;
    }
}
