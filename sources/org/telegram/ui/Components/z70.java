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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z70 extends rl0 {
    public final Context c;
    public final /* synthetic */ a80 d;

    public z70(a80 a80Var, Context context) {
        this.d = a80Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = m1Var.a;
        a80 a80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) a80Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.h3) a80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) a80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (a80Var.s == 0) {
            ((org.telegram.ui.Cells.e7) view).c(peerId, peerId == MessageObject.getPeerId(a80Var.v), null);
        } else {
            ((org.telegram.ui.Cells.g4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        a80 a80Var = this.d;
        if (a80Var.s == 0) {
            g4Var = new org.telegram.ui.Cells.e7(this.c, 2, null);
            g4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.c, null, false, a80Var.s == 2);
        }
        return new el0(g4Var);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        m1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = m1Var.a;
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
