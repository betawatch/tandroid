package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
