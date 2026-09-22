package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class q0 extends h51 {
    static {
        h51.setup(new q0());
    }

    public static i51 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            i51 J = i51.J(q0.class);
            long j3 = user.id;
            J.B = j3;
            J.d = (int) (j3 ^ (j3 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        i51 J2 = i51.J(q0.class);
        long j10 = chat != null ? -chat.id : 0L;
        J2.B = j10;
        J2.d = (int) (j10 ^ (j10 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        r2 r2Var = (r2) view;
        r2Var.setDialogCellDelegate((n2) i51Var.H);
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.id);
            r2Var.P0 = dialog == null;
            if (dialog != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog, 0, 0);
                return;
            } else {
                r2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                r2Var.W(-chat.id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.id);
            r2Var.P0 = dialog2 == null;
            if (dialog2 != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog2, 0, 0);
            } else {
                r2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                r2Var.W(user.id, null, 0, false, false);
            }
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        r2 r2Var = new r2(null, context, false, i10, e6Var);
        r2Var.O0 = true;
        return r2Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }
}
