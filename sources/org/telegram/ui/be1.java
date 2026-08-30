package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class be1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fe1 a;

    public be1(fe1 fe1Var) {
        this.a = fe1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        fe1 fe1Var = this.a;
        if (i10 == -1) {
            fe1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = fe1Var.e.getText() == null ? null : fe1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) fe1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(fe1Var.e);
                return;
            }
            if (fe1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(fe1Var.getParentActivity(), 3, null);
            d2Var.q(500L);
            fe1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = fe1Var.getMessagesController().getInputPeer(fe1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = fe1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = fe1Var.B;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.p2) fe1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new rr0(this, obj, d2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = fe1Var.e.getText() != null ? fe1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) fe1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(fe1Var.e);
                return;
            }
            if (!fe1Var.w.title.equals(obj2) || fe1Var.w.icon_emoji_id != fe1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = fe1Var.getMessagesController().getInputPeer(fe1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = fe1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = fe1Var.w.icon_emoji_id;
                long j12 = fe1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) fe1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new nh.p5(4));
            }
            if (fe1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = fe1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = fe1Var.getMessagesController().getInputPeer(fe1Var.a);
                    tL_messages_editForumTopic2.topic_id = fe1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !fe1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) fe1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new nh.p5(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = fe1Var.w;
            long j13 = fe1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (fe1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            fe1Var.getMessagesController().getTopicsController().onTopicEdited(fe1Var.a, fe1Var.w);
            fe1Var.finishFragment();
        }
    }
}
