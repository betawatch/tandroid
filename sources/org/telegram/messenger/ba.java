package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ic0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class ba implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ba(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.a = 0;
        this.b = messagesController;
        this.c = z10;
        this.e = user;
        this.d = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$deleteParticipantFromChat$315(this.c, (TLRPC.User) this.e, this.d, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$checkChatInviter$374((TLRPC.Chat) this.e, this.c, this.d, tLObject, tL_error);
                break;
            case 2:
                f90.u((f90) this.b, this.d, this.c, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.x2((ic0) this.b, tLObject, this.d, (String) this.e, this.c, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bi.x2((zh.g) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.d));
                break;
        }
    }

    public /* synthetic */ ba(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
        this.e = obj;
        this.c = z10;
        this.d = j10;
    }

    public /* synthetic */ ba(f90 f90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.b = f90Var;
        this.d = j10;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ ba(ic0 ic0Var, long j10, String str, boolean z10) {
        this.a = 3;
        this.b = ic0Var;
        this.d = j10;
        this.e = str;
        this.c = z10;
    }
}
