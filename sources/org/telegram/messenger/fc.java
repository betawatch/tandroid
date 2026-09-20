package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.i c;

    public /* synthetic */ fc(MessagesController messagesController, a0.i iVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$407(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$406(this.c);
                break;
            default:
                this.b.lambda$getChannelDifference$340(this.c);
                break;
        }
    }
}
