package kg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d0 extends vy {
    public final /* synthetic */ int U;
    public final /* synthetic */ li V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(li liVar, int i7, ek0 ek0Var, int i10) {
        super(i7, 0, ek0Var);
        this.U = i10;
        this.V = liVar;
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
                jj jjVar = new jj(this, recyclerView.getContext());
                jjVar.a = i7;
                w0(jjVar);
                break;
            case 2:
                ak akVar = new ak(this, recyclerView.getContext());
                akVar.a = i7;
                w0(akVar);
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
    public d0(kl klVar, di.b1 b1Var) {
        super(0, 0, b1Var);
        this.U = 3;
        this.V = klVar;
    }
}
