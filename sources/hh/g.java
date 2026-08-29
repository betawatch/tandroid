package hh;

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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.cg1;
import org.telegram.ui.tn;
import sf.l0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(v vVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = 0;
        this.c = vVar;
        this.d = tL_chatInviteImporter;
        this.b = z10;
        this.e = user;
        this.f = tL_messages_hideChatJoinRequest;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                v vVar = (v) this.c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f;
                if (tL_error == null) {
                    MessagesController.getInstance(vVar.k).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new h(vVar, tL_error, tLObject, tL_chatInviteImporter, this.b, user, tL_messages_hideChatJoinRequest));
                break;
            case 1:
                ((ContactsController) this.c).lambda$deleteContact$57((ArrayList) this.d, (ArrayList) this.e, this.b, (String) this.f, tLObject, tL_error);
                break;
            case 2:
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (tn) this.e, (String) this.f, this.b, tLObject, tL_error);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$26(this.b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.e, (o2) this.f, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new h((cg1) this.c, tL_error, this.b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h((l0) this.c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f, this.b, (TLRPC.User) this.e));
                break;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.a = 1;
        this.c = contactsController;
        this.d = arrayList;
        this.e = arrayList2;
        this.b = z10;
        this.f = str;
    }

    public /* synthetic */ g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, tn tnVar, String str, boolean z10) {
        this.a = 2;
        this.c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.e = tnVar;
        this.f = str;
        this.b = z10;
    }

    public /* synthetic */ g(l0 l0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.a = 5;
        this.c = l0Var;
        this.d = iArr;
        this.f = arrayList;
        this.b = z10;
        this.e = user;
    }
}
