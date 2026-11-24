// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kt4 extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tt4 b;

    public /* synthetic */ kt4(tt4 tt4Var, byte b) {
        this.a = b;
        this.b = tt4Var;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        tt4 tt4Var = this.b;
        switch (b) {
            case 0:
                tt4Var.invalidate();
                break;
            default:
                r7 r7Var = tt4Var.H;
                if (tt4Var.n.J1 && r7Var != null && r7Var.getSearchField() != null) {
                    gm.t1(r7Var.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
