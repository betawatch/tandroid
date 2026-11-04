package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.jc {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ b(e0 e0Var, int i3) {
        this.a = i3;
        this.b = e0Var;
    }

    @Override // org.telegram.messenger.jc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                e0Var.k2 = str;
                e0Var.H2.O(true);
                break;
            default:
                e0 e0Var2 = this.b;
                e0Var2.k2 = str;
                e0Var2.H2.O(true);
                break;
        }
    }
}
