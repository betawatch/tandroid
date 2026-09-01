package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ee1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ie1 a;

    public ee1(ie1 ie1Var) {
        this.a = ie1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        ie1 ie1Var = this.a;
        if (i10 == -1) {
            ie1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = ie1Var.e.getText() == null ? null : ie1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ie1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(ie1Var.e);
                return;
            }
            if (ie1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ie1Var.getParentActivity(), 3, null);
            d2Var.q(500L);
            ie1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = ie1Var.getMessagesController().getInputPeer(ie1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = ie1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = ie1Var.B;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new tr0(this, obj, d2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = ie1Var.e.getText() != null ? ie1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) ie1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ie1Var.e);
                return;
            }
            if (!ie1Var.w.title.equals(obj2) || ie1Var.w.icon_emoji_id != ie1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ie1Var.getMessagesController().getInputPeer(ie1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = ie1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = ie1Var.w.icon_emoji_id;
                long j12 = ie1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new oh.p5(4));
            }
            if (ie1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ie1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ie1Var.getMessagesController().getInputPeer(ie1Var.a);
                    tL_messages_editForumTopic2.topic_id = ie1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !ie1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new oh.p5(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ie1Var.w;
            long j13 = ie1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (ie1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            ie1Var.getMessagesController().getTopicsController().onTopicEdited(ie1Var.a, ie1Var.w);
            ie1Var.finishFragment();
        }
    }
}
