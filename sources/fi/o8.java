package fi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o8 extends mm0 {
    public final /* synthetic */ p8 c;

    public o8(p8 p8Var) {
        this.c = p8Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 2;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        p8 p8Var = this.c;
        int i11 = p8Var.b;
        if (e1Var.f == 2) {
            m9 m9Var = (m9) e1Var.a;
            m9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) p8Var.c.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                m9Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                m9Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                m9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                m9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            m9Var.f.setVisibility(8);
            m9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = p8Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(p8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z11 ? UserConfig.getInstance(p8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = false;
                    m9Var.c(z10, false);
                    m9Var.setDivider(i10 != h() - 1);
                }
            }
            z10 = true;
            m9Var.c(z10, false);
            m9Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.u6 u6Var;
        p8 p8Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(p8Var.getContext());
            view2.setLayoutParams(new s4.q0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = p8Var.getContext();
            u6Var = ((org.telegram.ui.ActionBar.k3) p8Var).resourcesProvider;
            view = new m9(context, u6Var);
        }
        return new wl0(view);
    }
}
