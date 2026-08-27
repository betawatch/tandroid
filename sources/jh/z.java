package jh;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import lh.cc;
import lh.hb;
import lh.ib;
import lh.sb;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        va vaVar;
        switch (this.a) {
            case 0:
                g2 g2Var = (g2) this.b;
                s0 s0Var = (s0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = g2Var.J;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = g2Var.K;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(s0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = s0Var.c;
                    ArrayList arrayList = g2Var.r;
                    ArrayList arrayList2 = g2Var.s;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < arrayList.size()) {
                        if (((s0) arrayList.get(i11)).c == j10) {
                            s0 s0Var2 = (s0) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((t0) arrayList2.get(i12)).f.contains(s0Var2)) {
                                        ((t0) arrayList2.get(i12)).f.remove(s0Var2);
                                        if (((t0) arrayList2.get(i12)).f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z10 = true;
                                        } else {
                                            g2Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            g2Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new a5.f(g2Var, 26));
                        g2Var.n.N(true);
                        g2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = g2Var.K;
                    deletegroupcallmessages.messages.add(Integer.valueOf(s0Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    g2Var.c(s0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (g2Var.I >= 0) {
                        MessagesController.getInstance(i10).blockPeer(g2Var.I);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-g2Var.I, MessagesController.getInstance(i10).getInputPeer(s0Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                ib ibVar = (ib) this.b;
                lh.q qVar = (lh.q) this.c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                sb sbVar = ibVar.O1;
                hb hbVar = sbVar.T0;
                if (hbVar != null) {
                    hbVar.K = false;
                    hbVar.c();
                    hb hbVar2 = sbVar.T0;
                    hbVar2.m(0L);
                    cc ccVar = hbVar2.B;
                    if (ccVar != null) {
                        ccVar.setProgress(0L);
                    }
                }
                lh.z7 z7Var = sbVar.G1;
                if (z7Var != null) {
                    z7Var.o0 = file;
                    z7Var.p0 = str;
                    z7Var.q0 = l10.longValue();
                    lh.z7 z7Var2 = sbVar.G1;
                    z7Var2.s0 = 0.0f;
                    z7Var2.t0 = 1.0f;
                    z7Var2.r0 = 0L;
                    z7Var2.u0 = 1.0f;
                    sbVar.u();
                    if (sbVar.T0 == null || (vaVar = sbVar.r1) == null) {
                        qVar.a(false);
                        return;
                    }
                    zf.c2 m0 = vaVar.m0(sbVar.G1.p0, true);
                    ibVar.setHasRoundVideo(true);
                    sbVar.T0.s(sbVar.G1, m0, true);
                    AndroidUtilities.cancelRunOnUIThread(qVar.h);
                    qVar.a.destroy(true, null);
                    m0.setDraw(false);
                    qVar.post(new p6(28, qVar, m0));
                    return;
                }
                return;
            default:
                nh.q qVar2 = (nh.q) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                qVar2.getClass();
                String str2 = null;
                if (tVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = qVar2.g;
                        } else {
                            if (i13 >= 30) {
                                uVar = qVar2.i(true);
                            }
                            if (uVar != null) {
                                str2 = !TextUtils.isEmpty(qVar2.g) ? new String(uVar.b.doFinal(Utilities.hexToBytes(qVar2.g)), StandardCharsets.UTF_8) : qVar2.g;
                            } else if (!TextUtils.isEmpty(qVar2.g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
