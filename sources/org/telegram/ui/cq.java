package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;

    public /* synthetic */ cq(jr jrVar, int i9) {
        this.a = i9;
        this.b = jrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q0();
                break;
            default:
                jr jrVar = this.b;
                jrVar.getMessagesController().loadFullChat(jrVar.J, 0, true);
                break;
        }
    }
}
