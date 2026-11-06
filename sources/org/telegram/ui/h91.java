package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ v91 b;

    public h91(v91 v91Var, Context context) {
        this.b = v91Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        s91 s91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        v91 v91Var = this.b;
        org.telegram.messenger.k00 k00Var = v91Var.s;
        ArrayList arrayList = v91Var.b;
        HashSet hashSet = v91Var.a0;
        long j3 = v91Var.a;
        if (i7 == -1) {
            if (hashSet.size() <= 0) {
                v91Var.finishFragment();
                return;
            }
            v91Var.G0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i11 = 0;
        switch (i7) {
            case 1:
                org.telegram.messenger.k00 k00Var2 = v91Var.getMessagesController().q7;
                k00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = k00Var2.getMessagesController().h1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                k00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var2, 7));
                v91Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                an anVar = new an(bundle);
                anVar.Ca = true;
                v91Var.presentFragment(anVar);
                break;
            case 2:
                TLRPC.ChatFull N0 = v91Var.getMessagesController().N0(j3);
                TLRPC.ChatFull chatFull = v91Var.J;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    N0.participants = chatParticipants;
                }
                if (N0 != null) {
                    a0.h hVar = new a0.h();
                    if (N0.participants != null) {
                        while (i11 < N0.participants.participants.size()) {
                            hVar.k(null, N0.participants.participants.get(i11).user_id);
                            i11++;
                        }
                    }
                    long j10 = N0.id;
                    i10 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
                    f91 f91Var = new f91(this, this.a, i10, hVar, N0.id, v91Var, j10);
                    f91Var.c2 = new di.c1(this, j10, 10);
                    f91Var.show();
                    break;
                }
                break;
            case 3:
                u81 f02 = u81.f0(j3, 0L);
                v91Var.presentFragment(f02);
                org.telegram.messenger.g0.i3(new o81(f02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    v91Var.C0 = true;
                    v91Var.N0 = true;
                    v91Var.s.t(v91Var.a, ((Integer) hashSet.iterator().next()).intValue(), i7 == 4, v91Var);
                }
                v91Var.G0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    v91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), v91Var.B0);
                }
                v91Var.G0();
                break;
            case 7:
                v91Var.H0(hashSet, new qu0(this, 22));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic f10 = k00Var.f(j3, ((Integer) arrayList2.get(i12)).intValue());
                    if (f10 != null) {
                        v91Var.getMessagesController().o3(-j3, f10.id);
                        org.telegram.messenger.qp messagesController = v91Var.getMessagesController();
                        long j11 = -j3;
                        int i13 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        messagesController.j3(j11, i13, 0, message != null ? message.date : 0, false, f10.id, 0, true, 0);
                        v91Var.getMessagesStorage().d2(v91Var.a, f10.id, f10.top_message, 0);
                    }
                }
                v91Var.G0();
                break;
            case 9:
            case 10:
                v91Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    k00Var.z(((Integer) arrayList3.get(i14)).intValue(), j3, i7 == 9);
                }
                v91Var.G0();
                break;
            case 11:
                TLRPC.Chat M0 = v91Var.getMessagesController().M0(Long.valueOf(j3));
                org.telegram.ui.Components.v4.r(v91Var, false, M0, null, false, true, false, false, new lk0(20, this, M0));
                break;
            case 12:
            case 13:
                int i15 = 0;
                while (true) {
                    if (i15 < v91Var.N.getChildCount()) {
                        View childAt = v91Var.N.getChildAt(i15);
                        if ((childAt instanceof s91) && (tL_forumTopic = (s91Var = (s91) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i15++;
                        }
                    } else {
                        s91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (arrayList.get(i11) == null || ((n91) arrayList.get(i11)).c == null || ((n91) arrayList.get(i11)).c.id != 1) {
                                i11++;
                            } else {
                                tL_forumTopic2 = ((n91) arrayList.get(i11)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (v91Var.y <= 0) {
                        v91Var.E = true;
                        v91Var.D = 2;
                    }
                    v91Var.getMessagesController().q7.A(1, j3, tL_forumTopic2.hidden);
                    if (s91Var != null) {
                        v91Var.c1 = s91Var;
                    }
                    v91Var.N.B1(!tL_forumTopic2.hidden, s91Var);
                    v91Var.Z0(true, true);
                    if (s91Var != null) {
                        s91Var.setTopicIcon(s91Var.c5);
                    }
                }
                v91Var.G0();
                break;
            case 14:
                if (org.telegram.messenger.t3.N(v91Var.getMessagesController().M0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v91Var.X;
                    t5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                    }
                    v91Var.presentFragment(t5Var);
                    break;
                } else {
                    v91Var.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(-j3));
                    break;
                }
            case 15:
                oy0.K0(-j3, v91Var);
                break;
        }
    }
}
