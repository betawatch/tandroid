package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class hb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ hb(MessagesController messagesController, a0.h hVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$412(this.c);
                break;
            case 1:
                this.b.lambda$getChannelDifference$341(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$413(this.c);
                break;
        }
    }
}
