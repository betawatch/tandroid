package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ gm(vp vpVar, a0.h hVar, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                a0.h hVar = this.c;
                ot notificationsController = vpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i10 = 0; i10 < hVar.m(); i10++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i10);
                        if (arrayList != null) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                jj jjVar = (jj) arrayList.get(i11);
                                if (jjVar != null && (message = jjVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(w0.b, notificationsController.currentAccount, jjVar.f1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    ot.k0.c(new hr(12, notificationsController, hVar));
                }
                x00 x00Var = vpVar.r7;
                x00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i12);
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) x00Var.e.f(x00.p(((jj) arrayList2.get(i13)).f1(), -jj.B0(((jj) arrayList2.get(i13)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((jj) arrayList2.get(i13)).k;
                            hashSet.add(Long.valueOf(-jj.B0(((jj) arrayList2.get(i13)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    x00Var.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 1:
                i0.g3(new gm(this.b, this.c, 0));
                break;
            default:
                vp vpVar2 = this.b;
                a0.h hVar2 = this.c;
                for (int i14 = 0; i14 < hVar2.m(); i14++) {
                    vpVar2.i5(0, hVar2.j(i14), (ArrayList) hVar2.n(i14));
                }
                vpVar2.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
