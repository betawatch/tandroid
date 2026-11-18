package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.zj;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c0 extends wy {
    public final /* synthetic */ int U;
    public final /* synthetic */ ki V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(ki kiVar, int i7, ck0 ck0Var, int i10) {
        super(i7, 0, ck0Var);
        this.U = i10;
        this.V = kiVar;
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
                b0 b0Var = new b0(this, recyclerView.getContext());
                b0Var.a = i7;
                w0(b0Var);
                break;
            case 1:
                ij ijVar = new ij(this, recyclerView.getContext());
                ijVar.a = i7;
                w0(ijVar);
                break;
            case 2:
                zj zjVar = new zj(this, recyclerView.getContext());
                zjVar.a = i7;
                w0(zjVar);
                break;
            case 3:
                gl glVar = new gl(this, recyclerView.getContext());
                glVar.a = i7;
                w0(glVar);
                break;
            default:
                gn gnVar = new gn(this, recyclerView.getContext());
                gnVar.a = i7;
                w0(gnVar);
                break;
        }
    }

    @Override // v4.c0
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(c1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((kl) this.V).M.getHeight());
                break;
            default:
                super.z0(c1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(kl klVar, di.b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = klVar;
    }
}
