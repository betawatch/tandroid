package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage.IntCallback b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
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
