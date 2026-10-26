package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rq0;
import org.telegram.ui.vj0;
import org.telegram.ui.xj0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class ac implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ac(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z10) {
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
                AndroidUtilities.runOnUIThread(new li.p2((xj0) this.d, (vj0) this.e, this.b, (String) this.f, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new li.p2((rq0) this.d, (String) this.e, this.b, tLObject, this.c, (TLRPC.User) this.f));
                break;
        }
    }

    public /* synthetic */ ac(xj0 xj0Var, vj0 vj0Var, int i10, String str, boolean z10) {
        this.d = xj0Var;
        this.e = vj0Var;
        this.b = i10;
        this.f = str;
        this.c = z10;
    }

    public /* synthetic */ ac(rq0 rq0Var, String str, int i10, boolean z10, TLRPC.User user) {
        this.d = rq0Var;
        this.e = str;
        this.b = i10;
        this.c = z10;
        this.f = user;
    }
}
