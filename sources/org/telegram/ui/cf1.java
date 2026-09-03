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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ sf1 b;

    public cf1(sf1 sf1Var, Context context) {
        this.b = sf1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        pf1 pf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        sf1 sf1Var = this.b;
        TopicsController topicsController = sf1Var.s;
        ArrayList arrayList = sf1Var.b;
        HashSet hashSet = sf1Var.X;
        long j10 = sf1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                sf1Var.finishFragment();
                return;
            }
            sf1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                sf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                sf1Var.F = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                zn znVar = new zn(bundle);
                znVar.ga = true;
                sf1Var.presentFragment(znVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = sf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = sf1Var.G;
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
                    i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
                    af1 af1Var = new af1(this, this.a, i11, hVar, chatFull.id, sf1Var, j11);
                    af1Var.i0 = new f3.e(this, j11, 10);
                    af1Var.show();
                    break;
                }
                break;
            case 3:
                ne1 a02 = ne1.a0(j10, 0L);
                sf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ie1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    sf1Var.z0 = true;
                    sf1Var.K0 = true;
                    sf1Var.s.pinTopic(sf1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, sf1Var);
                }
                sf1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    sf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), sf1Var.y0);
                }
                sf1Var.C0();
                break;
            case 7:
                sf1Var.D0(hashSet, new sz0(this, 19));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        sf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = sf1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        sf1Var.getMessagesStorage().updateRepliesMaxReadId(sf1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                sf1Var.C0();
                break;
            case 9:
            case 10:
                sf1Var.K0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                sf1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = sf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.z4.s(sf1Var, false, chat, null, false, true, false, false, new vl0(24, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < sf1Var.K.getChildCount()) {
                        View childAt = sf1Var.K.getChildAt(i16);
                        if ((childAt instanceof pf1) && (tL_forumTopic = (pf1Var = (pf1) childAt).K) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        pf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((jf1) arrayList.get(i12)).c == null || ((jf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((jf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (sf1Var.x <= 0) {
                        sf1Var.B = true;
                        sf1Var.y = 2;
                    }
                    sf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (pf1Var != null) {
                        sf1Var.Y0 = pf1Var;
                    }
                    sf1Var.K.y1(!tL_forumTopic2.hidden, pf1Var);
                    sf1Var.U0(true, true);
                    if (pf1Var != null) {
                        pf1Var.setTopicIcon(pf1Var.V4);
                    }
                }
                sf1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(sf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    a6 a6Var = new a6(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sf1Var.U;
                    a6Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        a6Var.getMessagesController().getBoostsController().userCanBoostChannel(a6Var.M, a6Var.O, new r5(a6Var, 0));
                    }
                    sf1Var.presentFragment(a6Var);
                    break;
                } else {
                    sf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                q31.K(-j10, sf1Var);
                break;
        }
    }
}
