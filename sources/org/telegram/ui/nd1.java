package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nd1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ rd1 a;

    public nd1(rd1 rd1Var) {
        this.a = rd1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        int i11;
        int i12;
        rd1 rd1Var = this.a;
        if (i9 == -1) {
            rd1Var.finishFragment();
            return;
        }
        if (i9 == 1) {
            String obj = rd1Var.e.getText() == null ? null : rd1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) rd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(rd1Var.e);
                return;
            }
            if (rd1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(rd1Var.getParentActivity(), 3, null);
            c2Var.q(500L);
            rd1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = rd1Var.getMessagesController().getInputPeer(rd1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = rd1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = rd1Var.A;
            tL_messages_createForumTopic.flags |= 1;
            i12 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
            ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new kr0(this, obj, c2Var, 11));
            return;
        }
        if (i9 == 2) {
            String obj2 = rd1Var.e.getText() != null ? rd1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) rd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(rd1Var.e);
                return;
            }
            if (!rd1Var.w.title.equals(obj2) || rd1Var.w.icon_emoji_id != rd1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = rd1Var.getMessagesController().getInputPeer(rd1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = rd1Var.w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = rd1Var.w.icon_emoji_id;
                long j12 = rd1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new ih.q5(5));
            }
            if (rd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = rd1Var.w;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = rd1Var.getMessagesController().getInputPeer(rd1Var.a);
                    tL_messages_editForumTopic2.topic_id = rd1Var.w.id;
                    tL_messages_editForumTopic2.hidden = !rd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new ih.q5(5));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = rd1Var.w;
            long j13 = rd1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (rd1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            rd1Var.getMessagesController().getTopicsController().onTopicEdited(rd1Var.a, rd1Var.w);
            rd1Var.finishFragment();
        }
    }
}
