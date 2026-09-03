package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mq0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.User d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sb(MessagesController messagesController, int i10, TLRPC.Chat chat, TLRPC.User user, boolean z4) {
        this.e = messagesController;
        this.b = i10;
        this.f = chat;
        this.d = user;
        this.c = z4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$pinMessage$130(this.b, (TLRPC.Chat) this.f, this.d, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new s1((mq0) this.e, (String) this.f, this.b, tLObject, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ sb(mq0 mq0Var, String str, int i10, boolean z4, TLRPC.User user) {
        this.e = mq0Var;
        this.f = str;
        this.b = i10;
        this.c = z4;
        this.d = user;
    }
}
