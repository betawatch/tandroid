package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class op implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq b;

    public /* synthetic */ op(aq aqVar, int i10) {
        this.a = i10;
        this.b = aqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aq aqVar = this.b;
                org.telegram.ui.ActionBar.a2 a2Var = aqVar.r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new ug(aqVar, 2));
                    aqVar.showDialog(aqVar.r);
                    break;
                }
                break;
            case 1:
                aq aqVar2 = this.b;
                aqVar2.getMessagesController().loadFullChat(aqVar2.E, 0, true);
                break;
            default:
                aq aqVar3 = this.b;
                aqVar3.getMessagesController().loadFullChat(aqVar3.E, 0, true);
                break;
        }
    }
}
