package org.telegram.messenger;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
