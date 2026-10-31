package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ha1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ la1 a;

    public ha1(la1 la1Var) {
        this.a = la1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        la1 la1Var = this.a;
        if (i10 == -1) {
            la1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String obj = la1Var.e.getText() == null ? null : la1Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) la1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.i0.E3(la1Var.e);
                return;
            }
            if (la1Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, la1Var.getParentActivity(), null);
            x1Var.r(500L);
            la1Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = la1Var.getMessagesController().i1(la1Var.a);
            tL_messages_createForumTopic.title = obj;
            long j10 = la1Var.b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
            tL_messages_createForumTopic.icon_color = la1Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i13 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
            ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new vp0(this, obj, x1Var, 11));
            return;
        }
        if (i10 == 2) {
            String obj2 = la1Var.e.getText() != null ? la1Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) la1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.i0.E3(la1Var.e);
                return;
            }
            if (!la1Var.x.title.equals(obj2) || la1Var.x.icon_emoji_id != la1Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = la1Var.getMessagesController().i1(la1Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = la1Var.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = la1Var.x.icon_emoji_id;
                long j12 = la1Var.b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ag.c3(4));
            }
            if (la1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = la1Var.x;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = la1Var.getMessagesController().i1(la1Var.a);
                    tL_messages_editForumTopic2.topic_id = la1Var.x.id;
                    tL_messages_editForumTopic2.hidden = !la1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ag.c3(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = la1Var.x;
            long j13 = la1Var.b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (la1Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            org.telegram.messenger.x00 x00Var = la1Var.getMessagesController().r7;
            long j14 = la1Var.a;
            x00Var.getMessagesStorage().f2(j14, la1Var.x, 35);
            x00Var.y(-j14, true);
            la1Var.finishFragment();
        }
    }
}
