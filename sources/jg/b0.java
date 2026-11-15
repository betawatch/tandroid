package jg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.lb;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b0 extends v4.b0 {
    public final /* synthetic */ int I;

    public /* synthetic */ b0(int i7) {
        this.I = i7;
    }

    @Override // v4.b0
    public int W0(v4.b1 b1Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return org.telegram.messenger.g0.L(4000.0f);
            default:
                return super.W0(b1Var);
        }
    }

    @Override // v4.b0, v4.o0
    public boolean e() {
        switch (this.I) {
            case 1:
                return false;
            default:
                return super.e();
        }
    }

    @Override // v4.b0, v4.o0
    public void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.I) {
            case 4:
                pi.l lVar = new pi.l(recyclerView.getContext(), 0);
                lVar.a = i7;
                w0(lVar);
                break;
            case 15:
                zo0 zo0Var = new zo0(recyclerView.getContext());
                zo0Var.a = i7;
                w0(zo0Var);
                break;
            default:
                super.v0(recyclerView, b1Var, i7);
                break;
        }
    }

    @Override // v4.b0, v4.o0
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 1:
            case 5:
            case 6:
            case 9:
            case 15:
            default:
                return super.y0();
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
            case 7:
                return false;
            case 8:
                return false;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                return false;
            case 13:
                return false;
            case 14:
                return false;
            case 16:
                return false;
            case 17:
                return false;
            case 18:
                return true;
            case 19:
                return false;
            case 20:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i7, boolean z10, int i10) {
        super(i7, z10);
        this.I = i10;
    }

    public b0(lb lbVar) {
        this.I = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0() {
        super(0, true);
        this.I = 15;
    }
}
