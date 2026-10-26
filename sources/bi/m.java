package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.lb0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(MessagesController messagesController, boolean z10, TLRPC.User user, long j10) {
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
                AndroidUtilities.runOnUIThread(new n((y) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.b, this.c));
                break;
            case 1:
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$317(this.b, (TLRPC.User) this.e, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$376((TLRPC.Chat) this.e, this.b, this.c, tLObject, tL_error);
                break;
            case 3:
                c90.s((c90) this.d, this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new n((lb0) this.d, tLObject, this.c, (String) this.e, this.b, tL_error));
                break;
        }
    }

    public /* synthetic */ m(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = z10;
        this.c = j10;
    }

    public /* synthetic */ m(c90 c90Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 3;
        this.d = c90Var;
        this.c = j10;
        this.b = z10;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ m(lb0 lb0Var, long j10, String str, boolean z10) {
        this.a = 4;
        this.d = lb0Var;
        this.c = j10;
        this.e = str;
        this.b = z10;
    }
}
