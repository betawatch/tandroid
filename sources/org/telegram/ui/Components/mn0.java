package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ mn0(po0 po0Var, int i7) {
        this.a = i7;
        this.b = po0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po0 po0Var = this.b;
                po0Var.w2 = true;
                v00 v00Var = po0Var.u2;
                v00Var.r.setText("");
                org.telegram.messenger.g0.J3(v00Var.r);
                break;
            default:
                ih ihVar = new ih(9);
                po0 po0Var2 = this.b;
                if (!po0Var2.d) {
                    ihVar.run();
                    break;
                } else {
                    v00 v00Var2 = po0Var2.u2;
                    if (v00Var2 != null) {
                        org.telegram.messenger.g0.v1(v00Var2.r);
                    }
                    org.telegram.messenger.g0.i3(ihVar, 300L);
                    break;
                }
        }
    }
}
