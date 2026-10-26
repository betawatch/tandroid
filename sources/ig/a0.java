package ig;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qs0;
import org.telegram.ui.wb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a0 extends s4.c0 {
    public final /* synthetic */ int I;

    public /* synthetic */ a0(int i10) {
        this.I = i10;
    }

    @Override // s4.c0
    public int W0(s4.b1 b1Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(b1Var);
        }
    }

    @Override // s4.c0, s4.p0
    public boolean e() {
        switch (this.I) {
            case 1:
                return false;
            default:
                return super.e();
        }
    }

    @Override // s4.c0, s4.p0
    public void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.I) {
            case 4:
                mi.n nVar = new mi.n(recyclerView.getContext(), 0);
                nVar.a = i10;
                w0(nVar);
                break;
            case 15:
                qs0 qs0Var = new qs0(recyclerView.getContext());
                qs0Var.a = i10;
                w0(qs0Var);
                break;
            default:
                super.v0(recyclerView, b1Var, i10);
                break;
        }
    }

    @Override // s4.c0, s4.p0
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

    public a0(wb wbVar) {
        this.I = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0() {
        super(0, true);
        this.I = 15;
    }
}
