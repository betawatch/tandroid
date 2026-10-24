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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class he1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ye1 b;

    public he1(ye1 ye1Var, Context context) {
        this.b = ye1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        ue1 ue1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        ye1 ye1Var = this.b;
        TopicsController topicsController = ye1Var.s;
        ArrayList arrayList = ye1Var.b;
        HashSet hashSet = ye1Var.a0;
        long j10 = ye1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                ye1Var.finishFragment();
                return;
            }
            ye1Var.B0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                ye1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                ye1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                sn snVar = new sn(bundle);
                snVar.va = true;
                ye1Var.presentFragment(snVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = ye1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = ye1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
                    fe1 fe1Var = new fe1(this, this.a, i11, hVar, chatFull.id, ye1Var, j11);
                    fe1Var.l0 = new ci.d1(this, j11, 11);
                    fe1Var.show();
                    break;
                }
                break;
            case 3:
                td1 a02 = td1.a0(j10, 0L);
                ye1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new od1(a02, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    ye1Var.C0 = true;
                    ye1Var.N0 = true;
                    ye1Var.s.pinTopic(ye1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, ye1Var);
                }
                ye1Var.B0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ye1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), ye1Var.B0);
                }
                ye1Var.B0();
                break;
            case 7:
                ye1Var.C0(hashSet, new my0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        ye1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.id);
                        MessagesController messagesController = ye1Var.getMessagesController();
                        long j12 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        ye1Var.getMessagesStorage().updateRepliesMaxReadId(ye1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                ye1Var.B0();
                break;
            case 9:
            case 10:
                ye1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                ye1Var.B0();
                break;
            case 11:
                TLRPC.Chat chat = ye1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.f5.s(ye1Var, false, chat, null, false, true, false, false, new ql0(23, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < ye1Var.N.getChildCount()) {
                        View childAt = ye1Var.N.getChildAt(i16);
                        if ((childAt instanceof ue1) && (tL_forumTopic = (ue1Var = (ue1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        ue1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((oe1) arrayList.get(i12)).c == null || ((oe1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((oe1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (ye1Var.x <= 0) {
                        ye1Var.E = true;
                        ye1Var.y = 2;
                    }
                    ye1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (ue1Var != null) {
                        ye1Var.c1 = ue1Var;
                    }
                    ye1Var.N.F1(!tL_forumTopic2.hidden, ue1Var);
                    ye1Var.U0(true, true);
                    if (ue1Var != null) {
                        ue1Var.setTopicIcon(ue1Var.c5);
                    }
                }
                ye1Var.B0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(ye1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ye1Var.X;
                    y5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.R, y5Var.T, new q5(y5Var, 0));
                    }
                    ye1Var.presentFragment(y5Var);
                    break;
                } else {
                    ye1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                    break;
                }
            case 15:
                s21.O(-j10, ye1Var);
                break;
        }
    }
}
