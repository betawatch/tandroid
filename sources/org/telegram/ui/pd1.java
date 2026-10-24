package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ td1 a;

    public pd1(td1 td1Var) {
        this.a = td1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        td1 td1Var = this.a;
        if (i10 == -1) {
            td1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = td1Var.e.getText() == null ? null : td1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) td1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(td1Var.e);
                return;
            }
            if (td1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(td1Var.getParentActivity(), 3, null);
            c2Var.r(500L);
            td1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = td1Var.getMessagesController().getInputPeer(td1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = td1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = td1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new wr0(this, obj, c2Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = td1Var.e.getText() != null ? td1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) td1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(td1Var.e);
                return;
            }
            if (!td1Var.w.title.equals(obj2) || td1Var.w.icon_emoji_id != td1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = td1Var.getMessagesController().getInputPeer(td1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = td1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = td1Var.w.icon_emoji_id;
                long j12 = td1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ci.d6(8));
            }
            if (td1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = td1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = td1Var.getMessagesController().getInputPeer(td1Var.a);
                    tL_messages_editForumTopic2.topic_id = td1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !td1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ci.d6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = td1Var.w;
            long j13 = td1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (td1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            td1Var.getMessagesController().getTopicsController().onTopicEdited(td1Var.a, td1Var.w);
            td1Var.finishFragment();
        }
    }
}
