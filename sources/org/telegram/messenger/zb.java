package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.tq0;
import org.telegram.ui.xj0;
import org.telegram.ui.zj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
        this.d = messagesController;
        this.b = i10;
        this.e = chat;
        this.f = user;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$pinMessage$129(this.b, (TLRPC.Chat) this.e, (TLRPC.User) this.f, this.c, tLObject, tL_error);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new li.p2((zj0) this.d, (xj0) this.e, this.b, (String) this.f, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new li.p2((tq0) this.d, (String) this.e, this.b, tLObject, this.c, (TLRPC.User) this.f));
                break;
        }
    }

    public /* synthetic */ zb(zj0 zj0Var, xj0 xj0Var, int i10, String str, boolean z10) {
        this.d = zj0Var;
        this.e = xj0Var;
        this.b = i10;
        this.f = str;
        this.c = z10;
    }

    public /* synthetic */ zb(tq0 tq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.d = tq0Var;
        this.e = str;
        this.b = i10;
        this.c = z10;
        this.f = user;
    }
}
