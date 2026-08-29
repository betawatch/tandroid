package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i2 extends lh.h7 {
    public final /* synthetic */ p2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(p2 p2Var) {
        super(null, false);
        this.S = p2Var;
    }

    @Override // lh.h7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.K0) ? false : true;
    }

    @Override // lh.h7
    public final boolean d(long j10) {
        p2 p2Var = this.S;
        int i10 = p2Var.B0;
        fy fyVar = p2Var.v4;
        if (fyVar == null || p2Var.K0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            fyVar.showDialog(new qh.i0(fyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        fyVar.showDialog(new qh.i0(fyVar, chat.linked_community_id));
        return true;
    }

    @Override // lh.h7
    public final void e() {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.W;
        if (l2Var == null) {
            return;
        }
        l2Var.f(p2Var);
    }

    @Override // lh.h7
    public final void f(long j10) {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.W;
        if (l2Var == null) {
            return;
        }
        if (p2Var.F0 != 0) {
            l2Var.c();
        } else {
            l2Var.e(p2Var);
        }
    }
}
