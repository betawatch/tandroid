package hg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ct0;
import org.telegram.ui.ub;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class b0 extends s4.c0 {
    public final /* synthetic */ int I;

    public /* synthetic */ b0(int i10) {
        this.I = i10;
    }

    @Override // s4.c0
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(z0Var);
        }
    }

    @Override // s4.c0, s4.o0
    public boolean e() {
        switch (this.I) {
            case 1:
                return false;
            default:
                return super.e();
        }
    }

    @Override // s4.c0, s4.o0
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 4:
                ki.p pVar = new ki.p(recyclerView.getContext(), 0);
                pVar.a = i10;
                w0(pVar);
                break;
            case 15:
                ct0 ct0Var = new ct0(recyclerView.getContext());
                ct0Var.a = i10;
                w0(ct0Var);
                break;
            default:
                super.v0(recyclerView, z0Var, i10);
                break;
        }
    }

    @Override // s4.c0, s4.o0
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
    public /* synthetic */ b0(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public b0(ub ubVar) {
        this.I = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0() {
        super(0, true);
        this.I = 15;
    }
}
