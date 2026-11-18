package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ ko(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vo voVar = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = voVar.r;
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new wf(voVar, 2));
                    voVar.showDialog(voVar.r);
                    break;
                }
                break;
            case 1:
                vo voVar2 = this.b;
                voVar2.getMessagesController().b3(0, voVar2.F, true);
                break;
            default:
                vo voVar3 = this.b;
                voVar3.getMessagesController().b3(0, voVar3.F, true);
                break;
        }
    }
}
