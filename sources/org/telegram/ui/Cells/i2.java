package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i2 extends nh.i7 {
    public final /* synthetic */ q2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(q2 q2Var) {
        super(null, false);
        this.S = q2Var;
    }

    @Override // nh.i7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.L0) ? false : true;
    }

    @Override // nh.i7
    public final boolean d(long j10) {
        q2 q2Var = this.S;
        int i10 = q2Var.C0;
        qy qyVar = q2Var.w4;
        if (qyVar == null || q2Var.L0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            qyVar.showDialog(new sh.i0(qyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        qyVar.showDialog(new sh.i0(qyVar, chat.linked_community_id));
        return true;
    }

    @Override // nh.i7
    public final void e() {
        q2 q2Var = this.S;
        m2 m2Var = q2Var.a0;
        if (m2Var == null) {
            return;
        }
        m2Var.f(q2Var);
    }

    @Override // nh.i7
    public final void f(long j10) {
        q2 q2Var = this.S;
        m2 m2Var = q2Var.a0;
        if (m2Var == null) {
            return;
        }
        if (q2Var.G0 != 0) {
            m2Var.c();
        } else {
            m2Var.e(q2Var);
        }
    }
}
