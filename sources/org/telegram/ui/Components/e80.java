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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e80 extends ul0 {
    public final Context c;
    public final /* synthetic */ f80 d;

    public e80(f80 f80Var, Context context) {
        this.d = f80Var;
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
        f80 f80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) f80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.h3) f80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) f80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (f80Var.s == 0) {
            ((org.telegram.ui.Cells.h7) view).c(peerId, peerId == MessageObject.getPeerId(f80Var.v), null);
        } else {
            ((org.telegram.ui.Cells.g4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        f80 f80Var = this.d;
        if (f80Var.s == 0) {
            g4Var = new org.telegram.ui.Cells.h7(this.c, 2, null);
            g4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.c, null, false, f80Var.s == 2);
        }
        return new fl0(g4Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        c1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.g4)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            h7Var.b(peerId == h7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Object object = g4Var.getObject();
            g4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
