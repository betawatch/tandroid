package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements org.telegram.ui.ActionBar.b2, BillingController.ProductDetailsResponseListenerLegacy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                AccountInstance accountInstance = (AccountInstance) this.c;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f;
                org.telegram.ui.Cells.y1[] y1VarArr = (org.telegram.ui.Cells.y1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(wnVar.a(), user.id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(wnVar.a(), -chat.id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (y1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (wnVar.getParentActivity() != null) {
                        wnVar.Z7();
                        UndoView undoView = wnVar.K3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new b2(accountInstance, 0));
                break;
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) this.f;
                m4.w1 w1Var = (m4.w1) this.h;
                org.telegram.ui.kn0 kn0Var = sm0Var.a;
                kn0Var.Y[0].setText(str);
                kn0Var.Y[1].setText(str2);
                kn0Var.Y[2].setText(str3);
                kn0Var.N1(true, true);
                sm0Var.c(nj0Var, w1Var);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        switch (this.a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.h;
                tL_inputStorePaymentPremiumGiftCode.currency = ((d5.o) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new bi.b8(callback, list, iVar, callback2, r2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.d;
                vg.v vVar = (vg.v) this.e;
                vg.v vVar2 = (vg.v) this.f;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.h;
                tL_inputStorePaymentPremiumGiveaway.currency = ((d5.o) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new bi.b8(vVar, list, iVar, vVar2, r2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                break;
        }
    }

    public /* synthetic */ c1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.wn wnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.y1[] y1VarArr, org.telegram.ui.ActionBar.u6 u6Var) {
        this.a = 0;
        this.b = user;
        this.c = accountInstance;
        this.d = wnVar;
        this.e = chat;
        this.f = messageObject;
        this.h = y1VarArr;
    }
}
