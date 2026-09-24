package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wf1 b;

    public gf1(wf1 wf1Var, Context context) {
        this.b = wf1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        tf1 tf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        wf1 wf1Var = this.b;
        TopicsController topicsController = wf1Var.s;
        ArrayList arrayList = wf1Var.b;
        HashSet hashSet = wf1Var.a0;
        long j3 = wf1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                wf1Var.finishFragment();
                return;
            }
            wf1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                wf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                wf1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                wn wnVar = new wn(bundle);
                wnVar.ja = true;
                wf1Var.presentFragment(wnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = wf1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = wf1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.i iVar = new a0.i();
                    if (chatFull.participants != null) {
                        while (i12 < chatFull.participants.participants.size()) {
                            iVar.k(null, chatFull.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j10 = chatFull.id;
                    i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
                    ef1 ef1Var = new ef1(this, this.a, i11, iVar, chatFull.id, wf1Var, j10);
                    ef1Var.l0 = new ai.z1(this, j10, 11);
                    ef1Var.show();
                    break;
                }
                break;
            case 3:
                se1 a02 = se1.a0(j3, 0L);
                wf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ne1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    wf1Var.C0 = true;
                    wf1Var.N0 = true;
                    wf1Var.s.pinTopic(wf1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, wf1Var);
                }
                wf1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    wf1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), wf1Var.B0);
                }
                wf1Var.C0();
                break;
            case 7:
                wf1Var.D0(hashSet, new vz0(this, 19));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        wf1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.id);
                        MessagesController messagesController = wf1Var.getMessagesController();
                        long j11 = -j3;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j11, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        wf1Var.getMessagesStorage().updateRepliesMaxReadId(wf1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                wf1Var.C0();
                break;
            case 9:
            case 10:
                wf1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j3, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                wf1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = wf1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(wf1Var, false, chat, null, false, true, false, false, new ds0(17, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < wf1Var.N.getChildCount()) {
                        View childAt = wf1Var.N.getChildAt(i16);
                        if ((childAt instanceof tf1) && (tL_forumTopic = (tf1Var = (tf1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        tf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((nf1) arrayList.get(i12)).c == null || ((nf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((nf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (wf1Var.x <= 0) {
                        wf1Var.E = true;
                        wf1Var.y = 2;
                    }
                    wf1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (tf1Var != null) {
                        wf1Var.b1 = tf1Var;
                    }
                    wf1Var.N.z1(!tL_forumTopic2.hidden, tf1Var);
                    wf1Var.U0(true, true);
                    if (tf1Var != null) {
                        tf1Var.setTopicIcon(tf1Var.Y4);
                    }
                }
                wf1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(wf1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wf1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    wf1Var.presentFragment(v5Var);
                    break;
                } else {
                    wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                    break;
                }
            case 15:
                t31.L(-j3, wf1Var);
                break;
        }
    }
}
