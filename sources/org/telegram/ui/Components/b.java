package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.nc {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ b(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.nc
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
