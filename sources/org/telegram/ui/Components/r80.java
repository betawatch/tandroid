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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class r80 extends lm0 {
    public final Context c;
    public final /* synthetic */ s80 d;

    public r80(s80 s80Var, Context context) {
        this.d = s80Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.r.size();
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
        s80 s80Var = this.d;
        long peerId = MessageObject.getPeerId((TLRPC.Peer) s80Var.r.get(i10));
        if (peerId > 0) {
            i12 = ((org.telegram.ui.ActionBar.h3) s80Var).currentAccount;
            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
            str = LocaleController.getString(R.string.VoipGroupPersonalAccount);
        } else {
            i11 = ((org.telegram.ui.ActionBar.h3) s80Var).currentAccount;
            chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
            str = null;
        }
        if (s80Var.w == 0) {
            ((org.telegram.ui.Cells.g7) view).c(peerId, peerId == MessageObject.getPeerId(s80Var.x), null);
        } else {
            ((org.telegram.ui.Cells.f4) view).e(chat, null, str, i10 != h() - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View f4Var;
        s80 s80Var = this.d;
        if (s80Var.w == 0) {
            f4Var = new org.telegram.ui.Cells.g7(this.c, 2, null);
            f4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(100.0f)));
        } else {
            f4Var = new org.telegram.ui.Cells.f4(2, 0, this.c, null, false, s80Var.w == 2);
        }
        return new wl0(f4Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        b1Var.b();
        long peerId = MessageObject.getPeerId(this.d.x);
        View view = b1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.f4)) {
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            g7Var.b(peerId == g7Var.getCurrentDialog(), false);
        } else {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Object object = f4Var.getObject();
            f4Var.c(peerId == (object != null ? object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : ((TLRPC.User) object).id : 0L), false);
        }
    }
}
