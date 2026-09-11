package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b61 extends g.p {
    public final /* synthetic */ a61 c;
    public final /* synthetic */ d61 d;

    public b61(d61 d61Var, a61 a61Var) {
        this.d = d61Var;
        this.c = a61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        v51 v51Var = this.d.Y2;
        a61 a61Var = this.c;
        if (v51Var == null) {
            return a61Var.J;
        }
        h51 G = v51Var.G(i10);
        return (G == null || (i11 = G.u) == -1) ? a61Var.J : i11;
    }
}
