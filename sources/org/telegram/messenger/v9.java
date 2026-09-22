package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r80;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class v9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v9(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
        this.a = 0;
        this.b = messagesController;
        this.c = z10;
        this.e = user;
        this.d = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$deleteParticipantFromChat$316(this.c, (TLRPC.User) this.e, this.d, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 2:
                r80.s((r80) this.b, this.d, this.c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new ai.h3((yh.g) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ v9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.e = obj;
        this.c = z10;
        this.d = j3;
    }

    public /* synthetic */ v9(r80 r80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.b = r80Var;
        this.d = j3;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
