package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class e9 extends ll0 {
    public final /* synthetic */ f9 c;

    public e9(f9 f9Var) {
        this.c = f9Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        f9 f9Var = this.c;
        int i11 = f9Var.b;
        if (c1Var.f == 2) {
            ea eaVar = (ea) c1Var.a;
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

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        f9 f9Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(f9Var.getContext());
            view2.setLayoutParams(new s4.p0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = f9Var.getContext();
            d6Var = ((org.telegram.ui.ActionBar.f3) f9Var).resourcesProvider;
            view = new ea(context, d6Var);
        }
        return new wk0(view);
    }
}
