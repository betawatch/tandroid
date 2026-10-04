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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class if1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yf1 b;

    public if1(yf1 yf1Var, Context context) {
        this.b = yf1Var;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        vf1 vf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        yf1 yf1Var = this.b;
        TopicsController topicsController = yf1Var.s;
        ArrayList arrayList = yf1Var.b;
        HashSet hashSet = yf1Var.a0;
        long j3 = yf1Var.a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                yf1Var.finishFragment();
                return;
            }
            yf1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i10) {
            case 1:
                yf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                yf1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                yn ynVar = new yn(bundle);
                ynVar.ha = true;
                yf1Var.presentFragment(ynVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = yf1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = yf1Var.J;
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
                    i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
                    gf1 gf1Var = new gf1(this, this.a, i11, iVar, chatFull.id, yf1Var, j10);
                    gf1Var.l0 = new ai.z1(this, j10, 11);
                    gf1Var.show();
                    break;
                }
                break;
            case 3:
                ue1 Z = ue1.Z(j3, 0L);
                yf1Var.presentFragment(Z);
                AndroidUtilities.runOnUIThread(new pe1(Z, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    yf1Var.C0 = true;
                    yf1Var.N0 = true;
                    yf1Var.s.pinTopic(yf1Var.a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, yf1Var);
                }
                yf1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    yf1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), yf1Var.B0);
                }
                yf1Var.C0();
                break;
            case 7:
                yf1Var.D0(hashSet, new hz0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        yf1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.id);
                        MessagesController messagesController = yf1Var.getMessagesController();
                        long j11 = -j3;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        messagesController.markDialogAsRead(j11, i14, 0, message != null ? message.date : 0, false, findTopic.id, 0, true, 0);
                        yf1Var.getMessagesStorage().updateRepliesMaxReadId(yf1Var.a, findTopic.id, findTopic.top_message, 0, true);
                    }
                }
                yf1Var.C0();
                break;
            case 9:
            case 10:
                yf1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    topicsController.toggleCloseTopic(j3, ((Integer) arrayList3.get(i15)).intValue(), i10 == 9);
                }
                yf1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = yf1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(yf1Var, false, chat, null, false, true, false, false, new fs0(18, this, chat));
                break;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < yf1Var.N.getChildCount()) {
                        View childAt = yf1Var.N.getChildAt(i16);
                        if ((childAt instanceof vf1) && (tL_forumTopic = (vf1Var = (vf1) childAt).N) != null && tL_forumTopic.id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        vf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) == null || ((pf1) arrayList.get(i12)).c == null || ((pf1) arrayList.get(i12)).c.id != 1) {
                                i12++;
                            } else {
                                tL_forumTopic2 = ((pf1) arrayList.get(i12)).c;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (yf1Var.x <= 0) {
                        yf1Var.E = true;
                        yf1Var.y = 2;
                    }
                    yf1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (vf1Var != null) {
                        yf1Var.b1 = vf1Var;
                    }
                    yf1Var.N.B1(!tL_forumTopic2.hidden, vf1Var);
                    yf1Var.U0(true, true);
                    if (vf1Var != null) {
                        vf1Var.setTopicIcon(vf1Var.Y4);
                    }
                }
                yf1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(yf1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    w5 w5Var = new w5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = yf1Var.X;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                    }
                    yf1Var.presentFragment(w5Var);
                    break;
                } else {
                    yf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                    break;
                }
            case 15:
                v31.J(-j3, yf1Var);
                break;
        }
    }
}
