package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
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
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.e;
                org.telegram.messenger.w10 w10Var2 = (org.telegram.messenger.w10) this.f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                tL_inputStorePaymentPremiumGiftCode.currency = ((f5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new di.y6(w10Var, list, fVar, w10Var2, g2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.d;
                wg.u uVar = (wg.u) this.e;
                wg.u uVar2 = (wg.u) this.f;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.h;
                tL_inputStorePaymentPremiumGiveaway.currency = ((f5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new di.y6(uVar, list, fVar, uVar2, g2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f;
                org.telegram.ui.Cells.d2[] d2VarArr = (org.telegram.ui.Cells.d2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(cVar.a);
                    a02.a.c(new org.telegram.messenger.np(3, bnVar.a(), user.id, a02));
                } else {
                    org.telegram.messenger.tr a03 = org.telegram.messenger.tr.a0(cVar.a);
                    a03.a.c(new org.telegram.messenger.np(3, bnVar.a(), -chat.id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = fjVar.e1();
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
                ConnectionsManager.getInstance(cVar.a).sendRequest(tL_contacts_blockFromReplies, new e2(cVar, 0));
                break;
            default:
                org.telegram.ui.oj0 oj0Var = (org.telegram.ui.oj0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) this.f;
                jb.m mVar = (jb.m) this.h;
                org.telegram.ui.fk0 fk0Var = oj0Var.a;
                fk0Var.Z[0].setText(str);
                fk0Var.Z[1].setText(str2);
                fk0Var.Z[2].setText(str3);
                fk0Var.R1(true, true);
                oj0Var.c(gf0Var, mVar);
                break;
        }
    }

    public /* synthetic */ b1(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.bn bnVar, TLRPC.Chat chat, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.d2[] d2VarArr, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = 0;
        this.b = user;
        this.c = cVar;
        this.d = bnVar;
        this.e = chat;
        this.f = fjVar;
        this.h = d2VarArr;
    }
}
