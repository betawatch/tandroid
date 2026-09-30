package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ MessagesStorage.IntCallback d;

    public /* synthetic */ ff(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j3;
        this.d = intCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDialogMaxMessageId$255(this.c, this.d);
                break;
            case 1:
                this.b.lambda$getDialogFolderId$243(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getMessagesCount$158(this.c, this.d);
                break;
            default:
                this.b.lambda$getSavedDialogMaxMessageId$53(this.c, this.d);
                break;
        }
    }
}
