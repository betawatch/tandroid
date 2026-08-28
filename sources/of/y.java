package of;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.as0;
import org.telegram.ui.pb;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y extends f2.m0 {
    public final /* synthetic */ int I;

    public /* synthetic */ y(int i9) {
        this.I = i9;
    }

    @Override // f2.m0
    public int W0(f2.n1 n1Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 8:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(n1Var);
        }
    }

    @Override // f2.m0, f2.z0
    public boolean e() {
        switch (this.I) {
            case 20:
                return false;
            default:
                return super.e();
        }
    }

    @Override // f2.m0, f2.z0
    public void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.I) {
            case 3:
                rh.n nVar = new rh.n(recyclerView.getContext(), 0);
                nVar.a = i9;
                w0(nVar);
                break;
            case 14:
                as0 as0Var = new as0(recyclerView.getContext());
                as0Var.a = i9;
                w0(as0Var);
                break;
            default:
                super.v0(recyclerView, n1Var, i9);
                break;
        }
    }

    @Override // f2.m0, f2.z0
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i9, boolean z10, int i10) {
        super(i9, z10);
        this.I = i10;
    }

    public y(pb pbVar) {
        this.I = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y() {
        super(0, true);
        this.I = 14;
    }
}
