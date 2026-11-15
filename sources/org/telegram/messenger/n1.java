package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] b;

    public /* synthetic */ n1(org.telegram.ui.ActionBar.t1[] t1VarArr, int i7) {
        this.a = i7;
        this.b = t1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, t0.b, null);
                t1VarArr[0] = t1Var;
                t1Var.r(500L);
                break;
            default:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.b[0];
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    break;
                }
                break;
        }
    }
}
