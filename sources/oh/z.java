package oh;

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
import org.telegram.ui.mg1;
import qh.ca;
import qh.ma;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        qh.f9 f9Var;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.b;
                t0 t0Var = (t0) this.c;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj3;
                int i10 = h2Var.K;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = h2Var.L;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i10).getInputPeer(t0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool.booleanValue();
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallparticipantmessages, null);
                    long j10 = t0Var.c;
                    ArrayList arrayList = h2Var.r;
                    ArrayList arrayList2 = h2Var.s;
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
                                            h2Var.m();
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                            arrayList.remove(i11);
                            h2Var.e.N(true);
                            i11--;
                        }
                        i11++;
                    }
                    if (z4) {
                        ConnectionsManager.getInstance(i10).getCurrentTime();
                        Collections.sort(arrayList2, new e5.f(h2Var, 29));
                        h2Var.n.N(true);
                        h2Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = h2Var.L;
                    deletegroupcallmessages.messages.add(Integer.valueOf(t0Var.a));
                    ConnectionsManager.getInstance(i10).sendRequest(deletegroupcallmessages, null);
                    h2Var.c(t0Var.a);
                }
                if (bool2.booleanValue()) {
                    if (h2Var.J >= 0) {
                        MessagesController.getInstance(i10).blockPeer(h2Var.J);
                        return;
                    } else {
                        MessagesController.getInstance(i10).deleteParticipantFromChat(-h2Var.J, MessagesController.getInstance(i10).getInputPeer(t0Var.c), false, true);
                        return;
                    }
                }
                return;
            case 1:
                qh.r9 r9Var = (qh.r9) this.b;
                qh.n nVar = (qh.n) this.c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l10 = (Long) obj3;
                ca caVar = r9Var.P1;
                qh.q9 q9Var = caVar.U0;
                if (q9Var != null) {
                    q9Var.L = false;
                    q9Var.c();
                    qh.q9 q9Var2 = caVar.U0;
                    q9Var2.m(0L);
                    ma maVar = q9Var2.C;
                    if (maVar != null) {
                        maVar.setProgress(0L);
                    }
                }
                qh.s6 s6Var = caVar.H1;
                if (s6Var != null) {
                    s6Var.o0 = file;
                    s6Var.p0 = str;
                    s6Var.q0 = l10.longValue();
                    qh.s6 s6Var2 = caVar.H1;
                    s6Var2.s0 = 0.0f;
                    s6Var2.t0 = 1.0f;
                    s6Var2.r0 = 0L;
                    s6Var2.u0 = 1.0f;
                    caVar.u();
                    if (caVar.U0 == null || (f9Var = caVar.s1) == null) {
                        nVar.a(false);
                        return;
                    }
                    eg.z2 m0 = f9Var.m0(caVar.H1.p0, true);
                    r9Var.setHasRoundVideo(true);
                    caVar.U0.s(caVar.H1, m0, true);
                    AndroidUtilities.cancelRunOnUIThread(nVar.h);
                    nVar.a.destroy(true, null);
                    m0.setDraw(false);
                    nVar.post(new mg1(28, nVar, m0));
                    return;
                }
                return;
            default:
                sh.p pVar = (sh.p) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool3 = (Boolean) obj;
                androidx.biometric.v vVar = (androidx.biometric.v) obj2;
                androidx.biometric.w wVar = (androidx.biometric.w) obj3;
                pVar.getClass();
                String str2 = null;
                if (vVar != null) {
                    try {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 < 23) {
                            str2 = pVar.g;
                        } else {
                            if (i13 >= 30) {
                                wVar = pVar.i(true);
                            }
                            if (wVar != null) {
                                str2 = !TextUtils.isEmpty(pVar.g) ? new String(wVar.b.doFinal(Utilities.hexToBytes(pVar.g)), StandardCharsets.UTF_8) : pVar.g;
                            } else if (!TextUtils.isEmpty(pVar.g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        bool3 = Boolean.FALSE;
                    }
                }
                callback2.run(bool3, str2);
                return;
        }
    }
}
