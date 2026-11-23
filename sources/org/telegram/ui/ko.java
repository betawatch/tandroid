package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                org.telegram.ui.ActionBar.t1 t1Var = voVar.r;
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new wf(voVar, 2));
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
