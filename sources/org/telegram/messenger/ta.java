package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ kf.t c;

    public /* synthetic */ ta(MessagesController messagesController, kf.t tVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$402(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$404(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$399(this.c);
                break;
        }
    }
}
