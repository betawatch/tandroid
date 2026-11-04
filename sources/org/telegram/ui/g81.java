package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ l81 a;

    public g81(l81 l81Var) {
        this.a = l81Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        int i11;
        int i12;
        l81 l81Var = this.a;
        if (i3 == -1) {
            l81Var.finishFragment();
            return;
        }
        if (i3 == 1) {
            String obj = l81Var.e.getText() == null ? null : l81Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) l81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(l81Var.e);
                return;
            }
            if (l81Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, l81Var.getParentActivity(), null);
            s1Var.r(500L);
            l81Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = l81Var.getMessagesController().j1(l81Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = l81Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
            tL_messages_createForumTopic.icon_color = l81Var.F;
            tL_messages_createForumTopic.flags |= 1;
            i12 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
            ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new co0(this, obj, s1Var, 11));
            return;
        }
        if (i3 == 2) {
            String obj2 = l81Var.e.getText() != null ? l81Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) l81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(l81Var.e);
                return;
            }
            if (!l81Var.x.title.equals(obj2) || l81Var.x.icon_emoji_id != l81Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = l81Var.getMessagesController().j1(l81Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = l81Var.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = l81Var.x.icon_emoji_id;
                long j12 = l81Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new ei.u5(9));
            }
            if (l81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = l81Var.x;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = l81Var.getMessagesController().j1(l81Var.a);
                    tL_messages_editForumTopic2.topic_id = l81Var.x.id;
                    tL_messages_editForumTopic2.hidden = !l81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new ei.u5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = l81Var.x;
            long j13 = l81Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (l81Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            org.telegram.messenger.c00 c00Var = l81Var.getMessagesController().q7;
            long j14 = l81Var.a;
            c00Var.getMessagesStorage().f2(j14, l81Var.x, 35);
            c00Var.y(-j14, true);
            l81Var.finishFragment();
        }
    }
}
