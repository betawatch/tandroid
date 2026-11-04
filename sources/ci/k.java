package ci;

import android.app.Activity;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.j00;
import org.telegram.messenger.li;
import org.telegram.messenger.mi;
import org.telegram.messenger.r10;
import org.telegram.messenger.t00;
import org.telegram.messenger.x00;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f21;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ k(v vVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = vVar;
        this.e = tL_error;
        this.f = twoStepVerificationActivity;
        this.h = activity;
        this.b = z10;
        this.c = j10;
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
                v.d0((v) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f, (Activity) this.h, this.b, this.c, (TLObject) this.n);
                return;
            case 1:
                boolean z10 = true;
                li liVar = (li) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                boolean z11 = this.b;
                ArrayList arrayList7 = (ArrayList) this.f;
                ArrayList arrayList8 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                long j10 = this.c;
                liVar.getMessagesController().Y3(arrayList6, z11);
                liVar.getMessagesController().S3(arrayList7, z11);
                int size = arrayList8.size();
                boolean z12 = false;
                int i3 = 0;
                while (i3 < size) {
                    zi ziVar = (zi) arrayList8.get(i3);
                    SparseArray sparseArray = (SparseArray) hVar.f(zi.B0(ziVar.k));
                    if (sparseArray != null && (arrayList = (ArrayList) sparseArray.get(ziVar.f1())) != null) {
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            zi ziVar2 = (zi) arrayList.get(i10);
                            ziVar2.C = ziVar;
                            ziVar2.m();
                            TLRPC.MessageAction messageAction = ziVar2.k.action;
                            if (messageAction instanceof TLRPC.TL_messageActionPinMessage) {
                                ziVar2.q0(null, null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                                ziVar2.m0(null);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                ziVar2.p0(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                ziVar2.p0(null, z10);
                            }
                            i10++;
                            z10 = true;
                        }
                        z12 = true;
                    }
                    i3++;
                    z10 = true;
                }
                if (z12) {
                    liVar.getNotificationCenter().k(55, Long.valueOf(j10), arrayList8, hVar);
                    return;
                }
                return;
            case 2:
                mi miVar = (mi) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.n;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z13 = this.b;
                long j11 = this.c;
                d4 d4Var = (d4) this.h;
                miVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteImporter == null && z13) {
                        miVar.a.put(j11, tL_messages_chatInviteImporters);
                    }
                }
                d4Var.run(tLObject, tL_error);
                return;
            default:
                x00 x00Var = (x00) this.d;
                t00 t00Var = (t00) this.f;
                TLObject tLObject2 = (TLObject) this.n;
                boolean z14 = this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j12 = this.c;
                HashSet hashSet = (HashSet) this.h;
                synchronized (x00Var) {
                    arrayList2 = t00Var.b;
                    arrayList3 = t00Var.d;
                    arrayList4 = t00Var.c;
                    str = t00Var.e;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList9 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    int min = Math.min(arrayList3.size(), arrayList9.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        ((r10) arrayList3.get(i11)).a(Boolean.valueOf(z14), (Integer) arrayList2.get(i11), f21.P0((TLRPC.TL_textWithEntities) arrayList4.get(i11), arrayList9.get(i11)), str);
                    }
                } else {
                    if (tL_error2 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error2.text)) {
                        arrayList5 = arrayList2;
                        if (tL_error2 == null || !"TO_LANG_INVALID".equals(tL_error2.text)) {
                            if (tL_error2 != null && "QUOTA_EXCEEDED".equals(tL_error2.text)) {
                                hs.e().k(hs.P4, 1, bd.M0(2131743957, null));
                            }
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                ((r10) arrayList3.get(i12)).a(Boolean.valueOf(z14), (Integer) arrayList5.get(i12), null, t00Var.e);
                            }
                        } else {
                            x00Var.K(j12, false);
                            hs.e().k(hs.P4, 1, bd.M0(2131743956, null));
                        }
                        synchronized (x00Var) {
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
                        f21.J0(((TLRPC.TL_textWithEntities) arrayList4.get(i14)).text, null, str2, new j00(x00Var, (r10) arrayList3.get(i14), z14, intValue, str2, j12, 1));
                        i14++;
                        arrayList2 = arrayList10;
                        str = str2;
                        arrayList3 = arrayList3;
                    }
                }
                arrayList5 = arrayList2;
                synchronized (x00Var) {
                }
                break;
        }
    }

    public /* synthetic */ k(li liVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = liVar;
        this.e = arrayList;
        this.b = z10;
        this.f = arrayList2;
        this.h = arrayList3;
        this.n = hVar;
        this.c = j10;
    }

    public /* synthetic */ k(mi miVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, long j10, d4 d4Var) {
        this.d = miVar;
        this.e = tL_error;
        this.n = tLObject;
        this.f = tL_chatInviteImporter;
        this.b = z10;
        this.c = j10;
        this.h = d4Var;
    }

    public /* synthetic */ k(x00 x00Var, t00 t00Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j10, HashSet hashSet) {
        this.d = x00Var;
        this.f = t00Var;
        this.n = tLObject;
        this.b = z10;
        this.e = tL_error;
        this.c = j10;
        this.h = hashSet;
    }
}
