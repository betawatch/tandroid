package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q10(Object obj, Serializable serializable, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.f2 Q;
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                s10 s10Var = (s10) obj3;
                String str = (String) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                int i11 = s10Var.a;
                ArrayList arrayList = (ArrayList) s10Var.c.remove(str);
                if (arrayList != null) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        qp.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                        qp.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                        yr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        long C1 = ij.C1(tL_contacts_resolvedPeer.peer);
                        s10Var.b.put(str, new r10(C1));
                        while (i10 < arrayList.size()) {
                            ((c20) arrayList.get(i10)).a(Long.valueOf(C1));
                            i10++;
                        }
                        break;
                    } else {
                        String str2 = tL_error.text;
                        if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                            while (i10 < arrayList.size()) {
                                ((c20) arrayList.get(i10)).a(Long.MAX_VALUE);
                                i10++;
                            }
                            break;
                        } else {
                            while (i10 < arrayList.size()) {
                                ((c20) arrayList.get(i10)).a(null);
                                i10++;
                            }
                            String str3 = tL_error.text;
                            if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                                k5.p(null, 2131750688, org.telegram.ui.Components.hc.a0(Q), null);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                m10 m10Var = (m10) obj3;
                HashSet hashSet = (HashSet) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i12 = m10Var.a;
                qp.s1(i12).Y3((ArrayList) serializable, true);
                ArrayList arrayList3 = m10Var.b;
                boolean isEmpty = arrayList3.isEmpty();
                int i13 = 0;
                while (i13 < arrayList3.size()) {
                    l10 l10Var = (l10) arrayList3.get(i13);
                    if (l10Var != null) {
                        m10 m10Var2 = l10Var.i;
                        if ((ConnectionsManager.getInstance(m10Var2.a).getCurrentTime() + qp.s1(m10Var2.a).n4) - l10Var.d > 0 && !hashSet.contains(Long.valueOf(l10Var.b))) {
                            i13++;
                        }
                    }
                    arrayList3.remove(i13);
                    i13--;
                    i13++;
                }
                arrayList3.addAll(arrayList2);
                boolean isEmpty2 = arrayList3.isEmpty();
                m10Var.c = true;
                m10Var.d = false;
                if (isEmpty != isEmpty2) {
                    qs.f(i12).k(qs.d3, new Object[0]);
                }
                m10Var.e();
                if (m10Var.e) {
                    m10Var.e = false;
                    m10Var.d();
                    break;
                }
                break;
        }
    }
}
