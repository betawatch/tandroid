package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
