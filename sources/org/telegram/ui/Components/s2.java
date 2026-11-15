package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.z10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ s2(int i7, org.telegram.messenger.z10 z10Var, boolean[] zArr) {
        this.a = i7;
        this.b = z10Var;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.a(Boolean.TRUE);
                this.c[0] = true;
                t1Var.dismiss();
                break;
        }
    }
}
