package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h91 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ w91 b;

    public h91(w91 w91Var, Context context) {
        this.b = w91Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        t91 t91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        w91 w91Var = this.b;
        org.telegram.messenger.d00 d00Var = w91Var.s;
        ArrayList arrayList = w91Var.b;
        HashSet hashSet = w91Var.b0;
        long j3 = w91Var.a;
        if (i7 == -1) {
            if (hashSet.size() <= 0) {
                w91Var.finishFragment();
                return;
            }
            w91Var.G0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i11 = 0;
        switch (i7) {
            case 1:
                org.telegram.messenger.d00 d00Var2 = w91Var.getMessagesController().t7;
                d00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = d00Var2.getMessagesController().j1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                d00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(d00Var2, 7));
                w91Var.J = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bn bnVar = new bn(bundle);
                bnVar.Ga = true;
                w91Var.presentFragment(bnVar);
                break;
            case 2:
                TLRPC.ChatFull P0 = w91Var.getMessagesController().P0(j3);
                TLRPC.ChatFull chatFull = w91Var.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    P0.participants = chatParticipants;
                }
                if (P0 != null) {
                    a0.h hVar = new a0.h();
                    if (P0.participants != null) {
                        while (i11 < P0.participants.participants.size()) {
                            hVar.k(null, P0.participants.participants.get(i11).user_id);
                            i11++;
                        }
                    }
                    long j10 = P0.id;
                    i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
                    f91 f91Var = new f91(this, this.a, i10, hVar, P0.id, w91Var, j10);
                    f91Var.g2 = new ai.z(this, j10, 11);
                    f91Var.show();
                    break;
                }
                break;
            case 3:
                u81 f02 = u81.f0(j3, 0L);
                w91Var.presentFragment(f02);
                org.telegram.messenger.g0.h3(new p81(f02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    w91Var.D0 = true;
                    w91Var.O0 = true;
                    w91Var.s.t(w91Var.a, ((Integer) hashSet.iterator().next()).intValue(), i7 == 4, w91Var);
                }
                w91Var.G0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), w91Var.C0);
                }
                w91Var.G0();
                break;
            case 7:
                w91Var.H0(hashSet, new qu0(this, 22));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic f10 = d00Var.f(j3, ((Integer) arrayList2.get(i12)).intValue());
                    if (f10 != null) {
                        w91Var.getMessagesController().v3(-j3, f10.id);
                        org.telegram.messenger.mp messagesController = w91Var.getMessagesController();
                        long j11 = -j3;
                        int i13 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        messagesController.q3(j11, i13, 0, message != null ? message.date : 0, false, f10.id, 0, true, 0);
                        w91Var.getMessagesStorage().d2(w91Var.a, f10.id, f10.top_message, 0);
                    }
                }
                w91Var.G0();
                break;
            case 9:
            case 10:
                w91Var.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    d00Var.z(((Integer) arrayList3.get(i14)).intValue(), j3, i7 == 9);
                }
                w91Var.G0();
                break;
            case 11:
                TLRPC.Chat O0 = w91Var.getMessagesController().O0(Long.valueOf(j3));
                org.telegram.ui.Components.b5.r(w91Var, false, O0, null, false, true, false, false, new yi0(23, this, O0));
                break;
            case 12:
            case 13:
                int i15 = 0;
                while (true) {
                    if (i15 < w91Var.O.getChildCount()) {
                        View childAt = w91Var.O.getChildAt(i15);
                        if ((childAt instanceof t91) && (tL_forumTopic = (t91Var = (t91) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i15++;
                        }
                    } else {
                        t91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (arrayList.get(i11) == null || ((o91) arrayList.get(i11)).c == null || ((o91) arrayList.get(i11)).c.id != 1) {
                                i11++;
                            } else {
                                tL_forumTopic2 = ((o91) arrayList.get(i11)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (w91Var.y <= 0) {
                        w91Var.F = true;
                        w91Var.E = 2;
                    }
                    w91Var.getMessagesController().t7.A(1, j3, tL_forumTopic2.hidden);
                    if (t91Var != null) {
                        w91Var.d1 = t91Var;
                    }
                    w91Var.O.B1(!tL_forumTopic2.hidden, t91Var);
                    w91Var.Z0(true, true);
                    if (t91Var != null) {
                        t91Var.setTopicIcon(t91Var.d5);
                    }
                }
                w91Var.G0();
                break;
            case 14:
                if (org.telegram.messenger.v3.N(w91Var.getMessagesController().O0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w91Var.Y;
                    t5Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                    }
                    w91Var.presentFragment(t5Var);
                    break;
                } else {
                    w91Var.getNotificationCenter().k(org.telegram.messenger.ks.p3, Long.valueOf(-j3));
                    break;
                }
            case 15:
                py0.L0(-j3, w91Var);
                break;
        }
    }
}
