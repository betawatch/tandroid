package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp b;

    public /* synthetic */ np(yp ypVar, int i10) {
        this.a = i10;
        this.b = ypVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yp ypVar = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = ypVar.r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new qg(ypVar, 2));
                    ypVar.showDialog(ypVar.r);
                    break;
                }
                break;
            case 1:
                yp ypVar2 = this.b;
                ypVar2.getMessagesController().loadFullChat(ypVar2.E, 0, true);
                break;
            default:
                yp ypVar3 = this.b;
                ypVar3.getMessagesController().loadFullChat(ypVar3.E, 0, true);
                break;
        }
    }
}
