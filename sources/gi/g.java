package gi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import hi.d3;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mi;
import v4.c1;
import v4.t;
import v4.x0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class g extends t {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override // v4.c0
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                return ((kw0) this.R).R1 != null && hd.a0;
            default:
                return super.Y0();
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public void b0(x0 x0Var, c1 c1Var) {
        switch (this.Q) {
            case 1:
                super.b0(x0Var, c1Var);
                d3 d3Var = (d3) this.R;
                if (d3Var.V) {
                    d3Var.V = false;
                    d3Var.a();
                    break;
                }
                break;
            default:
                super.b0(x0Var, c1Var);
                break;
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).b) {
                    i7 = 0;
                }
                return super.o0(i7, x0Var, c1Var);
            default:
                return super.o0(i7, x0Var, c1Var);
        }
    }

    @Override // v4.c0, v4.p0
    public void v0(RecyclerView recyclerView, c1 c1Var, int i7) {
        switch (this.Q) {
            case 2:
                fj fjVar = new fj(this, recyclerView.getContext());
                fjVar.a = i7;
                w0(fjVar);
                break;
            case 3:
                dm dmVar = new dm(this, recyclerView.getContext());
                dmVar.a = i7;
                w0(dmVar);
                break;
            default:
                super.v0(recyclerView, c1Var, i7);
                break;
        }
    }

    @Override // v4.t, v4.c0, v4.p0
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
            default:
                return super.y0();
            case 2:
                return false;
            case 3:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(mi miVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = miVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kw0 kw0Var) {
        super(5);
        this.Q = 4;
        this.R = kw0Var;
    }
}
