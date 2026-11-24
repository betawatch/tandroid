// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lsa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gta b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ lsa(gta gtaVar, TLObject tLObject, byte b) {
        this.a = b;
        this.b = gtaVar;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        char c = 1;
        TLObject tLObject = this.c;
        final gta gtaVar = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                int i = gtaVar.a;
                gtaVar.A = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    na7.q1(i).b4(starsStatus.users, false);
                    na7.q1(i).V3(starsStatus.chats, false);
                    gtaVar.z.addAll(starsStatus.subscriptions);
                    gtaVar.i0(starsStatus.balance);
                    kk7.f(i).k(kk7.B3, new Object[0]);
                    break;
                }
                break;
            case 1:
                int i2 = gtaVar.a;
                gtaVar.x = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject;
                    na7.q1(i2).b4(starsStatus2.users, false);
                    na7.q1(i2).V3(starsStatus2.chats, false);
                    gtaVar.v.addAll(starsStatus2.subscriptions);
                    gtaVar.y = (starsStatus2.flags & 4) == 0;
                    gtaVar.w = starsStatus2.subscriptions_next_offset;
                    gtaVar.i0(starsStatus2.balance);
                    kk7.f(i2).k(kk7.B3, new Object[0]);
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
                            if (tL_starsTopupOption.store_product != null && !w01.b()) {
                                arrayList2.add(tL_starsTopupOption);
                                tL_starsTopupOption.loadingStorePrice = true;
                            }
                        }
                    }
                    gtaVar.i = true;
                }
                gtaVar.j = arrayList;
                gtaVar.h = false;
                kk7.f(gtaVar.a).k(kk7.w3, new Object[0]);
                if (!arrayList2.isEmpty()) {
                    Runnable runnable = new Runnable() { // from class: nsa
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = b2;
                            final ArrayList arrayList4 = arrayList2;
                            final gta gtaVar2 = gtaVar;
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
                                    ci0.h().o(arrayList5, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b6 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList6 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b7 = b6;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7 = arrayList6;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar4 = gtaVar3;
                                                            switch (b7) {
                                                                case 0:
                                                                    int i4 = fi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i4)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList7.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList7.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar4.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar4.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar4.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar4.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList7.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList7.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar4.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar4.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar4.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar4.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList7.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar4.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar4.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar4.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar4.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i4 = fi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i4)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i4 = fi0Var2.a;
                                                                    if (i4 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i4)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                                    ci0.h().o(arrayList6, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList7 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList7;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i5 = 0; i5 < list2.size(); i5++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i5);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                                    ci0.h().o(arrayList7, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList62 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList72 = arrayList62;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList72.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList72.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList72.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList72.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList72.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList72.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList72.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList72.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList72.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList4;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption.currency = a.c;
                                                                                    tL_starsGiftOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption2 != null && tL_starsGiftOption2.loadingStorePrice) {
                                                                                    tL_starsGiftOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                    if (!ci0.h().j()) {
                        ci0.h().i.add(runnable);
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
                            if (tL_starsGiftOption.store_product != null && !w01.b()) {
                                arrayList5.add(tL_starsGiftOption);
                                tL_starsGiftOption.loadingStorePrice = true;
                            }
                        }
                    }
                    gtaVar.l = true;
                }
                gtaVar.m = arrayList4;
                gtaVar.k = false;
                kk7.f(gtaVar.a).k(kk7.x3, new Object[0]);
                if (!arrayList5.isEmpty()) {
                    final char c2 = c == true ? 1 : 0;
                    Runnable runnable2 = new Runnable() { // from class: nsa
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = c2;
                            final ArrayList arrayList42 = arrayList5;
                            final gta gtaVar2 = gtaVar;
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
                                    ci0.h().o(arrayList52, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList62 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList62;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i42 = fi0Var2.a;
                                                                    if (i42 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i42)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                                    ci0.h().o(arrayList62, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                                    ci0.h().o(arrayList7, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList8 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList8;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption.currency = a2.c;
                                                                                    tL_starsGiveawayOption.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption2 != null && tL_starsGiveawayOption2.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption2.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                    if (!ci0.h().j()) {
                        ci0.h().i.add(runnable2);
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
                            if (tL_starsGiveawayOption.store_product != null && !w01.b()) {
                                arrayList8.add(tL_starsGiveawayOption);
                                tL_starsGiveawayOption.loadingStorePrice = true;
                            }
                        }
                    }
                    gtaVar.o = true;
                }
                gtaVar.p = arrayList7;
                gtaVar.n = false;
                kk7.f(gtaVar.a).k(kk7.y3, new Object[0]);
                if (!arrayList8.isEmpty()) {
                    final byte b3 = 2;
                    Runnable runnable3 = new Runnable() { // from class: nsa
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b32 = b3;
                            final ArrayList arrayList42 = arrayList8;
                            final gta gtaVar2 = gtaVar;
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
                                    ci0.h().o(arrayList52, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b5) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                                    ci0.h().o(arrayList62, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b6) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList72 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList72;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList82;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i52 = 0; i52 < list2.size(); i52++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i52);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                                    ci0.h().o(arrayList72, new bi0() { // from class: pra
                                        @Override // bi0
                                        public final void b(final fi0 fi0Var, final List list) {
                                            switch (b4) {
                                                case 0:
                                                    final byte b62 = 1;
                                                    final gta gtaVar3 = gtaVar2;
                                                    final ArrayList arrayList622 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b62;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList722 = arrayList622;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar3;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i522 = 0; i522 < list2.size(); i522++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i522);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList722.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList722.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList722.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList722.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList722.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList722.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList722.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList722.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList722.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                case 1:
                                                    final byte b7 = 2;
                                                    final gta gtaVar4 = gtaVar2;
                                                    final ArrayList arrayList722 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b7;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList722;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar4;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i522 = 0; i522 < list2.size(); i522++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i522);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList7222.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList7222.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList7222.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final byte b8 = 0;
                                                    final gta gtaVar5 = gtaVar2;
                                                    final ArrayList arrayList82 = arrayList42;
                                                    gl.c3(new Runnable() { // from class: sra
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TL_stars.TL_starsGiftOption tL_starsGiftOption2;
                                                            gl8 a;
                                                            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption2;
                                                            gl8 a2;
                                                            TL_stars.TL_starsTopupOption tL_starsTopupOption2;
                                                            double d;
                                                            gl8 a3;
                                                            byte b72 = b8;
                                                            double d2 = 1000000.0d;
                                                            ArrayList arrayList7222 = arrayList82;
                                                            List list2 = list;
                                                            fi0 fi0Var2 = fi0Var;
                                                            gta gtaVar42 = gtaVar5;
                                                            switch (b72) {
                                                                case 0:
                                                                    int i422 = fi0Var2.a;
                                                                    if (i422 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i422)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i522 = 0; i522 < list2.size(); i522++) {
                                                                                kl8 kl8Var = (kl8) list2.get(i522);
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    if (i6 >= arrayList7222.size()) {
                                                                                        tL_starsGiftOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiftOption) arrayList7222.get(i6)).store_product.equals(kl8Var.c)) {
                                                                                        tL_starsGiftOption2 = (TL_stars.TL_starsGiftOption) arrayList7222.get(i6);
                                                                                    } else {
                                                                                        i6++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiftOption2 != null && (a = kl8Var.a()) != null) {
                                                                                    tL_starsGiftOption2.currency = a.c;
                                                                                    tL_starsGiftOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiftOption2.currency)) * (a.b / 1000000.0d));
                                                                                    tL_starsGiftOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.m != null) {
                                                                            for (int i7 = 0; i7 < gtaVar42.m.size(); i7++) {
                                                                                TL_stars.TL_starsGiftOption tL_starsGiftOption22 = (TL_stars.TL_starsGiftOption) gtaVar42.m.get(i7);
                                                                                if (tL_starsGiftOption22 != null && tL_starsGiftOption22.loadingStorePrice) {
                                                                                    tL_starsGiftOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.x3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    int i8 = fi0Var2.a;
                                                                    if (i8 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i8)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                                                                kl8 kl8Var2 = (kl8) list2.get(i9);
                                                                                int i10 = 0;
                                                                                while (true) {
                                                                                    if (i10 >= arrayList7222.size()) {
                                                                                        tL_starsGiveawayOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10)).store_product.equals(kl8Var2.c)) {
                                                                                        tL_starsGiveawayOption2 = (TL_stars.TL_starsGiveawayOption) arrayList7222.get(i10);
                                                                                    } else {
                                                                                        i10++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsGiveawayOption2 != null && (a2 = kl8Var2.a()) != null) {
                                                                                    tL_starsGiveawayOption2.currency = a2.c;
                                                                                    tL_starsGiveawayOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsGiveawayOption2.currency)) * (a2.b / 1000000.0d));
                                                                                    tL_starsGiveawayOption2.loadingStorePrice = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (gtaVar42.p != null) {
                                                                            for (int i11 = 0; i11 < gtaVar42.p.size(); i11++) {
                                                                                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption22 = (TL_stars.TL_starsGiveawayOption) gtaVar42.p.get(i11);
                                                                                if (tL_starsGiveawayOption22 != null && tL_starsGiveawayOption22.loadingStorePrice) {
                                                                                    tL_starsGiveawayOption22.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.y3, new Object[0]);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    int i12 = fi0Var2.a;
                                                                    if (i12 != 0) {
                                                                        gta.c("BILLING_".concat(ci0.i(i12)));
                                                                        break;
                                                                    } else {
                                                                        if (list2 != null) {
                                                                            int i13 = 0;
                                                                            while (i13 < list2.size()) {
                                                                                kl8 kl8Var3 = (kl8) list2.get(i13);
                                                                                int i14 = 0;
                                                                                while (true) {
                                                                                    if (i14 >= arrayList7222.size()) {
                                                                                        tL_starsTopupOption2 = null;
                                                                                    } else if (((TL_stars.TL_starsTopupOption) arrayList7222.get(i14)).store_product.equals(kl8Var3.c)) {
                                                                                        tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList7222.get(i14);
                                                                                    } else {
                                                                                        i14++;
                                                                                    }
                                                                                }
                                                                                if (tL_starsTopupOption2 == null || (a3 = kl8Var3.a()) == null) {
                                                                                    d = d2;
                                                                                } else {
                                                                                    tL_starsTopupOption2.currency = a3.c;
                                                                                    d = d2;
                                                                                    tL_starsTopupOption2.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_starsTopupOption2.currency)) * (a3.b / d2));
                                                                                    tL_starsTopupOption2.loadingStorePrice = false;
                                                                                }
                                                                                i13++;
                                                                                d2 = d;
                                                                            }
                                                                        }
                                                                        if (gtaVar42.j != null) {
                                                                            for (int i15 = 0; i15 < gtaVar42.j.size(); i15++) {
                                                                                TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) gtaVar42.j.get(i15);
                                                                                if (tL_starsTopupOption3 != null && tL_starsTopupOption3.loadingStorePrice) {
                                                                                    tL_starsTopupOption3.missingStorePrice = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        kk7.f(gtaVar42.a).k(kk7.w3, new Object[0]);
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
                    if (!ci0.h().j()) {
                        ci0.h().i.add(runnable3);
                        break;
                    } else {
                        runnable3.run();
                        break;
                    }
                }
                break;
            default:
                na7.q1(gtaVar.a).R3((TLRPC.Updates) tLObject, false);
                break;
        }
    }
}
