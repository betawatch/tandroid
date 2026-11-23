package di;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.k00;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.messenger.ri;
import org.telegram.messenger.si;
import org.telegram.messenger.t10;
import org.telegram.messenger.u00;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a31;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ k(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.c = z10;
        this.b = j3;
        this.n = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0129  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        ArrayList arrayList5;
        switch (this.a) {
            case 0:
                t.e0((t) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.c, this.b, (TLObject) this.n);
                return;
            case 1:
                y8 y8Var = (y8) this.d;
                p10 p10Var = (p10) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.h;
                long j3 = this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.n;
                boolean z10 = this.c;
                if (y8Var.e) {
                    y8Var.h(tL_payments_paymentFormStarGift, starGift, j3, tL_textWithEntities, z10, p10Var);
                    return;
                } else {
                    y8.e("NO_BALANCE");
                    p10Var.a(Boolean.FALSE, null);
                    return;
                }
            case 2:
                boolean z11 = true;
                ri riVar = (ri) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z12 = this.c;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                long j10 = this.b;
                riVar.getMessagesController().f4(arrayList6, z12);
                riVar.getMessagesController().Z3(arrayList7, z12);
                int size = arrayList8.size();
                boolean z13 = false;
                int i7 = 0;
                while (i7 < size) {
                    fj fjVar = (fj) arrayList8.get(i7);
                    SparseArray sparseArray = (SparseArray) hVar.f(fj.B0(fjVar.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(fjVar.e1())) != null) {
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            fj fjVar2 = (fj) arrayList.get(i10);
                            fjVar2.C = fjVar;
                            fjVar2.m();
                            TLRPC.MessageAction messageAction = fjVar2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                fjVar2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                fjVar2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                fjVar2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                fjVar2.p0(null, z11);
                            }
                            i10++;
                            z11 = true;
                        }
                        z13 = true;
                    }
                    i7++;
                    z11 = true;
                }
                if (z13) {
                    riVar.getNotificationCenter().k(55, Long.valueOf(j10), arrayList8, hVar);
                    return;
                }
                return;
            case 3:
                si siVar = (si) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z14 = this.c;
                long j11 = this.b;
                x3 x3Var = (x3) this.h;
                siVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z14) {
                        siVar.a.put(j11, tL_messages_chatInviteImporters);
                    }
                }
                x3Var.run(tLObject, tL_error);
                return;
            default:
                y00 y00Var = (y00) this.d;
                u00 u00Var = (u00) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z15 = this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j12 = this.b;
                HashSet hashSet = (HashSet) this.h;
                synchronized (y00Var) {
                    arrayList2 = u00Var.b;
                    arrayList3 = u00Var.d;
                    arrayList4 = u00Var.c;
                    str = u00Var.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList9 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList9.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        ((t10) arrayList3.get(i11)).a(Boolean.valueOf(z15), (Integer) arrayList2.get(i11), a31.R0((TLRPC.TL_textWithEntities) arrayList4.get(i11), arrayList9.get(i11)), str);
                    }
                } else {
                    if (tL_error2 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                        arrayList5 = arrayList2;
                        if (tL_error2 == null || !"TO_LANG_INVALID".equals(tL_error2.text)) {
                            if (tL_error2 != null && "QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                ks.e().k(ks.S4, 1, gd.N0(2131743700, null));
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                ((t10) arrayList3.get(i12)).a(Boolean.valueOf(z15), (Integer) arrayList5.get(i12), null, u00Var.e);
                            }
                        } else {
                            y00Var.K(j12, false);
                            ks.e().k(ks.S4, 1, gd.N0(2131743699, null));
                        }
                        synchronized (y00Var) {
                            for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                                try {
                                    hashSet.remove(arrayList5.get(i13));
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        return;
                    }
                    int i14 = 0;
                    while (i14 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i14)).intValue();
                        ArrayList arrayList10 = arrayList2;
                        String str2 = str;
                        a31.K0(((TLRPC.TL_textWithEntities) arrayList4.get(i14)).text, null, str2, new k00(y00Var, (t10) arrayList3.get(i14), z15, intValue, str2, j12, 1));
                        i14++;
                        arrayList2 = arrayList10;
                        str = str2;
                        arrayList3 = arrayList3;
                    }
                }
                arrayList5 = arrayList2;
                synchronized (y00Var) {
                }
                break;
        }
    }

    public /* synthetic */ k(y8 y8Var, p10 p10Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.d = y8Var;
        this.e = p10Var;
        this.f = tL_payments_paymentFormStarGift;
        this.h = starGift;
        this.b = j3;
        this.n = tL_textWithEntities;
        this.c = z10;
    }

    public /* synthetic */ k(ri riVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = riVar;
        this.e = arrayList;
        this.c = z10;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = hVar;
        this.b = j3;
    }

    public /* synthetic */ k(si siVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, x3 x3Var) {
        this.d = siVar;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.c = z10;
        this.b = j3;
        this.h = x3Var;
    }

    public /* synthetic */ k(y00 y00Var, u00 u00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = y00Var;
        this.f = u00Var;
        this.n = tLObject;
        this.c = z10;
        this.e = tL_error;
        this.b = j3;
        this.h = hashSet;
    }
}
