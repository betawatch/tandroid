package nh;

import android.os.Build;
import android.text.TextUtils;
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
import org.telegram.ui.kg1;
import ph.da;
import ph.oa;
import ph.s9;
import ph.t9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        ph.h9 h9Var;
        switch (this.a) {
            case 0:
                g2 g2Var = (g2) this.b;
                t0 t0Var = (t0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = g2Var.K;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = g2Var.L;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(t0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = t0Var.c;
                    ArrayList arrayList = g2Var.r;
                    ArrayList arrayList2 = g2Var.s;
                    int i11 = 0;
                    boolean z4 = false;
                    while (i11 < arrayList.size()) {
                        if (((t0) arrayList.get(i11)).c == j10) {
                            t0 t0Var2 = (t0) arrayList.get(i11);
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((u0) arrayList2.get(i12)).f.contains(t0Var2)) {
                                        ((u0) arrayList2.get(i12)).f.remove(t0Var2);
                                        if (((u0) arrayList2.get(i12)).f.isEmpty()) {
                                            arrayList2.remove(i12);
                                            z4 = true;
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
                    if (z4) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new e5.f(g2Var, 28));
                        g2Var.n.N(true);
                        g2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = g2Var.L;
                    deletegroupcallmessages.messages.add(Integer.valueOf(t0Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    g2Var.c(t0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (g2Var.J >= 0) {
                        MessagesController.getInstance(i10).blockPeer(g2Var.J);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-g2Var.J, MessagesController.getInstance(i10).getInputPeer(t0Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                t9 t9Var = (t9) this.b;
                ph.n nVar = (ph.n) this.c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                da daVar = t9Var.P1;
                s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.L = false;
                    s9Var.c();
                    s9 s9Var2 = daVar.U0;
                    s9Var2.m(0L);
                    oa oaVar = s9Var2.C;
                    if (oaVar != null) {
                        oaVar.setProgress(0L);
                    }
                }
                ph.u6 u6Var = daVar.H1;
                if (u6Var != null) {
                    u6Var.o0 = file;
                    u6Var.p0 = str;
                    u6Var.q0 = l10.longValue();
                    ph.u6 u6Var2 = daVar.H1;
                    u6Var2.s0 = 0.0f;
                    u6Var2.t0 = 1.0f;
                    u6Var2.r0 = 0L;
                    u6Var2.u0 = 1.0f;
                    daVar.u();
                    if (daVar.U0 == null || (h9Var = daVar.s1) == null) {
                        nVar.a(false);
                        return;
                    }
                    dg.b3 m0 = h9Var.m0(daVar.H1.p0, true);
                    t9Var.setHasRoundVideo(true);
                    daVar.U0.s(daVar.H1, m0, true);
                    AndroidUtilities.cancelRunOnUIThread(nVar.h);
                    nVar.a.destroy(true, null);
                    m0.setDraw(false);
                    nVar.post(new kg1(28, nVar, m0));
                    return;
                }
                return;
            default:
                rh.q qVar = (rh.q) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.v vVar = (androidx.biometric.v) obj2;
                androidx.biometric.w wVar = (androidx.biometric.w) obj3;
                qVar.getClass();
                String str2 = null;
                if (vVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = qVar.g;
                        } else {
                            if (i13 >= 30) {
                                wVar = qVar.i(true);
                            }
                            if (wVar != null) {
                                str2 = !TextUtils.isEmpty(qVar.g) ? new String(wVar.b.doFinal(Utilities.hexToBytes(qVar.g)), StandardCharsets.UTF_8) : qVar.g;
                            } else if (!TextUtils.isEmpty(qVar.g)) {
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
