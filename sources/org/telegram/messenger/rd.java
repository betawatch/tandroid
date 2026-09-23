package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
