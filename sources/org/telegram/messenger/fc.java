package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
