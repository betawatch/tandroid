package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ MessagesStorage.IntCallback d;

    public /* synthetic */ hf(MessagesStorage messagesStorage, long j10, MessagesStorage.IntCallback intCallback, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = j10;
        this.d = intCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDialogMaxMessageId$259(this.c, this.d);
                break;
            case 1:
                this.b.lambda$getDialogFolderId$247(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getMessagesCount$162(this.c, this.d);
                break;
            default:
                this.b.lambda$getSavedDialogMaxMessageId$56(this.c, this.d);
                break;
        }
    }
}
