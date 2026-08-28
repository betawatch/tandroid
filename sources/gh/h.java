package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p70;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
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
                AndroidUtilities.runOnUIThread(new i((r) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.b, this.c));
                break;
            case 1:
                ((MessagesController) this.d).lambda$deleteParticipantFromChat$316(this.b, (TLRPC.User) this.e, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.d).lambda$checkChatInviter$375((TLRPC.Chat) this.e, this.b, this.c, tLObject, tL_error);
                break;
            default:
                p70.s((p70) this.d, this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.e, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ h(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, long j10, int i9) {
        this.a = i9;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.b = z10;
        this.c = j10;
    }

    public /* synthetic */ h(p70 p70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 3;
        this.d = p70Var;
        this.c = j10;
        this.b = z10;
        this.e = tL_messages_importChatInvite;
    }
}
