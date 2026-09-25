package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ lq(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                pr prVar = this.b;
                prVar.getMessagesController().loadFullChat(prVar.N, 0, true);
                break;
        }
    }
}
