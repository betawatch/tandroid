package org.telegram.messenger;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ pb(MessagesController messagesController, a0.h hVar, a0.h hVar2, int i10) {
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
