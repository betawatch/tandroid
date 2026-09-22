package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class q0 extends x51 {
    static {
        x51.setup(new q0());
    }

    public static y51 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            y51 J = y51.J(q0.class);
            long j3 = user.id;
            J.B = j3;
            J.d = (int) (j3 ^ (j3 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        y51 J2 = y51.J(q0.class);
        long j10 = chat != null ? -chat.id : 0L;
        J2.B = j10;
        J2.d = (int) (j10 ^ (j10 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) y51Var.H);
        Object obj = y51Var.G;
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

    @Override // org.telegram.ui.Components.x51
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        return y51Var.d == y51Var2.d;
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        s2 s2Var = new s2(null, context, false, i10, f6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        return y51Var.d == y51Var2.d;
    }
}
