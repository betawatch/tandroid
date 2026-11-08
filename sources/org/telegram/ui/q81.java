package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class q81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ v81 a;

    public q81(v81 v81Var) {
        this.a = v81Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        v81 v81Var = this.a;
        if (i7 == -1) {
            v81Var.finishFragment();
            return;
        }
        if (i7 == 1) {
            String obj = v81Var.e.getText() == null ? null : v81Var.e.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) v81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(v81Var.e);
                return;
            }
            if (v81Var.r) {
                return;
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, v81Var.getParentActivity(), null);
            u1Var.r(500L);
            v81Var.r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = v81Var.getMessagesController().j1(v81Var.a);
            tL_messages_createForumTopic.title = obj;
            long j3 = v81Var.b;
            if (j3 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j3;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
            tL_messages_createForumTopic.icon_color = v81Var.E;
            tL_messages_createForumTopic.flags |= 1;
            i12 = ((org.telegram.ui.ActionBar.f2) v81Var).currentAccount;
            ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new lo0(this, obj, u1Var, 11));
            return;
        }
        if (i7 == 2) {
            String obj2 = v81Var.e.getText() != null ? v81Var.e.getText().toString() : null;
            if (TextUtils.isEmpty(obj2)) {
                Vibrator vibrator2 = (Vibrator) v81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(v81Var.e);
                return;
            }
            if (!v81Var.x.title.equals(obj2) || v81Var.x.icon_emoji_id != v81Var.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = v81Var.getMessagesController().j1(v81Var.a);
                TLRPC.TL_forumTopic tL_forumTopic = v81Var.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(obj2)) {
                    tL_messages_editForumTopic.title = obj2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = v81Var.x.icon_emoji_id;
                long j11 = v81Var.b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) v81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new di.u5(9));
            }
            if (v81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = v81Var.x;
                if (tL_forumTopic2.id == 1 && (!r12.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = v81Var.getMessagesController().j1(v81Var.a);
                    tL_messages_editForumTopic2.topic_id = v81Var.x.id;
                    tL_messages_editForumTopic2.hidden = !v81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.f2) v81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new di.u5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = v81Var.x;
            long j12 = v81Var.b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = obj2;
            if (v81Var.d != null) {
                tL_forumTopic3.hidden = !r0.d.h;
            }
            org.telegram.messenger.k00 k00Var = v81Var.getMessagesController().q7;
            long j13 = v81Var.a;
            k00Var.getMessagesStorage().f2(j13, v81Var.x, 35);
            k00Var.y(-j13, true);
            v81Var.finishFragment();
        }
    }
}
