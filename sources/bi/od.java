package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class od implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ od(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        ad adVar;
        switch (this.a) {
            case 0:
                qd qdVar = (qd) this.b;
                t tVar = (t) this.c;
                File file = (File) obj;
                String str = (String) obj2;
                Long l4 = (Long) obj3;
                ce ceVar = qdVar.S1;
                nd ndVar = ceVar.X0;
                if (ndVar != null) {
                    ndVar.O = false;
                    ndVar.c();
                    nd ndVar2 = ceVar.X0;
                    ndVar2.m(0L);
                    me meVar = ndVar2.F;
                    if (meVar != null) {
                        meVar.setProgress(0L);
                    }
                }
                r9 r9Var = ceVar.K1;
                if (r9Var != null) {
                    r9Var.o0 = file;
                    r9Var.p0 = str;
                    r9Var.q0 = l4.longValue();
                    r9 r9Var2 = ceVar.K1;
                    r9Var2.s0 = 0.0f;
                    r9Var2.t0 = 1.0f;
                    r9Var2.r0 = 0L;
                    r9Var2.u0 = 1.0f;
                    ceVar.u();
                    if (ceVar.X0 == null || (adVar = ceVar.v1) == null) {
                        tVar.a(false);
                        return;
                    }
                    pg.b2 m0 = adVar.m0(ceVar.K1.p0, true);
                    qdVar.setHasRoundVideo(true);
                    ceVar.X0.s(ceVar.K1, m0, true);
                    AndroidUtilities.cancelRunOnUIThread(tVar.h);
                    tVar.a.destroy(true, null);
                    m0.setDraw(false);
                    tVar.post(new a1.e(20, tVar, m0));
                    return;
                }
                return;
            case 1:
                di.u uVar = (di.u) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar2 = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar2 = (androidx.biometric.u) obj3;
                uVar.getClass();
                String str2 = null;
                if (tVar2 != null) {
                    try {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 < 23) {
                            str2 = uVar.g;
                        } else {
                            if (i10 >= 30) {
                                uVar2 = uVar.i(true);
                            }
                            if (uVar2 != null) {
                                str2 = !TextUtils.isEmpty(uVar.g) ? new String(uVar2.b.doFinal(Utilities.hexToBytes(uVar.g)), StandardCharsets.UTF_8) : uVar.g;
                            } else if (!TextUtils.isEmpty(uVar.g)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                callback2.run(bool, str2);
                return;
            default:
                zh.o1 o1Var = (zh.o1) this.b;
                zh.k0 k0Var = (zh.k0) this.c;
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj3;
                int i11 = o1Var.N;
                if (((Boolean) obj2).booleanValue()) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = o1Var.O;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i11).getInputPeer(k0Var.c);
                    deletegroupcallparticipantmessages.report_spam = bool2.booleanValue();
                    ConnectionsManager.getInstance(i11).sendRequest(deletegroupcallparticipantmessages, null);
                    long j3 = k0Var.c;
                    ArrayList arrayList = o1Var.r;
                    ArrayList arrayList2 = o1Var.s;
                    int i12 = 0;
                    boolean z10 = false;
                    while (i12 < arrayList.size()) {
                        if (((zh.k0) arrayList.get(i12)).c == j3) {
                            zh.k0 k0Var2 = (zh.k0) arrayList.get(i12);
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (((zh.l0) arrayList2.get(i13)).f.contains(k0Var2)) {
                                        ((zh.l0) arrayList2.get(i13)).f.remove(k0Var2);
                                        if (((zh.l0) arrayList2.get(i13)).f.isEmpty()) {
                                            arrayList2.remove(i13);
                                            z10 = true;
                                        } else {
                                            o1Var.m();
                                        }
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            arrayList.remove(i12);
                            o1Var.e.N(true);
                            i12--;
                        }
                        i12++;
                    }
                    if (z10) {
                        ConnectionsManager.getInstance(i11).getCurrentTime();
                        Collections.sort(arrayList2, new sg.p(o1Var, 23));
                        o1Var.n.N(true);
                        o1Var.t();
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = o1Var.O;
                    deletegroupcallmessages.messages.add(Integer.valueOf(k0Var.a));
                    ConnectionsManager.getInstance(i11).sendRequest(deletegroupcallmessages, null);
                    o1Var.c(k0Var.a);
                }
                if (bool3.booleanValue()) {
                    if (o1Var.M >= 0) {
                        MessagesController.getInstance(i11).blockPeer(o1Var.M);
                        return;
                    } else {
                        MessagesController.getInstance(i11).deleteParticipantFromChat(-o1Var.M, MessagesController.getInstance(i11).getInputPeer(k0Var.c), false, true);
                        return;
                    }
                }
                return;
        }
    }
}
