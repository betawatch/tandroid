package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lb(MessagesController messagesController, int i9, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.e = messagesController;
        this.b = i9;
        this.f = chat;
        this.d = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$pinMessage$130(this.b, (TLRPC.Chat) this.f, this.d, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new s1((zp0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ lb(zp0 zp0Var, String str, int i9, boolean z10, TLRPC.User user) {
        this.e = zp0Var;
        this.f = str;
        this.b = i9;
        this.c = z10;
        this.d = user;
    }
}
