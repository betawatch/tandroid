package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class jb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.i c;
    public final /* synthetic */ a0.i d;

    public /* synthetic */ jb(MessagesController messagesController, a0.i iVar, a0.i iVar2, int i10) {
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
