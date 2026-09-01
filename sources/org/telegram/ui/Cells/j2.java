package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j2 extends oh.i7 {
    public final /* synthetic */ r2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(r2 r2Var) {
        super(null, false);
        this.S = r2Var;
    }

    @Override // oh.i7
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.L0) ? false : true;
    }

    @Override // oh.i7
    public final boolean d(long j10) {
        r2 r2Var = this.S;
        int i10 = r2Var.C0;
        py pyVar = r2Var.w4;
        if (pyVar == null || r2Var.L0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            pyVar.showDialog(new th.i0(pyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        pyVar.showDialog(new th.i0(pyVar, chat.linked_community_id));
        return true;
    }

    @Override // oh.i7
    public final void e() {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.a0;
        if (n2Var == null) {
            return;
        }
        n2Var.f(r2Var);
    }

    @Override // oh.i7
    public final void f(long j10) {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.a0;
        if (n2Var == null) {
            return;
        }
        if (r2Var.G0 != 0) {
            n2Var.c();
        } else {
            n2Var.e(r2Var);
        }
    }
}
