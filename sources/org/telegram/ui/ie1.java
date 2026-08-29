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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ie1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ze1 b;

    public ie1(ze1 ze1Var, Context context) {
        this.b = ze1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        we1 we1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        ze1 ze1Var = this.b;
        TopicsController topicsController = ze1Var.s;
        ArrayList arrayList = ze1Var.b;
        HashSet hashSet = ze1Var.W;
        long j10 = ze1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                ze1Var.finishFragment();
                return;
            }
            ze1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                ze1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                ze1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                tn tnVar = new tn(bundle);
                tnVar.fa = true;
                ze1Var.presentFragment(tnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = ze1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = ze1Var.F;
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
                    i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
                    ge1 ge1Var = new ge1(this, this.a, i11, hVar, chatFull.id, ze1Var, j11);
                    ge1Var.h0 = new f3.e(this, j11, 11);
                    ge1Var.show();
                    break;
                }
                break;
            case 3:
                td1 a02 = td1.a0(j10, 0L);
                ze1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new od1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    ze1Var.y0 = true;
                    ze1Var.J0 = true;
                    ze1Var.s.pinTopic(ze1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, ze1Var);
                }
                ze1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ze1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), ze1Var.x0);
                }
                ze1Var.C0();
                break;
            case 7:
                ze1Var.D0(hashSet, new ky0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        ze1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = ze1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        ze1Var.getMessagesStorage().updateRepliesMaxReadId(ze1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                ze1Var.C0();
                break;
            case 9:
            case 10:
                ze1Var.J0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                ze1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = ze1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.c5.s(ze1Var, false, chat, null, false, true, false, false, new kl0(25, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < ze1Var.J.getChildCount()) {
                        View childAt = ze1Var.J.getChildAt(i16);
                        if ((childAt instanceof we1) && (tL_forumTopic = (we1Var = (we1) childAt).J) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        we1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((pe1) arrayList.get(i12)).c == null || ((pe1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((pe1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (ze1Var.x <= 0) {
                        ze1Var.A = true;
                        ze1Var.y = 2;
                    }
                    ze1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (we1Var != null) {
                        ze1Var.X0 = we1Var;
                    }
                    ze1Var.J.z1(!tL_forumTopic2.hidden, we1Var);
                    ze1Var.U0(true, true);
                    if (we1Var != null) {
                        we1Var.setTopicIcon(we1Var.U4);
                    }
                }
                ze1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(ze1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    v5 v5Var = new v5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ze1Var.T;
                    v5Var.N = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, 0));
                    }
                    ze1Var.presentFragment(v5Var);
                    break;
                } else {
                    ze1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                y21.K(-j10, ze1Var);
                break;
        }
    }
}
