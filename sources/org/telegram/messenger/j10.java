package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class j10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.g2 Q;
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                l10 l10Var = (l10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = l10Var.a;
                ArrayList arrayList = (ArrayList) l10Var.c.remove(str);
                if (arrayList != null) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        mp.u1(i11).f4(tL_contacts_resolvedPeer.users, false);
                        mp.u1(i11).Z3(tL_contacts_resolvedPeer.chats, false);
                        tr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        long B1 = fj.B1(tL_contacts_resolvedPeer.peer);
                        l10Var.b.put(str, new k10(B1));
                        while (i10 < arrayList.size()) {
                            ((w10) arrayList.get(i10)).a(Long.valueOf(B1));
                            i10++;
                        }
                        break;
                    } else {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((w10) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            break;
                        } else {
                            while (i10 < arrayList.size()) {
                                ((w10) arrayList.get(i10)).a(null);
                                i10++;
                            }
                            String str3 = tL_error.text;
                            if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                                f3.o(null, 2131750670, org.telegram.ui.Components.kc.b0(Q), null);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                f10 f10Var = (f10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = f10Var.a;
                mp.u1(i12).f4((ArrayList) serializable, true);
                ArrayList arrayList3 = f10Var.b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    e10 e10Var = (e10) arrayList3.get(i13);
                    if (e10Var != null) {
                        f10 f10Var2 = e10Var.i;
                        if ((ConnectionsManager.getInstance(f10Var2.a).getCurrentTime() + mp.u1(f10Var2.a).q4) - e10Var.d > 0 && !hashSet.contains(Long.valueOf(e10Var.b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                f10Var.c = true;
                f10Var.d = false;
                if (isEmpty != isEmpty2) {
                    ks.f(i12).k(ks.f3, new Object[0]);
                }
                f10Var.e();
                if (f10Var.e) {
                    f10Var.e = false;
                    f10Var.d();
                    break;
                }
                break;
        }
    }
}
