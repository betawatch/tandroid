package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.x10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ a3(int i7, org.telegram.messenger.x10 x10Var, boolean[] zArr) {
        this.a = i7;
        this.b = x10Var;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.a(Boolean.TRUE);
                this.c[0] = true;
                u1Var.dismiss();
                break;
        }
    }
}
