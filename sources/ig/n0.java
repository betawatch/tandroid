package ig;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.co;
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n0(u0 u0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.a = 0;
        this.d = u0Var;
        this.e = iArr;
        this.b = arrayList;
        this.c = z10;
        this.f = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q0((u0) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.b, this.c, (TLRPC.User) this.f));
                break;
            case 1:
                ((ContactsController) this.d).lambda$deleteContact$57((ArrayList) this.b, (ArrayList) this.e, this.c, (String) this.f, tLObject, tL_error);
                break;
            case 2:
                ((SendMessagesHelper) this.d).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.e, (co) this.b, (String) this.f, this.c, tLObject, tL_error);
                break;
            case 3:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26(this.c, (MessageObject) this.e, (TLRPC.TL_messages_editMessage) this.b, (n2) this.f, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new q0((hh1) this.d, tL_error, this.c, tLObject, (byte[]) this.e, (String) this.b, (TL_account.passwordInputSettings) this.f));
                break;
            default:
                xh.n nVar = (xh.n) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.b;
                if (tL_error == null) {
                    MessagesController.getInstance(nVar.k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q0(nVar, tL_error, tLObject, tL_chatInviteImporter, this.c, user, tL_messages_hideChatJoinRequest));
                break;
        }
    }

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n0(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.a = 1;
        this.d = contactsController;
        this.b = arrayList;
        this.e = arrayList2;
        this.c = z10;
        this.f = str;
    }

    public /* synthetic */ n0(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, co coVar, String str, boolean z10) {
        this.a = 2;
        this.d = sendMessagesHelper;
        this.e = tL_messages_requestUrlAuth;
        this.b = coVar;
        this.f = str;
        this.c = z10;
    }

    public /* synthetic */ n0(xh.n nVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = 5;
        this.d = nVar;
        this.e = tL_chatInviteImporter;
        this.c = z10;
        this.f = user;
        this.b = tL_messages_hideChatJoinRequest;
    }
}
