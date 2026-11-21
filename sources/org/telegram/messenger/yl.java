package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class yl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ yl(mp mpVar, a0.h hVar, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                mp mpVar = this.b;
                a0.h hVar = this.c;
                xs notificationsController = mpVar.getNotificationsController();
                notificationsController.getClass();
                if (hVar.m() != 0) {
                    for (int i7 = 0; i7 < hVar.m(); i7++) {
                        ArrayList arrayList = (ArrayList) hVar.n(i7);
                        if (arrayList != null) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                fj fjVar = (fj) arrayList.get(i10);
                                if (fjVar != null && (message = fjVar.k) != null) {
                                    TLRPC.MessageAction messageAction = message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed) {
                                            VoIPGroupNotification.hide(t0.b, notificationsController.currentAccount, fjVar.e1());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    new ArrayList(0);
                    xs.l0.c(new rq(16, notificationsController, hVar));
                }
                e00 e00Var = mpVar.t7;
                e00Var.getClass();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    ArrayList arrayList2 = (ArrayList) hVar.n(i11);
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) e00Var.e.f(e00.p(((fj) arrayList2.get(i12)).e1(), -fj.B0(((fj) arrayList2.get(i12)).k)));
                        if (tL_forumTopic != null) {
                            tL_forumTopic.topMessage = ((fj) arrayList2.get(i12)).k;
                            hashSet.add(Long.valueOf(-fj.B0(((fj) arrayList2.get(i12)).k)));
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e00Var.y(((Long) it.next()).longValue(), true);
                }
                break;
            case 1:
                g0.g3(new yl(this.b, this.c, 0));
                break;
            default:
                mp mpVar2 = this.b;
                a0.h hVar2 = this.c;
                for (int i13 = 0; i13 < hVar2.m(); i13++) {
                    mpVar2.x5(0, hVar2.j(i13), (ArrayList) hVar2.n(i13));
                }
                mpVar2.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
