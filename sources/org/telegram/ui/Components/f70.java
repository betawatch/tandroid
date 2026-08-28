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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f70 extends vk0 {
    public final Context c;
    public final /* synthetic */ g70 d;

    public f70(g70 g70Var, Context context) {
        this.d = g70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLObject chat;
        String str;
        int i11;
        View view = q1Var.a;
        g70 g70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) g70Var.h.get(i9));
        if (peerId > 0) {
            i11 = ((org.telegram.ui.ActionBar.f3) g70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) g70Var).currentAccount;
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (g70Var.s == 0) {
            ((org.telegram.ui.Cells.e7) view).c(peerId, peerId == MessageObject.getPeerId(g70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.g4) view).e(chat, null, str, i9 != h() - 1);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View g4Var;
        g70 g70Var = this.d;
        if (g70Var.s == 0) {
            g4Var = new org.telegram.ui.Cells.e7(this.c, 2, null);
            g4Var.setLayoutParams(new f2.a1(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            g4Var = new org.telegram.ui.Cells.g4(2, 0, this.c, null, false, g70Var.s == 2);
        }
        return new ik0(g4Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        q1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = q1Var.a;
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
