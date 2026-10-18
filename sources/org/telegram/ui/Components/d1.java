package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements org.telegram.ui.ActionBar.a2, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                AccountInstance accountInstance = (AccountInstance) this.c;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(snVar.a(), user.id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(snVar.a(), -chat.id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (snVar.getParentActivity() != null) {
                        snVar.T7();
                        UndoView undoView = snVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                break;
            default:
                org.telegram.ui.gm0 gm0Var = (org.telegram.ui.gm0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f;
                mi.q qVar = (mi.q) this.h;
                org.telegram.ui.xm0 xm0Var = gm0Var.a;
                xm0Var.Y[0].setText(str);
                xm0Var.Y[1].setText(str2);
                xm0Var.Y[2].setText(str3);
                xm0Var.M1(true, true);
                gm0Var.c(ek0Var, qVar);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                tL_inputStorePaymentPremiumGiftCode.currency = ((c5.o) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new ai.e8(callback, list, iVar, callback2, n2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.d;
                ug.u uVar = (ug.u) this.e;
                ug.u uVar2 = (ug.u) this.f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                tL_inputStorePaymentPremiumGiveaway.currency = ((c5.o) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new ai.e8(uVar, list, iVar, uVar2, n2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                break;
        }
    }

    public /* synthetic */ d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.sn snVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = 0;
        this.b = user;
        this.c = accountInstance;
        this.d = snVar;
        this.e = chat;
        this.f = messageObject;
        this.h = a2VarArr;
    }
}
