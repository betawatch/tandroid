package bi;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.b10;
import org.telegram.messenger.f10;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.r00;
import org.telegram.messenger.ui;
import org.telegram.messenger.vi;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ l(z zVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3, TLObject tLObject) {
        this.d = zVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z9;
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
                z.d0((z) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
            case 1:
                boolean z9 = true;
                ui uiVar = (ui) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z10 = this.b;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                long j3 = this.c;
                uiVar.getMessagesController().Y3(arrayList6, z10);
                uiVar.getMessagesController().S3(arrayList7, z10);
                int size = arrayList8.size();
                boolean z11 = false;
                int i7 = 0;
                while (i7 < size) {
                    ij ijVar = (ij) arrayList8.get(i7);
                    SparseArray sparseArray = (SparseArray) hVar.f(ij.B0(ijVar.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(ijVar.f1())) != null) {
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            ij ijVar2 = (ij) arrayList.get(i10);
                            ijVar2.C = ijVar;
                            ijVar2.m();
                            TLRPC.MessageAction messageAction = ijVar2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                ijVar2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                ijVar2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                ijVar2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                ijVar2.p0(null, z9);
                            }
                            i10++;
                            z9 = true;
                        }
                        z11 = true;
                    }
                    i7++;
                    z9 = true;
                }
                if (z11) {
                    uiVar.getNotificationCenter().k(55, Long.valueOf(j3), arrayList8, hVar);
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z12 = this.b;
                long j10 = this.c;
                t4 t4Var = (t4) this.h;
                viVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z12) {
                        viVar.a.put(j10, tL_messages_chatInviteImporters);
                    }
                }
                t4Var.run(tLObject, tL_error);
                return;
            default:
                f10 f10Var = (f10) this.d;
                b10 b10Var = (b10) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z13 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j11 = this.c;
                HashSet hashSet = (HashSet) this.h;
                synchronized (f10Var) {
                    arrayList2 = b10Var.b;
                    arrayList3 = b10Var.d;
                    arrayList4 = b10Var.c;
                    str = b10Var.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList9 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList9.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        ((z10) arrayList3.get(i11)).a(Boolean.valueOf(z13), (Integer) arrayList2.get(i11), k21.P0((TLRPC.TL_textWithEntities) arrayList4.get(i11), arrayList9.get(i11)), str);
                    }
                } else {
                    if (tL_error2 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                        arrayList5 = arrayList2;
                        if (tL_error2 == null || !"TO_LANG_INVALID".equals(tL_error2.text)) {
                            if (tL_error2 != null && "QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                qs.e().k(qs.P4, 1, org.telegram.messenger.id.M0(2131743950, null));
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                ((z10) arrayList3.get(i12)).a(Boolean.valueOf(z13), (Integer) arrayList5.get(i12), null, b10Var.e);
                            }
                        } else {
                            f10Var.K(j11, false);
                            qs.e().k(qs.P4, 1, org.telegram.messenger.id.M0(2131743949, null));
                        }
                        synchronized (f10Var) {
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
                        k21.J0(((TLRPC.TL_textWithEntities) arrayList4.get(i14)).text, null, str2, new r00(f10Var, (z10) arrayList3.get(i14), z13, intValue, str2, j11, 1));
                        i14++;
                        arrayList2 = arrayList10;
                        str = str2;
                        arrayList3 = arrayList3;
                    }
                }
                arrayList5 = arrayList2;
                synchronized (f10Var) {
                }
                break;
        }
    }

    public /* synthetic */ l(ui uiVar, ArrayList arrayList, boolean z9, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j3) {
        this.d = uiVar;
        this.e = arrayList;
        this.b = z9;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = hVar;
        this.c = j3;
    }

    public /* synthetic */ l(vi viVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, long j3, t4 t4Var) {
        this.d = viVar;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.b = z9;
        this.c = j3;
        this.h = t4Var;
    }

    public /* synthetic */ l(f10 f10Var, b10 b10Var, TLObject tLObject, boolean z9, TLRPC.TL_error tL_error, long j3, HashSet hashSet) {
        this.d = f10Var;
        this.f = b10Var;
        this.n = tLObject;
        this.b = z9;
        this.e = tL_error;
        this.c = j3;
        this.h = hashSet;
    }
}
