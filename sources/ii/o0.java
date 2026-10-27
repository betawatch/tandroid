package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o0 extends t61 {
    static {
        t61.setup(new o0());
    }

    public static u61 a(MessagesController.CommunityPeerDialog communityPeerDialog, j0 j0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            u61 K = u61.K(o0.class);
            long j10 = user.id;
            K.B = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.G = user;
            K.H = j0Var;
            return K;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        u61 K2 = u61.K(o0.class);
        long j11 = chat != null ? -chat.id : 0L;
        K2.B = j11;
        K2.d = (int) (j11 ^ (j11 >>> 32));
        K2.G = chat;
        K2.H = j0Var;
        return K2;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        p2 p2Var = (p2) view;
        p2Var.setDialogCellDelegate((l2) u61Var.H);
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            p2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            p2Var.P0 = dialog == null;
            if (dialog != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.W(dialog, 0, 0);
                return;
            } else {
                p2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                p2Var.V(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            p2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            p2Var.P0 = dialog2 == null;
            if (dialog2 != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.W(dialog2, 0, 0);
            } else {
                p2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                p2Var.V(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return u61Var.d == u61Var2.d;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        p2 p2Var = new p2(null, context, false, i10, u6Var);
        p2Var.O0 = true;
        return p2Var;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.d == u61Var2.d;
    }
}
