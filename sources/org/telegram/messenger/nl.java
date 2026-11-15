package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class nl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ nl(np npVar, a0.h hVar, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                np npVar = this.b;
                a0.h hVar = this.c;
                at notificationsController = npVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                gj gjVar = (gj) arrayList.get(i10);
                                if (gjVar != null && (message = gjVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.b, notificationsController.currentAccount, gjVar.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    at.l0.c(new pq(15, notificationsController, hVar));
                }
                h00 h00Var = npVar.r7;
                h00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) h00Var.e.f(h00.p(((gj) arrayList2.get(i12)).e1(), -gj.B0(((gj) arrayList2.get(i12)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((gj) arrayList2.get(i12)).k;
                            hashSet.add(Long.valueOf(-gj.B0(((gj) arrayList2.get(i12)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h00Var.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 1:
                g0.h3(new nl(this.b, this.c, 0));
                break;
            default:
                np npVar2 = this.b;
                a0.h hVar2 = this.c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    npVar2.m5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                npVar2.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
