package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
