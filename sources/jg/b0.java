package jg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.cp0;
import org.telegram.ui.lb;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b0 extends v4.c0 {
    public final /* synthetic */ int I;

    public /* synthetic */ b0(int i7) {
        this.I = i7;
    }

    @Override // v4.c0
    public int W0(v4.c1 c1Var) {
        switch (this.I) {
            case 5:
                return 5000;
            case 9:
                return org.telegram.messenger.g0.L(4000.0f);
            default:
                return super.W0(c1Var);
        }
    }

    @Override // v4.c0, v4.p0
    public boolean e() {
        switch (this.I) {
            case 1:
                return false;
            default:
                return super.e();
        }
    }

    @Override // v4.c0, v4.p0
    public void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.I) {
            case 4:
                pi.l lVar = new pi.l(recyclerView.getContext(), 0);
                lVar.a = i7;
                w0(lVar);
                break;
            case 15:
                cp0 cp0Var = new cp0(recyclerView.getContext());
                cp0Var.a = i7;
                w0(cp0Var);
                break;
            default:
                super.v0(recyclerView, c1Var, i7);
                break;
        }
    }

    @Override // v4.c0, v4.p0
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
