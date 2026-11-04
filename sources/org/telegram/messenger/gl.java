package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ gl(hp hpVar, a0.h hVar, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                hp hpVar = this.b;
                a0.h hVar = this.c;
                us notificationsController = hpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i3 = 0; i3 < hVar.m(); i3++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i3);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                zi ziVar = (zi) arrayList.get(i10);
                                if (ziVar != null && (message = ziVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.b, notificationsController.currentAccount, ziVar.f1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    us.l0.c(new pq(14, notificationsController, hVar));
                }
                c00 c00Var = hpVar.q7;
                c00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) c00Var.e.f(c00.p(((zi) arrayList2.get(i12)).f1(), -zi.B0(((zi) arrayList2.get(i12)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((zi) arrayList2.get(i12)).k;
                            hashSet.add(Long.valueOf(-zi.B0(((zi) arrayList2.get(i12)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c00Var.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 1:
                g0.h3(new gl(this.b, this.c, 0));
                break;
            default:
                hp hpVar2 = this.b;
                a0.h hVar2 = this.c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    hpVar2.l5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                hpVar2.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
