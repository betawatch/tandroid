package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j4(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4((k7) this.c, tL_error, (byte[]) this.d, (TwoStepVerificationActivity) this.e, this.b, (Utilities.Callback) this.f, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new m4((ig.r0) this.c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.e, this.b, (TLRPC.User) this.f));
                break;
            case 2:
                ((ContactsController) this.c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.e, this.b, (String) this.f, tLObject, tL_error);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$40((TLRPC.TL_messages_requestUrlAuth) this.d, (sn) this.e, (String) this.f, this.b, tLObject, tL_error);
                break;
            case 4:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$29(this.b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.e, (org.telegram.ui.ActionBar.n2) this.f, tLObject, tL_error);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new m4((xf1) this.c, tL_error, this.b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f));
                break;
            default:
                xh.k kVar = (xh.k) this.c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f;
                if (tL_error == null) {
                    MessagesController.getInstance(kVar.k).lambda$processUpdates$377((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new m4(kVar, tL_error, tLObject, tL_chatInviteImporter, this.b, user, tL_messages_hideChatJoinRequest));
                break;
        }
    }

    public /* synthetic */ j4(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j4(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, sn snVar, String str, boolean z10) {
        this.a = 3;
        this.c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.e = snVar;
        this.f = str;
        this.b = z10;
    }

    public /* synthetic */ j4(xh.k kVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = 6;
        this.c = kVar;
        this.d = tL_chatInviteImporter;
        this.b = z10;
        this.e = user;
        this.f = tL_messages_hideChatJoinRequest;
    }
}
