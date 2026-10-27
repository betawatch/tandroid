package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i2 extends di.w7 {
    public final /* synthetic */ p2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(p2 p2Var) {
        super(null, false);
        this.S = p2Var;
    }

    @Override // di.w7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // di.w7
    public final boolean d(long j10) {
        p2 p2Var = this.S;
        int i10 = p2Var.F0;
        ey eyVar = p2Var.D4;
        if (eyVar == null || p2Var.O0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            eyVar.showDialog(new ii.j0(eyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        eyVar.showDialog(new ii.j0(eyVar, chat.linked_community_id));
        return true;
    }

    @Override // di.w7
    public final void e() {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.d0;
        if (l2Var == null) {
            return;
        }
        l2Var.f(p2Var);
    }

    @Override // di.w7
    public final void f(long j10) {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.d0;
        if (l2Var == null) {
            return;
        }
        if (p2Var.J0 != 0) {
            l2Var.c();
        } else {
            l2Var.e(p2Var);
        }
    }
}
