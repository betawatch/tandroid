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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fe1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ we1 b;

    public fe1(we1 we1Var, Context context) {
        this.b = we1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        se1 se1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        we1 we1Var = this.b;
        TopicsController topicsController = we1Var.s;
        ArrayList arrayList = we1Var.b;
        HashSet hashSet = we1Var.W;
        long j10 = we1Var.a;
        if (i9 == -1) {
            if (hashSet.size() <= 0) {
                we1Var.finishFragment();
                return;
            }
            we1Var.B0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i11 = 0;
        switch (i9) {
            case 1:
                we1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                we1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                qn qnVar = new qn(bundle);
                qnVar.fa = true;
                we1Var.presentFragment(qnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = we1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = we1Var.F;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i11 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i11).user_id);
                            i11++;
                        }
                    }
                    long j11 = chatFull.id;
                    i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
                    de1 de1Var = new de1(this, this.a, i10, hVar, chatFull.id, we1Var, j11);
                    de1Var.h0 = new d3.e(this, j11, 11);
                    de1Var.show();
                    break;
                }
                break;
            case 3:
                rd1 Z = rd1.Z(j10, 0L);
                we1Var.presentFragment(Z);
                AndroidUtilities.runOnUIThread(new md1(Z, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    we1Var.y0 = true;
                    we1Var.J0 = true;
                    we1Var.s.pinTopic(we1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i9 == 4, we1Var);
                }
                we1Var.B0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    we1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), we1Var.x0);
                }
                we1Var.B0();
                break;
            case 7:
                we1Var.C0(hashSet, new ky0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i12)).intValue());
                    if (findTopic != null) {
                        we1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = we1Var.getMessagesController();
                        long j12 = -j10;
                        int i13 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i13, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        we1Var.getMessagesStorage().updateRepliesMaxReadId(we1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                we1Var.B0();
                break;
            case 9:
            case 10:
                we1Var.J0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i14)).intValue(), i9 == 9);
                }
                we1Var.B0();
                break;
            case 11:
                TLRPC.Chat chat = we1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.y4.s(we1Var, false, chat, null, false, true, false, false, new nl0(25, this, chat));
                break;
            case 12:
            case 13:
                int i15 = 0;
                while (true) {
                    if (i15 < we1Var.J.getChildCount()) {
                        View childAt = we1Var.J.getChildAt(i15);
                        if ((childAt instanceof se1) && (tL_forumTopic = (se1Var = (se1) childAt).J) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i15++;
                        }
                    } else {
                        se1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (arrayList.get(i11) == null || ((me1) arrayList.get(i11)).c == null || ((me1) arrayList.get(i11)).c.id != 1) {
                                i11++;
                            } else {
                                tL_forumTopic2 = ((me1) arrayList.get(i11)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (we1Var.x <= 0) {
                        we1Var.A = true;
                        we1Var.y = 2;
                    }
                    we1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (se1Var != null) {
                        we1Var.X0 = se1Var;
                    }
                    we1Var.J.z1(!tL_forumTopic2.hidden, se1Var);
                    we1Var.U0(true, true);
                    if (se1Var != null) {
                        se1Var.setTopicIcon(se1Var.U4);
                    }
                }
                we1Var.B0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(we1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    u5 u5Var = new u5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = we1Var.T;
                    u5Var.N = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        u5Var.getMessagesController().getBoostsController().userCanBoostChannel(u5Var.L, u5Var.N, new m5(u5Var, 0));
                    }
                    we1Var.presentFragment(u5Var);
                    break;
                } else {
                    we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                y21.K(-j10, we1Var);
                break;
        }
    }
}
