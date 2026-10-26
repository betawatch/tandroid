package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ zb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
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
