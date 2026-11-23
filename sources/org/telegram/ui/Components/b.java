package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.nc {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ b(m0 m0Var, int i7) {
        this.a = i7;
        this.b = m0Var;
    }

    @Override // org.telegram.messenger.nc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                m0Var.n2 = str;
                m0Var.P2.O(true);
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.n2 = str;
                m0Var2.P2.O(true);
                break;
        }
    }
}
