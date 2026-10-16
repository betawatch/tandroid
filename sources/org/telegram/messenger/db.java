package org.telegram.messenger;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ zf.s c;

    public /* synthetic */ db(MessagesController messagesController, zf.s sVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$402(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$405(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$407(this.c);
                break;
        }
    }
}
