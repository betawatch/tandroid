package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ jf.t c;

    public /* synthetic */ sa(MessagesController messagesController, jf.t tVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$402(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$404(this.c);
                break;
            default:
                this.b.lambda$processUpdateArray$399(this.c);
                break;
        }
    }
}
