package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t00(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j3 = this.b;
        Object obj4 = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                c10 c10Var = (c10) obj4;
                gj gjVar = (gj) obj3;
                String str = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.k;
                message.translatedSummaryLanguage = tL_textWithEntities != null ? str : null;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                c10Var.getMessagesStorage().X1(j3, gjVar.k);
                ns.f(c10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                break;
            case 1:
                x6 x6Var = (x6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i11 = x6Var.a;
                tL_getFactCheck.peer = np.s1(i11).j1(j3);
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
                        z10 z10Var = (z10) hashMap.get(w6Var);
                        if (z10Var != null) {
                            z10Var.a(tL_factCheck);
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    ns.f(i11).k(ns.B3, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i11).sendRequest(tL_getFactCheck, new q6(x6Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    break;
                }
                break;
            default:
                np npVar = (np) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.yd ydVar = (org.telegram.ui.yd) obj2;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    npVar.W7.add(Long.valueOf(j3));
                    npVar.G4(true);
                    if (T != null) {
                        org.telegram.ui.Components.cc.a0(T).P(R.raw.chats_infotip, g0.H2(g0.x2(hd.M0(2131745574, null), new on(i10, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    ydVar.run();
                    break;
                } else if (T != null) {
                    org.telegram.ui.Components.cc.a0(T).I(R.raw.error, hd.M0(2131754311, null), hd.M0(2131754312, null)).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t00(c10 c10Var, gj gjVar, String str, long j3) {
        this.a = 0;
        this.c = c10Var;
        this.d = gjVar;
        this.e = str;
        this.b = j3;
    }
}
