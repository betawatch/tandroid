package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.u10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ s2(int i3, org.telegram.messenger.u10 u10Var, boolean[] zArr) {
        this.a = i3;
        this.b = u10Var;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.a(Boolean.TRUE);
                this.c[0] = true;
                s1Var.dismiss();
                break;
        }
    }
}
