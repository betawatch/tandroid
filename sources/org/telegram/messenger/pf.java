package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class pf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ long c;
    public final /* synthetic */ MessagesStorage.IntCallback d;

    public /* synthetic */ pf(MessagesStorage messagesStorage, long j3, MessagesStorage.IntCallback intCallback, int i10) {
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
