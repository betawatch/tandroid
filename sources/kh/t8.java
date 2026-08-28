package kh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t8 extends vk0 {
    public final /* synthetic */ u8 c;

    public t8(u8 u8Var) {
        this.c = u8Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 2;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return i9 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        u8 u8Var = this.c;
        int i10 = u8Var.b;
        if (q1Var.f == 2) {
            s9 s9Var = (s9) q1Var.a;
            s9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) u8Var.c.get(i9 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                s9Var.setUser(UserConfig.getInstance(i10).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                s9Var.setUser(MessagesController.getInstance(i10).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                s9Var.a(0, MessagesController.getInstance(i10).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                s9Var.a(0, MessagesController.getInstance(i10).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            s9Var.f.setVisibility(8);
            s9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = u8Var.d;
            if (inputPeer2 != null || i9 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(u8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z11 ? UserConfig.getInstance(u8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = false;
                    s9Var.c(z10, false);
                    s9Var.setDivider(i9 != h() - 1);
                }
            }
            z10 = true;
            s9Var.c(z10, false);
            s9Var.setDivider(i9 != h() - 1);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        u8 u8Var = this.c;
        if (i9 == 0 || i9 == 1) {
            View view2 = new View(u8Var.getContext());
            view2.setLayoutParams(new f2.a1(-1, i9 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = u8Var.getContext();
            b6Var = ((org.telegram.ui.ActionBar.f3) u8Var).resourcesProvider;
            view = new s9(context, b6Var);
        }
        return new ik0(view);
    }
}
