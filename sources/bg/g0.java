package bg;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.fm0;
import org.telegram.ui.qn;
import org.telegram.ui.wm0;
import org.telegram.ui.zk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                AccountInstance accountInstance = (AccountInstance) this.b;
                qn qnVar = (qn) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(qnVar.a(), user.id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(qnVar.a(), -chat.id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (qnVar.getParentActivity() != null) {
                        qnVar.Q7();
                        UndoView undoView = qnVar.u3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.w1(accountInstance, 0));
                break;
            default:
                fm0 fm0Var = (fm0) this.e;
                String str = (String) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.f;
                zk0 zk0Var = (zk0) this.h;
                org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) this.d;
                wm0 wm0Var = fm0Var.a;
                wm0Var.U[0].setText(str);
                wm0Var.U[1].setText(str2);
                wm0Var.U[2].setText(str3);
                wm0Var.N1(true, true);
                fm0Var.c(zk0Var, e3Var);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                tL_inputStorePaymentPremiumGiftCode.currency = ((n2.l) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new n0(callback, list, gVar, callback2, o2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.b;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.c;
                z0 z0Var = (z0) this.f;
                z0 z0Var2 = (z0) this.h;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                tL_inputStorePaymentPremiumGiveaway.currency = ((n2.l) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new n0(z0Var, list, gVar, z0Var2, o2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                break;
        }
    }

    public /* synthetic */ g0(TLRPC.User user, AccountInstance accountInstance, qn qnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, b6 b6Var) {
        this.a = 2;
        this.e = user;
        this.b = accountInstance;
        this.c = qnVar;
        this.f = chat;
        this.h = messageObject;
        this.d = z1VarArr;
    }
}
