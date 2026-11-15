package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class n10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.e2 Q;
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                p10 p10Var = (p10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = p10Var.a;
                ArrayList arrayList = (ArrayList) p10Var.c.remove(str);
                if (arrayList != null) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        np.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                        np.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                        vr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        long B1 = gj.B1(tL_contacts_resolvedPeer.peer);
                        p10Var.b.put(str, new o10(B1));
                        while (i10 < arrayList.size()) {
                            ((z10) arrayList.get(i10)).a(Long.valueOf(B1));
                            i10++;
                        }
                        break;
                    } else {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((z10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            break;
                        } else {
                            while (i10 < arrayList.size()) {
                                ((z10) arrayList.get(i10)).a(null);
                                i10++;
                            }
                            String str3 = tL_error.text;
                            if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                                k5.o(null, 2131750687, org.telegram.ui.Components.cc.a0(Q), null);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                j10 j10Var = (j10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = j10Var.a;
                np.s1(i12).Y3((ArrayList) serializable, true);
                ArrayList arrayList3 = j10Var.b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    i10 i10Var = (i10) arrayList3.get(i13);
                    if (i10Var != null) {
                        j10 j10Var2 = i10Var.i;
                        if ((ConnectionsManager.getInstance(j10Var2.a).getCurrentTime() + np.s1(j10Var2.a).o4) - i10Var.d > 0 && !hashSet.contains(Long.valueOf(i10Var.b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                j10Var.c = true;
                j10Var.d = false;
                if (isEmpty != isEmpty2) {
                    ns.f(i12).k(ns.d3, new Object[0]);
                }
                j10Var.e();
                if (j10Var.e) {
                    j10Var.e = false;
                    j10Var.d();
                    break;
                }
                break;
        }
    }
}
