package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class k2 extends ci.y7 {
    public final /* synthetic */ r2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(r2 r2Var) {
        super(null, false);
        this.S = r2Var;
    }

    @Override // ci.y7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // ci.y7
    public final boolean d(long j10) {
        r2 r2Var = this.S;
        int i10 = r2Var.F0;
        cy cyVar = r2Var.D4;
        if (cyVar == null || r2Var.O0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            cyVar.showDialog(new hi.k0(cyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        cyVar.showDialog(new hi.k0(cyVar, chat.linked_community_id));
        return true;
    }

    @Override // ci.y7
    public final void e() {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.d0;
        if (n2Var == null) {
            return;
        }
        n2Var.g(r2Var);
    }

    @Override // ci.y7
    public final void f(long j10) {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.d0;
        if (n2Var == null) {
            return;
        }
        if (r2Var.J0 != 0) {
            n2Var.c();
        } else {
            n2Var.f(r2Var);
        }
    }
}
