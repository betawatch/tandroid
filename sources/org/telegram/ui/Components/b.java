package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.oc {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ b(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // org.telegram.messenger.oc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                d0Var.n2 = str;
                d0Var.K2.O(true);
                break;
            default:
                d0 d0Var2 = this.b;
                d0Var2.n2 = str;
                d0Var2.K2.O(true);
                break;
        }
    }
}
