package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j2 extends bi.j9 {
    public final /* synthetic */ r2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(r2 r2Var) {
        super(null, false);
        this.S = r2Var;
    }

    @Override // bi.j9
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // bi.j9
    public final boolean d(long j3) {
        r2 r2Var = this.S;
        int i10 = r2Var.F0;
        uy uyVar = r2Var.z4;
        if (uyVar == null || r2Var.O0) {
            return false;
        }
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            uyVar.showDialog(new gi.k0(uyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        uyVar.showDialog(new gi.k0(uyVar, chat.linked_community_id));
        return true;
    }

    @Override // bi.j9
    public final void e() {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.d0;
        if (n2Var == null) {
            return;
        }
        n2Var.f(r2Var);
    }

    @Override // bi.j9
    public final void f(long j3) {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.d0;
        if (n2Var == null) {
            return;
        }
        if (r2Var.J0 != 0) {
            n2Var.c();
        } else {
            n2Var.e(r2Var);
        }
    }
}
