package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k extends f2.j0 {
    public final /* synthetic */ int I;

    public /* synthetic */ k(int i10) {
        this.I = i10;
    }

    @Override // f2.j0
    public int W0(f2.k1 k1Var) {
        switch (this.I) {
            case 3:
                return 5000;
            case 7:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(k1Var);
        }
    }

    @Override // f2.j0, f2.w0
    public boolean e() {
        switch (this.I) {
            case 20:
                return false;
            default:
                return super.e();
        }
    }

    @Override // f2.j0, f2.w0
    public void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.I) {
            case 2:
                uh.n nVar = new uh.n(recyclerView.getContext(), 0);
                nVar.a = i10;
                w0(nVar);
                break;
            case 13:
                zr0 zr0Var = new zr0(recyclerView.getContext());
                zr0Var.a = i10;
                w0(zr0Var);
                break;
            default:
                super.v0(recyclerView, k1Var, i10);
                break;
        }
    }

    @Override // f2.j0, f2.w0
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return true;
            case 3:
            case 4:
            case 7:
            case 13:
            default:
                return super.y0();
            case 5:
                return false;
            case 6:
                return false;
            case 8:
                return true;
            case 9:
                return false;
            case 10:
                return false;
            case 11:
                return false;
            case 12:
                return false;
            case 14:
                return false;
            case 15:
                return false;
            case 16:
                return true;
            case 17:
                return false;
            case 18:
                return false;
            case 19:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, boolean z10, int i11) {
        super(i10, z10);
        this.I = i11;
    }

    public k(ob obVar) {
        this.I = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k() {
        super(0, true);
        this.I = 13;
    }
}
