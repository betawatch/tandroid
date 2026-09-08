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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v70 extends kl0 {
    public final Context c;
    public final /* synthetic */ w70 d;

    public v70(w70 w70Var, Context context) {
        this.d = w70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = c1Var.a;
        w70 w70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) w70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) w70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) w70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (w70Var.s == 0) {
            ((org.telegram.ui.Cells.f7) view).c(peerId, peerId == MessageObject.getPeerId(w70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.f4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View f4Var;
        w70 w70Var = this.d;
        if (w70Var.s == 0) {
            f4Var = new org.telegram.ui.Cells.f7(this.c, 2, null);
            f4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.c, null, false, w70Var.s == 2);
        }
        return new vk0(f4Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        c1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.f4)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            f7Var.b(peerId == f7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            f4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
