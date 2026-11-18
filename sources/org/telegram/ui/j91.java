package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j91 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ y91 b;

    public j91(y91 y91Var, Context context) {
        this.b = y91Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        v91 v91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        y91 y91Var = this.b;
        org.telegram.messenger.e00 e00Var = y91Var.s;
        ArrayList arrayList = y91Var.b;
        HashSet hashSet = y91Var.b0;
        long j3 = y91Var.a;
        if (i7 == -1) {
            if (hashSet.size() <= 0) {
                y91Var.finishFragment();
                return;
            }
            y91Var.G0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i11 = 0;
        switch (i7) {
            case 1:
                org.telegram.messenger.e00 e00Var2 = y91Var.getMessagesController().t7;
                e00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = e00Var2.getMessagesController().j1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                e00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(e00Var2, 7));
                y91Var.J = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bn bnVar = new bn(bundle);
                bnVar.Ga = true;
                y91Var.presentFragment(bnVar);
                break;
            case 2:
                TLRPC.ChatFull P0 = y91Var.getMessagesController().P0(j3);
                TLRPC.ChatFull chatFull = y91Var.K;
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
                    i10 = ((org.telegram.ui.ActionBar.h2) y91Var).currentAccount;
                    h91 h91Var = new h91(this, this.a, i10, hVar, P0.id, y91Var, j10);
                    h91Var.g2 = new ai.d0(this, j10, 11);
                    h91Var.show();
                    break;
                }
                break;
            case 3:
                w81 f02 = w81.f0(j3, 0L);
                y91Var.presentFragment(f02);
                org.telegram.messenger.g0.h3(new r81(f02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    y91Var.D0 = true;
                    y91Var.O0 = true;
                    y91Var.s.t(y91Var.a, ((Integer) hashSet.iterator().next()).intValue(), i7 == 4, y91Var);
                }
                y91Var.G0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    y91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), y91Var.C0);
                }
                y91Var.G0();
                break;
            case 7:
                y91Var.H0(hashSet, new ru0(this, 22));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic f10 = e00Var.f(j3, ((Integer) arrayList2.get(i12)).intValue());
                    if (f10 != null) {
                        y91Var.getMessagesController().v3(-j3, f10.id);
                        org.telegram.messenger.mp messagesController = y91Var.getMessagesController();
                        long j11 = -j3;
                        int i13 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        messagesController.q3(j11, i13, 0, message != null ? message.date : 0, false, f10.id, 0, true, 0);
                        y91Var.getMessagesStorage().d2(y91Var.a, f10.id, f10.top_message, 0);
                    }
                }
                y91Var.G0();
                break;
            case 9:
            case 10:
                y91Var.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    e00Var.z(((Integer) arrayList3.get(i14)).intValue(), j3, i7 == 9);
                }
                y91Var.G0();
                break;
            case 11:
                TLRPC.Chat O0 = y91Var.getMessagesController().O0(Long.valueOf(j3));
                org.telegram.ui.Components.b5.r(y91Var, false, O0, null, false, true, false, false, new aj0(23, this, O0));
                break;
            case 12:
            case 13:
                int i15 = 0;
                while (true) {
                    if (i15 < y91Var.O.getChildCount()) {
                        View childAt = y91Var.O.getChildAt(i15);
                        if ((childAt instanceof v91) && (tL_forumTopic = (v91Var = (v91) childAt).O) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i15++;
                        }
                    } else {
                        v91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (arrayList.get(i11) == null || ((q91) arrayList.get(i11)).c == null || ((q91) arrayList.get(i11)).c.id != 1) {
                                i11++;
                            } else {
                                tL_forumTopic2 = ((q91) arrayList.get(i11)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (y91Var.y <= 0) {
                        y91Var.F = true;
                        y91Var.E = 2;
                    }
                    y91Var.getMessagesController().t7.A(1, j3, tL_forumTopic2.hidden);
                    if (v91Var != null) {
                        y91Var.d1 = v91Var;
                    }
                    y91Var.O.B1(!tL_forumTopic2.hidden, v91Var);
                    y91Var.Z0(true, true);
                    if (v91Var != null) {
                        v91Var.setTopicIcon(v91Var.d5);
                    }
                }
                y91Var.G0();
                break;
            case 14:
                if (org.telegram.messenger.v3.N(y91Var.getMessagesController().O0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = y91Var.Y;
                    t5Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                    }
                    y91Var.presentFragment(t5Var);
                    break;
                } else {
                    y91Var.getNotificationCenter().k(org.telegram.messenger.ks.p3, Long.valueOf(-j3));
                    break;
                }
            case 15:
                qy0.L0(-j3, y91Var);
                break;
        }
    }
}
