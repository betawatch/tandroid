package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ nf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = hVar;
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
