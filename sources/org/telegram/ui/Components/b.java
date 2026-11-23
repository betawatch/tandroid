package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.oc {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ b(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.oc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                n0Var.n2 = str;
                n0Var.P2.O(true);
                break;
            default:
                n0 n0Var2 = this.b;
                n0Var2.n2 = str;
                n0Var2.P2.O(true);
                break;
        }
    }
}
