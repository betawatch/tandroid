package di;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c10;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.o00;
import org.telegram.messenger.si;
import org.telegram.messenger.ti;
import org.telegram.messenger.w10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ j(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        this.d = tVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z10;
        this.c = j3;
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
                t.d0((t) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
            case 1:
                boolean z10 = true;
                si siVar = (si) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z11 = this.b;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                long j3 = this.c;
                siVar.getMessagesController().Y3(arrayList6, z11);
                siVar.getMessagesController().S3(arrayList7, z11);
                int size = arrayList8.size();
                boolean z12 = false;
                int i7 = 0;
                while (i7 < size) {
                    gj gjVar = (gj) arrayList8.get(i7);
                    SparseArray sparseArray = (SparseArray) hVar.f(gj.B0(gjVar.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(gjVar.e1())) != null) {
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            gj gjVar2 = (gj) arrayList.get(i10);
                            gjVar2.C = gjVar;
                            gjVar2.m();
                            TLRPC.MessageAction messageAction = gjVar2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                gjVar2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                gjVar2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                gjVar2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                gjVar2.p0(null, z10);
                            }
                            i10++;
                            z10 = true;
                        }
                        z12 = true;
                    }
                    i7++;
                    z10 = true;
                }
                if (z12) {
                    siVar.getNotificationCenter().k(55, Long.valueOf(j3), arrayList8, hVar);
                    return;
                }
                return;
            case 2:
                ti tiVar = (ti) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z13 = this.b;
                long j10 = this.c;
                u3 u3Var = (u3) this.h;
                tiVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z13) {
                        tiVar.a.put(j10, tL_messages_chatInviteImporters);
                    }
                }
                u3Var.run(tLObject, tL_error);
                return;
            default:
                c10 c10Var = (c10) this.d;
                y00 y00Var = (y00) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z14 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j11 = this.c;
                HashSet hashSet = (HashSet) this.h;
                synchronized (c10Var) {
                    arrayList2 = y00Var.b;
                    arrayList3 = y00Var.d;
                    arrayList4 = y00Var.c;
                    str = y00Var.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList9 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList9.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        ((w10) arrayList3.get(i11)).a(Boolean.valueOf(z14), (Integer) arrayList2.get(i11), p21.Q0((TLRPC.TL_textWithEntities) arrayList4.get(i11), arrayList9.get(i11)), str);
                    }
                } else {
                    if (tL_error2 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                        arrayList5 = arrayList2;
                        if (tL_error2 == null || !"TO_LANG_INVALID".equals(tL_error2.text)) {
                            if (tL_error2 != null && "QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                ns.e().k(ns.P4, 1, hd.M0(2131743947, null));
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                ((w10) arrayList3.get(i12)).a(Boolean.valueOf(z14), (Integer) arrayList5.get(i12), null, y00Var.e);
                            }
                        } else {
                            c10Var.K(j11, false);
                            ns.e().k(ns.P4, 1, hd.M0(2131743946, null));
                        }
                        synchronized (c10Var) {
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
                        p21.J0(((TLRPC.TL_textWithEntities) arrayList4.get(i14)).text, null, str2, new o00(c10Var, (w10) arrayList3.get(i14), z14, intValue, str2, j11, 1));
                        i14++;
                        arrayList2 = arrayList10;
                        str = str2;
                        arrayList3 = arrayList3;
                    }
                }
                arrayList5 = arrayList2;
                synchronized (c10Var) {
                }
                break;
        }
    }

    public /* synthetic */ j(si siVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = siVar;
        this.e = arrayList;
        this.b = z10;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = hVar;
        this.c = j3;
    }

    public /* synthetic */ j(ti tiVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j3, u3 u3Var) {
        this.d = tiVar;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.b = z10;
        this.c = j3;
        this.h = u3Var;
    }

    public /* synthetic */ j(c10 c10Var, y00 y00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = c10Var;
        this.f = y00Var;
        this.n = tLObject;
        this.b = z10;
        this.e = tL_error;
        this.c = j3;
        this.h = hashSet;
    }
}
