// default package

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gg2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gg2(mg2 mg2Var, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.a = (byte) 0;
        this.d = mg2Var;
        this.e = iArr;
        this.b = arrayList;
        this.c = z;
        this.f = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        byte b = 1;
        switch (this.a) {
            case 0:
                mg2 mg2Var = (mg2) this.d;
                int[] iArr = (int[]) this.e;
                ArrayList arrayList = (ArrayList) this.b;
                boolean z = this.c;
                TLRPC.User user = (TLRPC.User) this.f;
                mg2Var.getClass();
                hl.c3(new d6a(mg2Var, tL_error, tLObject, iArr, arrayList, z, user));
                break;
            case 1:
                lv2 lv2Var = (lv2) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                boolean z2 = this.c;
                String str = (String) this.f;
                if (tL_error == null) {
                    lv2Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    jf7 messagesStorage = lv2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList2.isEmpty()) {
                        messagesStorage.a.c(new q41(messagesStorage, arrayList2, (byte) 18));
                    }
                    Utilities.h.c(new zu2(lv2Var, arrayList3, b));
                    for (int i = 0; i < arrayList3.size(); i++) {
                        TLRPC.User user2 = (TLRPC.User) arrayList3.get(i);
                        if (!TextUtils.isEmpty(user2.phone)) {
                            lv2Var.getMessagesStorage().e(user2.phone, "");
                            iv2 iv2Var = (iv2) lv2Var.a0.get(user2.phone);
                            if (iv2Var != null && (indexOf = iv2Var.g.indexOf(user2.phone)) != -1) {
                                iv2Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    hl.c3(new lg((Object) lv2Var, (Object) arrayList3, z2, (Object) str, (byte) 14));
                    break;
                }
                break;
            case 2:
                e17 e17Var = (e17) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                boolean z3 = this.c;
                TLRPC.User user3 = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.b;
                if (tL_error == null) {
                    uc7.s1(e17Var.k).Y3((TLRPC.TL_updates) tLObject, false);
                }
                hl.c3(new d6a(e17Var, tL_error, tLObject, tL_chatInviteImporter, z3, user3, tL_messages_hideChatJoinRequest));
                break;
            case 3:
                hl.c3(new y6a(this.d, (Object) tLObject, this.e, this.b, (Serializable) this.f, this.c, (byte) 0));
                break;
            case 4:
                r7a r7aVar = (r7a) this.d;
                boolean z4 = this.c;
                r47 r47Var = (r47) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.b;
                e eVar = (e) this.f;
                if (tL_error == null) {
                    if (z4 && r47Var != null) {
                        r47Var.A2 = true;
                    }
                    r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new bt1(r7aVar, r47Var));
                    break;
                } else {
                    if (xc4.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        va7 va7Var = new va7(r7aVar, tL_messages_editMessage, r47Var, eVar, z4);
                        if (r47Var != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList4 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList4.addAll(tL_inputRichMessage.photos);
                            arrayList4.addAll(tL_inputRichMessage.documents);
                            if (!arrayList4.isEmpty()) {
                                int c = xc4.c(str2);
                                if (c < 0 || c >= arrayList4.size()) {
                                    c = 0;
                                }
                                r7aVar.getFileRefController().u(new Object[]{arrayList4.get(c), va7Var}, r47Var);
                                break;
                            }
                        }
                    }
                    hl.c3(new en9(r7aVar, r47Var, (byte) 23));
                    if (eVar != null) {
                        hl.c3(new z6a(r7aVar, tL_error, eVar, tL_messages_editMessage, (byte) 0));
                        break;
                    }
                }
                break;
            default:
                hl.c3(new d6a((o7c) this.d, tL_error, this.c, tLObject, (byte[]) this.e, (String) this.b, (TL_account.passwordInputSettings) this.f));
                break;
        }
    }

    public /* synthetic */ gg2(lv2 lv2Var, ArrayList arrayList, ArrayList arrayList2, boolean z, String str) {
        this.a = (byte) 1;
        this.d = lv2Var;
        this.b = arrayList;
        this.e = arrayList2;
        this.c = z;
        this.f = str;
    }

    public /* synthetic */ gg2(e17 e17Var, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = (byte) 2;
        this.d = e17Var;
        this.e = tL_chatInviteImporter;
        this.c = z;
        this.f = user;
        this.b = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ gg2(r7a r7aVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, zu1 zu1Var, String str, boolean z) {
        this.a = (byte) 3;
        this.d = r7aVar;
        this.e = tL_messages_requestUrlAuth;
        this.b = zu1Var;
        this.f = str;
        this.c = z;
    }

    public /* synthetic */ gg2(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }
}
