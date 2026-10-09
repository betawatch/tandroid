package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.yn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f0 extends f00 {
    public final /* synthetic */ int U;
    public final /* synthetic */ qi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(qi qiVar, int i10, qm0 qm0Var, int i11) {
        super(i10, 0, qm0Var);
        this.U = i11;
        this.V = qiVar;
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

    @Override // s4.d0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        switch (this.U) {
            case 0:
                e0 e0Var = new e0(this, recyclerView.getContext());
                e0Var.a = i10;
                w0(e0Var);
                break;
            case 1:
                rj rjVar = new rj(this, recyclerView.getContext());
                rjVar.a = i10;
                w0(rjVar);
                break;
            case 2:
                ik ikVar = new ik(this, recyclerView.getContext());
                ikVar.a = i10;
                w0(ikVar);
                break;
            case 3:
                pl plVar = new pl(this, recyclerView.getContext());
                plVar.a = i10;
                w0(plVar);
                break;
            default:
                yn ynVar = new yn(this, recyclerView.getContext());
                ynVar.a = i10;
                w0(ynVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(xl xlVar, ai.w0 w0Var) {
        super(0, 0, w0Var);
        this.U = 3;
        this.V = xlVar;
    }
}
