package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class rb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.i c;
    public final /* synthetic */ a0.i d;

    public /* synthetic */ rb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
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
