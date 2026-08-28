package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ii implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ ii(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i9) {
        this.a = i9;
        this.b = sendMessagesHelper;
        this.c = tL_error;
        this.d = o2Var;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$sendEditRichMessageRequest$25(this.c, this.d, this.e);
                break;
            default:
                this.b.lambda$editMessage$20(this.c, this.d, this.e);
                break;
        }
    }
}
