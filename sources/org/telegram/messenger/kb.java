package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class kb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.i c;
    public final /* synthetic */ a0.i d;

    public /* synthetic */ kb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = iVar;
        this.d = iVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkDeletingTask$86(this.c, this.d);
                break;
            case 1:
                this.b.lambda$updatePrintingStrings$170(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getNewDeleteTask$83(this.c, this.d);
                break;
            default:
                this.b.lambda$checkDeletingTask$85(this.c, this.d);
                break;
        }
    }
}
