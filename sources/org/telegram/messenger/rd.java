package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
