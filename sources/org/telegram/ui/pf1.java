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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ fg1 b;

    public pf1(fg1 fg1Var, Context context) {
        this.b = fg1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        cg1 cg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        fg1 fg1Var = this.b;
        TopicsController topicsController = fg1Var.s;
        ArrayList arrayList = fg1Var.b;
        HashSet hashSet = fg1Var.a0;
        long j3 = fg1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                fg1Var.finishFragment();
                return;
            }
            fg1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                fg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                fg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                zn znVar = new zn(bundle);
                znVar.ja = true;
                fg1Var.presentFragment(znVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = fg1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = fg1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.n2) fg1Var).currentAccount;
                    nf1 nf1Var = new nf1(this, this.a, i11, iVar, chatFull.id, fg1Var, j10);
                    nf1Var.l0 = new ai.z1(this, j10, 11);
                    nf1Var.show();
                    break;
                }
                break;
            case 3:
                bf1 a02 = bf1.a0(j3, 0L);
                fg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new we1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    fg1Var.C0 = true;
                    fg1Var.N0 = true;
                    fg1Var.s.pinTopic(fg1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, fg1Var);
                }
                fg1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    fg1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), fg1Var.B0);
                }
                fg1Var.C0();
                break;
            case 7:
                fg1Var.D0(hashSet, new e01(this, 19));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        fg1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.id);
                        MessagesController messagesController = fg1Var.getMessagesController();
                        long j11 = -j3;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j11, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        fg1Var.getMessagesStorage().updateRepliesMaxReadId(fg1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                fg1Var.C0();
                break;
            case 9:
            case 10:
                fg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j3, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                fg1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = fg1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.d5.s(fg1Var, false, chat, null, false, true, false, false, new rv0(16, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < fg1Var.N.getChildCount()) {
                        View childAt = fg1Var.N.getChildAt(i16);
                        if ((childAt instanceof cg1) && (tL_forumTopic = (cg1Var = (cg1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        cg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((wf1) arrayList.get(i12)).c == null || ((wf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((wf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (fg1Var.x <= 0) {
                        fg1Var.E = true;
                        fg1Var.y = 2;
                    }
                    fg1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (cg1Var != null) {
                        fg1Var.b1 = cg1Var;
                    }
                    fg1Var.N.A1(!tL_forumTopic2.hidden, cg1Var);
                    fg1Var.U0(true, true);
                    if (cg1Var != null) {
                        cg1Var.setTopicIcon(cg1Var.Y4);
                    }
                }
                fg1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(fg1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = fg1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    fg1Var.presentFragment(v5Var);
                    break;
                } else {
                    fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                    break;
                }
            case 15:
                c41.L(-j3, fg1Var);
                break;
        }
    }
}
