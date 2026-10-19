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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class be1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ re1 b;

    public be1(re1 re1Var, Context context) {
        this.b = re1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        oe1 oe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        re1 re1Var = this.b;
        TopicsController topicsController = re1Var.s;
        ArrayList arrayList = re1Var.b;
        HashSet hashSet = re1Var.a0;
        long j10 = re1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                re1Var.finishFragment();
                return;
            }
            re1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                re1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                re1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                qn qnVar = new qn(bundle);
                qnVar.ja = true;
                re1Var.presentFragment(qnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = re1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = re1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
                    zd1 zd1Var = new zd1(this, this.a, i11, hVar, chatFull.id, re1Var, j11);
                    zd1Var.l0 = new ci.d1(this, j11, 11);
                    zd1Var.show();
                    break;
                }
                break;
            case 3:
                nd1 a02 = nd1.a0(j10, 0L);
                re1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new id1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    re1Var.C0 = true;
                    re1Var.N0 = true;
                    re1Var.s.pinTopic(re1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, re1Var);
                }
                re1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    re1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), re1Var.B0);
                }
                re1Var.C0();
                break;
            case 7:
                re1Var.D0(hashSet, new qy0(this, 20));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        re1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = re1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        re1Var.getMessagesStorage().updateRepliesMaxReadId(re1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                re1Var.C0();
                break;
            case 9:
            case 10:
                re1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                re1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = re1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.f5.r(re1Var, false, chat, null, false, true, false, false, new en0(21, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < re1Var.N.getChildCount()) {
                        View childAt = re1Var.N.getChildAt(i16);
                        if ((childAt instanceof oe1) && (tL_forumTopic = (oe1Var = (oe1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        oe1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((ie1) arrayList.get(i12)).c == null || ((ie1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((ie1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (re1Var.x <= 0) {
                        re1Var.E = true;
                        re1Var.y = 2;
                    }
                    re1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (oe1Var != null) {
                        re1Var.b1 = oe1Var;
                    }
                    re1Var.N.A1(!tL_forumTopic2.hidden, oe1Var);
                    re1Var.U0(true, true);
                    if (oe1Var != null) {
                        oe1Var.setTopicIcon(oe1Var.c5);
                    }
                }
                re1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(re1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = re1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                    }
                    re1Var.presentFragment(z5Var);
                    break;
                } else {
                    re1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                o21.M(-j10, re1Var);
                break;
        }
    }
}
