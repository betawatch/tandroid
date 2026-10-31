package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bb1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ pb1 b;

    public bb1(pb1 pb1Var, Context context) {
        this.b = pb1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        mb1 mb1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        pb1 pb1Var = this.b;
        org.telegram.messenger.x00 x00Var = pb1Var.s;
        ArrayList arrayList = pb1Var.b;
        HashSet hashSet = pb1Var.a0;
        long j10 = pb1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                pb1Var.finishFragment();
                return;
            }
            pb1Var.F0();
        }
        int i12 = 9;
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                org.telegram.messenger.x00 x00Var2 = pb1Var.getMessagesController().r7;
                x00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = x00Var2.getMessagesController().g1(j10);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                x00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.v1(x00Var2, 7));
                pb1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                un unVar = new un(bundle);
                unVar.Ca = true;
                pb1Var.presentFragment(unVar);
                break;
            case 2:
                TLRPC.ChatFull M0 = pb1Var.getMessagesController().M0(j10);
                TLRPC.ChatFull chatFull = pb1Var.J;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    M0.participants = chatParticipants;
                }
                if (M0 != null) {
                    a0.h hVar = new a0.h();
                    if (M0.participants != null) {
                        while (i13 < M0.participants.participants.size()) {
                            hVar.k(null, M0.participants.participants.get(i13).user_id);
                            i13++;
                        }
                    }
                    long j11 = M0.id;
                    i11 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
                    za1 za1Var = new za1(this, this.a, i11, hVar, M0.id, pb1Var, j11);
                    za1Var.c2 = new m4.x0(this, j11, i12);
                    za1Var.show();
                    break;
                }
                break;
            case 3:
                la1 e02 = la1.e0(j10, 0L);
                pb1Var.presentFragment(e02);
                org.telegram.messenger.i0.h3(new ga1(e02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    pb1Var.C0 = true;
                    pb1Var.N0 = true;
                    pb1Var.s.t(pb1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, pb1Var);
                }
                pb1Var.F0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    pb1Var.getNotificationsController().G(-j10, ((Integer) it.next()).intValue(), pb1Var.B0);
                }
                pb1Var.F0();
                break;
            case 7:
                pb1Var.G0(hashSet, new wv0(this, 24));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic f7 = x00Var.f(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (f7 != null) {
                        pb1Var.getMessagesController().l3(-j10, f7.id);
                        org.telegram.messenger.vp messagesController = pb1Var.getMessagesController();
                        long j12 = -j10;
                        int i15 = f7.top_message;
                        TLRPC.Message message = f7.topMessage;
                        messagesController.h3(j12, i15, 0, message != null ? message.date : 0, false, f7.id, 0, true, 0);
                        pb1Var.getMessagesStorage().d2(pb1Var.a, f7.id, f7.top_message, 0);
                    }
                }
                pb1Var.F0();
                break;
            case 9:
            case 10:
                pb1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    x00Var.z(((Integer) arrayList3.get(i16)).intValue(), j10, i10 == 9);
                }
                pb1Var.F0();
                break;
            case 11:
                TLRPC.Chat L0 = pb1Var.getMessagesController().L0(Long.valueOf(j10));
                org.telegram.ui.Components.s4.r(pb1Var, false, L0, null, false, true, false, false, new ep0(19, this, L0));
                break;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < pb1Var.N.getChildCount()) {
                        View childAt = pb1Var.N.getChildAt(i17);
                        if ((childAt instanceof mb1) && (tL_forumTopic = (mb1Var = (mb1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        mb1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) == null || ((hb1) arrayList.get(i13)).c == null || ((hb1) arrayList.get(i13)).c.id != 1) {
                                i13++;
                            } else {
                                tL_forumTopic2 = ((hb1) arrayList.get(i13)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (pb1Var.y <= 0) {
                        pb1Var.E = true;
                        pb1Var.D = 2;
                    }
                    pb1Var.getMessagesController().r7.A(1, j10, tL_forumTopic2.hidden);
                    if (mb1Var != null) {
                        pb1Var.c1 = mb1Var;
                    }
                    pb1Var.N.B1(!tL_forumTopic2.hidden, mb1Var);
                    pb1Var.Y0(true, true);
                    if (mb1Var != null) {
                        mb1Var.setTopicIcon(mb1Var.c5);
                    }
                }
                pb1Var.F0();
                break;
            case 14:
                if (org.telegram.messenger.w3.N(pb1Var.getMessagesController().L0(Long.valueOf(j10)))) {
                    t5 t5Var = new t5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pb1Var.X;
                    t5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new k5(t5Var, 0));
                    }
                    pb1Var.presentFragment(t5Var);
                    break;
                } else {
                    pb1Var.getNotificationCenter().k(org.telegram.messenger.zs.n3, Long.valueOf(-j10));
                    break;
                }
            case 15:
                c01.K0(-j10, pb1Var);
                break;
        }
    }
}
