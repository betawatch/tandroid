package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class hm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ hm(wp wpVar, a0.h hVar, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                a0.h hVar = this.c;
                pt notificationsController = wpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i10 = 0; i10 < hVar.m(); i10++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i10);
                        if (arrayList != null) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                kj kjVar = (kj) arrayList.get(i11);
                                if (kjVar != null && (message = kjVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(w0.b, notificationsController.currentAccount, kjVar.f1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    pt.k0.c(new ir(12, notificationsController, hVar));
                }
                y00 y00Var = wpVar.r7;
                y00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < hVar.m(); i12++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i12);
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) y00Var.e.f(y00.p(((kj) arrayList2.get(i13)).f1(), -kj.B0(((kj) arrayList2.get(i13)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((kj) arrayList2.get(i13)).k;
                            hashSet.add(Long.valueOf(-kj.B0(((kj) arrayList2.get(i13)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    y00Var.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 1:
                i0.g3(new hm(this.b, this.c, 0));
                break;
            default:
                wp wpVar2 = this.b;
                a0.h hVar2 = this.c;
                for (int i14 = 0; i14 < hVar2.m(); i14++) {
                    wpVar2.i5(0, hVar2.j(i14), (ArrayList) hVar2.n(i14));
                }
                wpVar2.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
