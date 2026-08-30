package jh;

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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.og1;
import org.telegram.ui.xn;
import uf.k0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
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
                ((SendMessagesHelper) this.c).lambda$requestUrlAuth$37((TLRPC.TL_messages_requestUrlAuth) this.d, (xn) this.e, (String) this.f, this.b, tLObject, tL_error);
                break;
            case 3:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$26(this.b, (MessageObject) this.d, (TLRPC.TL_messages_editMessage) this.e, (p2) this.f, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new h((og1) this.c, tL_error, this.b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h((k0) this.c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.f, this.b, (TLRPC.User) this.e));
                break;
        }
    }

    public /* synthetic */ g(v vVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = 0;
        this.c = vVar;
        this.d = tL_chatInviteImporter;
        this.b = z4;
        this.e = user;
        this.f = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ g(ContactsController contactsController, ArrayList arrayList, ArrayList arrayList2, boolean z4, String str) {
        this.a = 1;
        this.c = contactsController;
        this.d = arrayList;
        this.e = arrayList2;
        this.b = z4;
        this.f = str;
    }

    public /* synthetic */ g(SendMessagesHelper sendMessagesHelper, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, xn xnVar, String str, boolean z4) {
        this.a = 2;
        this.c = sendMessagesHelper;
        this.d = tL_messages_requestUrlAuth;
        this.e = xnVar;
        this.f = str;
        this.b = z4;
    }

    public /* synthetic */ g(k0 k0Var, int[] iArr, ArrayList arrayList, boolean z4, TLRPC.User user) {
        this.a = 5;
        this.c = k0Var;
        this.d = iArr;
        this.f = arrayList;
        this.b = z4;
        this.e = user;
    }
}
