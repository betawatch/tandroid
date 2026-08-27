package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class od1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ sd1 a;

    public od1(sd1 sd1Var) {
        this.a = sd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        sd1 sd1Var = this.a;
        if (i10 == -1) {
            sd1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = sd1Var.e.getText() == null ? null : sd1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) sd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(sd1Var.e);
                return;
            }
            if (sd1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(sd1Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            sd1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = sd1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = sd1Var.A;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new lr0(this, obj, b2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = sd1Var.e.getText() != null ? sd1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) sd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(sd1Var.e);
                return;
            }
            if (!sd1Var.w.title.equals(obj2) || sd1Var.w.icon_emoji_id != sd1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = sd1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = sd1Var.w.icon_emoji_id;
                long j12 = sd1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new jh.m5(5));
            }
            if (sd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = sd1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.a);
                    tL_messages_editForumTopic2.topic_id = sd1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !sd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new jh.m5(5));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = sd1Var.w;
            long j13 = sd1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (sd1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            sd1Var.getMessagesController().getTopicsController().onTopicEdited(sd1Var.a, sd1Var.w);
            sd1Var.finishFragment();
        }
    }
}
