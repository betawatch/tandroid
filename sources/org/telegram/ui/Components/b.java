package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
