package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ u2(int i10, org.telegram.messenger.r20 r20Var, boolean[] zArr) {
        this.a = i10;
        this.b = r20Var;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.a(Boolean.TRUE);
                this.c[0] = true;
                x1Var.dismiss();
                break;
        }
    }
}
