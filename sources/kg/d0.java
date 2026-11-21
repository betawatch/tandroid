package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.yy;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d0 extends yy {
    public final /* synthetic */ int U;
    public final /* synthetic */ mi V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(mi miVar, int i7, ek0 ek0Var, int i10) {
        super(i7, 0, ek0Var);
        this.U = i10;
        this.V = miVar;
    }

    @Override // v4.p0
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

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.U) {
            case 0:
                c0 c0Var = new c0(this, recyclerView.getContext());
                c0Var.a = i7;
                w0(c0Var);
                break;
            case 1:
                kj kjVar = new kj(this, recyclerView.getContext());
                kjVar.a = i7;
                w0(kjVar);
                break;
            case 2:
                bk bkVar = new bk(this, recyclerView.getContext());
                bkVar.a = i7;
                w0(bkVar);
                break;
            case 3:
                il ilVar = new il(this, recyclerView.getContext());
                ilVar.a = i7;
                w0(ilVar);
                break;
            default:
                in inVar = new in(this, recyclerView.getContext());
                inVar.a = i7;
                w0(inVar);
                break;
        }
    }

    @Override // v4.c0
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(c1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((ml) this.V).M.getHeight());
                break;
            default:
                super.z0(c1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ml mlVar, di.b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = mlVar;
    }
}
