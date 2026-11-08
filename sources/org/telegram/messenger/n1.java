package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] b;

    public /* synthetic */ n1(org.telegram.ui.ActionBar.u1[] u1VarArr, int i7) {
        this.a = i7;
        this.b = u1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, t0.b, null);
                u1VarArr[0] = u1Var;
                u1Var.r(500L);
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.b[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    break;
                }
                break;
        }
    }
}
