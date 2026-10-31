package mg;

import java.util.List;
import org.telegram.messenger.aq;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ll0;
import org.telegram.ui.mg0;
import org.telegram.ui.tk0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements org.telegram.messenger.t1, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override // org.telegram.messenger.t1
    public void a(c5.g gVar, List list) {
        switch (this.a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                q20 q20Var = (q20) this.f;
                q20 q20Var2 = (q20) this.h;
                k2 k2Var = (k2) this.d;
                tL_inputStorePaymentPremiumGiftCode.currency = ((c5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_premiumGiftCodeOption.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new e0(q20Var, list, gVar, q20Var2, k2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.b;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.c;
                o0 o0Var = (o0) this.f;
                o0 o0Var2 = (o0) this.h;
                k2 k2Var2 = (k2) this.d;
                tL_inputStorePaymentPremiumGiveaway.currency = ((c5.m) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_premiumGiftCodeOption2.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new e0(o0Var, list, gVar, o0Var2, k2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.b;
                un unVar = (un) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f;
                jj jjVar = (jj) this.h;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.d;
                if (user != null) {
                    hs a02 = hs.a0(cVar.a);
                    a02.a.c(new aq(3, unVar.a(), user.id, a02));
                } else {
                    hs a03 = hs.a0(cVar.a);
                    a03.a.c(new aq(3, unVar.a(), -chat.id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = jjVar.f1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (unVar.getParentActivity() != null) {
                        unVar.Y7();
                        UndoView undoView = unVar.M3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.a).sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.x1(cVar, 0));
                break;
            default:
                tk0 tk0Var = (tk0) this.e;
                String str = (String) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.f;
                mg0 mg0Var = (mg0) this.h;
                m4.c cVar2 = (m4.c) this.d;
                ll0 ll0Var = tk0Var.a;
                ll0Var.Y[0].setText(str);
                ll0Var.Y[1].setText(str2);
                ll0Var.Y[2].setText(str3);
                ll0Var.Q1(true, true);
                tk0Var.c(mg0Var, cVar2);
                break;
        }
    }

    public /* synthetic */ y(TLRPC.User user, org.telegram.messenger.c cVar, un unVar, TLRPC.Chat chat, jj jjVar, org.telegram.ui.Cells.c2[] c2VarArr, p6 p6Var) {
        this.a = 2;
        this.e = user;
        this.b = cVar;
        this.c = unVar;
        this.f = chat;
        this.h = jjVar;
        this.d = c2VarArr;
    }
}
