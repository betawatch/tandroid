// default package

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ar0 extends u55 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(s4b s4bVar) {
        super(5);
        this.Q = (byte) 4;
        this.R = s4bVar;
    }

    @Override // x46
    public final boolean X0() {
        switch (this.Q) {
            case 4:
                return ((s4b) this.R).Q1 != null && ob6.a0;
            default:
                return super.X0();
        }
    }

    @Override // u55, x46, q79
    public final void a0(oh2 oh2Var, c89 c89Var) {
        switch (this.Q) {
            case 3:
                super.a0(oh2Var, c89Var);
                wt4 wt4Var = (wt4) this.R;
                if (wt4Var.V) {
                    wt4Var.V = false;
                    wt4Var.a();
                    break;
                }
                break;
            default:
                super.a0(oh2Var, c89Var);
                break;
        }
    }

    @Override // u55, x46, q79
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        switch (this.Q) {
            case 0:
                if (((gr0) this.R).b) {
                    i = 0;
                }
                return super.n0(i, oh2Var, c89Var);
            default:
                return super.n0(i, oh2Var, c89Var);
        }
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.Q) {
            case 1:
                k22 k22Var = new k22(this, recyclerView.getContext());
                k22Var.a = i;
                v0(k22Var);
                break;
            case 2:
                o52 o52Var = new o52(this, recyclerView.getContext());
                o52Var.a = i;
                v0(o52Var);
                break;
            default:
                super.u0(recyclerView, c89Var, i);
                break;
        }
    }

    @Override // u55, x46, q79
    public final boolean x0() {
        switch (this.Q) {
            case 0:
            case 1:
            case 2:
                return false;
            default:
                return super.x0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar0(FrameLayout frameLayout, byte b) {
        super(3);
        this.Q = b;
        this.R = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar0(f12 f12Var, int i, byte b) {
        super(i);
        this.Q = b;
        this.R = f12Var;
    }
}
