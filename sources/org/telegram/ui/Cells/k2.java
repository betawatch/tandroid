package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k2 extends ai.da {
    public final /* synthetic */ s2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(s2 s2Var) {
        super(null, false);
        this.S = s2Var;
    }

    @Override // ai.da
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // ai.da
    public final boolean d(long j3) {
        s2 s2Var = this.S;
        int i10 = s2Var.F0;
        ty tyVar = s2Var.D4;
        if (tyVar == null || s2Var.O0) {
            return false;
        }
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            tyVar.showDialog(new fi.k0(tyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        tyVar.showDialog(new fi.k0(tyVar, chat.linked_community_id));
        return true;
    }

    @Override // ai.da
    public final void e() {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.d0;
        if (o2Var == null) {
            return;
        }
        o2Var.g(s2Var);
    }

    @Override // ai.da
    public final void f(long j3) {
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
