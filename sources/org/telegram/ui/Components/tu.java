package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uu b;

    public /* synthetic */ tu(uu uuVar, int i7) {
        this.a = i7;
        this.b = uuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        uu uuVar = this.b;
        switch (i7) {
            case 0:
                uuVar.f.dismiss();
                break;
            default:
                wu wuVar = uuVar.f;
                wuVar.dismiss();
                org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                if (e2Var != null && e2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.o(null, 2131754435, cc.a0(e2Var), null);
                    break;
                }
                break;
        }
    }
}
