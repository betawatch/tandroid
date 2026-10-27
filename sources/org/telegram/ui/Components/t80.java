package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t80 extends mm0 {
    public final Context c;
    public final /* synthetic */ u80 d;

    public t80(u80 u80Var, Context context) {
        this.d = u80Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.r.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = e1Var.a;
        u80 u80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) u80Var.r.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.k3) u80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.k3) u80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (u80Var.w == 0) {
            ((org.telegram.ui.Cells.k7) view).c(peerId, peerId == MessageObject.getPeerId(u80Var.x), null);
        } else {
            ((org.telegram.ui.Cells.k4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        u80 u80Var = this.d;
        if (u80Var.w == 0) {
            k4Var = new org.telegram.ui.Cells.k7(this.c, 2, null);
            k4Var.setLayoutParams(new s4.q0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            k4Var = new org.telegram.ui.Cells.k4(2, 0, this.c, null, false, u80Var.w == 2);
        }
        return new wl0(k4Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        e1Var.b();
        long peerId = MessageObject.getPeerId(this.d.x);
        View view = e1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.k4)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            k7Var.b(peerId == k7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            Object object = k4Var.getObject();
            k4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
