package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ ff(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$deleteEphemeralMessages$208(this.c);
                break;
            case 1:
                this.b.lambda$markMessagesAsDeletedInternal$228(this.c);
                break;
            case 2:
                this.b.lambda$putWebPages$191(this.c);
                break;
            default:
                this.b.lambda$getDialogs$242(this.c);
                break;
        }
    }
}
