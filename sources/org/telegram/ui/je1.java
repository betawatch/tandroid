package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class je1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ne1 a;

    public je1(ne1 ne1Var) {
        this.a = ne1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        ne1 ne1Var = this.a;
        if (i10 == -1) {
            ne1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = ne1Var.e.getText() == null ? null : ne1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ne1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(ne1Var.e);
                return;
            }
            if (ne1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ne1Var.getParentActivity(), 3, null);
            d2Var.q(500L);
            ne1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = ne1Var.getMessagesController().getInputPeer(ne1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = ne1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = ne1Var.B;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.p2) ne1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new yr0(this, obj, d2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = ne1Var.e.getText() != null ? ne1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) ne1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ne1Var.e);
                return;
            }
            if (!ne1Var.w.title.equals(obj2) || ne1Var.w.icon_emoji_id != ne1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ne1Var.getMessagesController().getInputPeer(ne1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = ne1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = ne1Var.w.icon_emoji_id;
                long j12 = ne1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) ne1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new nh.p5(4));
            }
            if (ne1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ne1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ne1Var.getMessagesController().getInputPeer(ne1Var.a);
                    tL_messages_editForumTopic2.topic_id = ne1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !ne1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) ne1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new nh.p5(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ne1Var.w;
            long j13 = ne1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (ne1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            ne1Var.getMessagesController().getTopicsController().onTopicEdited(ne1Var.a, ne1Var.w);
            ne1Var.finishFragment();
        }
    }
}
