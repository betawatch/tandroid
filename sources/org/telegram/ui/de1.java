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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class de1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ te1 b;

    public de1(te1 te1Var, Context context) {
        this.b = te1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        qe1 qe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        te1 te1Var = this.b;
        TopicsController topicsController = te1Var.s;
        ArrayList arrayList = te1Var.b;
        HashSet hashSet = te1Var.a0;
        long j10 = te1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                te1Var.finishFragment();
                return;
            }
            te1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                te1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                te1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                sn snVar = new sn(bundle);
                snVar.ja = true;
                te1Var.presentFragment(snVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = te1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = te1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i12 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j11 = chatFull.id;
                    i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
                    be1 be1Var = new be1(this, this.a, i11, hVar, chatFull.id, te1Var, j11);
                    be1Var.l0 = new ci.d1(this, j11, 11);
                    be1Var.show();
                    break;
                }
                break;
            case 3:
                pd1 a02 = pd1.a0(j10, 0L);
                te1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new kd1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    te1Var.C0 = true;
                    te1Var.N0 = true;
                    te1Var.s.pinTopic(te1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, te1Var);
                }
                te1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    te1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), te1Var.B0);
                }
                te1Var.C0();
                break;
            case 7:
                te1Var.D0(hashSet, new sy0(this, 20));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        te1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = te1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        te1Var.getMessagesStorage().updateRepliesMaxReadId(te1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                te1Var.C0();
                break;
            case 9:
            case 10:
                te1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                te1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = te1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.f5.r(te1Var, false, chat, null, false, true, false, false, new gn0(21, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < te1Var.N.getChildCount()) {
                        View childAt = te1Var.N.getChildAt(i16);
                        if ((childAt instanceof qe1) && (tL_forumTopic = (qe1Var = (qe1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        qe1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((ke1) arrayList.get(i12)).c == null || ((ke1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((ke1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (te1Var.x <= 0) {
                        te1Var.E = true;
                        te1Var.y = 2;
                    }
                    te1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (qe1Var != null) {
                        te1Var.b1 = qe1Var;
                    }
                    te1Var.N.A1(!tL_forumTopic2.hidden, qe1Var);
                    te1Var.U0(true, true);
                    if (qe1Var != null) {
                        qe1Var.setTopicIcon(qe1Var.c5);
                    }
                }
                te1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(te1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = te1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                    }
                    te1Var.presentFragment(z5Var);
                    break;
                } else {
                    te1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                q21.M(-j10, te1Var);
                break;
        }
    }
}
