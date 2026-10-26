package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ MessagesStorage.IntCallback d;

    public /* synthetic */ df(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = intCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDialogMaxMessageId$258(this.c, this.d);
                break;
            case 1:
                this.b.lambda$getDialogFolderId$246(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getMessagesCount$161(this.c, this.d);
                break;
            default:
                this.b.lambda$getSavedDialogMaxMessageId$56(this.c, this.d);
                break;
        }
    }
}
