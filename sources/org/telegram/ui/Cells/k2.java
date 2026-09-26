package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k2 extends ai.ca {
    public final /* synthetic */ s2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(s2 s2Var) {
        super(null, false);
        this.S = s2Var;
    }

    @Override // ai.ca
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // ai.ca
    public final boolean d(long j3) {
        s2 s2Var = this.S;
        int i10 = s2Var.F0;
        qy qyVar = s2Var.z4;
        if (qyVar == null || s2Var.O0) {
            return false;
        }
        if (j3 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            qyVar.showDialog(new fi.k0(qyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        qyVar.showDialog(new fi.k0(qyVar, chat.linked_community_id));
        return true;
    }

    @Override // ai.ca
    public final void e() {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.d0;
        if (o2Var == null) {
            return;
        }
        o2Var.f(s2Var);
    }

    @Override // ai.ca
    public final void f(long j3) {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.d0;
        if (o2Var == null) {
            return;
        }
        if (s2Var.J0 != 0) {
            o2Var.c();
        } else {
            o2Var.e(s2Var);
        }
    }
}
