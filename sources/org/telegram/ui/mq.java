package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ mq(rr rrVar, int i10) {
        this.a = i10;
        this.b = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                rr rrVar = this.b;
                rrVar.getMessagesController().loadFullChat(rrVar.K, 0, true);
                break;
        }
    }
}
