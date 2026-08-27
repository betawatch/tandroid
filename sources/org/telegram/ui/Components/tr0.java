package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tr0 extends f2.w {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ tr0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                zs0 zs0Var = (zs0) this.d;
                f2.q0 adapter = zs0Var.r.getAdapter();
                hu0 hu0Var = (hu0) this.e;
                bu0 bu0Var = hu0Var.E;
                if (adapter == bu0Var) {
                    if (bu0Var.j(i10) == 2) {
                        return zs0Var.s.J;
                    }
                    return 1;
                }
                if (hu0.v(hu0Var, adapter) == -1) {
                    return 1;
                }
                ((eu0) adapter).getClass();
                return 1;
            default:
                kh.i iVar = (kh.i) this.d;
                b51 b51Var = ((k51) this.e).U2;
                if (b51Var == null) {
                    return iVar.J;
                }
                n41 G = b51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}
