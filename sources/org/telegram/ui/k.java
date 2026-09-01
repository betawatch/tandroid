package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k extends f2.j0 {
    public final /* synthetic */ int I;

    public /* synthetic */ k(int i10) {
        this.I = i10;
    }

    @Override // f2.j0
    public int W0(f2.j1 j1Var) {
        switch (this.I) {
            case 3:
                return 5000;
            case 7:
                return AndroidUtilities.dp(4000.0f);
            default:
                return super.W0(j1Var);
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
    public void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.I) {
            case 2:
                xh.o oVar = new xh.o(recyclerView.getContext(), 0);
                oVar.a = i10;
                w0(oVar);
                break;
            case 13:
                js0 js0Var = new js0(recyclerView.getContext());
                js0Var.a = i10;
                w0(js0Var);
                break;
            default:
                super.v0(recyclerView, j1Var, i10);
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
    public /* synthetic */ k(int i10, boolean z4, int i11) {
        super(i10, z4);
        this.I = i11;
    }

    public k(sb sbVar) {
        this.I = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k() {
        super(0, true);
        this.I = 13;
    }
}
