package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ ag.y c;

    public /* synthetic */ sa(MessagesController messagesController, ag.y yVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$405(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$408(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$410(this.c);
                break;
        }
    }
}
