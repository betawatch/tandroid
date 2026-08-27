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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j70 extends yk0 {
    public final Context c;
    public final /* synthetic */ k70 d;

    public j70(k70 k70Var, Context context) {
        this.d = k70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = o1Var.a;
        k70 k70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) k70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.e3) k70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.e3) k70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (k70Var.s == 0) {
            ((org.telegram.ui.Cells.b7) view).c(peerId, peerId == MessageObject.getPeerId(k70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.d4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View d4Var;
        k70 k70Var = this.d;
        if (k70Var.s == 0) {
            d4Var = new org.telegram.ui.Cells.b7(this.c, 2, null);
            d4Var.setLayoutParams(new f2.y0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            d4Var = new org.telegram.ui.Cells.d4(2, 0, this.c, null, false, k70Var.s == 2);
        }
        return new lk0(d4Var);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        o1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = o1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.d4)) {
            org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
            b7Var.b(peerId == b7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            Object object = d4Var.getObject();
            d4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
