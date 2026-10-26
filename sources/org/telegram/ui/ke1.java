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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ke1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ af1 b;

    public ke1(af1 af1Var, Context context) {
        this.b = af1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        xe1 xe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        af1 af1Var = this.b;
        TopicsController topicsController = af1Var.s;
        ArrayList arrayList = af1Var.b;
        HashSet hashSet = af1Var.a0;
        long j10 = af1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                af1Var.finishFragment();
                return;
            }
            af1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                af1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                af1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                un unVar = new un(bundle);
                unVar.va = true;
                af1Var.presentFragment(unVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = af1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = af1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
                    ie1 ie1Var = new ie1(this, this.a, i11, hVar, chatFull.id, af1Var, j11);
                    ie1Var.l0 = new di.d1(this, j11, 11);
                    ie1Var.show();
                    break;
                }
                break;
            case 3:
                wd1 b02 = wd1.b0(j10, 0L);
                af1Var.presentFragment(b02);
                AndroidUtilities.runOnUIThread(new rd1(b02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    af1Var.C0 = true;
                    af1Var.N0 = true;
                    af1Var.s.pinTopic(af1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, af1Var);
                }
                af1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    af1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), af1Var.B0);
                }
                af1Var.C0();
                break;
            case 7:
                af1Var.D0(hashSet, new my0(this, 23));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        af1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = af1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        af1Var.getMessagesStorage().updateRepliesMaxReadId(af1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                af1Var.C0();
                break;
            case 9:
            case 10:
                af1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                af1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = af1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(af1Var, false, chat, null, false, true, false, false, new af0(27, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < af1Var.N.getChildCount()) {
                        View childAt = af1Var.N.getChildAt(i16);
                        if ((childAt instanceof xe1) && (tL_forumTopic = (xe1Var = (xe1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        xe1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((re1) arrayList.get(i12)).c == null || ((re1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((re1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (af1Var.x <= 0) {
                        af1Var.E = true;
                        af1Var.y = 2;
                    }
                    af1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (xe1Var != null) {
                        af1Var.c1 = xe1Var;
                    }
                    af1Var.N.F1(!tL_forumTopic2.hidden, xe1Var);
                    af1Var.V0(true, true);
                    if (xe1Var != null) {
                        xe1Var.setTopicIcon(xe1Var.c5);
                    }
                }
                af1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(af1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    x5 x5Var = new x5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = af1Var.X;
                    x5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                    }
                    af1Var.presentFragment(x5Var);
                    break;
                } else {
                    af1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                v21.O(-j10, af1Var);
                break;
        }
    }
}
