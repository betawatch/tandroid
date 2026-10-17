package hg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ls0;
import org.telegram.ui.xb;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class a0 extends s4.b0 {
    public final /* synthetic */ int I;

    public /* synthetic */ a0(int i10) {
        this.I = i10;
    }

    @Override // s4.b0
    public int W0(s4.y0 y0Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(y0Var);
        }
    }

    @Override // s4.b0, s4.n0
    public boolean e() {
        switch (this.I) {
            case 1:
                return false;
            default:
                return super.e();
        }
    }

    @Override // s4.b0, s4.n0
    public void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.I) {
            case 4:
                li.n nVar = new li.n(recyclerView.getContext(), 0);
                nVar.a = i10;
                w0(nVar);
                break;
            case 15:
                ls0 ls0Var = new ls0(recyclerView.getContext());
                ls0Var.a = i10;
                w0(ls0Var);
                break;
            default:
                super.v0(recyclerView, y0Var, i10);
                break;
        }
    }

    @Override // s4.b0, s4.n0
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
    public /* synthetic */ a0(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public a0(xb xbVar) {
        this.I = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0() {
        super(0, true);
        this.I = 15;
    }
}
