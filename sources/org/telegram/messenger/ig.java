package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.IntCallback b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ ig(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.a = i10;
        this.b = intCallback;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$258(this.b, this.c);
                break;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$55(this.b, this.c);
                break;
        }
    }
}
