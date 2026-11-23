package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.y10 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ b3(int i7, org.telegram.messenger.y10 y10Var, boolean[] zArr) {
        this.a = i7;
        this.b = y10Var;
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
