// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nua implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jva b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ nua(jva jvaVar, TLObject tLObject, byte b) {
        this.a = b;
        this.b = jvaVar;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        char c = 1;
        TLObject tLObject = this.c;
        final jva jvaVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                int i = jvaVar.a;
                jvaVar.A = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    oc7.r1(i).d4(starsStatus.users, false);
                    oc7.r1(i).X3(starsStatus.chats, false);
                    jvaVar.z.addAll(starsStatus.subscriptions);
                    jvaVar.i0(starsStatus.balance);
                    nm7.f(i).k(nm7.C3, new Object[0]);
                    break;
                }
                break;
            case 1:
                int i2 = jvaVar.a;
                jvaVar.x = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject;
                    oc7.r1(i2).d4(starsStatus2.users, false);
                    oc7.r1(i2).X3(starsStatus2.chats, false);
                    jvaVar.v.addAll(starsStatus2.subscriptions);
                    jvaVar.y = (starsStatus2.flags & 4) == 0;
                    jvaVar.w = starsStatus2.subscriptions_next_offset;
                    jvaVar.i0(starsStatus2.balance);
                    nm7.f(i2).k(nm7.C3, new Object[0]);
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList3 = ((Vector) tLObject).objects;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        if (obj instanceof TL_stars.TL_starsTopupOption) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj;
                            arrayList.add(tL_starsTopupOption);
                            if (tL_starsTopupOption.store_product != null && !e21.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jvaVar.i = true;
                }
                jvaVar.j = arrayList;
                jvaVar.h = false;
                nm7.f(jvaVar.a).k(nm7.x3, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() { // from class: pua
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final ArrayList arrayList4 = arrayList2;
                            final jva jvaVar2 = jvaVar;
                            final byte b4 = 0;
                            switch (b3) {
                                case 0:
                                    ArrayList arrayList5 = new ArrayList();
                                    while (b4 < arrayList4.size()) {
                                        i5 i5Var = new i5();
                                        i5Var.b = "inapp";
                                        i5Var.a = ((TL_stars.TL_starsTopupOption) arrayList4.get(b4)).store_product;
                                        arrayList5.add(i5Var.a());
                                        b4++;
                                    }
                                    final byte b5 = 1;
                                    cj0.h().o(arrayList5, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b6 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList6 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b7 = b6;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7 = arrayList6;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar4 = jvaVar3;
                                                            switch (b7) {
                                                                case 0:
                                                                    int i4 = fj0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i4)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList7.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar4.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar4.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar4.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar4.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList7.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList7.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar4.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar4.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar4.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar4.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList7.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar4.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar4.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar4.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar4.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i4 = fj0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i4)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i4 = fj0Var2.a;
                                                                    if (i4 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i4)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                                case 1:
                                    ArrayList arrayList6 = new ArrayList();
                                    for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                                        i5 i5Var2 = new i5();
                                        i5Var2.b = "inapp";
                                        i5Var2.a = ((TL_stars.TL_starsGiftOption) arrayList4.get(i4)).store_product;
                                        arrayList6.add(i5Var2.a());
                                    }
                                    final byte b6 = 2;
                                    cj0.h().o(arrayList6, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                                default:
                                    ArrayList arrayList7 = new ArrayList();
                                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                                        i5 i5Var3 = new i5();
                                        i5Var3.b = "inapp";
                                        i5Var3.a = ((TL_stars.TL_starsGiveawayOption) arrayList4.get(i5)).store_product;
                                        arrayList7.add(i5Var3.a());
                                    }
                                    cj0.h().o(arrayList7, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList72 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                            }
                        }
                    };
                    if (!cj0.h().j()) {
                        cj0.h().i.add(runnable);
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
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList6.get(i4);
                        i4++;
                        if (obj2 instanceof TL_stars.TL_starsGiftOption) {
                            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) obj2;
                            arrayList4.add(tL_starsGiftOption);
                            if (tL_starsGiftOption.store_product != null && !e21.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jvaVar.l = true;
                }
                jvaVar.m = arrayList4;
                jvaVar.k = false;
                nm7.f(jvaVar.a).k(nm7.y3, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final char c2 = c == true ? 1 : 0;
                    Runnable runnable2 = new Runnable() { // from class: pua
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = c2;
                            final ArrayList arrayList42 = arrayList5;
                            final jva jvaVar2 = jvaVar;
                            final byte b4 = 0;
                            switch (b3) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    while (b4 < arrayList42.size()) {
                                        i5 i5Var = new i5();
                                        i5Var.b = "inapp";
                                        i5Var.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(b4)).store_product;
                                        arrayList52.add(i5Var.a());
                                        b4++;
                                    }
                                    final byte b5 = 1;
                                    cj0.h().o(arrayList52, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList62 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList62;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fj0Var2.a;
                                                                    if (i42 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    for (int i42 = 0; i42 < arrayList42.size(); i42++) {
                                        i5 i5Var2 = new i5();
                                        i5Var2.b = "inapp";
                                        i5Var2.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i42)).store_product;
                                        arrayList62.add(i5Var2.a());
                                    }
                                    final byte b6 = 2;
                                    cj0.h().o(arrayList62, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                                default:
                                    ArrayList arrayList7 = new ArrayList();
                                    for (int i5 = 0; i5 < arrayList42.size(); i5++) {
                                        i5 i5Var3 = new i5();
                                        i5Var3.b = "inapp";
                                        i5Var3.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i5)).store_product;
                                        arrayList7.add(i5Var3.a());
                                    }
                                    cj0.h().o(arrayList7, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                            }
                        }
                    };
                    if (!cj0.h().j()) {
                        cj0.h().i.add(runnable2);
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
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList9 = ((Vector) tLObject).objects;
                    int size3 = arrayList9.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList9.get(i5);
                        i5++;
                        if (obj3 instanceof TL_stars.TL_starsGiveawayOption) {
                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj3;
                            arrayList7.add(tL_starsGiveawayOption);
                            if (tL_starsGiveawayOption.store_product != null && !e21.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    jvaVar.o = true;
                }
                jvaVar.p = arrayList7;
                jvaVar.n = false;
                nm7.f(jvaVar.a).k(nm7.z3, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final byte b3 = 2;
                    Runnable runnable3 = new Runnable() { // from class: pua
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            final ArrayList arrayList42 = arrayList8;
                            final jva jvaVar2 = jvaVar;
                            final byte b4 = 0;
                            switch (b32) {
                                case 0:
                                    ArrayList arrayList52 = new ArrayList();
                                    while (b4 < arrayList42.size()) {
                                        i5 i5Var = new i5();
                                        i5Var.b = "inapp";
                                        i5Var.a = ((TL_stars.TL_starsTopupOption) arrayList42.get(b4)).store_product;
                                        arrayList52.add(i5Var.a());
                                        b4++;
                                    }
                                    final byte b5 = 1;
                                    cj0.h().o(arrayList52, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                                case 1:
                                    ArrayList arrayList62 = new ArrayList();
                                    for (int i42 = 0; i42 < arrayList42.size(); i42++) {
                                        i5 i5Var2 = new i5();
                                        i5Var2.b = "inapp";
                                        i5Var2.a = ((TL_stars.TL_starsGiftOption) arrayList42.get(i42)).store_product;
                                        arrayList62.add(i5Var2.a());
                                    }
                                    final byte b6 = 2;
                                    cj0.h().o(arrayList62, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                                default:
                                    ArrayList arrayList72 = new ArrayList();
                                    for (int i52 = 0; i52 < arrayList42.size(); i52++) {
                                        i5 i5Var3 = new i5();
                                        i5Var3.b = "inapp";
                                        i5Var3.a = ((TL_stars.TL_starsGiveawayOption) arrayList42.get(i52)).store_product;
                                        arrayList72.add(i5Var3.a());
                                    }
                                    cj0.h().o(arrayList72, new bj0() { // from class: qta
                                        @Override // bj0
                                        public final void b(final fj0 fj0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final jva jvaVar3 = jvaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i522 = 0; i522 < list2.size(); i522++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i522);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final jva jvaVar4 = jvaVar2;
                                                    final ArrayList arrayList722 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList722;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i522 = 0; i522 < list2.size(); i522++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i522);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList7222.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList7222.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList7222.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final jva jvaVar5 = jvaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gm.c3(new Runnable() { // from class: tta
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            in8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            in8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            in8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList82;
                                                            List list2 = list;
                                                            fj0 fj0Var2 = fj0Var;
                                                            jva jvaVar42 = jvaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fj0Var2.a;
                                                                    if (i422 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i522 = 0; i522 < list2.size(); i522++) {
                                                                                ln8 ln8Var = (ln8) list2.get(i522);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList7222.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i6)).store_product.equals(ln8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = ln8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < jvaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) jvaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fj0Var2.a;
                                                                    if (i8 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                ln8 ln8Var2 = (ln8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList7222.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10)).store_product.equals(ln8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = ln8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (jvaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < jvaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) jvaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.z3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fj0Var2.a;
                                                                    if (i12 != 0) {
                                                                        jva.c("BILLING_".concat(cj0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                ln8 ln8Var3 = (ln8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList7222.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i14)).store_product.equals(ln8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = ln8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (jvaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < jvaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) jvaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        nm7.f(jvaVar42.a).k(nm7.x3, new Object[0]);
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
                            }
                        }
                    };
                    if (!cj0.h().j()) {
                        cj0.h().i.add(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                oc7.r1(jvaVar.a).T3((TLRPC.Updates) tLObject, false);
                break;
        }
    }
}
