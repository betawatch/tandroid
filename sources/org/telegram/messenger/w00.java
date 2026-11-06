package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class w00 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j3 = this.b;
        Object obj4 = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                f10 f10Var = (f10) obj4;
                ij ijVar = (ij) obj3;
                String str = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ijVar.k;
                message.translatedSummaryLanguage = tL_textWithEntities != null ? str : null;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                f10Var.getMessagesStorage().X1(j3, ijVar.k);
                qs.f(f10Var.currentAccount).k(128, ijVar, Boolean.TRUE);
                break;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i11 = x6Var.a;
                tL_getFactCheck.peer = qp.s1(i11).j1(j3);
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    w6 w6Var = (w6) arrayList.get(i13);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i13);
                    if (tL_factCheck == null) {
                        arrayList3.add(w6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(w6Var.a));
                    } else {
                        x6Var.d.remove(w6Var);
                        c20 c20Var = (c20) hashMap.get(w6Var);
                        if (c20Var != null) {
                            c20Var.a(tL_factCheck);
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    qs.f(i11).k(qs.B3, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i11).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    break;
                }
                break;
            default:
                qp qpVar = (qp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ae aeVar = (org.telegram.ui.ae) obj2;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    qpVar.V7.add(Long.valueOf(j3));
                    qpVar.F4(true);
                    if (T != null) {
                        org.telegram.ui.Components.hc.a0(T).P(R.raw.chats_infotip, g0.H2(g0.x2(hd.M0(2131745575, null), new rn(i10, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    aeVar.run();
                    break;
                } else if (T != null) {
                    org.telegram.ui.Components.hc.a0(T).I(R.raw.error, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w00(f10 f10Var, ij ijVar, String str, long j3) {
        this.a = 0;
        this.c = f10Var;
        this.d = ijVar;
        this.e = str;
        this.b = j3;
    }
}
