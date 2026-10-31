package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;

    public /* synthetic */ dp(qp qpVar, int i10) {
        this.a = i10;
        this.b = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = qpVar.r;
                if (x1Var != null) {
                    x1Var.setOnCancelListener(new kg(qpVar, 2));
                    qpVar.showDialog(qpVar.r);
                    break;
                }
                break;
            case 1:
                qp qpVar2 = this.b;
                qpVar2.getMessagesController().T2(0, qpVar2.E, true);
                break;
            default:
                qp qpVar3 = this.b;
                qpVar3.getMessagesController().T2(0, qpVar3.E, true);
                break;
        }
    }
}
