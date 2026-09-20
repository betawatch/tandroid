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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d80 extends ul0 {
    public final Context c;
    public final /* synthetic */ e80 d;

    public d80(e80 e80Var, Context context) {
        this.d = e80Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        e80 e80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) e80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) e80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) e80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (e80Var.s == 0) {
            ((org.telegram.ui.Cells.h7) view).c(peerId, peerId == MessageObject.getPeerId(e80Var.v), null);
        } else {
            ((org.telegram.ui.Cells.h4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h4Var;
        e80 e80Var = this.d;
        if (e80Var.s == 0) {
            h4Var = new org.telegram.ui.Cells.h7(this.c, 2, null);
            h4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            h4Var = new org.telegram.ui.Cells.h4(2, 0, this.c, null, false, e80Var.s == 2);
        }
        return new fl0(h4Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        c1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            h7Var.b(peerId == h7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Object object = h4Var.getObject();
            h4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
