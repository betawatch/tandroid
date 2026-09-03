package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c3(FileLoader.1 r22, boolean z4, String str, boolean z10) {
        this.a = 0;
        this.d = r22;
        this.b = z4;
        this.e = str;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FileLoader.1) this.d).lambda$didFailedUploadingFile$1(this.b, (String) this.e, this.c);
                break;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.b, this.c);
                break;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ c3(MessagesStorage messagesStorage, Object obj, boolean z4, boolean z10, int i10) {
        this.a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.b = z4;
        this.c = z10;
    }
}
