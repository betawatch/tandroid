package ai;

import android.os.Build;
import android.text.TextUtils;
import ci.zc;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        ci.qb qbVar;
        switch (this.a) {
            case 0:
                r3 r3Var = (r3) this.b;
                m1 m1Var = (m1) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = r3Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = r3Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(m1Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = m1Var.c;
                    ArrayList arrayList = r3Var.r;
                    ArrayList arrayList2 = r3Var.s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((m1) arrayList.get(i11)).c == j3) {
                            m1 m1Var2 = (m1) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((n1) arrayList2.get(i12)).f.contains(m1Var2)) {
                                        ((n1) arrayList2.get(i12)).f.remove(m1Var2);
                                        if (((n1) arrayList2.get(i12)).f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            r3Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            r3Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a4.e(r3Var, 4));
                        r3Var.n.N(true);
                        r3Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = r3Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(m1Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    r3Var.c(m1Var.a);
                }
                if (bool2.booleanValue()) {
                    if (r3Var.M >= 0) {
                        MessagesController.getInstance(i10).blockPeer(r3Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-r3Var.M, MessagesController.getInstance(i10).getInputPeer(m1Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ci.ec ecVar = (ci.ec) this.b;
                ci.p pVar = (ci.p) this.c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                ci.oc ocVar = ecVar.S1;
                ci.cc ccVar = ocVar.X0;
                if (ccVar != null) {
                    ccVar.O = false;
                    ccVar.c();
                    ci.cc ccVar2 = ocVar.X0;
                    ccVar2.m(0L);
                    zc zcVar = ccVar2.F;
                    if (zcVar != null) {
                        zcVar.setProgress(0L);
                    }
                }
                ci.o8 o8Var = ocVar.K1;
                if (o8Var != null) {
                    o8Var.o0 = file;
                    o8Var.p0 = str;
                    o8Var.q0 = l4.longValue();
                    ci.o8 o8Var2 = ocVar.K1;
                    o8Var2.s0 = 0.0f;
                    o8Var2.t0 = 1.0f;
                    o8Var2.r0 = 0L;
                    o8Var2.u0 = 1.0f;
                    ocVar.u();
                    if (ocVar.X0 == null || (qbVar = ocVar.v1) == null) {
                        pVar.a(false);
                        return;
                    }
                    qg.b2 m0 = qbVar.m0(ocVar.K1.p0, true);
                    ecVar.setHasRoundVideo(true);
                    ocVar.X0.s(ocVar.K1, m0, true);
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    pVar.a.destroy(true, null);
                    m0.setDraw(false);
                    pVar.post(new ba(24, pVar, m0));
                    return;
                }
                return;
            default:
                ei.r rVar = (ei.r) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.s sVar = (androidx.biometric.s) obj2;
                androidx.biometric.t tVar = (androidx.biometric.t) obj3;
                rVar.getClass();
                String str2 = null;
                if (sVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = rVar.g;
                        } else {
                            if (i13 >= 30) {
                                tVar = rVar.i(true);
                            }
                            if (tVar != null) {
                                str2 = !TextUtils.isEmpty(rVar.g) ? new String(tVar.b.doFinal(Utilities.hexToBytes(rVar.g)), StandardCharsets.UTF_8) : rVar.g;
                            } else if (!TextUtils.isEmpty(rVar.g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
