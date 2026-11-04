package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i10(Object obj, Serializable serializable, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.d2 Q;
        int i3 = this.a;
        int i10 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                k10 k10Var = (k10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = k10Var.a;
                ArrayList arrayList = (ArrayList) k10Var.c.remove(str);
                if (arrayList != null) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        hp.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                        hp.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                        qr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        long C1 = zi.C1(tL_contacts_resolvedPeer.peer);
                        k10Var.b.put(str, new j10(C1));
                        while (i10 < arrayList.size()) {
                            ((u10) arrayList.get(i10)).a(Long.valueOf(C1));
                            i10++;
                        }
                        break;
                    } else {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((u10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            break;
                        } else {
                            while (i10 < arrayList.size()) {
                                ((u10) arrayList.get(i10)).a(null);
                                i10++;
                            }
                            String str3 = tL_error.text;
                            if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                                k5.p(null, 2131750688, org.telegram.ui.Components.fc.a0(Q), null);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                e10 e10Var = (e10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = e10Var.a;
                hp.s1(i12).Y3((ArrayList) serializable, true);
                ArrayList arrayList3 = e10Var.b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    d10 d10Var = (d10) arrayList3.get(i13);
                    if (d10Var != null) {
                        e10 e10Var2 = d10Var.i;
                        if ((ConnectionsManager.getInstance(e10Var2.a).getCurrentTime() + hp.s1(e10Var2.a).n4) - d10Var.d > 0 && !hashSet.contains(Long.valueOf(d10Var.b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                e10Var.c = true;
                e10Var.d = false;
                if (isEmpty != isEmpty2) {
                    hs.f(i12).k(hs.d3, new Object[0]);
                }
                e10Var.e();
                if (e10Var.e) {
                    e10Var.e = false;
                    e10Var.d();
                    break;
                }
                break;
        }
    }
}
