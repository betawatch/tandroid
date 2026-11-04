package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o00(Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j10 = this.b;
        Object obj4 = this.c;
        int i10 = 0;
        switch (i3) {
            case 0:
                x00 x00Var = (x00) obj4;
                zi ziVar = (zi) obj3;
                String str = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ziVar.k;
                message.translatedSummaryLanguage = tL_textWithEntities != null ? str : null;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                x00Var.getMessagesStorage().X1(j10, ziVar.k);
                hs.f(x00Var.currentAccount).k(128, ziVar, Boolean.TRUE);
                break;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i11 = x6Var.a;
                tL_getFactCheck.peer = hp.s1(i11).j1(j10);
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
                        u10 u10Var = (u10) hashMap.get(w6Var);
                        if (u10Var != null) {
                            u10Var.a(tL_factCheck);
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    hs.f(i11).k(hs.B3, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i11).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    break;
                }
                break;
            default:
                hp hpVar = (hp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.yd ydVar = (org.telegram.ui.yd) obj2;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    hpVar.V7.add(Long.valueOf(j10));
                    hpVar.F4(true);
                    if (T != null) {
                        org.telegram.ui.Components.fc.a0(T).P(R.raw.chats_infotip, g0.H2(g0.x2(bd.M0(2131745584, null), new hn(i10, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    ydVar.run();
                    break;
                } else if (T != null) {
                    org.telegram.ui.Components.fc.a0(T).I(R.raw.error, bd.M0(2131754311, null), bd.M0(2131754312, null)).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o00(x00 x00Var, zi ziVar, String str, long j10) {
        this.a = 0;
        this.c = x00Var;
        this.d = ziVar;
        this.e = str;
        this.b = j10;
    }
}
