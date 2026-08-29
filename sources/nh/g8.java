package nh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g8 extends il0 {
    public final /* synthetic */ h8 c;

    public g8(h8 h8Var) {
        this.c = h8Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 2;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        h8 h8Var = this.c;
        int i11 = h8Var.b;
        if (n1Var.f == 2) {
            d9 d9Var = (d9) n1Var.a;
            d9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) h8Var.c.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                d9Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                d9Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                d9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                d9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            d9Var.f.setVisibility(8);
            d9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = h8Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(h8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z11 ? UserConfig.getInstance(h8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = false;
                    d9Var.c(z10, false);
                    d9Var.setDivider(i10 != h() - 1);
                }
            }
            z10 = true;
            d9Var.c(z10, false);
            d9Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        h8 h8Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(h8Var.getContext());
            view2.setLayoutParams(new f2.x0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = h8Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.f3) h8Var).resourcesProvider;
            view = new d9(context, c6Var);
        }
        return new vk0(view);
    }
}
