package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e9 extends pm0 {
    public final /* synthetic */ f9 c;

    public e9(f9 f9Var) {
        this.c = f9Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 2;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        f9 f9Var = this.c;
        int i11 = f9Var.b;
        if (d1Var.f == 2) {
            ea eaVar = (ea) d1Var.a;
            eaVar.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) f9Var.c.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                eaVar.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                eaVar.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                eaVar.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                eaVar.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            eaVar.f.setVisibility(8);
            eaVar.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = f9Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(f9Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z11 ? UserConfig.getInstance(f9Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = false;
                    eaVar.c(z10, false);
                    eaVar.setDivider(i10 != h() - 1);
                }
            }
            z10 = true;
            eaVar.c(z10, false);
            eaVar.setDivider(i10 != h() - 1);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        f9 f9Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(f9Var.getContext());
            view2.setLayoutParams(new s4.q0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = f9Var.getContext();
            e6Var = ((org.telegram.ui.ActionBar.f3) f9Var).resourcesProvider;
            view = new ea(context, e6Var);
        }
        return new am0(view);
    }
}
