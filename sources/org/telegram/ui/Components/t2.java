package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ t2(int i7, org.telegram.messenger.c20 c20Var, boolean[] zArr) {
        this.a = i7;
        this.b = c20Var;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
