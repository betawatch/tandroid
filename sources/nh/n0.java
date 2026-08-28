package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n0 extends k41 {
    static {
        k41.setup(new n0());
    }

    public static l41 a(MessagesController.CommunityPeerDialog communityPeerDialog, j0 j0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            l41 J = l41.J(n0.class);
            long j10 = user.id;
            J.B = j10;
            J.d = (int) (j10 ^ (j10 >>> 32));
            J.G = user;
            J.H = j0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        l41 J2 = l41.J(n0.class);
        long j11 = chat != null ? -chat.id : 0L;
        J2.B = j11;
        J2.d = (int) (j11 ^ (j11 >>> 32));
        J2.G = chat;
        J2.H = j0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        r2 r2Var = (r2) view;
        r2Var.setDialogCellDelegate((n2) l41Var.H);
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            r2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            r2Var.L0 = dialog == null;
            if (dialog != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.W(dialog, 0, 0);
                return;
            } else {
                r2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                r2Var.V(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            r2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            r2Var.L0 = dialog2 == null;
            if (dialog2 != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.W(dialog2, 0, 0);
            } else {
                r2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                r2Var.V(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        r2 r2Var = new r2(null, context, false, i9, b6Var);
        r2Var.K0 = true;
        return r2Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }
}
