package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class ob implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ ob(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
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
