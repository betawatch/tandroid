package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class q0 extends u51 {
    static {
        u51.setup(new q0());
    }

    public static v51 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            v51 J = v51.J(q0.class);
            long j3 = user.id;
            J.B = j3;
            J.d = (int) (j3 ^ (j3 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        v51 J2 = v51.J(q0.class);
        long j10 = chat != null ? -chat.id : 0L;
        J2.B = j10;
        J2.d = (int) (j10 ^ (j10 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) v51Var.H);
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            s2Var.P0 = dialog == null;
            if (dialog != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.X(dialog, 0, 0);
                return;
            } else {
                s2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                s2Var.W(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            s2Var.P0 = dialog2 == null;
            if (dialog2 != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.X(dialog2, 0, 0);
            } else {
                s2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                s2Var.W(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        s2 s2Var = new s2(null, context, false, i10, d6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        return v51Var.d == v51Var2.d;
    }
}
