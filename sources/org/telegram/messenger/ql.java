package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ql implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ ql(qp qpVar, a0.h hVar, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                a0.h hVar = this.c;
                dt notificationsController = qpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                ij ijVar = (ij) arrayList.get(i10);
                                if (ijVar != null && (message = ijVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.b, notificationsController.currentAccount, ijVar.f1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    dt.k0.c(new zq(14, notificationsController, hVar));
                }
                k00 k00Var = qpVar.q7;
                k00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) k00Var.e.f(k00.p(((ij) arrayList2.get(i12)).f1(), -ij.B0(((ij) arrayList2.get(i12)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((ij) arrayList2.get(i12)).k;
                            hashSet.add(Long.valueOf(-ij.B0(((ij) arrayList2.get(i12)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    k00Var.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 1:
                g0.h3(new ql(this.b, this.c, 0));
                break;
            default:
                qp qpVar2 = this.b;
                a0.h hVar2 = this.c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    qpVar2.l5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                qpVar2.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
