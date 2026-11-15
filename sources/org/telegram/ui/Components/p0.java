package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
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
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.e;
                org.telegram.messenger.z10 z10Var2 = (org.telegram.messenger.z10) this.f;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.h;
                tL_inputStorePaymentPremiumGiftCode.currency = ((f5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new di.u6(z10Var, list, fVar, z10Var2, e2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.b;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.c;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.d;
                wg.t tVar = (wg.t) this.e;
                wg.t tVar2 = (wg.t) this.f;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.h;
                tL_inputStorePaymentPremiumGiveaway.currency = ((f5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new di.u6(tVar, list, fVar, tVar2, e2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(cVar.a);
                    a02.a.c(new org.telegram.messenger.pp(3, anVar.a(), user.id, a02));
                } else {
                    org.telegram.messenger.vr a03 = org.telegram.messenger.vr.a0(cVar.a);
                    a03.a.c(new org.telegram.messenger.pp(3, anVar.a(), -chat.id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = gjVar.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (anVar.getParentActivity() != null) {
                        anVar.h8();
                        UndoView undoView = anVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.a).sendRequest(tL_contacts_blockFromReplies, new v1(cVar, 0));
                break;
            default:
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) this.f;
                k8.a aVar = (k8.a) this.h;
                org.telegram.ui.ek0 ek0Var = nj0Var.a;
                ek0Var.Z[0].setText(str);
                ek0Var.Z[1].setText(str2);
                ek0Var.Z[2].setText(str3);
                ek0Var.R1(true, true);
                nj0Var.c(ef0Var, aVar);
                break;
        }
    }

    public /* synthetic */ p0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.an anVar, TLRPC.Chat chat, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 0;
        this.b = user;
        this.c = cVar;
        this.d = anVar;
        this.e = chat;
        this.f = gjVar;
        this.h = c2VarArr;
    }
}
