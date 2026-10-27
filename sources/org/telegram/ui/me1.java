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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class me1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cf1 b;

    public me1(cf1 cf1Var, Context context) {
        this.b = cf1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        ze1 ze1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        cf1 cf1Var = this.b;
        TopicsController topicsController = cf1Var.s;
        ArrayList arrayList = cf1Var.b;
        HashSet hashSet = cf1Var.a0;
        long j10 = cf1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                cf1Var.finishFragment();
                return;
            }
            cf1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                cf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                cf1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                wn wnVar = new wn(bundle);
                wnVar.za = true;
                cf1Var.presentFragment(wnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = cf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = cf1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
                    ke1 ke1Var = new ke1(this, this.a, i11, hVar, chatFull.id, cf1Var, j11);
                    ke1Var.l0 = new di.d1(this, j11, 11);
                    ke1Var.show();
                    break;
                }
                break;
            case 3:
                yd1 b02 = yd1.b0(j10, 0L);
                cf1Var.presentFragment(b02);
                AndroidUtilities.runOnUIThread(new td1(b02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    cf1Var.C0 = true;
                    cf1Var.N0 = true;
                    cf1Var.s.pinTopic(cf1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, cf1Var);
                }
                cf1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    cf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), cf1Var.B0);
                }
                cf1Var.C0();
                break;
            case 7:
                cf1Var.D0(hashSet, new oy0(this, 23));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        cf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = cf1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        cf1Var.getMessagesStorage().updateRepliesMaxReadId(cf1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                cf1Var.C0();
                break;
            case 9:
            case 10:
                cf1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                cf1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = cf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(cf1Var, false, chat, null, false, true, false, false, new cf0(27, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < cf1Var.N.getChildCount()) {
                        View childAt = cf1Var.N.getChildAt(i16);
                        if ((childAt instanceof ze1) && (tL_forumTopic = (ze1Var = (ze1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        ze1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((te1) arrayList.get(i12)).c == null || ((te1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((te1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (cf1Var.x <= 0) {
                        cf1Var.E = true;
                        cf1Var.y = 2;
                    }
                    cf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (ze1Var != null) {
                        cf1Var.c1 = ze1Var;
                    }
                    cf1Var.N.F1(!tL_forumTopic2.hidden, ze1Var);
                    cf1Var.V0(true, true);
                    if (ze1Var != null) {
                        ze1Var.setTopicIcon(ze1Var.c5);
                    }
                }
                cf1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(cf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    x5 x5Var = new x5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = cf1Var.X;
                    x5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                    }
                    cf1Var.presentFragment(x5Var);
                    break;
                } else {
                    cf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                x21.O(-j10, cf1Var);
                break;
        }
    }
}
