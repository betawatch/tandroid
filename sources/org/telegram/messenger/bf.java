package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ MessagesStorage.IntCallback d;

    public /* synthetic */ bf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i9) {
        this.a = i9;
        this.b = messagesStorage;
        this.c = j10;
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
