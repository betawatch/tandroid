package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b3(FileLoader.1 r22, boolean z10, String str, boolean z11) {
        this.a = 0;
        this.d = r22;
        this.b = z10;
        this.e = str;
        this.c = z11;
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

    public /* synthetic */ b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.b = z10;
        this.c = z11;
    }
}
