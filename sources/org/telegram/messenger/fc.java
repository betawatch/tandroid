package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.i c;

    public /* synthetic */ fc(MessagesController messagesController, a0.i iVar, int i10) {
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
