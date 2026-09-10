package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q80;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class ca implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ca(MessagesController messagesController, boolean z10, TLRPC.User user, long j3) {
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
                q80.s((q80) this.b, this.d, this.c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gg((xh.h) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ ca(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j3, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.e = obj;
        this.c = z10;
        this.d = j3;
    }

    public /* synthetic */ ca(q80 q80Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.b = q80Var;
        this.d = j3;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }
}
