package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ a9(ea eaVar, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = eaVar;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ea eaVar = this.b;
                int i7 = eaVar.a;
                eaVar.A = false;
                TLObject tLObject = this.c;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    qp.s1(i7).Y3(starsStatus.users, false);
                    qp.s1(i7).S3(starsStatus.chats, false);
                    eaVar.z.addAll(starsStatus.subscriptions);
                    eaVar.i0(starsStatus.balance);
                    qs.f(i7).k(qs.A3, new Object[0]);
                    break;
                }
                break;
            case 1:
                ea eaVar2 = this.b;
                int i10 = eaVar2.a;
                eaVar2.x = false;
                TLObject tLObject2 = this.c;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject2;
                    qp.s1(i10).Y3(starsStatus2.users, false);
                    qp.s1(i10).S3(starsStatus2.chats, false);
                    eaVar2.v.addAll(starsStatus2.subscriptions);
                    eaVar2.y = (starsStatus2.flags & 4) == 0;
                    eaVar2.w = starsStatus2.subscriptions_next_offset;
                    eaVar2.i0(starsStatus2.balance);
                    qs.f(i10).k(qs.A3, new Object[0]);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                TLObject tLObject3 = this.c;
                boolean z9 = tLObject3 instanceof Vector;
                final ea eaVar3 = this.b;
                if (z9) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject3).objects;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !org.telegram.messenger.r2.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    eaVar3.i = true;
                }
                eaVar3.j = arrayList;
                eaVar3.h = false;
                qs.f(eaVar3.a).k(qs.v3, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    final int i12 = 0;
                    Runnable runnable = new Runnable() { // from class: bi.g9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ArrayList arrayList4 = new ArrayList();
                                    int i13 = 0;
                                    while (true) {
                                        final ArrayList arrayList5 = arrayList2;
                                        if (i13 >= arrayList5.size()) {
                                            org.telegram.messenger.r1 i14 = org.telegram.messenger.r1.i();
                                            final int i15 = 1;
                                            final ea eaVar4 = eaVar3;
                                            i14.o(arrayList4, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i15) {
                                                        case 0:
                                                            final int i16 = 1;
                                                            final ea eaVar5 = eaVar4;
                                                            final ArrayList arrayList6 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i16) {
                                                                        case 0:
                                                                            int i17 = fVar.a;
                                                                            if (i17 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i17)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i18 = 0; i18 < list2.size(); i18++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7 = arrayList6;
                                                                                            if (i19 >= arrayList7.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i19)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar6 = eaVar5;
                                                                                if (eaVar6.m != null) {
                                                                                    for (int i20 = 0; i20 < eaVar6.m.size(); i20++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar6.m.get(i20);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar6.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i21 = fVar.a;
                                                                            if (i21 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i21)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList6;
                                                                                            if (i23 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar7 = eaVar5;
                                                                                if (eaVar7.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar7.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar7.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar7.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList6;
                                                                                            if (i27 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar5;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i17 = 2;
                                                            final ea eaVar6 = eaVar4;
                                                            final ArrayList arrayList7 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i17) {
                                                                        case 0:
                                                                            int i172 = fVar.a;
                                                                            if (i172 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i172)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i18 = 0; i18 < list2.size(); i18++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i18);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList7;
                                                                                            if (i19 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i19)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar62 = eaVar6;
                                                                                if (eaVar62.m != null) {
                                                                                    for (int i20 = 0; i20 < eaVar62.m.size(); i20++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.m.get(i20);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar62.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i21 = fVar.a;
                                                                            if (i21 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i21)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8 = arrayList7;
                                                                                            if (i23 >= arrayList8.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList8.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar7 = eaVar6;
                                                                                if (eaVar7.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar7.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar7.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar7.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList7;
                                                                                            if (i27 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar6;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i18 = 0;
                                                            final ea eaVar7 = eaVar4;
                                                            final ArrayList arrayList8 = arrayList5;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i18) {
                                                                        case 0:
                                                                            int i172 = fVar.a;
                                                                            if (i172 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i172)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i182 = 0; i182 < list2.size(); i182++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i182);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList8;
                                                                                            if (i19 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i19)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar62 = eaVar7;
                                                                                if (eaVar62.m != null) {
                                                                                    for (int i20 = 0; i20 < eaVar62.m.size(); i20++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.m.get(i20);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar62.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i21 = fVar.a;
                                                                            if (i21 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i21)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i23 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i27 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar = new f5.a();
                                            aVar.b = "inapp";
                                            aVar.a = ((TL_stars.TL_starsTopupOption) arrayList5.get(i13)).store_product;
                                            arrayList4.add(aVar.a());
                                            i13++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList2;
                                        if (i16 >= arrayList7.size()) {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final int i18 = 2;
                                            final ea eaVar5 = eaVar3;
                                            i17.o(arrayList6, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i18) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final ea eaVar52 = eaVar5;
                                                            final ArrayList arrayList62 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            int i172 = fVar.a;
                                                                            if (i172 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i172)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i182 = 0; i182 < list2.size(); i182++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i182);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList72 = arrayList62;
                                                                                            if (i19 >= arrayList72.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i19)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar62 = eaVar52;
                                                                                if (eaVar62.m != null) {
                                                                                    for (int i20 = 0; i20 < eaVar62.m.size(); i20++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.m.get(i20);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar62.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i21 = fVar.a;
                                                                            if (i21 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i21)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i23 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar52;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList62;
                                                                                            if (i27 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar52;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar6 = eaVar5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i182 = 0; i182 < list2.size(); i182++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i182);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i19 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i19)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar62 = eaVar6;
                                                                                if (eaVar62.m != null) {
                                                                                    for (int i20 = 0; i20 < eaVar62.m.size(); i20++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.m.get(i20);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar62.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i21 = fVar.a;
                                                                            if (i21 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i21)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i23 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar6;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList72;
                                                                                            if (i27 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar6;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar5;
                                                            final ArrayList arrayList8 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i19 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList8;
                                                                                            if (i19 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i19)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i19);
                                                                                            } else {
                                                                                                i19++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar62 = eaVar7;
                                                                                if (eaVar62.m != null) {
                                                                                    for (int i20 = 0; i20 < eaVar62.m.size(); i20++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.m.get(i20);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar62.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i21 = fVar.a;
                                                                            if (i21 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i21)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList8;
                                                                                            if (i23 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList9 = arrayList8;
                                                                                            if (i27 >= arrayList9.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList9.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList9.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar2 = new f5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = ((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product;
                                            arrayList6.add(aVar2.a());
                                            i16++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i19 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList2;
                                        if (i19 >= arrayList9.size()) {
                                            org.telegram.messenger.r1 i20 = org.telegram.messenger.r1.i();
                                            final int i21 = 0;
                                            final ea eaVar6 = eaVar3;
                                            i20.o(arrayList8, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i21) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final ea eaVar52 = eaVar6;
                                                            final ArrayList arrayList62 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar62 = eaVar52;
                                                                                if (eaVar62.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar62.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar62.m.get(i202);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar62.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList62;
                                                                                            if (i23 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar52;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar52;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList82 = arrayList72;
                                                                                            if (i23 >= arrayList82.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList82.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList82.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption.currency = a10.c;
                                                                                            tL_starsGiftOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                            tL_starsGiftOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar3 = new f5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i19)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i19++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.r1.i().k()) {
                        org.telegram.messenger.r1.i().i.add(runnable);
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
                boolean z10 = tLObject4 instanceof Vector;
                final ea eaVar4 = this.b;
                if (z10) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject4).objects;
                    int size2 = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList6.get(i13);
                        i13++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !org.telegram.messenger.r2.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    eaVar4.l = true;
                }
                eaVar4.m = arrayList4;
                eaVar4.k = false;
                qs.f(eaVar4.a).k(qs.w3, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final int i14 = 1;
                    Runnable runnable2 = new Runnable() { // from class: bi.g9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList5;
                                        if (i132 >= arrayList52.size()) {
                                            org.telegram.messenger.r1 i142 = org.telegram.messenger.r1.i();
                                            final int i15 = 1;
                                            final ea eaVar42 = eaVar4;
                                            i142.o(arrayList42, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i15) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final ea eaVar52 = eaVar42;
                                                            final ArrayList arrayList62 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList62;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar52;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList62;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar52;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList62;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar52;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar = new f5.a();
                                            aVar.b = "inapp";
                                            aVar.a = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(aVar.a());
                                            i132++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i16 = 0;
                                    while (true) {
                                        final ArrayList arrayList7 = arrayList5;
                                        if (i16 >= arrayList7.size()) {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final int i18 = 2;
                                            final ea eaVar5 = eaVar4;
                                            i17.o(arrayList62, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i18) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final ea eaVar52 = eaVar5;
                                                            final ArrayList arrayList622 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar52;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar52;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar52;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar5;
                                                            final ArrayList arrayList72 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar5;
                                                            final ArrayList arrayList82 = arrayList7;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar2 = new f5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = ((TL_stars.TL_starsGiftOption) arrayList7.get(i16)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i16++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList8 = new ArrayList();
                                    int i19 = 0;
                                    while (true) {
                                        final ArrayList arrayList9 = arrayList5;
                                        if (i19 >= arrayList9.size()) {
                                            org.telegram.messenger.r1 i20 = org.telegram.messenger.r1.i();
                                            final int i21 = 0;
                                            final ea eaVar6 = eaVar4;
                                            i20.o(arrayList8, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i21) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final ea eaVar52 = eaVar6;
                                                            final ArrayList arrayList622 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar52;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar52;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar52;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar6;
                                                            final ArrayList arrayList72 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar6;
                                                            final ArrayList arrayList82 = arrayList9;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption.currency = a11.c;
                                                                                            tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar3 = new f5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = ((TL_stars.TL_starsGiveawayOption) arrayList9.get(i19)).store_product;
                                            arrayList8.add(aVar3.a());
                                            i19++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.r1.i().k()) {
                        org.telegram.messenger.r1.i().i.add(runnable2);
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
                boolean z11 = tLObject5 instanceof Vector;
                final ea eaVar5 = this.b;
                if (z11) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject5).objects;
                    int size3 = arrayList9.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj3 = arrayList9.get(i15);
                        i15++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !org.telegram.messenger.r2.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    eaVar5.o = true;
                }
                eaVar5.p = arrayList7;
                eaVar5.n = false;
                qs.f(eaVar5.a).k(qs.x3, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final int i16 = 2;
                    Runnable runnable3 = new Runnable() { // from class: bi.g9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i16) {
                                case 0:
                                    ArrayList arrayList42 = new ArrayList();
                                    int i132 = 0;
                                    while (true) {
                                        final ArrayList arrayList52 = arrayList8;
                                        if (i132 >= arrayList52.size()) {
                                            org.telegram.messenger.r1 i142 = org.telegram.messenger.r1.i();
                                            final int i152 = 1;
                                            final ea eaVar42 = eaVar5;
                                            i142.o(arrayList42, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i152) {
                                                        case 0:
                                                            final int i162 = 1;
                                                            final ea eaVar52 = eaVar42;
                                                            final ArrayList arrayList622 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i162) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar52;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar52;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar52;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar42;
                                                            final ArrayList arrayList72 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList72;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList72;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList72;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar42;
                                                            final ArrayList arrayList82 = arrayList52;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList82;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar = new f5.a();
                                            aVar.b = "inapp";
                                            aVar.a = ((TL_stars.TL_starsTopupOption) arrayList52.get(i132)).store_product;
                                            arrayList42.add(aVar.a());
                                            i132++;
                                        }
                                    }
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    int i162 = 0;
                                    while (true) {
                                        final ArrayList arrayList72 = arrayList8;
                                        if (i162 >= arrayList72.size()) {
                                            org.telegram.messenger.r1 i17 = org.telegram.messenger.r1.i();
                                            final int i18 = 2;
                                            final ea eaVar52 = eaVar5;
                                            i17.o(arrayList62, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i18) {
                                                        case 0:
                                                            final int i1622 = 1;
                                                            final ea eaVar522 = eaVar52;
                                                            final ArrayList arrayList622 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i1622) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList722 = arrayList622;
                                                                                            if (i192 >= arrayList722.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar522;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar522;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList622;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar522;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar52;
                                                            final ArrayList arrayList722 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i192 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList722;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar52;
                                                            final ArrayList arrayList82 = arrayList72;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList82;
                                                                                            if (i192 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList82;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList92 = arrayList82;
                                                                                            if (i27 >= arrayList92.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList92.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList92.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar2 = new f5.a();
                                            aVar2.b = "inapp";
                                            aVar2.a = ((TL_stars.TL_starsGiftOption) arrayList72.get(i162)).store_product;
                                            arrayList62.add(aVar2.a());
                                            i162++;
                                        }
                                    }
                                default:
                                    ArrayList arrayList82 = new ArrayList();
                                    int i19 = 0;
                                    while (true) {
                                        final ArrayList arrayList92 = arrayList8;
                                        if (i19 >= arrayList92.size()) {
                                            org.telegram.messenger.r1 i20 = org.telegram.messenger.r1.i();
                                            final int i21 = 0;
                                            final ea eaVar6 = eaVar5;
                                            i20.o(arrayList82, new org.telegram.messenger.q1() { // from class: bi.a8
                                                @Override // org.telegram.messenger.q1
                                                public final void a(final f5.f fVar, final List list) {
                                                    switch (i21) {
                                                        case 0:
                                                            final int i1622 = 1;
                                                            final ea eaVar522 = eaVar6;
                                                            final ArrayList arrayList622 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i1622) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList622;
                                                                                            if (i192 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar522;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList622;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar522;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList622;
                                                                                            if (i27 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar522;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        case 1:
                                                            final int i172 = 2;
                                                            final ea eaVar62 = eaVar6;
                                                            final ArrayList arrayList722 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i172) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList722;
                                                                                            if (i192 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar62;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList822 = arrayList722;
                                                                                            if (i23 >= arrayList822.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList822.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList822.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar62;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList722;
                                                                                            if (i27 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar62;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i182 = 0;
                                                            final ea eaVar7 = eaVar6;
                                                            final ArrayList arrayList822 = arrayList92;
                                                            org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e8
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                                    f5.h a10;
                                                                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                                    f5.h a11;
                                                                    TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                                    f5.h a12;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            int i1722 = fVar.a;
                                                                            if (i1722 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i1722)));
                                                                                break;
                                                                            } else {
                                                                                List list2 = list;
                                                                                if (list2 != null) {
                                                                                    for (int i1822 = 0; i1822 < list2.size(); i1822++) {
                                                                                        f5.l lVar = (f5.l) list2.get(i1822);
                                                                                        int i192 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList7222 = arrayList822;
                                                                                            if (i192 >= arrayList7222.size()) {
                                                                                                tL_starsGiftOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i192)).store_product.equals(lVar.c)) {
                                                                                                tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i192);
                                                                                            } else {
                                                                                                i192++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiftOption2 != null && (a10 = lVar.a()) != null) {
                                                                                            tL_starsGiftOption2.currency = a10.c;
                                                                                            tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiftOption2.currency)) * (a10.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiftOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar622 = eaVar7;
                                                                                if (eaVar622.m != null) {
                                                                                    for (int i202 = 0; i202 < eaVar622.m.size(); i202++) {
                                                                                        TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) eaVar622.m.get(i202);
                                                                                        if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                            tL_starsGiftOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar622.a).k(qs.w3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            int i212 = fVar.a;
                                                                            if (i212 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i212)));
                                                                                break;
                                                                            } else {
                                                                                List list3 = list;
                                                                                if (list3 != null) {
                                                                                    for (int i22 = 0; i22 < list3.size(); i22++) {
                                                                                        f5.l lVar2 = (f5.l) list3.get(i22);
                                                                                        int i23 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList8222 = arrayList822;
                                                                                            if (i23 >= arrayList8222.size()) {
                                                                                                tL_starsGiveawayOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsGiveawayOption) arrayList8222.get(i23)).store_product.equals(lVar2.c)) {
                                                                                                tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList8222.get(i23);
                                                                                            } else {
                                                                                                i23++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsGiveawayOption2 != null && (a11 = lVar2.a()) != null) {
                                                                                            tL_starsGiveawayOption2.currency = a11.c;
                                                                                            tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsGiveawayOption2.currency)) * (a11.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar72 = eaVar7;
                                                                                if (eaVar72.p != null) {
                                                                                    for (int i24 = 0; i24 < eaVar72.p.size(); i24++) {
                                                                                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) eaVar72.p.get(i24);
                                                                                        if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                            tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar72.a).k(qs.x3, new Object[0]);
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            int i25 = fVar.a;
                                                                            if (i25 != 0) {
                                                                                ea.e("BILLING_".concat(org.telegram.messenger.r1.j(i25)));
                                                                                break;
                                                                            } else {
                                                                                List list4 = list;
                                                                                if (list4 != null) {
                                                                                    for (int i26 = 0; i26 < list4.size(); i26++) {
                                                                                        f5.l lVar3 = (f5.l) list4.get(i26);
                                                                                        int i27 = 0;
                                                                                        while (true) {
                                                                                            ArrayList arrayList922 = arrayList822;
                                                                                            if (i27 >= arrayList922.size()) {
                                                                                                tL_starsTopupOption2 = null;
                                                                                            } else if (((TL_stars.TL_starsTopupOption) arrayList922.get(i27)).store_product.equals(lVar3.c)) {
                                                                                                tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList922.get(i27);
                                                                                            } else {
                                                                                                i27++;
                                                                                            }
                                                                                        }
                                                                                        if (tL_starsTopupOption2 != null && (a12 = lVar3.a()) != null) {
                                                                                            tL_starsTopupOption2.currency = a12.c;
                                                                                            tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_starsTopupOption2.currency)) * (a12.b / Math.pow(10.0d, 6.0d)));
                                                                                            tL_starsTopupOption2.loadingStorePrice = false;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                ea eaVar8 = eaVar7;
                                                                                if (eaVar8.j != null) {
                                                                                    for (int i28 = 0; i28 < eaVar8.j.size(); i28++) {
                                                                                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) eaVar8.j.get(i28);
                                                                                        if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                            tL_starsTopupOption3.missingStorePrice = true;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qs.f(eaVar8.a).k(qs.v3, new Object[0]);
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
                                            f5.a aVar3 = new f5.a();
                                            aVar3.b = "inapp";
                                            aVar3.a = ((TL_stars.TL_starsGiveawayOption) arrayList92.get(i19)).store_product;
                                            arrayList82.add(aVar3.a());
                                            i19++;
                                        }
                                    }
                            }
                        }
                    };
                    if (!org.telegram.messenger.r1.i().k()) {
                        org.telegram.messenger.r1.i().i.add(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                qp.s1(this.b.a).O3((TLRPC.Updates) this.c, false);
                break;
        }
    }
}
