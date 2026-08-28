package gh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ t6(v7 v7Var, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = v7Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b;
                int i9 = v7Var.a;
                v7Var.A = false;
                TLObject tLObject = this.c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i9).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i9).putChats(starsStatus.chats, false);
                    v7Var.z.addAll(starsStatus.subscriptions);
                    v7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 1:
                v7 v7Var2 = this.b;
                int i10 = v7Var2.a;
                v7Var2.x = false;
                TLObject tLObject2 = this.c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i10).putUsers(starsStatus2.users, false);
                    MessagesController.getInstance(i10).putChats(starsStatus2.chats, false);
                    v7Var2.v.addAll(starsStatus2.subscriptions);
                    v7Var2.y = (starsStatus2.flags & 4) == 0;
                    v7Var2.w = starsStatus2.subscriptions_next_offset;
                    v7Var2.k0(starsStatus2.balance);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.c;
                boolean z10 = tLObject3 instanceof Vector;
                final v7 v7Var3 = this.b;
                if (z10) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    v7Var3.i = true;
                }
                v7Var3.j = arrayList;
                v7Var3.h = false;
                NotificationCenter.getInstance(v7Var3.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    final int i12 = 0;
                    Runnable runnable = new Runnable() { // from class: gh.z6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i13 >= arrayList5.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i14 = 1;
                                            final v7 v7Var4 = v7Var3;
                                            billingController.queryProductDetails(arrayList4, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i14) {
                                                        case 0:
                                                            final int i15 = 1;
                                                            final v7 v7Var5 = v7Var4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i15) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16 = 0; i16 < list2.size(); i16++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i16);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7 = arrayList6;
                                                                                            if (i17 >= arrayList7.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i17)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var6 = v7Var5;
                                                                                if (v7Var6.m != null) {
                                                                                    for (int i18 = 0; i18 < v7Var6.m.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var6.m.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var6.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList6;
                                                                                            if (i20 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var7 = v7Var5;
                                                                                if (v7Var7.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var7.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var7.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var7.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList6;
                                                                                            if (i23 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var5;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i16 = 2;
                                                            final v7 v7Var6 = v7Var4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i16) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i162);
                                                                                        int i17 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList7;
                                                                                            if (i17 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i17)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i17);
                                                                                            } else {
                                                                                                i17++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var62 = v7Var6;
                                                                                if (v7Var62.m != null) {
                                                                                    for (int i18 = 0; i18 < v7Var62.m.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.m.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList7;
                                                                                            if (i20 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var7 = v7Var6;
                                                                                if (v7Var7.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var7.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var7.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var7.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList7;
                                                                                            if (i23 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var6;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i17 = 0;
                                                            final v7 v7Var7 = v7Var4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i162);
                                                                                        int i172 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList8;
                                                                                            if (i172 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i172)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var62 = v7Var7;
                                                                                if (v7Var62.m != null) {
                                                                                    for (int i18 = 0; i18 < v7Var62.m.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.m.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i20 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i23 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar = new b9.c();
                                            cVar.c = "inapp";
                                            cVar.b = ((TL_stars.TL_starsTopupOption) arrayList5.get(i13)).store_product;
                                            arrayList4.add(cVar.a());
                                            i13++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i15 >= arrayList7.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i16 = 2;
                                            final v7 v7Var5 = v7Var3;
                                            billingController2.queryProductDetails(arrayList6, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i16) {
                                                        case 0:
                                                            final int i152 = 1;
                                                            final v7 v7Var52 = v7Var5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i152) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i162 = 0; i162 < list2.size(); i162++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i162);
                                                                                        int i172 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList62;
                                                                                            if (i172 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i172)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var62 = v7Var52;
                                                                                if (v7Var62.m != null) {
                                                                                    for (int i18 = 0; i18 < v7Var62.m.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.m.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i20 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var52;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList62;
                                                                                            if (i23 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var52;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i162 = 2;
                                                            final v7 v7Var6 = v7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i172 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i172 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var62 = v7Var6;
                                                                                if (v7Var62.m != null) {
                                                                                    for (int i18 = 0; i18 < v7Var62.m.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.m.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i20 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var6;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList72;
                                                                                            if (i23 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var6;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i17 = 0;
                                                            final v7 v7Var7 = v7Var5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i172 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList8;
                                                                                            if (i172 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var62 = v7Var7;
                                                                                if (v7Var62.m != null) {
                                                                                    for (int i18 = 0; i18 < v7Var62.m.size(); i18++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.m.get(i18);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i20 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i23 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar2 = new b9.c();
                                            cVar2.c = "inapp";
                                            cVar2.b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i15)).store_product;
                                            arrayList6.add(cVar2.a());
                                            i15++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i17 >= arrayList9.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i18 = 0;
                                            final v7 v7Var6 = v7Var3;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i18) {
                                                        case 0:
                                                            final int i152 = 1;
                                                            final v7 v7Var52 = v7Var6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i152) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i172 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i172 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var62 = v7Var52;
                                                                                if (v7Var62.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var62.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var62.m.get(i182);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var62.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i20 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var52;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var52;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i162 = 2;
                                                            final v7 v7Var62 = v7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i172 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i172 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i172)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i172);
                                                                                            } else {
                                                                                                i172++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i20 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a2.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar3 = new b9.c();
                                            cVar3.c = "inapp";
                                            cVar3.b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i17)).store_product;
                                            arrayList8.add(cVar3.a());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable);
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                TLObject tLObject4 = this.c;
                boolean z11 = tLObject4 instanceof Vector;
                final v7 v7Var4 = this.b;
                if (z11) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList6.get(i13);
                        i13++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    v7Var4.l = true;
                }
                v7Var4.m = arrayList4;
                v7Var4.k = false;
                NotificationCenter.getInstance(v7Var4.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final int i14 = 1;
                    Runnable runnable2 = new Runnable() { // from class: gh.z6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i132 >= arrayList52.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i142 = 1;
                                            final v7 v7Var42 = v7Var4;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i142) {
                                                        case 0:
                                                            final int i152 = 1;
                                                            final v7 v7Var52 = v7Var42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i152) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var52;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList62;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var52;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var52;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i162 = 2;
                                                            final v7 v7Var62 = v7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar = new b9.c();
                                            cVar.c = "inapp";
                                            cVar.b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(cVar.a());
                                            i132++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i15 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i15 >= arrayList7.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i16 = 2;
                                            final v7 v7Var5 = v7Var4;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i16) {
                                                        case 0:
                                                            final int i152 = 1;
                                                            final v7 v7Var52 = v7Var5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i152) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var52;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var52;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var52;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i162 = 2;
                                                            final v7 v7Var62 = v7Var5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar2 = new b9.c();
                                            cVar2.c = "inapp";
                                            cVar2.b = ((TL_stars.TL_starsGiftOption) arrayList7.get(i15)).store_product;
                                            arrayList62.add(cVar2.a());
                                            i15++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i17 >= arrayList9.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i18 = 0;
                                            final v7 v7Var6 = v7Var4;
                                            billingController3.queryProductDetails(arrayList8, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i18) {
                                                        case 0:
                                                            final int i152 = 1;
                                                            final v7 v7Var52 = v7Var6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i152) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var52;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var52;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var52;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i162 = 2;
                                                            final v7 v7Var62 = v7Var6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a3.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar3 = new b9.c();
                                            cVar3.c = "inapp";
                                            cVar3.b = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i17)).store_product;
                                            arrayList8.add(cVar3.a());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable2);
                        break;
                    } else {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 4:
                ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                TLObject tLObject5 = this.c;
                boolean z12 = tLObject5 instanceof Vector;
                final v7 v7Var5 = this.b;
                if (z12) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj3 = arrayList9.get(i15);
                        i15++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !BuildVars.useInvoiceBilling()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    v7Var5.o = true;
                }
                v7Var5.p = arrayList7;
                v7Var5.n = false;
                NotificationCenter.getInstance(v7Var5.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final int i16 = 2;
                    Runnable runnable3 = new Runnable() { // from class: gh.z6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i132 >= arrayList52.size()) {
                                            BillingController billingController = BillingController.getInstance();
                                            final int i142 = 1;
                                            final v7 v7Var42 = v7Var5;
                                            billingController.queryProductDetails(arrayList42, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i142) {
                                                        case 0:
                                                            final int i152 = 1;
                                                            final v7 v7Var52 = v7Var42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i152) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var52;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var52;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var52;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i162 = 2;
                                                            final v7 v7Var62 = v7Var42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar = new b9.c();
                                            cVar.c = "inapp";
                                            cVar.b = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(cVar.a());
                                            i132++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i152 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i152 >= arrayList72.size()) {
                                            BillingController billingController2 = BillingController.getInstance();
                                            final int i162 = 2;
                                            final v7 v7Var52 = v7Var5;
                                            billingController2.queryProductDetails(arrayList62, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i162) {
                                                        case 0:
                                                            final int i1522 = 1;
                                                            final v7 v7Var522 = v7Var52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i1522) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1622 = 0; i1622 < list2.size(); i1622++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i1622);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i1722 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var522;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var522;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var522;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i1622 = 2;
                                                            final v7 v7Var62 = v7Var52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i1622) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16222 = 0; i16222 < list2.size(); i16222++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i16222);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i1722 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList722;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16222 = 0; i16222 < list2.size(); i16222++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i16222);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList82;
                                                                                            if (i1722 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i23 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar2 = new b9.c();
                                            cVar2.c = "inapp";
                                            cVar2.b = ((TL_stars.TL_starsGiftOption) arrayList72.get(i152)).store_product;
                                            arrayList62.add(cVar2.a());
                                            i152++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList82 = new ArrayList();
                                    int i17 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i17 >= arrayList92.size()) {
                                            BillingController billingController3 = BillingController.getInstance();
                                            final int i18 = 0;
                                            final v7 v7Var6 = v7Var5;
                                            billingController3.queryProductDetails(arrayList82, new BillingController.ProductDetailsResponseListenerLegacy() { // from class: gh.y5
                                                @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
                                                public final void onProductDetailsResponse(final n2.g gVar, final List list) {
                                                    switch (i18) {
                                                        case 0:
                                                            final int i1522 = 1;
                                                            final v7 v7Var522 = v7Var6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i1522) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16222 = 0; i16222 < list2.size(); i16222++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i16222);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList622;
                                                                                            if (i1722 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var522;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var522;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList622;
                                                                                            if (i23 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var522;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i1622 = 2;
                                                            final v7 v7Var62 = v7Var6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i1622) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16222 = 0; i16222 < list2.size(); i16222++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i16222);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i1722 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var62;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i20 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var62;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList722;
                                                                                            if (i23 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var62;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i172 = 0;
                                                            final v7 v7Var7 = v7Var6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: gh.a6
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    n2.i a2;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    n2.i a3;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    n2.i a10;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            n2.g gVar2 = gVar;
                                                                            if (gVar2.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar2.a));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i16222 = 0; i16222 < list2.size(); i16222++) {
                                                                                        n2.l lVar = (n2.l) list2.get(i16222);
                                                                                        int i1722 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList822;
                                                                                            if (i1722 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i1722)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i1722);
                                                                                            } else {
                                                                                                i1722++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a2 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a2.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiftOption2.currency)) * (a2.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var622 = v7Var7;
                                                                                if (v7Var622.m != null) {
                                                                                    for (int i182 = 0; i182 < v7Var622.m.size(); i182++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) v7Var622.m.get(i182);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var622.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            n2.g gVar3 = gVar;
                                                                            if (gVar3.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar3.a));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i19 = 0; i19 < list3.size(); i19++) {
                                                                                        n2.l lVar2 = (n2.l) list3.get(i19);
                                                                                        int i20 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8222 = arrayList822;
                                                                                            if (i20 >= arrayList8222.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i20)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i20);
                                                                                            } else {
                                                                                                i20++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a3 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a3.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsGiveawayOption2.currency)) * (a3.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var72 = v7Var7;
                                                                                if (v7Var72.p != null) {
                                                                                    for (int i21 = 0; i21 < v7Var72.p.size(); i21++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) v7Var72.p.get(i21);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var72.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiveawayOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n2.g gVar4 = gVar;
                                                                            if (gVar4.a != 0) {
                                                                                v7.e("BILLING_" + BillingController.getResponseCodeString(gVar4.a));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i22 = 0; i22 < list4.size(); i22++) {
                                                                                        n2.l lVar3 = (n2.l) list4.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList822;
                                                                                            if (i23 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i23)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a10 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a10.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                v7 v7Var8 = v7Var7;
                                                                                if (v7Var8.j != null) {
                                                                                    for (int i24 = 0; i24 < v7Var8.j.size(); i24++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) v7Var8.j.get(i24);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                NotificationCenter.getInstance(v7Var8.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starOptionsLoaded, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        } else {
                                            b9.c cVar3 = new b9.c();
                                            cVar3.c = "inapp";
                                            cVar3.b = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i17)).store_product;
                                            arrayList82.add(cVar3.a());
                                            i17++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!BillingController.getInstance().isReady()) {
                        BillingController.getInstance().whenSetuped(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                MessagesController.getInstance(this.b.a).processUpdates((TLRPC.Updates) this.c, false);
                break;
        }
    }
}
