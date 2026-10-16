package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class k2 extends bi.m9 {
    public final /* synthetic */ s2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(s2 s2Var) {
        super(null, false);
        this.S = s2Var;
    }

    @Override // bi.m9
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // bi.m9
    public final boolean d(long j10) {
        s2 s2Var = this.S;
        int i10 = s2Var.F0;
        yy yyVar = s2Var.D4;
        if (yyVar == null || s2Var.O0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            yyVar.showDialog(new gi.k0(yyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        yyVar.showDialog(new gi.k0(yyVar, chat.linked_community_id));
        return true;
    }

    @Override // bi.m9
    public final void e() {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.d0;
        if (o2Var == null) {
            return;
        }
        o2Var.g(s2Var);
    }

    @Override // bi.m9
    public final void f(long j10) {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.d0;
        if (o2Var == null) {
            return;
        }
        if (s2Var.J0 != 0) {
            o2Var.c();
        } else {
            o2Var.f(s2Var);
        }
    }
}
