package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(cVar.a);
                    a02.a.c(new org.telegram.messenger.mp(3, wmVar.a(), user.id, a02));
                } else {
                    org.telegram.messenger.qr a03 = org.telegram.messenger.qr.a0(cVar.a);
                    a03.a.c(new org.telegram.messenger.mp(3, wmVar.a(), -chat.id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = ziVar.f1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (wmVar.getParentActivity() != null) {
                        wmVar.f8();
                        UndoView undoView = wmVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.a).sendRequest(tL_contacts_blockFromReplies, new w1(cVar, 0));
                break;
            default:
                org.telegram.ui.hj0 hj0Var = (org.telegram.ui.hj0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                org.telegram.ui.sg0 sg0Var = (org.telegram.ui.sg0) this.f;
                m2.t tVar = (m2.t) this.h;
                org.telegram.ui.yj0 yj0Var = hj0Var.a;
                yj0Var.Z[0].setText(str);
                yj0Var.Z[1].setText(str2);
                yj0Var.Z[2].setText(str3);
                yj0Var.R1(true, true);
                hj0Var.c(sg0Var, tVar);
                break;
        }
    }

    @Override // org.telegram.messenger.q1
    public void k(e5.f fVar, List list) {
        switch (this.a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.d;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.e;
                org.telegram.messenger.u10 u10Var2 = (org.telegram.messenger.u10) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                tL_inputStorePaymentPremiumGiftCode.currency = ((e5.l) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new ci.d7(u10Var, list, fVar, u10Var2, d2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.d;
                xg.v vVar = (xg.v) this.e;
                xg.v vVar2 = (xg.v) this.f;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.h;
                tL_inputStorePaymentPremiumGiveaway.currency = ((e5.l) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new ci.d7(vVar, list, fVar, vVar2, d2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                break;
        }
    }

    public /* synthetic */ r0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.wm wmVar, TLRPC.Chat chat, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 0;
        this.b = user;
        this.c = cVar;
        this.d = wmVar;
        this.e = chat;
        this.f = ziVar;
        this.h = c2VarArr;
    }
}
