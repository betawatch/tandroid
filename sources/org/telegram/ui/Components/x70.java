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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x70 extends rl0 {
    public final Context c;
    public final /* synthetic */ y70 d;

    public x70(y70 y70Var, Context context) {
        this.d = y70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = l1Var.a;
        y70 y70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) y70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.g3) y70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.g3) y70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (y70Var.s == 0) {
            ((org.telegram.ui.Cells.e7) view).c(peerId, peerId == MessageObject.getPeerId(y70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.g4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        y70 y70Var = this.d;
        if (y70Var.s == 0) {
            g4Var = new org.telegram.ui.Cells.e7(this.c, 2, null);
            g4Var.setLayoutParams(new f2.w0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.c, null, false, y70Var.s == 2);
        }
        return new el0(g4Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        l1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = l1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.g4)) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            e7Var.b(peerId == e7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            g4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
