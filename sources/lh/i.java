package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(MessagesController messagesController, boolean z4, TLRPC.User user, long j10) {
        this.a = 1;
        this.d = messagesController;
        this.b = z4;
        this.e = user;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j((q) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.b, this.c));
                break;
            case 1:
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.b, (TLRPC.User) this.e, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.b, this.c, tLObject, tL_error);
                break;
            default:
                i80.s((i80) this.d, this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ i(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z4, long j10, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = z4;
        this.c = j10;
    }

    public /* synthetic */ i(i80 i80Var, long j10, boolean z4, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 3;
        this.d = i80Var;
        this.c = j10;
        this.b = z4;
        this.e = tL_messages_importChatInvite;
    }
}
