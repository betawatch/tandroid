package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cf1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ gf1 a;

    public cf1(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        gf1 gf1Var = this.a;
        if (i10 == -1) {
            gf1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = gf1Var.e.getText() == null ? null : gf1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) gf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(gf1Var.e);
                return;
            }
            if (gf1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(gf1Var.getParentActivity(), 3, null);
            a2Var.q(500L);
            gf1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = gf1Var.getMessagesController().getInputPeer(gf1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = gf1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = gf1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ts0(this, obj, a2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = gf1Var.e.getText() != null ? gf1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) gf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(gf1Var.e);
                return;
            }
            if (!gf1Var.w.title.equals(obj2) || gf1Var.w.icon_emoji_id != gf1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = gf1Var.getMessagesController().getInputPeer(gf1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = gf1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = gf1Var.w.icon_emoji_id;
                long j12 = gf1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new bi.g7(8));
            }
            if (gf1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = gf1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = gf1Var.getMessagesController().getInputPeer(gf1Var.a);
                    tL_messages_editForumTopic2.topic_id = gf1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !gf1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new bi.g7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = gf1Var.w;
            long j13 = gf1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (gf1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            gf1Var.getMessagesController().getTopicsController().onTopicEdited(gf1Var.a, gf1Var.w);
            gf1Var.finishFragment();
        }
    }
}
