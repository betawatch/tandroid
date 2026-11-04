package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] b;

    public /* synthetic */ n1(org.telegram.ui.ActionBar.s1[] s1VarArr, int i3) {
        this.a = i3;
        this.b = s1VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, t0.b, null);
                s1VarArr[0] = s1Var;
                s1Var.r(500L);
                break;
            default:
                org.telegram.ui.ActionBar.s1 s1Var2 = this.b[0];
                if (s1Var2 != null) {
                    s1Var2.dismiss();
                    break;
                }
                break;
        }
    }
}
