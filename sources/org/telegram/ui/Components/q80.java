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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q80 extends hm0 {
    public final Context c;
    public final /* synthetic */ r80 d;

    public q80(r80 r80Var, Context context) {
        this.d = r80Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
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
        r80 r80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) r80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) r80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) r80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (r80Var.s == 0) {
            ((org.telegram.ui.Cells.e7) view).c(peerId, peerId == MessageObject.getPeerId(r80Var.v), null);
        } else {
            ((org.telegram.ui.Cells.f4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View f4Var;
        r80 r80Var = this.d;
        if (r80Var.s == 0) {
            f4Var = new org.telegram.ui.Cells.e7(this.c, 2, null);
            f4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.c, null, false, r80Var.s == 2);
        }
        return new sl0(f4Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        b1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = b1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.f4)) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            e7Var.b(peerId == e7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            f4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
