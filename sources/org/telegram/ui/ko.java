package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ ko(vo voVar, int i9) {
        this.a = i9;
        this.b = voVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vo voVar = this.b;
                voVar.Y = true;
                voVar.a0();
                break;
            case 1:
                vo voVar2 = this.b;
                voVar2.T = voVar2.getMessagesController().getChat(Long.valueOf(voVar2.V));
                voVar2.X();
                break;
            case 2:
                this.b.Z(false);
                break;
            case 3:
                vo voVar3 = this.b;
                voVar3.Y = true;
                if (voVar3.a.length() > 0) {
                    voVar3.V(voVar3.a.getText().toString());
                }
                voVar3.a0();
                break;
            case 4:
                this.b.X();
                break;
            default:
                this.b.Z(true);
                break;
        }
    }
}
