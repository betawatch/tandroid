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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y70 extends ql0 {
    public final Context c;
    public final /* synthetic */ z70 d;

    public y70(z70 z70Var, Context context) {
        this.d = z70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
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
        z70 z70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) z70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.g3) z70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.g3) z70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (z70Var.s == 0) {
            ((org.telegram.ui.Cells.d7) view).c(peerId, peerId == MessageObject.getPeerId(z70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.f4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View f4Var;
        z70 z70Var = this.d;
        if (z70Var.s == 0) {
            f4Var = new org.telegram.ui.Cells.d7(this.c, 2, null);
            f4Var.setLayoutParams(new f2.w0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.c, null, false, z70Var.s == 2);
        }
        return new dl0(f4Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        l1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = l1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.f4)) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) view;
            d7Var.b(peerId == d7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            f4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
