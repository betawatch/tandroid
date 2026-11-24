// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cc6 extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pc6 b;

    public /* synthetic */ cc6(pc6 pc6Var, byte b) {
        this.a = b;
        this.b = pc6Var;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        byte b = this.a;
        pc6 pc6Var = this.b;
        switch (b) {
            case 0:
                if (i == 1 && pc6Var.u0 && pc6Var.v0) {
                    gm.t1(pc6Var.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                boolean z = i != 0;
                pc6Var.N = z;
                if (!z && pc6Var.I != null) {
                    pc6Var.I = null;
                    break;
                }
                break;
        }
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                pc6 pc6Var = this.b;
                pc6Var.N0(false);
                if (pc6Var.I != null) {
                    pc6Var.K += i2;
                    break;
                }
                break;
        }
    }
}
