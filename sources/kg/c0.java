package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.Components.zm;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c0 extends qy {
    public final /* synthetic */ int U;
    public final /* synthetic */ ci V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(ci ciVar, int i7, uj0 uj0Var, int i10) {
        super(i7, 0, uj0Var);
        this.U = i10;
        this.V = ciVar;
    }

    @Override // v4.o0
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

    @Override // v4.b0, v4.o0
    public final void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.U) {
            case 0:
                b0 b0Var = new b0(this, recyclerView.getContext());
                b0Var.a = i7;
                w0(b0Var);
                break;
            case 1:
                bj bjVar = new bj(this, recyclerView.getContext());
                bjVar.a = i7;
                w0(bjVar);
                break;
            case 2:
                sj sjVar = new sj(this, recyclerView.getContext());
                sjVar.a = i7;
                w0(sjVar);
                break;
            case 3:
                zk zkVar = new zk(this, recyclerView.getContext());
                zkVar.a = i7;
                w0(zkVar);
                break;
            default:
                zm zmVar = new zm(this, recyclerView.getContext());
                zmVar.a = i7;
                w0(zmVar);
                break;
        }
    }

    @Override // v4.b0
    public void z0(v4.b1 b1Var, int[] iArr) {
        switch (this.U) {
            case 3:
                super.z0(b1Var, iArr);
                iArr[1] = Math.max(iArr[1], ((dl) this.V).M.getHeight());
                break;
            default:
                super.z0(b1Var, iArr);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(dl dlVar, di.c1 c1Var) {
        super(0, 0, c1Var);
        this.U = 3;
        this.V = dlVar;
    }
}
