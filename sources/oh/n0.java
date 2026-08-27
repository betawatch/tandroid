package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n0 extends m41 {
    static {
        m41.setup(new n0());
    }

    public static n41 a(MessagesController.CommunityPeerDialog communityPeerDialog, j0 j0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            n41 J = n41.J(n0.class);
            long j10 = user.id;
            J.B = j10;
            J.d = (int) (j10 ^ (j10 >>> 32));
            J.G = user;
            J.H = j0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        n41 J2 = n41.J(n0.class);
        long j11 = chat != null ? -chat.id : 0L;
        J2.B = j11;
        J2.d = (int) (j11 ^ (j11 >>> 32));
        J2.G = chat;
        J2.H = j0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        p2 p2Var = (p2) view;
        p2Var.setDialogCellDelegate((l2) n41Var.H);
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            p2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            p2Var.L0 = dialog == null;
            if (dialog != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.X(dialog, 0, 0);
                return;
            } else {
                p2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                p2Var.W(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            p2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            p2Var.L0 = dialog2 == null;
            if (dialog2 != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.X(dialog2, 0, 0);
            } else {
                p2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                p2Var.W(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        p2 p2Var = new p2(null, context, false, i10, c6Var);
        p2Var.K0 = true;
        return p2Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
