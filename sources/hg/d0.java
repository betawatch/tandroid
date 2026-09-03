package hg;

import java.util.List;
import n7.qa;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.nm0;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                AccountInstance accountInstance = (AccountInstance) this.b;
                xn xnVar = (xn) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), user.id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), -chat.id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (xnVar.getParentActivity() != null) {
                        xnVar.Q7();
                        UndoView undoView = xnVar.v3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.y1(accountInstance, 0));
                break;
            default:
                nm0 nm0Var = (nm0) this.e;
                String str = (String) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.f;
                gl0 gl0Var = (gl0) this.h;
                qa qaVar = (qa) this.d;
                fn0 fn0Var = nm0Var.a;
                fn0Var.V[0].setText(str);
                fn0Var.V[1].setText(str2);
                fn0Var.V[2].setText(str3);
                fn0Var.N1(true, true);
                nm0Var.c(gl0Var, qaVar);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        switch (this.a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                tL_inputStorePaymentPremiumGiftCode.currency = ((p2.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new i0(callback, list, hVar, callback2, p2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.b;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.c;
                t0 t0Var = (t0) this.f;
                t0 t0Var2 = (t0) this.h;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                tL_inputStorePaymentPremiumGiveaway.currency = ((p2.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new i0(t0Var, list, hVar, t0Var2, p2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                break;
        }
    }

    public /* synthetic */ d0(TLRPC.User user, AccountInstance accountInstance, xn xnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, g6 g6Var) {
        this.a = 2;
        this.e = user;
        this.b = accountInstance;
        this.c = xnVar;
        this.f = chat;
        this.h = messageObject;
        this.d = z1VarArr;
    }
}
