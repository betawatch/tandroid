package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ga implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ag.y c;

    public /* synthetic */ ga(MessagesController messagesController, ag.y yVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$409(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$404(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$407(this.c);
                break;
        }
    }
}
