package ih;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import kh.gc;
import kh.kb;
import kh.mb;
import kh.wb;
import kh.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        ya yaVar;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.b;
                u0 u0Var = (u0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i9 = h2Var.J;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = h2Var.K;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i9).getInputPeer(u0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i9).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = u0Var.c;
                    ArrayList arrayList = h2Var.r;
                    ArrayList arrayList2 = h2Var.s;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < arrayList.size()) {
                        if (((u0) arrayList.get(i10)).c == j10) {
                            u0 u0Var2 = (u0) arrayList.get(i10);
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (((v0) arrayList2.get(i11)).f.contains(u0Var2)) {
                                        ((v0) arrayList2.get(i11)).f.remove(u0Var2);
                                        if (((v0) arrayList2.get(i11)).f.isEmpty()) {
                                            arrayList2.remove(i11);
                                            z10 = true;
                                        } else {
                                            h2Var.m();
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            arrayList.remove(i10);
                            h2Var.e.N(true);
                            i10--;
                        }
                        i10++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i9).getCurrentTime();
                        Collections.sort(arrayList2, new a5.e(h2Var, 25));
                        h2Var.n.N(true);
                        h2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = h2Var.K;
                    deletegroupcallmessages.messages.add(Integer.valueOf(u0Var.a));
                    ConnectionsManager.getInstance(i9).sendRequest(deletegroupcallmessages, null);
                    h2Var.c(u0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (h2Var.I >= 0) {
                        MessagesController.getInstance(i9).blockPeer(h2Var.I);
                        return;
                    } else {
                        MessagesController.getInstance(i9).deleteParticipantFromChat(-h2Var.I, MessagesController.getInstance(i9).getInputPeer(u0Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                mb mbVar = (mb) this.b;
                kh.q qVar = (kh.q) this.c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                wb wbVar = mbVar.O1;
                kb kbVar = wbVar.T0;
                if (kbVar != null) {
                    kbVar.K = false;
                    kbVar.c();
                    kb kbVar2 = wbVar.T0;
                    kbVar2.m(0L);
                    gc gcVar = kbVar2.B;
                    if (gcVar != null) {
                        gcVar.setProgress(0L);
                    }
                }
                kh.a8 a8Var = wbVar.G1;
                if (a8Var != null) {
                    a8Var.o0 = file;
                    a8Var.p0 = str;
                    a8Var.q0 = l10.longValue();
                    kh.a8 a8Var2 = wbVar.G1;
                    a8Var2.s0 = 0.0f;
                    a8Var2.t0 = 1.0f;
                    a8Var2.r0 = 0L;
                    a8Var2.u0 = 1.0f;
                    wbVar.u();
                    if (wbVar.T0 == null || (yaVar = wbVar.r1) == null) {
                        qVar.a(false);
                        return;
                    }
                    yf.b2 m0 = yaVar.m0(wbVar.G1.p0, true);
                    mbVar.setHasRoundVideo(true);
                    wbVar.T0.s(wbVar.G1, m0, true);
                    AndroidUtilities.cancelRunOnUIThread(qVar.h);
                    qVar.a.destroy(true, null);
                    m0.setDraw(false);
                    qVar.post(new j7(22, qVar, m0));
                    return;
                }
                return;
            default:
                mh.r rVar = (mh.r) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                rVar.getClass();
                String str2 = null;
                if (tVar != null) {
                    try {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 < 23) {
                            str2 = rVar.g;
                        } else {
                            if (i12 >= 30) {
                                uVar = rVar.i(true);
                            }
                            if (uVar != null) {
                                str2 = !TextUtils.isEmpty(rVar.g) ? new String(uVar.b.doFinal(Utilities.hexToBytes(rVar.g)), StandardCharsets.UTF_8) : rVar.g;
                            } else if (!TextUtils.isEmpty(rVar.g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
