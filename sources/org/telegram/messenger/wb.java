package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class wb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$checkLastDialogMessage$224(this.c);
                break;
            case 1:
                this.b.lambda$checkLastDialogMessage$225(this.c);
                break;
            default:
                this.b.lambda$checkLastDialogMessage$223(this.c);
                break;
        }
    }
}
