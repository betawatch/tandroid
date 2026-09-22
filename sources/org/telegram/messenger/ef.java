package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.IntCallback b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.a = i10;
        this.b = intCallback;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.b, this.c);
                break;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.b, this.c);
                break;
        }
    }
}
