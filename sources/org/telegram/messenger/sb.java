package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ sb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = hVar;
        this.d = hVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkDeletingTask$85(this.c, this.d);
                break;
            case 1:
                this.b.lambda$updatePrintingStrings$169(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getNewDeleteTask$82(this.c, this.d);
                break;
            default:
                this.b.lambda$checkDeletingTask$84(this.c, this.d);
                break;
        }
    }
}
