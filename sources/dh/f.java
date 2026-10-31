package dh;

import androidx.recyclerview.widget.RecyclerView;
import ci.p;
import org.telegram.messenger.i0;
import org.telegram.ui.lq0;
import org.telegram.ui.sb;
import s4.a0;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends a0 {
    public final /* synthetic */ int I;

    public /* synthetic */ f(int i10) {
        this.I = i10;
    }

    @Override // s4.a0
    public int W0(z0 z0Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 8:
                return i0.L(4000.0f);
            default:
                return super.W0(z0Var);
        }
    }

    @Override // s4.a0, s4.n0
    public boolean e() {
        switch (this.I) {
            case 0:
                return false;
            default:
                return super.e();
        }
    }

    @Override // s4.a0, s4.n0
    public void v0(RecyclerView recyclerView, z0 z0Var, int i10) {
        switch (this.I) {
            case 3:
                p pVar = new p(recyclerView.getContext(), 0);
                pVar.a = i10;
                w0(pVar);
                break;
            case 14:
                lq0 lq0Var = new lq0(recyclerView.getContext());
                lq0Var.a = i10;
                w0(lq0Var);
                break;
            default:
                super.v0(recyclerView, z0Var, i10);
                break;
        }
    }

    @Override // s4.a0, s4.n0
    public boolean y0() {
        switch (this.I) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
            case 5:
            case 8:
            case 14:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
            case 9:
                return true;
            case 10:
                return false;
            case 11:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 15:
                return false;
            case 16:
                return false;
            case 17:
                return true;
            case 18:
                return false;
            case 19:
                return false;
            case 20:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public f(sb sbVar) {
        this.I = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f() {
        super(0, true);
        this.I = 14;
    }
}
