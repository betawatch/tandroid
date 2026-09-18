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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class nf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ dg1 b;

    public nf1(dg1 dg1Var, Context context) {
        this.b = dg1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        ag1 ag1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        dg1 dg1Var = this.b;
        TopicsController topicsController = dg1Var.s;
        ArrayList arrayList = dg1Var.b;
        HashSet hashSet = dg1Var.a0;
        long j3 = dg1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                dg1Var.finishFragment();
                return;
            }
            dg1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                dg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                dg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                zn znVar = new zn(bundle);
                znVar.ja = true;
                dg1Var.presentFragment(znVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = dg1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = dg1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
                    lf1 lf1Var = new lf1(this, this.a, i11, iVar, chatFull.id, dg1Var, j10);
                    lf1Var.l0 = new ai.z1(this, j10, 11);
                    lf1Var.show();
                    break;
                }
                break;
            case 3:
                ze1 a02 = ze1.a0(j3, 0L);
                dg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ue1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    dg1Var.C0 = true;
                    dg1Var.N0 = true;
                    dg1Var.s.pinTopic(dg1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, dg1Var);
                }
                dg1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    dg1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), dg1Var.B0);
                }
                dg1Var.C0();
                break;
            case 7:
                dg1Var.D0(hashSet, new e01(this, 19));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        dg1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.id);
                        MessagesController messagesController = dg1Var.getMessagesController();
                        long j11 = -j3;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j11, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        dg1Var.getMessagesStorage().updateRepliesMaxReadId(dg1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                dg1Var.C0();
                break;
            case 9:
            case 10:
                dg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j3, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                dg1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = dg1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(dg1Var, false, chat, null, false, true, false, false, new rv0(16, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < dg1Var.N.getChildCount()) {
                        View childAt = dg1Var.N.getChildAt(i16);
                        if ((childAt instanceof ag1) && (tL_forumTopic = (ag1Var = (ag1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        ag1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((uf1) arrayList.get(i12)).c == null || ((uf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((uf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (dg1Var.x <= 0) {
                        dg1Var.E = true;
                        dg1Var.y = 2;
                    }
                    dg1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (ag1Var != null) {
                        dg1Var.b1 = ag1Var;
                    }
                    dg1Var.N.A1(!tL_forumTopic2.hidden, ag1Var);
                    dg1Var.U0(true, true);
                    if (ag1Var != null) {
                        ag1Var.setTopicIcon(ag1Var.Y4);
                    }
                }
                dg1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(dg1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dg1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    dg1Var.presentFragment(v5Var);
                    break;
                } else {
                    dg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                    break;
                }
            case 15:
                b41.L(-j3, dg1Var);
                break;
        }
    }
}
