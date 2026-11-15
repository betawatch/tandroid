package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n30 b;

    public /* synthetic */ m30(n30 n30Var, int i7) {
        this.a = i7;
        this.b = n30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n30 n30Var = this.b;
                rv rvVar = n30Var.b;
                if (rvVar != null) {
                    rvVar.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new m30(n30Var, 2), 16L);
                break;
            case 1:
                rv rvVar2 = this.b.b;
                if (rvVar2 != null) {
                    rvVar2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
