package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k10 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k10(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        long j10 = this.b;
        Object obj4 = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                t10 t10Var = (t10) obj4;
                jj jjVar = (jj) obj3;
                String str = (String) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = jjVar.k;
                message.translatedSummaryLanguage = tL_textWithEntities != null ? str : null;
                message.translatedSummaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                t10Var.getMessagesStorage().X1(j10, jjVar.k);
                zs.f(t10Var.currentAccount).k(128, jjVar, Boolean.TRUE);
                break;
            case 1:
                a7 a7Var = (a7) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_getFactCheck tL_getFactCheck = new TLRPC.TL_getFactCheck();
                int i12 = a7Var.a;
                tL_getFactCheck.peer = vp.r1(i12).i1(j10);
                ArrayList arrayList3 = new ArrayList();
                int i13 = 0;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    z6 z6Var = (z6) arrayList.get(i14);
                    TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) arrayList2.get(i14);
                    if (tL_factCheck == null) {
                        arrayList3.add(z6Var);
                        tL_getFactCheck.msg_id.add(Integer.valueOf(z6Var.a));
                    } else {
                        a7Var.d.remove(z6Var);
                        q20 q20Var = (q20) hashMap.get(z6Var);
                        if (q20Var != null) {
                            q20Var.a(tL_factCheck);
                            i13++;
                        }
                    }
                }
                if (i13 > 0) {
                    zs.f(i12).k(zs.B3, new Object[0]);
                }
                if (!tL_getFactCheck.msg_id.isEmpty()) {
                    ConnectionsManager.getInstance(i12).sendRequest(tL_getFactCheck, new r6(a7Var, tL_getFactCheck, arrayList3, hashMap, 0));
                    break;
                }
                break;
            default:
                vp vpVar = (vp) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.me meVar = (org.telegram.ui.me) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (((Boolean) obj).booleanValue()) {
                    vpVar.W7.add(Long.valueOf(j10));
                    vpVar.C4(true);
                    if (T != null) {
                        org.telegram.ui.Components.cc.a0(T).P(R.raw.chats_infotip, i0.G2(i0.x2(cd.L0(2131745591, null), new xn(i11, T)), true)).k(true);
                    }
                    zArr[0] = true;
                    meVar.run();
                    break;
                } else if (T != null) {
                    org.telegram.ui.Components.cc.a0(T).I(R.raw.error, cd.L0(2131754311, null), cd.L0(2131754312, null)).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k10(t10 t10Var, jj jjVar, String str, long j10) {
        this.a = 0;
        this.c = t10Var;
        this.d = jjVar;
        this.e = str;
        this.b = j10;
    }
}
