// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hc6 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc6 b;

    public /* synthetic */ hc6(uc6 uc6Var, byte b) {
        this.a = b;
        this.b = uc6Var;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        uc6 uc6Var = this.b;
        switch (b) {
            case 0:
                if (i == 1 && uc6Var.u0 && uc6Var.v0) {
                    hl.t1(uc6Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                boolean z = i != 0;
                uc6Var.N = z;
                if (!z && uc6Var.I != null) {
                    uc6Var.I = null;
                    break;
                }
                break;
        }
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                uc6 uc6Var = this.b;
                uc6Var.N0(false);
                if (uc6Var.I != null) {
                    uc6Var.K += i2;
                    break;
                }
                break;
        }
    }
}
