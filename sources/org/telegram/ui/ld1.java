package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ld1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pd1 a;

    public ld1(pd1 pd1Var) {
        this.a = pd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        pd1 pd1Var = this.a;
        if (i10 == -1) {
            pd1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = pd1Var.e.getText() == null ? null : pd1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) pd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(pd1Var.e);
                return;
            }
            if (pd1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(pd1Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            pd1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = pd1Var.getMessagesController().getInputPeer(pd1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = pd1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = pd1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new vr0(this, obj, b2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = pd1Var.e.getText() != null ? pd1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) pd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(pd1Var.e);
                return;
            }
            if (!pd1Var.w.title.equals(obj2) || pd1Var.w.icon_emoji_id != pd1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = pd1Var.getMessagesController().getInputPeer(pd1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = pd1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = pd1Var.w.icon_emoji_id;
                long j12 = pd1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ci.d6(8));
            }
            if (pd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = pd1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = pd1Var.getMessagesController().getInputPeer(pd1Var.a);
                    tL_messages_editForumTopic2.topic_id = pd1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !pd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ci.d6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = pd1Var.w;
            long j13 = pd1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (pd1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            pd1Var.getMessagesController().getTopicsController().onTopicEdited(pd1Var.a, pd1Var.w);
            pd1Var.finishFragment();
        }
    }
}
