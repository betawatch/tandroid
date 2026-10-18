package org.telegram.messenger;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ mf(MessagesStorage messagesStorage, a0.h hVar, int i10) {
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
