package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r8 extends yk0 {
    public final /* synthetic */ s8 c;

    public r8(s8 s8Var) {
        this.c = s8Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 2;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.c.size() + 2;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        s8 s8Var = this.c;
        int i11 = s8Var.b;
        if (o1Var.f == 2) {
            p9 p9Var = (p9) o1Var.a;
            p9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) s8Var.c.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                p9Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                p9Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                p9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                p9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            p9Var.f.setVisibility(8);
            p9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = s8Var.d;
            if (inputPeer2 != null || i10 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(s8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) != (z11 ? UserConfig.getInstance(s8Var.b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = false;
                    p9Var.c(z10, false);
                    p9Var.setDivider(i10 != h() - 1);
                }
            }
            z10 = true;
            p9Var.c(z10, false);
            p9Var.setDivider(i10 != h() - 1);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var;
        s8 s8Var = this.c;
        if (i10 == 0 || i10 == 1) {
            View view2 = new View(s8Var.getContext());
            view2.setLayoutParams(new f2.y0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            view = view2;
        } else {
            Context context = s8Var.getContext();
            c6Var = ((org.telegram.ui.ActionBar.e3) s8Var).resourcesProvider;
            view = new p9(context, c6Var);
        }
        return new lk0(view);
    }
}
