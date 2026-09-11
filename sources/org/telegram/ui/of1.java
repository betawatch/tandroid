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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class of1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ eg1 b;

    public of1(eg1 eg1Var, Context context) {
        this.b = eg1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        bg1 bg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        eg1 eg1Var = this.b;
        TopicsController topicsController = eg1Var.s;
        ArrayList arrayList = eg1Var.b;
        HashSet hashSet = eg1Var.a0;
        long j3 = eg1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                eg1Var.finishFragment();
                return;
            }
            eg1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                eg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                eg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                co coVar = new co(bundle);
                coVar.ja = true;
                eg1Var.presentFragment(coVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = eg1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = eg1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
                    mf1 mf1Var = new mf1(this, this.a, i11, iVar, chatFull.id, eg1Var, j10);
                    mf1Var.l0 = new bi.p1(this, j10, 11);
                    mf1Var.show();
                    break;
                }
                break;
            case 3:
                af1 a02 = af1.a0(j3, 0L);
                eg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ve1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    eg1Var.C0 = true;
                    eg1Var.N0 = true;
                    eg1Var.s.pinTopic(eg1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, eg1Var);
                }
                eg1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    eg1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), eg1Var.B0);
                }
                eg1Var.C0();
                break;
            case 7:
                eg1Var.D0(hashSet, new f01(this, 19));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        eg1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.id);
                        MessagesController messagesController = eg1Var.getMessagesController();
                        long j11 = -j3;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j11, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        eg1Var.getMessagesStorage().updateRepliesMaxReadId(eg1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                eg1Var.C0();
                break;
            case 9:
            case 10:
                eg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j3, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                eg1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = eg1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(eg1Var, false, chat, null, false, true, false, false, new qv0(16, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < eg1Var.N.getChildCount()) {
                        View childAt = eg1Var.N.getChildAt(i16);
                        if ((childAt instanceof bg1) && (tL_forumTopic = (bg1Var = (bg1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        bg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((vf1) arrayList.get(i12)).c == null || ((vf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((vf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (eg1Var.x <= 0) {
                        eg1Var.E = true;
                        eg1Var.y = 2;
                    }
                    eg1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (bg1Var != null) {
                        eg1Var.b1 = bg1Var;
                    }
                    eg1Var.N.y1(!tL_forumTopic2.hidden, bg1Var);
                    eg1Var.U0(true, true);
                    if (bg1Var != null) {
                        bg1Var.setTopicIcon(bg1Var.Y4);
                    }
                }
                eg1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(eg1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = eg1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    eg1Var.presentFragment(v5Var);
                    break;
                } else {
                    eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                    break;
                }
            case 15:
                e41.L(-j3, eg1Var);
                break;
        }
    }
}
