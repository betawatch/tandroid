package ei;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class s8 extends lm0 {
    public final /* synthetic */ t8 c;

    public s8(t8 t8Var) {
        this.c = t8Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 2;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        t8 t8Var = this.c;
        int i11 = t8Var.b;
        if (b1Var.f == 2) {
            q9 q9Var = (q9) b1Var.a;
            q9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) t8Var.c.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                q9Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                q9Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                q9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                q9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            q9Var.f.setVisibility(8);
            q9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = t8Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(t8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z11 ? UserConfig.getInstance(t8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = false;
                    q9Var.c(z10, false);
                    q9Var.setDivider(i10 != h() - 1);
                }
            }
            z10 = true;
            q9Var.c(z10, false);
            q9Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        t8 t8Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(t8Var.getContext());
            view2.setLayoutParams(new s4.o0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = t8Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) t8Var).resourcesProvider;
            view = new q9(context, g6Var);
        }
        return new wl0(view);
    }
}
