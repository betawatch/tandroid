package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c80;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
        this.a = 1;
        this.d = messagesController;
        this.b = z10;
        this.e = user;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i((q) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.b, this.c));
                break;
            case 1:
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.b, (TLRPC.User) this.e, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.b, this.c, tLObject, tL_error);
                break;
            default:
                c80.s((c80) this.d, this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = z10;
        this.c = j10;
    }

    public /* synthetic */ h(c80 c80Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 3;
        this.d = c80Var;
        this.c = j10;
        this.b = z10;
        this.e = tL_messages_importChatInvite;
    }
}
