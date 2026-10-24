package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j2 extends ci.x7 {
    public final /* synthetic */ q2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(q2 q2Var) {
        super(null, false);
        this.S = q2Var;
    }

    @Override // ci.x7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // ci.x7
    public final boolean d(long j10) {
        q2 q2Var = this.S;
        int i10 = q2Var.F0;
        ey eyVar = q2Var.D4;
        if (eyVar == null || q2Var.O0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            eyVar.showDialog(new hi.k0(eyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        eyVar.showDialog(new hi.k0(eyVar, chat.linked_community_id));
        return true;
    }

    @Override // ci.x7
    public final void e() {
        q2 q2Var = this.S;
        m2 m2Var = q2Var.d0;
        if (m2Var == null) {
            return;
        }
        m2Var.f(q2Var);
    }

    @Override // ci.x7
    public final void f(long j10) {
        q2 q2Var = this.S;
        m2 m2Var = q2Var.d0;
        if (m2Var == null) {
            return;
        }
        if (q2Var.J0 != 0) {
            m2Var.c();
        } else {
            m2Var.e(q2Var);
        }
    }
}
