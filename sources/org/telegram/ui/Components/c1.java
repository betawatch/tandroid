package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        switch (this.a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) this.e;
                org.telegram.messenger.y10 y10Var2 = (org.telegram.messenger.y10) this.f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                tL_inputStorePaymentPremiumGiftCode.currency = ((f5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new di.y6(y10Var, list, fVar, y10Var2, g2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.d;
                wg.v vVar = (wg.v) this.e;
                wg.v vVar2 = (wg.v) this.f;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.h;
                tL_inputStorePaymentPremiumGiveaway.currency = ((f5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new di.y6(vVar, list, fVar, vVar2, g2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f;
                org.telegram.ui.Cells.d2[] d2VarArr = (org.telegram.ui.Cells.d2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(cVar.a);
                    a02.a.c(new org.telegram.messenger.op(3, bnVar.a(), user.id, a02));
                } else {
                    org.telegram.messenger.ur a03 = org.telegram.messenger.ur.a0(cVar.a);
                    a03.a.c(new org.telegram.messenger.op(3, bnVar.a(), -chat.id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = gjVar.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (d2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (bnVar.getParentActivity() != null) {
                        bnVar.h8();
                        UndoView undoView = bnVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.a).sendRequest(tL_contacts_blockFromReplies, new f2(cVar, 0));
                break;
            default:
                org.telegram.ui.qj0 qj0Var = (org.telegram.ui.qj0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.f;
                k8.a aVar = (k8.a) this.h;
                org.telegram.ui.hk0 hk0Var = qj0Var.a;
                hk0Var.Z[0].setText(str);
                hk0Var.Z[1].setText(str2);
                hk0Var.Z[2].setText(str3);
                hk0Var.R1(true, true);
                qj0Var.c(hf0Var, aVar);
                break;
        }
    }

    public /* synthetic */ c1(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.bn bnVar, TLRPC.Chat chat, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.d2[] d2VarArr, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = 0;
        this.b = user;
        this.c = cVar;
        this.d = bnVar;
        this.e = chat;
        this.f = gjVar;
        this.h = d2VarArr;
    }
}
