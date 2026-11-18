package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
