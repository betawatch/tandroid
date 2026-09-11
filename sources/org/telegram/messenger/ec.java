package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class ec implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.i c;

    public /* synthetic */ ec(MessagesController messagesController, a0.i iVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$407(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$406(this.c);
                break;
            default:
                this.b.lambda$getChannelDifference$340(this.c);
                break;
        }
    }
}
