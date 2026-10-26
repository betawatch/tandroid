package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ eb(MessagesController messagesController, a0.h hVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getChannelDifference$341(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$412(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$411(this.c);
                break;
        }
    }
}
