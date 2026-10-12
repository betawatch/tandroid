package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class df1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hf1 a;

    public df1(hf1 hf1Var) {
        this.a = hf1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        hf1 hf1Var = this.a;
        if (i10 == -1) {
            hf1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = hf1Var.e.getText() == null ? null : hf1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) hf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(hf1Var.e);
                return;
            }
            if (hf1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(hf1Var.getParentActivity(), 3, null);
            a2Var.q(500L);
            hf1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = hf1Var.getMessagesController().getInputPeer(hf1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = hf1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = hf1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.m2) hf1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new us0(this, obj, a2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = hf1Var.e.getText() != null ? hf1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) hf1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(hf1Var.e);
                return;
            }
            if (!hf1Var.w.title.equals(obj2) || hf1Var.w.icon_emoji_id != hf1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = hf1Var.getMessagesController().getInputPeer(hf1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = hf1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = hf1Var.w.icon_emoji_id;
                long j12 = hf1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) hf1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new bi.g7(8));
            }
            if (hf1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = hf1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = hf1Var.getMessagesController().getInputPeer(hf1Var.a);
                    tL_messages_editForumTopic2.topic_id = hf1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !hf1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.m2) hf1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new bi.g7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = hf1Var.w;
            long j13 = hf1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (hf1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            hf1Var.getMessagesController().getTopicsController().onTopicEdited(hf1Var.a, hf1Var.w);
            hf1Var.finishFragment();
        }
    }
}
