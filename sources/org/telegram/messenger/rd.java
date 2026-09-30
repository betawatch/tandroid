package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkLastDialogMessage$225(this.c);
                break;
            case 1:
                this.b.lambda$checkLastDialogMessage$226(this.c);
                break;
            default:
                this.b.lambda$checkLastDialogMessage$224(this.c);
                break;
        }
    }
}
