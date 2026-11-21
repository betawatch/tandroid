package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class q00 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j3 = this.b;
        Object obj4 = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                z00 z00Var = (z00) obj4;
                fj fjVar = (fj) obj3;
                String str = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = fjVar.k;
                message.translatedSummaryLanguage = tL_textWithEntities != null ? str : null;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                z00Var.getMessagesStorage().X1(j3, fjVar.k);
                ks.f(z00Var.currentAccount).k(128, fjVar, Boolean.TRUE);
                break;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i11 = x6Var.a;
                tL_getFactCheck.peer = mp.u1(i11).l1(j3);
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
                        x10 x10Var = (x10) hashMap.get(w6Var);
                        if (x10Var != null) {
                            x10Var.a(tL_factCheck);
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    ks.f(i11).k(ks.D3, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i11).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    break;
                }
                break;
            default:
                mp mpVar = (mp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) obj2;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    mpVar.b8.add(Long.valueOf(j3));
                    mpVar.Q4(true);
                    if (T != null) {
                        org.telegram.ui.Components.lc.b0(T).P(R.raw.chats_infotip, g0.H2(g0.x2(gd.N0(2131745378, null), new ln(i10, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    zdVar.run();
                    break;
                } else if (T != null) {
                    org.telegram.ui.Components.lc.b0(T).I(R.raw.error, gd.N0(2131754308, null), gd.N0(2131754309, null)).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q00(z00 z00Var, fj fjVar, String str, long j3) {
        this.a = 0;
        this.c = z00Var;
        this.d = fjVar;
        this.e = str;
        this.b = j3;
    }
}
