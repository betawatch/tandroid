package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;

    public /* synthetic */ io(to toVar, int i7) {
        this.a = i7;
        this.b = toVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                to toVar = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = toVar.r;
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new tf(toVar, 2));
                    toVar.showDialog(toVar.r);
                    break;
                }
                break;
            case 1:
                to toVar2 = this.b;
                toVar2.getMessagesController().V2(0, toVar2.F, true);
                break;
            default:
                to toVar3 = this.b;
                toVar3.getMessagesController().V2(0, toVar3.F, true);
                break;
        }
    }
}
