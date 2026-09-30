package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ a0.i c;

    public /* synthetic */ nf(MessagesStorage messagesStorage, a0.i iVar, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDialogs$239(this.c);
                break;
            case 1:
                this.b.lambda$markMessagesAsDeletedInternal$225(this.c);
                break;
            case 2:
                this.b.lambda$putWebPages$188(this.c);
                break;
            default:
                this.b.lambda$deleteEphemeralMessages$205(this.c);
                break;
        }
    }
}
