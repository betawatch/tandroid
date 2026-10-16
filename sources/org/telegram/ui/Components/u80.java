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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u80 extends lm0 {
    public final Context c;
    public final /* synthetic */ v80 d;

    public u80(v80 v80Var, Context context) {
        this.d = v80Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = b1Var.a;
        v80 v80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) v80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.e3) v80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) v80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (v80Var.s == 0) {
            ((org.telegram.ui.Cells.f7) view).c(peerId, peerId == MessageObject.getPeerId(v80Var.v), null);
        } else {
            ((org.telegram.ui.Cells.g4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        v80 v80Var = this.d;
        if (v80Var.s == 0) {
            g4Var = new org.telegram.ui.Cells.f7(this.c, 2, null);
            g4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.c, null, false, v80Var.s == 2);
        }
        return new wl0(g4Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        b1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = b1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.g4)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            f7Var.b(peerId == f7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            g4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
