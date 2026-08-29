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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s70 extends il0 {
    public final Context c;
    public final /* synthetic */ t70 d;

    public s70(t70 t70Var, Context context) {
        this.d = t70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLObject chat;
        String str;
        int i12;
        View view = n1Var.a;
        t70 t70Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) t70Var.h.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (t70Var.s == 0) {
            ((org.telegram.ui.Cells.c7) view).c(peerId, peerId == MessageObject.getPeerId(t70Var.v), null);
        } else {
            ((org.telegram.ui.Cells.e4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View e4Var;
        t70 t70Var = this.d;
        if (t70Var.s == 0) {
            e4Var = new org.telegram.ui.Cells.c7(this.c, 2, null);
            e4Var.setLayoutParams(new f2.x0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            e4Var = new org.telegram.ui.Cells.e4(2, 0, this.c, null, false, t70Var.s == 2);
        }
        return new vk0(e4Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        n1Var.b();
        long peerId = MessageObject.getPeerId(this.d.v);
        View view = n1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.e4)) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
            c7Var.b(peerId == c7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            Object object = e4Var.getObject();
            e4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
