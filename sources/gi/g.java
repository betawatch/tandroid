package gi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import hi.d3;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ul;
import org.telegram.ui.Components.wi;
import v4.b1;
import v4.s;
import v4.w0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g extends s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override // v4.b0
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                return ((bw0) this.R).R1 != null && hd.a0;
            default:
                return super.Y0();
        }
    }

    @Override // v4.s, v4.b0, v4.o0
    public void b0(w0 w0Var, b1 b1Var) {
        switch (this.Q) {
            case 1:
                super.b0(w0Var, b1Var);
                d3 d3Var = (d3) this.R;
                if (d3Var.V) {
                    d3Var.V = false;
                    d3Var.a();
                    break;
                }
                break;
            default:
                super.b0(w0Var, b1Var);
                break;
        }
    }

    @Override // v4.s, v4.b0, v4.o0
    public int o0(int i7, w0 w0Var, b1 b1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).b) {
                    i7 = 0;
                }
                return super.o0(i7, w0Var, b1Var);
            default:
                return super.o0(i7, w0Var, b1Var);
        }
    }

    @Override // v4.b0, v4.o0
    public void v0(RecyclerView recyclerView, b1 b1Var, int i7) {
        switch (this.Q) {
            case 2:
                wi wiVar = new wi(this, recyclerView.getContext());
                wiVar.a = i7;
                w0(wiVar);
                break;
            case 3:
                ul ulVar = new ul(this, recyclerView.getContext());
                ulVar.a = i7;
                w0(ulVar);
                break;
            default:
                super.v0(recyclerView, b1Var, i7);
                break;
        }
    }

    @Override // v4.s, v4.b0, v4.o0
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
    public /* synthetic */ g(ci ciVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = ciVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bw0 bw0Var) {
        super(5);
        this.Q = 4;
        this.R = bw0Var;
    }
}
