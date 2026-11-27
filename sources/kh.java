// default package

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements fd, fy8, ci0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ kh(di0 di0Var, Activity activity, k5 k5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ekd ekdVar) {
        this.a = (byte) 1;
        this.c = di0Var;
        this.d = activity;
        this.b = k5Var;
        this.e = inputStorePaymentPurpose;
        this.f = list;
        this.h = ekdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        continue;
     */
    @Override // fy8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(gi0 gi0Var, List list) {
        di0 di0Var = (di0) this.c;
        Activity activity = (Activity) this.d;
        k5 k5Var = (k5) this.b;
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = (TLRPC.InputStorePaymentPurpose) this.e;
        List list2 = (List) this.f;
        ekd ekdVar = (ekd) this.h;
        if (gi0Var.a != 0) {
            StringBuilder sb = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
            sb.append(gi0Var.a);
            sb.append(" ");
            uh9.s(gi0Var.c, sb);
            di0Var.l(activity, k5Var, inputStorePaymentPurpose, list2, ekdVar, false);
            return;
        }
        cc4.b("BillingController.launchBillingFlow, checked consumables: OK");
        z87 z87Var = new z87((Object) di0Var, (Object) activity, (Object) k5Var, (Object) inputStorePaymentPurpose, (Object) list2, (Object) ekdVar, (byte) 2);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            if (purchase.c.optBoolean("acknowledged", true)) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str = ((ei0) it2.next()).a.c;
                        if (purchase.c().contains(str)) {
                            atomicInteger.incrementAndGet();
                            cc4.b("BillingController.launchBillingFlow, consuming " + purchase.b());
                            vh0 vh0Var = di0Var.d;
                            String b = purchase.b();
                            if (b == null) {
                                lq5.j("Purchase token must be set");
                                return;
                            } else {
                                mt2 mt2Var = new mt2((byte) 0);
                                mt2Var.b = b;
                                vh0Var.a(mt2Var, new xg(purchase, arrayList, str, atomicInteger, z87Var));
                            }
                        }
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                h1 a = gi0.a();
                a.a = 0;
                di0Var.m(a.a(), Collections.singletonList(purchase), new es6((Object) arrayList, (Object) atomicInteger, (Object) z87Var, (byte) 17));
            }
        }
        if (atomicInteger.get() == 0) {
            z87Var.run();
        }
    }

    @Override // ci0
    public final void c(gi0 gi0Var, List list) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj6;
                tL_inputStorePaymentPremiumGiftCode.currency = ((wo8) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, di0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (r0.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore, new mn0(obj3, (Object) list, (Object) gi0Var, obj2, obj, (Object) tL_inputStorePaymentPremiumGiftCode, (byte) 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj6;
                tL_inputStorePaymentPremiumGiveaway.currency = ((wo8) list.get(0)).a().c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, di0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (r0.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore2, new mn0(obj3, (Object) list, (Object) gi0Var, obj2, obj, (Object) tL_inputStorePaymentPremiumGiveaway, (byte) 0));
                break;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj6;
                k5 k5Var = (k5) obj5;
                zu1 zu1Var = (zu1) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                r47 r47Var = (r47) obj2;
                sg2[] sg2VarArr = (sg2[]) obj;
                if (user != null) {
                    jf7 Y = jf7.Y(k5Var.a);
                    Y.a.c(new xd7(Y, zu1Var.a(), user.id, (byte) 3));
                } else {
                    jf7 Y2 = jf7.Y(k5Var.a);
                    Y2.a.c(new xd7(Y2, zu1Var.a(), -chat.id, (byte) 3));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = r47Var.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (sg2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (zu1Var.getParentActivity() != null) {
                        zu1Var.i6();
                        UndoView undoView = zu1Var.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(k5Var.a).sendRequest(tL_contacts_blockFromReplies, new ye(k5Var, b2));
                break;
            default:
                m08 m08Var = (m08) obj6;
                b18 b18Var = m08Var.a;
                b18Var.Z[0].setText((String) obj5);
                b18Var.Z[1].setText((String) obj4);
                b18Var.Z[2].setText((String) obj3);
                b18Var.Q1(true, true);
                m08Var.c((fe7) obj2, (um4) obj);
                break;
        }
    }

    public /* synthetic */ kh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ kh(TLRPC.User user, k5 k5Var, zu1 zu1Var, TLRPC.Chat chat, r47 r47Var, sg2[] sg2VarArr, vnb vnbVar) {
        this.a = (byte) 0;
        this.c = user;
        this.b = k5Var;
        this.d = zu1Var;
        this.e = chat;
        this.f = r47Var;
        this.h = sg2VarArr;
    }
}
