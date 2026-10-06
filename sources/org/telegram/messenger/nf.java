package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
